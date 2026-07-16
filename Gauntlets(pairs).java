/*
Gauntlets

You have a collection of N gauntlets, each with a specific color represented by A[i]. Your goal is to maximize the number of pairs by repeatedly pairing up gauntlets of the same color. Determine the maximum number of pairs that can be formed.

Input Format
The first line of input contains an integer N. The second line of input contains an array of size N.

Output Format
For the given input, print a single line representing the answer.

Constraints
1 ≤ N ≤ 102
1 ≤ Ai ≤ 103

Example
Input
6
4 1 7 4 1 4

Output
2

Explanation

You can do the operation twice as follows.Choose two gauntlets with the color 1 and pair them.Choose two gauntlets with the color 4 and pair them.Then, you will be left with one gauntlet with the color 4 and another with the color 7, so you can no longer do the operation. There is no way to do the operation three or more times, so you should print 2. */


/* THE MAIN LOGIC HERE IS TO FIND THE FREQUENCY OF EACH ELEMENT AND DIVIDE IT BY 2 TO FORM PAIRS . 
  IN JAVA THE MOST OPTIMAL WAY TO FIND FREQUENCIES IS BY USING "***HASHMAP***" */

import java.util.*;

class Gauntlets{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(int num : arr)
            hmap.put(num , hmap.getOrDefault(num,0)+1); // storing the values in frequency map
        int pairs = 0;
        for(int freq : hmap.values()) // Iterating over the values
            pairs += freq/2; 
        System.out.print(pairs);       
    }
}
