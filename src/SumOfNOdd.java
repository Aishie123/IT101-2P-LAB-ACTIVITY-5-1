// Aisha Nicole L. Dones
// Section A122

import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class SumOfNOdd {

    public static void main(String[] args){
        System.out.println("Created By: Aisha Nicole L. Dones");
        script();
    } // end of main

    private static void script(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Value of N: ");
            int n = input.nextInt();
            sumOfN(n);
        } catch (Exception e){
            System.out.println("INVALID INPUT! Please try again.");
            script();
        }
    } // end of script method

    private static void sumOfN(int n){
        int sum = 0;
        for (int i = 0; i<n; i++){
            int num = 1 + (i*2);
            if (i == n-1){ System.out.print(num + " = "); }
            else { System.out.print(num + " + "); }
            sum += num;
        }
        System.out.print(sum);
    } // end of sumOfN method
    
} // end of class