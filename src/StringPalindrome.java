// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

public class StringPalindrome {

    private static String str;

    public static void main(String[] args) {

        str = JOptionPane.showInputDialog(null, "Enter a String: ");

        if (isPalindrome(reverse(str))){
            JOptionPane.showMessageDialog(null, str + " is a Palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, str + " is NOT a Palindrome.");
        }
    } // end of main

    public static String reverse(String str){
        StringBuilder reversedString = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){ reversedString.append(str.charAt(i)); }
        return String.valueOf(reversedString);
    } // end of reverse method

    public static boolean isPalindrome(String strReverse){ return strReverse.equalsIgnoreCase(str); }
    // end of isPalindrome method

} // end of class
