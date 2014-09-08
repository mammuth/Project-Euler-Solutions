#!/usr/bin/python

# Created by Max Muth on 31. August 2014
# kontakt@maxi-muth.de

from math import *
import itertools


def primes(n):
    """
    Returns an array containing primes < n.

    Uses sieve of Eratosthenes.
    """
    numbers = list(range(2, n + 1))
    p = 2
    j = 0
    done = False
    while not done:
        for i, n in enumerate(numbers):
            if n % p == 0 and n != p:
                numbers.pop(i)
        j += 1
        p = numbers[j]
        if p ** 2 > n:
            done = True
    return numbers


def binomial(n, k):
    f = factorial
    return int(f(n) / f(k) / f(n - k))


def primeFactors(n):
    res = list()
    # iterate over all even numbers first.
    while n % 2 == 0:
        res.append(2)
        n //= 2
    # try odd numbers up to sqrt(n)
    limit = sqrt(n + 1)
    i = 3
    while i <= limit:
        if n % i == 0:
            res.append(i)
            n //= i
            limit = sqrt(n + i)
        else:
            i += 2
    if n != 1:
        res.append(n)
    return res


def distinctPrimeFactors(n):
    return set(primeFactors(n))


"""
Checking for Being :-)
"""


def isPrime(n):
    """
    Checks whtere n is prime.
    """
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False

    for i in range(3, sqrt(n), 2):
        if n % i == 0:
            return False

    return True


def isEven(n):
    return n % 2 == 0


def isOdd(n):
    return n % 2 != 0


"""
Special Numbers / Sequences
"""


def fibonacci(n):
    """
    Returns the n-th term of the fibonacci sequence.
    """
    return int(((1 + sqrt(5)) ** n - (1 - sqrt(5)) ** n) / (2 ** n * sqrt(5)))


def permutations(seq):
    """
    In: Anything
    Out: list of Strings !

    Contains seq aswell !
    """
    return list(map("".join, itertools.permutations(str(seq))))


def reverseInt(n):
    return int(reverseString(str(n)))


def reverseString(s):
    return s[::-1]

def pentagonal(n):
    """
    Returns the n-th pentagonal number.
    """
    return int(n * (3 * n - 1) / 2)


def triangle(n):
    """
    Returns the n-th triangle number.
    """
    return int(n * (n + 1) / 2)


def hexagonal(n):
    """
    Returns the n-th hexagonal number.
    """
    return int(n * (2 * n - 1))