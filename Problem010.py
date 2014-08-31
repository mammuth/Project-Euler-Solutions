#!/usr/bin/python

# Created by Max Muth on 05.08.14.
# kontakt@maxi-muth.de

# should work but stopped it running after 15 minutes :)
noprimes = [j for i in range(2, 8) for j in range(i * 2, 2000000, i)]
primes = [x for x in range(2, 2000000) if x not in noprimes]
print(sum(primes))