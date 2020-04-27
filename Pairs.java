package com.nt;
import java.util.Arrays;

/*	You will be given an array of integers and a target value. Determine the number of pairs of array elements that have a difference equal to a target value.

For example, given an array of [1, 2, 3, 4] and a target value of 1, we have three values meeting the condition: , , and .

Function Description

Complete the pairs function below. It must return an integer representing the number of element pairs having the required difference.

pairs has the following parameter(s):

k: an integer, the target difference
arr: an array of integers
Input Format

The first line contains two space-separated integers  and , the size of  and the target value.
The second line contains  space-separated integers of the array .

Constraints

each integer  will be unique
Output Format

An integer representing the number of pairs of integers whose difference is .

Sample Input

5 2  
1 5 3 4 2  
Sample Output

3
Explanation

There are 3 pairs of integers in the set with a difference of 2: [5,3], [4,2] and [3,1] .
*/


public class Pairs {
	
	// Complete the pairs function below.
    static int pairs(int k, int[] arr) {
         int matches = 0;
        Arrays.sort(arr);
        
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            int diff = arr[j] - arr[i];
            if (diff == k) {
                matches++;
                j++;
            } else if (diff > k) {
                i++;
                if (i == j) {
                    j++;
                }
            } else if (diff < k) {
                j++;
            }
        }
        
        return matches;
    
    }
	public static void main(String[] args) {
		
		int k=2;
		int arr[]= {1 ,5 ,3 ,4 ,2};
		int result = pairs(k, arr);
		System.out.println(result);
	
	}
}
