#!/usr/bin/python3

# Created by Max Muth on 03.05.17.
# kontakt@maxi-muth.de

# Lychrel numbers
# https://projecteuler.net/problem=55


from euler_helper import is_lychrel

lychrels = [is_lychrel(n, max_iterations=50) for n in range(10000)]
print('There are {} lychrels below ten-thousand'.format(sum(lychrels)))
