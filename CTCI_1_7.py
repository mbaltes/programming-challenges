"""
Ctci problem 1.7
Write an algorithm such that if an element in an NxM matrix is 0,
its entire row and column are set to 0.

"""


def pretty_print(A):
    """Prints the matrix A in a readable way."""
    for n in A:
        for m in n:
            print(m, end=' ')
        print()


def locate_zeroes(A):
    """
    Takes an NxM matrix and returns the positions of its zeroes as the lists
    row and col.
    """
    row = [0 for n in range(len(A))]
    col = [0 for m in range(len(A[0]))]
    for i in range(len(A)):
        for j in range(len(A[0])):
            if A[i][j] == 0:
                row[i], col[j] = 1, 1
    return row, col


def soln(A):
    """Solves Ctci 1.7."""
    row, col = locate_zeroes(A)
    for i in range(len(A)):
        for j in range(len(A[0])):
            if row[i] or col[j]:
                A[i][j] = 0


A = [[1, 2, 3], [4, 0, 6], [7, 8, 9]]
pretty_print(A)
soln(A)
print()
pretty_print(A)
