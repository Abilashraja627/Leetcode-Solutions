/*Ugly Number
Solved
Easy
Topics
Companies
An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

Given an integer n, return true if n is an ugly number.
Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors.*/
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        // Divide n by 2, 3, and 5 as long as it's divisible
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        // After removing all 2, 3, 5, if what's left is 1, it's ugly
        return n == 1;
    }

    // Custom prime checker that does NOT treat 2, 3, and 5 as prime
    public static boolean customPrime(int num) {
        if (num <= 1 || num == 2 || num == 3 || num == 5) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
