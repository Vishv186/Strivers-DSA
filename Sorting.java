/*
Selection sort :- algorithm that repeatedly selects the smallest (or largest) element from the unsorted part of an array and places it at the correct 
position in the sorted part.

Steps:- 1. Start with the first element as the current position.
        2. Find the minimum element from the unsorted part of the array.
        3. Swap the minimum element with the element at the current position. 
        4. Move to the next position and repeat steps 2–3 until the array is sorted.
*/

// package SortingTechniques;

// public class Sorting {
//     static void selectionSort(int arr[], int n){
//         for(int i=0; i<=n-1; i++){
//             int min = i;

//             for(int j=i; j<=n-1; j++){
//                 if(arr[j] < arr[min]){
//                     min = j;
//                 }
//             }
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void main(String[] args){
//         int arr[] = {13, 46, 24, 52, 20, 9};
//         int n = arr.length;
//         System.out.println("Before Selection sort");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         selectionSort(arr, n);

//         System.out.println("After selection sort:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }





/*
Bubble sort:- sorting algorithm where adjacent elements are repeatedly compared and swapped if they are in the
wrong order.
Push the maximum element to the last by adjacent swaps.

Steps:- 1. Start from the first element.
        2. Compare with the next element.
        3. Swap if out of order.
        4. Repeat for the whole array.
        5. After each pass, the largest element moves to the end.
        6. Continue until the array is sorted. 
*/
// package SortingTechniques;

// public class Sorting {
//     static void bubbleSort(int arr[], int n) {
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 0; j <= i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {13, 46, 24, 52, 20, 9};
//         int n = arr.length;

//         bubbleSort(arr, n); // 
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }
