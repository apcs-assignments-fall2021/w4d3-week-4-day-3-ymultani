import java.util.Arrays;

public class MyMain {
    // Write a method that prints out all the even numbers in an array backwards
    // Ex: printEvensBackwards([1, 2, 3, 4, 5, 6]) =>
    //     6
    //     4
    //     2
    public static void printEvensBackwards(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    // Next, write a method that checks if an array is sorted in
    // strictly increasing order (i.e. each element must be greater
    // than the previous element)
    // Ex: isIncreasing([1, 2, 3, 4, 5, 6]) => true
    //     isIncreasing([1, 1, 3, 6, 7]) => false (because 1 is not > 1)
    //     isIncreasing([1, 2, 3, 2, 4, 5, 8]) => false
    public static boolean isIncreasing(int[] arr) {
        int count = 0;
        for (int i = 1; i<arr.length; i++){
            if (arr[i]>arr[i-1]){
                count+=1;
            }
            else{
                count = count;
            }
        }
        if (count == arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    // (Maybe Optional):
    // Write a method that checks if an array is "balanced". An array
    // is balanced if the first and last values differ by at most 2, and
    // if the second and second to last values differ by at most 2, and so on
    // Ex: isBalanced([1, 2, 3, 2, 1]) => true
    //     isBalanced([1, 2, 3, 4, 1, -1]) => true
    //     isBalanced([1, 2, 3, 7, 2, 1]) => false (because 7 - 3 > 2)
    public static boolean isBalanced(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            if(Math.abs(arr[i]-arr[j])>2){
                return false;
            }
            j--;
        }
        return true;
    }

    // Write a method that takes an array and checks if it contains
    // any duplicate values
    // Ex: containsDuplicates([1, 2, 3, 2, 1]) => true
    //     containsDuplicates([7, 2, 3, 4, 1, 5]) => false
    public static boolean containsDuplicates(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Sorting:
    // Implement the bubble sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length -1; i++){
            for(int j = i+1; j<= arr.length-1; j++){
                if(arr[i]>arr[j]) {


                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }

        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println("printEvensBackwards Tests:");
        printEvensBackwards(new int[] {1, 2, 3, 4, 5, 6});
        // 6
        // 4
        // 2

        System.out.println();
        System.out.println("isIncreasing Tests:");
        System.out.println(isIncreasing(new int[] {1, 2, 3, 4, 5, 6})); // true
        System.out.println(isIncreasing(new int[] {1, 1, 3, 6, 7})); // false (because 1 is not > 1)
        System.out.println(isIncreasing(new int[] {1, 2, 3, 2, 4, 5, 8})); // false

        System.out.println();
        System.out.println("isBalanced Tests:");
        System.out.println(isBalanced(new int[] {1, 2, 3, 2, 1})); // true
        System.out.println(isBalanced(new int[] {1, 2, 3, 4, 1, -1})); //true
        System.out.println(isBalanced(new int[] {1, 2, 3, 7, 2, 1})); // false (because 7 - 3 > 2)

        System.out.println();
        System.out.println("containsDuplicates Tests:");
        System.out.println(containsDuplicates(new int[] {1, 2, 3, 2, 1})); // true
        System.out.println(containsDuplicates(new int[] {7, 2, 3, 4, 1, 5})); // false

        System.out.println();
        System.out.println("Bubble Sort Tests");
        System.out.println(Arrays.toString((bubbleSort(new int[] {6, 1, 3, 8, 2, 9})))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(new int[] {12, 5, 23, 74, 12, 86, 2})); // [2, 5, 12, 23, 74, 86]
    }
}