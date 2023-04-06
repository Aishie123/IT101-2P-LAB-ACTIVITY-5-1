// Aisha Nicole L. Dones
// Section A122

public class TableOfSquares {
    public static void main (String[] args) {
        System.out.println ("Created By: Aisha Nicole Dones");
        System.out.println ("\n---Using for loop---"); forLoop();
        System.out.println ("\n---Using while loop---"); whileLoop();
        System.out.println ("\n---Using do-while loop---"); doWhileLoop();
    } // end of main
    
    private static void forLoop() {
        for (byte i = 1; i <= 20; i++) { System.out.println("Number: " + i + " Square: " + (i*i)); }
    } // end of forLoop method
        
    private static void whileLoop() {
        byte i = 1;
        while (i <= 20) { System.out.println("Number: " + i + " Square: " + (i*i)); i++; }
    } // end of whileLoop method
        
    private static void doWhileLoop() {
        byte i = 1;
        do { System.out.println("Number: " + i + " Square: " + (i*i)); i++; } while (i <= 20);
    } // end of doWhileLoop method

} // end of class