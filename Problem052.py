#!/usr/bin/python3

# Created by Max Muth on 21. September 2014
# kontakt@maxi-muth.de


from EulerLibrary import *

for x in range(1, 10000000):
    perms = permutations(x)
    isOne = True
    for f in range(2, 7):
        if str(f * x) not in perms:
            isOne = False
            break
    if isOne:
        print(str(x))
        break
