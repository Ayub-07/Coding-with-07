/*
Power Game 
There are 2 teams, each having N players. There will be N rounds played between the 2 teams. In every round, a player from team A plays against a player from team B. The more powerful player wins the game. Given the strength of the players of both teams, you have to find the maximum number of rounds team A can win. Note that a player cannot play more than 1 round.

Input Format
The first line of input contains T - the number of test cases. It's followed by 3T lines. The first line contains the N - the size of the team. The next 2 lines contain N numbers each - the strength of the players of team A and team B respectively.

Output Format
For each test case, print the maximum number of rounds team A can win, separated by a new line.

Constraints
1 <= T <= 500
1 <= N <= 10000
0 <= A[i], B[i] <= 10000

Example
Input
3
4
1 5 7 4 
3 8 2 10 
2
2 3 
10 5 
3
3 7 10 
5 20 15 

Output
2
0
1

Explanation

Test Case-1
Player with strength 5 in team A can defeat player with strength 3 in team B.
Player with strength 7 in team A can defeat player with strength 2 in team B.

Test Case-2
No Player in team A can defeat any player in team B.

Test Case-3
Player with strength 7 in team A can defeat player with strength 5 in team B. */
import java.util.*;

class PowerGame {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
          int n = sc.nextInt();
          int [] A = new int[n];
          for(int i=0;i<n;i++)
              A[i] = sc.nextInt();
          int [] B = new int[n];
          for(int i=0;i<n;i++)
              B[i] = sc.nextInt();
          Arrays.sort(A);
          Arrays.sort(B);
          int count =0;
          int p1 = 0 , p2 = 0;  // USING 2 POINTERS
          while (p1<n){
              if (A[p1]>B[p2]){  
                  count++;      // MAIN LOGIC
                  p1++;
                  p2++;
             }
              else {
                  p1++;
              }
            }
          System.out.println(count);
       }
    }
}