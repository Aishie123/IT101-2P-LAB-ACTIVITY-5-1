// Aisha Nicole L. Dones
// Section A122

public class EvenNum {

    public static void main (String[] args){
        System.out.println("Created By: Aisha Nicole L. Dones");
        System.out.println("Even Numbers from 1 to 50");
        System.out.println("---Using for loop---"); forLoop();
        System.out.println("\n---Using while loop---"); whileLoop();
        System.out.println("\n---Using do-while loop---"); doWhileLoop();
    } // end of main

    private static void forLoop(){
        for (byte i = 1; i <= 50; i++){ if (i%2 == 0) { System.out.print(i + " "); } }
    } // end of forLoop method

    private static void whileLoop(){
        byte i = 1;
        while (i <= 50){
            if (i%2 == 0) { System.out.print(i + " "); }
            i++;
        }
    } // end of whileLoop method

    private static void doWhileLoop(){
        byte i = 1;
        do{
            if (i%2 == 0) { System.out.print(i + " "); }
            i++;
        } while (i <= 50);
    } // end of doWhileLoop method

} // end of class
