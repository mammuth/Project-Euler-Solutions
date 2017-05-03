#!/usr/bin/python3

# Created by Max Muth on 05. December 2014
# kontakt@maxi-muth.de

'''
Break XOR decryption
https://projecteuler.net/problem=59
'''
import itertools
import string

f = open('../p059_cipher.txt')

CIPHER_TEXT = f.read().split(',')
KEYS = list(''.join(x) for x in itertools.permutations(string.ascii_lowercase, 3)) # permutations of length 3 over [a..z]
LOOKUP_WORD = ' a ' # a is one of the most common words in english language. So go hunt it down!


def bruteForce(lookUpWord):
    for key in KEYS:
        plain = [int(a)^ord(b) for (a, b) in zip(CIPHER_TEXT, itertools.cycle(key))] # int(a)^ord(b) deciphers a with key-part b
        if lookUpWord in ''.join(map(chr, plain)):
            return sum(plain)

    return ("Couldn't find it!")


print(bruteForce(LOOKUP_WORD))