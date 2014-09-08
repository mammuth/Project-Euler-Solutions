#!/usr/bin/python3

# Created by Max Muth on 01. September 2014
# kontakt@maxi-muth.de

# The arithmetic sequence, 1487, 4817, 8147, in which each of the
# terms increases by 3330, is unusual in two ways: (i) each of the
# three terms are prime, and, (ii) each of the 4-digit numbers are
# permutations of one another.
#
# There are no arithmetic sequences made up of three 1-, 2-, or
# 3-digit primes, exhibiting this property, but there is one other
# 4-digit increasing sequence.
#
# What 12-digit number do you form by concatenating the three terms
# in this sequence?

import EulerLibrary


def main():
    primes = list(p for p in EulerLibrary.primes(10000) if len(str(p)) == 4)

    for p in primes:
        perm = (int(s) for s in EulerLibrary.permutations(p))
        result = list()
        for i in range(0, 3):
            if p != 1487 and p + i * 3330 in perm and p + i * 3330 in primes:
                result.append(p + i * 3330)
                if len(result) == 3:
                    print(result)
                    return


main()