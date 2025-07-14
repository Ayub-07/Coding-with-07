/*
TWO APPROACHES FOR REVERSING THE STRING 

Approach -1 : Using String Builder 
Time complexity - O (n)
Space complexity - O (n)

Approach -2 : Using Character Array
Time complexity - O (n)
Space complexity - O (n)

*/

class ReverseString {
    public static String revStrUsingStringBuilder(String str){
      StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static String revStrUsingCharArray(String str){
        char a [] = str.toCharArray();
        int i = 0 , j = a.length-1;
        while(i<j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return new String (a);
    }
    
    public static void main(String[] args) {
        String str = "Ayub";
        System.out.println(revStrUsingStringBuilder(str)+"  (reversed using string builder)");
        System.out.println(revStrUsingCharArray(str)+"  (reversed using char array)");
    }
}

/*
OUTPUT -

buyA  (reversed using string builder)
buyA  (reversed using char array)

=== Code Execution Successful ===
 */