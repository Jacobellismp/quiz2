import java.util.Scanner;

public class SimpleCipher{
    public static void main(String[] args) {
        int inShift;
        String inWord;
        int letter = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word");
        inWord = scan.nextLine();
        int lenght = inWord.length();
        System.out.println("Enter the shift");
        inShift = scan.nextInt();

        while (lenght > 0){
                char chr = inWord.charAt(letter);
                int asciiValue = (int) chr;
                if (asciiValue < 122){
                    asciiValue = 97;
                }
                chr =  (char)(asciiValue + inShift);
         System.out.print(chr);
            letter++;
            lenght--;
        }  
        }
 
    }