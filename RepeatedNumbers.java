/*
REPEATED NUMBERS

You are given an array of N elements. All elements of the array are in range 1 to N-2. All elements occur once except two numbers, which occur twice. Your task is to find the two repeating numbers.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array.

Output Format
Print the 2 repeated numbers in sorted manner, for each test case, separated by new line.

Constraints
30 points
1 <= T <= 100
4 <= N <= 103

70 points
1 <= T <= 100
4 <= N <= 106

Example
Input
2
8
1 3 2 3 4 6 5 5
10
1 5 2 8 1 4 7 4 3 6

Output
3 5
1 4 */

/**
 * TWO APPROACHES -
  
   APPROACH -1 USING HASHMAP ------> Time complexity = O(n)  ,  Space Complexity = O(n)  (OPTIMIZED & EFFECIENT)

   APPROACH -2 Without HASHMAP ------> Time complexity = O(n^2)  ,  Space Complexity = O(n)  (RAW LOGIC)

 */

//APPROACH - 1

import java.util.*;

public class RepeatedNumbers {

    public static void RepeatedNumbers (int a[] , int n){
        Map <Integer,Integer> hmap = new HashMap<>();
        for(int num : a){
            hmap.put(num,hmap.getOrDefault(num,0)+1);         //Frequency map -  To store (Element,frequency) as (Key,value) pairs
        }
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            if(entry.getValue() == 2){                        //MAIN LOGIC
                System.out.print(entry.getKey()+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            RepeatedNumbers(arr,n);
            System.out.println();
        }
    }
}

//APPROACH -2 


 class Approach2 {

    public static void RepeatedNumbers (int a[] , int n){
        boolean [] visited = new boolean [n];       //BOOLEAN ARRAY TO REMEMBER VISITED ELEMENTS .. SO THAT REPEATITION IS AVOIDED
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(a[i] == a[j]){               //MAIN LOGIC
                    count++;
                    visited[j] = true;
                }
            }
            if(count==2){
                System.out.print(a[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            RepeatedNumbers(arr,n);
            System.out.println();
        }
    }
}