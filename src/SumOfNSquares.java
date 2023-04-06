// Aisha Nicole L. Dones
// Section A122

import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class SumOfNSquares {

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
        for (int i = 1; i<=n; i++){
            int square = i*i;
            if (i == n){ System.out.print(square + " = "); }
            else { System.out.print(square + " + "); }
            sum += square;
        }
        System.out.print(sum);
    } // end of sumOfN method

} // end of class