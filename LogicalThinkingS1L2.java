// PATTERNS 

/*
Steps :-
    1] For the Outer loop count the no. of lines(Rows).
    2] For the Inner loop, focus on the columns and connect them somehow to the Rows. 
    3] Print '*' inside the inner for loop.
    4] Observe Symmetry (optional step) 
 */


/*
        Rows = Outer Loop, Columns = Inner Loop

          C1  C2  C3  C4
    R1    *   *   *   *
    R2    *   *   *   *
    R3    *   *   *   *
    R4    *   *   *   *

 */

// public class LogicalThinkingS1L2{
//     static void pattern1(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         int n = 4;
//         pattern1(n);
//     }
// }





/*

          Rows = Outer Loop, Columns = Inner Loop

          C1  C2  C3  C4  C5
    R1    *   
    R2    *   *  
    R3    *   *   *   
    R4    *   *   *   *
    R5    *   *   *   *   *   

 */


// public class LogicalThinkingS1L2{
//     static void pattern2(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         int n = 5;
//         pattern2(n);
//     }
// }






/*

          Rows = Outer Loop, Columns = Inner Loop

          C1  C2  C3  C4  C5
    R1    1   
    R2    1   2  
    R3    1   2   3   
    R4    1   2   3   4
    R5    1   2   3   4   5   

*/


// public class LogicalThinkingS1L2{
//     static void pattern2(int n){
//         for(int i=1; i<n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+ " " );
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         int n = 6;
//         pattern2(n);
//     }
// }
