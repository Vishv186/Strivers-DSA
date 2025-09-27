/*

Extracting from a number
    N = 7789
                                             n / 10 gives last digit(Integer)
    N = 7789 % 10 = 9(Remainder)             % is the Modulo which gives remainder 
   N/10 778  % 10 = 8(Remainder)             778.9 but just take Integer part
   N/10 77   % 10 = 7(Remainder)             77.8 but just take Integer part
   N/10 7    % 10 = 7(Remainder)             7.7 but just take Integer part

Pseudo Code
 
while (n>0){                        7789 > 0 is true
    last digit = n%10;              to get last digit n%10
    n = n/10;                       to get next n n/10
}

*/

/*
COUNT THE DIGITS
Given a number n, find out and return the number of digits present in a number 
*/

// import java.util.*;

// public class BasicMaths {
//     public static int countDigits(int n){
//         int count = 0;
//         while(n>0){
//             count = count + 1;
//             n = n/10;
//         }
//         return count;
//     }
//     public static void main(String[] args){
//         int N = 45634;
//         System.out.println("N: " + N);
//         int digits = countDigits(N);
//         System.out.println("Number of Digits in N: " + digits);
//     }
// }

/*
REVERSE A NUMBER
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
*/

// import java.util.*;

// public class BasicMaths {
//      public static int ReverseNumber(int n){
//         int revNum = 0;
//         while(n>0){
//             int ld = n%10;
//             revNum = (revNum * 10) + ld;
//             n = n/10;
//         }
//         return revNum;
//      }
//      public static void main(String[] args){
//         int n = 123456789;
//         int reversed = ReverseNumber(n);
//         System.out.println(reversed);
//      }
// }

/*
CHECK PALINDROME
Given an integer N, return true if it is a palindrome else return false.
*/

// import java.util.*;

// public class BasicMaths {
//     public static Boolean palindrome(int n) {
//         int revNum = 0;
//         int dup = n;

//         while (n > 0) {
//             int ld = n % 10;
//             revNum = (revNum * 10) + ld;
//             n = n / 10;
//         }

//         if (dup == revNum) {
//             return true;
//         } else {
//                 return false;
//         }
//     }

//     public static void main(String[] args) {
//         int n = 121;
//         if(palindrome(n)){
//             System.out.println("It is a Palindrome number.");
//         } else {
//             System.out.println("It is not a Palindrome number.");
//         }
//     }
// }
