/*
Closest Prime Numbers in Range


Given two positive integers left and right, find the two integers num1 and num2 such that:

left <= num1 < num2 <= right .
Both num1 and num2 are prime numbers.
num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
Return the positive integer array ans = [num1, num2]. If there are multiple pairs satisfying these conditions, return the one with the smallest num1 value. If no such numbers exist, return [-1, -1].

 

Example 1:

Input: left = 10, right = 19
Output: [11,13]
Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
Since 11 is smaller than 17, we return the first pair.
Example 2:

Input: left = 4, right = 6
Output: [-1,-1]
Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.
 
*/
public class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] arr = new int[2];
        int prevPrime = -1;
        int minDiff = Integer.MAX_VALUE;

        arr[0] = -1;
        arr[1] = -1;

        while (left <= right) {
            if (isPrime(left)) {
                if (prevPrime != -1) {
                    int diff = left - prevPrime;
                    if (diff < minDiff) {
                        minDiff = diff;
                        arr[0] = prevPrime;
                        arr[1] = left;
                        if(minDiff<=2){
                            break;
                        }
                    }
                }
                prevPrime = left;
            }
            left++;
        }
        return arr;
    }

    public static boolean isPrime(int a) {
        if (a <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
