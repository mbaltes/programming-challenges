# Problem: https://www.hackerrank.com/challenges/pangrams
# Status: Working
# Todo:

alphabet = {
    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
}

s = input()
s = s.replace(" ", "")

s_set = set(s)
s_set = [x.lower() for x in s_set]

if alphabet.issubset(s_set):
    print("pangram")
else:
    print("not pangram")