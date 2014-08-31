#!/usr/bin/python3

# Created by Max Muth on 31. August 2014
# kontakt@maxi-muth.de

from EulerLibrary import pentagonal, triangle, hexagonal

p = set(pentagonal(n) for n in range(1, 100000))
h = set(hexagonal(n) for n in range(1, 100000))

for n in range(1, 100000):
    t = triangle(n)
    if t > 40755 and t in p and t in h:
        print(t)
        break

