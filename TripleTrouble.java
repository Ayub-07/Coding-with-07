/*Triple Trouble
Given an array of size 3X+1, where every element occurs three times, except one element, which occurs only once. Find the element that occurs only once.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array (of the form 3X + 1) and second line contains the elements of the array.

Output Format
For each test case, print the number which occurs only once, separated by new line.

Constraints
30 points
1 <= T <= 100
1 <= N <= 103
1 <= A[i] <= 105

70 points
1 <= T <= 100
1 <= N <= 106
1 <= A[i] <= 109

Example
Input
2
10
5 7 8 7 7 9 5 9 5 9
7
10 20 20 30 20 30 30

Output
8
10*/

import java.util.*;

class TripleTrouble {
    public static int UniqueValue (int a[]){
        Map<Integer,Integer> hmap = new HashMap<>();                // USING HASHMAP TO STORE THE FREQUENCIES (num,frequency)

        for (int num : a){
            hmap.put (num , hmap.getOrDefault(num,0)+1) ;
        }
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            if (entry.getValue()!=3)                                //MAIN LOGIC
                return entry.getKey();
        }
        return -1;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(UniqueValue(arr));
        }
    }
}