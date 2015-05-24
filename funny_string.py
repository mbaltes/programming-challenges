# Problem: https://www.hackerrank.com/challenges/funny-string
# Status: Working
# Todo: 

n = int(input())
strings = []
r = []

for x in range(0, n):
    s = input()
    strings.append(s)
    r.append(s[::-1]) # reverse string using slice

for i, j in zip(strings, r):
    length = len(i)
    answer = True
    for k in range(1, length):
        if abs(ord(i[k]) - ord(i[k - 1])) != abs(ord(j[k]) - ord(j[k - 1])):
            answer = False
            print("Not Funny")
            break
    if answer == True:
        print("Funny")
