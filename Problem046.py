#!/usr/bin/python3

# Created by Max Muth on 31. August 2014
# kontakt@maxi-muth.de

from itertools import product

from EulerLibrary import *


primes = primes(10000)
composites = list(n for n in range(2, 10000) if n not in primes)
squares = list(2 * (n ** 2) for n in range(100))

sums = set(sum(c) for c in product(primes, squares))

print(min(n for n in composites if n not in sums and isOdd(n)))
