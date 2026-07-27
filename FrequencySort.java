/*
                                                  Frequency Sort 

You are given an array of integers. Sort them by frequency. See examples for more clarifications.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Output Format
For each test case, print the elements of the array sorted by frequency. In case 2 elements have the same frequency, print the smaller element first.

Constraints
1 <= T <= 100
1 <= N <= 10000
-1000 <= A[i] <= 1000

Example
Input
2
6
4 -2 10 12 -8 4
8
176 -272 -272 -45 269 -327 -945 176

Output
-8 -2 10 12 4 4
-945 -327 -45 269 -272 -272 176 176

Explanation

Self Explanatory
 */

import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            Map<Integer,Integer> hmap = new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1); // Inserting all the values in HashMap
            }
            List<Integer> ls = new ArrayList<>(hmap.keySet());  // Making a list for keys (unique elements)
            Collections.sort(ls ,(a,b)->{                       // Custom sorting using Comparator
                if (hmap.get(a).intValue()!=hmap.get(b).intValue())
                    return hmap.get(a)-hmap.get(b); // Lesser frequency element comes first
            return a-b; // If frequecy is equal then in increasing order of elements
            });
        for(int num : ls){
            for(int i=0;i<hmap.get(num);i++) // Since our list contains only unique elements but we have to print all the repetitions of particular element too ; so using this loop we will repeat the number as given in input
                System.out.print(num+" ");
        }
        System.out.println();
        }
    }
}