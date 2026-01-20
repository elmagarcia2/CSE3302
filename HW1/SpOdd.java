package HW1;

import java.util.Scanner; 

public class SpOdd {
    public static int[] spOdd(int[] arr) {
        int odd = 0, oddIndex = 0;
        // taking the odd numbers
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                odd++;
            }
        }
        int [] oddArr = new int[odd];
        // printing the results
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddArr[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        return oddArr;
    }
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int [7];
        System.out.println("Enter 7 integers: ");
        for(int i = 0; i < 7; i++) { // letting the user enter 7 ints
            arr[i] = scanner.nextInt();
        }
        System.out.print("Original Array: ["); //printing the og array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        // creating and calling the oddArr SpOdd function
        int [] oddArr = spOdd(arr);
        System.out.print("Odd elements in the array: ["); //printing the ODD array
        for(int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i]);
            if(i < oddArr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");


        scanner.close(); // close the scanner
    }
}
