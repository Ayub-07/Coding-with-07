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
import java.util.*;

class RepeatedNumbers {

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