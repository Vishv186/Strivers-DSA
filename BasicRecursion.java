/*
Recursion :- When a function calls itself until a specified condition is met.

Recursive tree :- It is basically a representative form of recursion which depicts how functions are called and 
returned as a series of events happening consecutively.

Stack Overflow :- When there is no base condition given for a particular recursive function, it gets called 
indefinitely which results in a Stack Overflow.
 */

// public class BasicRecursion{
//     int cnt = 0;
//     public static void callRecursion(int cnt){
//         //Base condition
//         if(cnt == 3)return;
//         System.out.println(cnt);

//         //Count incremented
//         cnt = cnt+1;
//         callRecursion(cnt);
//     }
//     public static void main(String[] args){
//         callRecursion(0);
//     }
// }



/*
Print Name N times using Recursion
*/

// public class BasicRecursion{
//     public static void printMyName(int i, int n){
//         if(i>n) return;
//         System.out.println("Vishv");

//         printMyName(i+1, n);
//     }
//     public static void main(String[] args){
//         int n = 5;
//         printMyName(1, n);
//     }
// }



/*
Print 1 to N using Recursion
*/

// public class BasicRecursion{
//     public static void printMyName(int i, int n){
//         if(i>n) return;
//         System.out.println(i);

//         printMyName(i+1, n);
//     }
//     public static void main(String[] args){
//         int n = 4;
//         printMyName(1, n);
//     }
// }




/*
Print N to 1 using Recursion
*/

// public class BasicRecursion{
//     public static void printMyName(int i, int n){
//         if(i<1) return;
//         System.out.println(i);

//         printMyName(i-1, n);
//     }
//     public static void main(String[] args){
//         int n = 4;
//         printMyName(n, n);
//     }
// }





/*
Sum of first N Natural Numbers
Given a number ‘N’, find out the sum of the first N natural numbers.
*/

// public class BasicRecursion{
//     public static void sumofNum(int n){
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             sum += i;
//         }
//         System.out.println("Sum on " + n + " is " + sum);
//     }
//     public static void main(String[] args){
//         sumofNum(6);
//     }
// }





/*
Factorial of a Number : Iterative and Recursive
Given a number X,  print its factorial.
*/

// public class BasicRecursion{
//     public static int factorial(int X){
//         int ans = 1;

//         for(int i=1; i<=X; i++){
//             ans = ans*i;
//         }
//         return ans;
//     }
//     public static void main(String[] args){
//         int X = 4;

//         int result = factorial(X);

//         System.out.println("The factorial of " + X + " is " + result);
//     }
// }




/*
Revere an Array
You are given an array. The task is to reverse the array and print it. 
Space-otimized iterative method
*/

// public class BasicRecursion{
//     public static void printArray(int arr[], int n){
//         System.out.println("Reversed array is:- \n");
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     static void reverseArray(int arr[], int n) {
//       int p1 = 0, p2 = n - 1;
//       while (p1 < p2) {
//          int tmp = arr[p1];
//          arr[p1] = arr[p2];
//          arr[p2] = tmp;
//          p1++;
//          p2--;
//       }
//       printArray(arr, n);
//    }
//    public static void main(String[] args) {
//       int n = 5;
//       int arr[] = { 5, 4, 3, 2, 1};
//       reverseArray(arr, n);

//    }

// }





/*
Check if the given String is Palindrome or not
*/

// class BasicRecursion {
    
//     static boolean palindrome(int i, String s){

//             if(i>=s.length()/2) return true;
            
//             if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            
//             return palindrome(i+1,s);
            

//     }
//     public static void main(String[] args) {

//        String s = "madam";
//        System.out.println(palindrome(0,s));
//     }
// }





/*
Fibonacci Number
Given an integer N. Print the Fibonacci series up to the Nth term.
*/

// public class BasicRecursion {
//   public static void main(String args[]) {
//     int n = 5;
//     if (n == 0) {
//       System.out.println(0);
//     } else {
//       int fib[] = new int[n + 1];
//       fib[0] = 0;
//       fib[1] = 1;
//       for (int i = 2; i <= n; i++) {
//         fib[i] = fib[i - 1] + fib[i - 2];
//       }
//       System.out.println("The Fibonacci Series up to "+n+"th term:");
//       for (int i = 0; i <= n; i++) {
//         System.out.print(fib[i] + " ");
//       }
//     }
//   }
// }
