// Aisha Nicole L. Dones
// Section A122

import javax.swing.*;

@SuppressWarnings("DuplicatedCode")
public class StringCount {

    private static int vowN, conN, zeroN, oddN, evenN, speN, spaceN;

    public static void main(String[] args){ script(); } // end of main

    private static void script(){
        String str = JOptionPane.showInputDialog(null, "Type a word: ");
        if (str == null || str.equals("")){
            JOptionPane.showMessageDialog(null, "INVALID INPUT! Please enter a word.");
            script();
        }
        else { countString(str); }
    } // end of script method

    private static void countString(String str){

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] odd = {'1', '3', '5', '7', '9'};

        vowN = conN = zeroN = oddN = evenN = speN = spaceN = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.toLowerCase().charAt(i);
            if (ch >= 'a' && ch <= 'z'){ // for vowel or consonant
                boolean isVowel = false;
                for (char j : vowels){ if(ch == j) { isVowel = true; break;} }
                if (isVowel) { vowN++; } else { conN++; }
            }
            else if (ch == '0'){ zeroN++; } // for zero
            else if (ch > '0' && ch <= '9') { // for odd or even
                boolean isOdd = false;
                for (char j : odd) { if (ch == j) { isOdd = true; break;} }
                if (isOdd) { oddN++; } else { evenN++; }
            }
            else if (ch == ' '){ spaceN++; } // for spaces
            else { speN++; } // for special characters (excluding spaces)
        } showCount(str);
    } // end of countString method

    private static void showCount(String str){
        String text = "String is\t: " + str + "\nVowels\t: " + vowN + "\nConsonants\t: " + conN +
                "\nZero\t: " + zeroN + "\nOdd\t: " + oddN + "\nEven\t: " + evenN +
                "\nSpecial\t: " + speN + "\nSpaces\t: " + spaceN + "\n\nCreated By: Aisha Nicole L. Dones";

        JTextArea textArea = new JTextArea(text);
        JScrollPane scrollArea = new JScrollPane(textArea);

        JOptionPane.showMessageDialog(null, scrollArea);
    } // end of showCount method

} // end of class
