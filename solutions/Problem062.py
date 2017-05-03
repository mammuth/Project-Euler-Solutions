#!/usr/bin/python3

# Created by Max Muth on 13. December 2014
# kontakt@maxi-muth.de

digits = ''
cubes = {}
minCube = float('inf')

n = 100
while minCube == float('inf') or len(digits) <= len(str(minCube)):
    c = n**3
    digits = ''.join(sorted(str(c)))
    if digits in cubes:
        cubes[digits] += [c]
        if len(cubes[digits]) == 5:
            minCube = min(minCube, cubes[digits][0])
    else:
        cubes[digits] = [c]
    n += 1

print(minCube)
