import java.util.Scanner;

public class Strings {
    public  static void main(String[] args) {
        String userInput = getWord();
        char[] charArray = stringToCharArray(userInput);
        sortOutCharArray(charArray);
    }

    private static String getWord (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static char[] stringToCharArray(String userInput){
        int y = userInput.length();
        char [] charArray = new char[y];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = userInput.charAt(i);
        }
        return  charArray;
    }

    private static void sortOutCharArray (char [] charArray){

        for (char ch : charArray) System.out.print(ch + " ");
        System.out.println();
        for (int i = 1;i<charArray.length;i++)
            System.out.println(charArray[i]);

    }
}




