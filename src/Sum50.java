// Aisha Nicole L. Dones
// Section A122

public class Sum50{

    public static void main(String[] args){
        System.out.println("Created By: Aisha Nicole L. Dones");
        System.out.println("The sum of numbers from 1 to 50 is " + sumAll());
    } // end of main

    private static short sumAll(){
        short sum = 0;
        for (byte i = 1; i <= 50; i++){sum+=i;}
        return sum;
    } // end of sumAll method

} // end of class
