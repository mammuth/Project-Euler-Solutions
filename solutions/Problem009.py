#!/usr/bin/python3

# Created by Max Muth on 05.08.14.
# kontakt@maxi-muth.de

# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
# a^2 + b^2 = c^2

# For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
#Find the product abc.

n = 1000

for a in range(1, n):
    for b in range(a, n):
        for c in range(b, n):
            if a ** 2 + b ** 2 == c ** 2 and a + b + c == 1000:
                print(a, b, c)
                break
