#!/usr/bin/python

# Created by Max Muth on 05.08.14.
# kontakt@maxi-muth.de


def factorial(n):
    return reduce(lambda x, y: x * y, range(1, n + 1))


sum = 0
for c in str(factorial(100)):
    sum += int(c)

print(sum)