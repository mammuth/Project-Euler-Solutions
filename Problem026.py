#!/usr/bin/python

# Created by Max Muth on 19.08.14.
# kontakt@maxi-muth.de

def recurringCycle(n, d):
    for t in range(1, d):
        if 1 == 10 ** t % d:
            return t
    return 0


longest = max(recurringCycle(1, i) for i in range(2, 1001))
print [i for i in range(2, 1001) if recurringCycle(1, i) == longest][0]