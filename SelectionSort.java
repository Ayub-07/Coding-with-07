//SELECTION SORT
import java.util.*;
class SelectionSort{

  public static void Swap (int arr[] , int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void SelectionSort(int ar[],int n){
    for(int i=0;i<n-1;i++){
      int Smallestidx = i;
      for(int j=i+1;j<n;j++){
        if(ar[j] < ar[Smallestidx])
          Smallestidx = j;
      }
      Swap(ar,i,Smallestidx);
    }
  }

  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ar[] = new int [n];
    for(int i=0;i<n;i++)  ar[i] = sc.nextInt();
    SelectionSort(ar,n);
    for(int i=0;i<n;i++)
      System.out.print(ar[i]+" ");
  }
}