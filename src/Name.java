
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName){
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
       String [] words = name.trim().split(" ");
       return words.length == 3;
    }

    private static void sortBylength(String [] words){
        for (int i = 0; i < words.length-1 ; i++) {
            for (int j = 0; j <words.length-1 ; j++) {
                if (words[j].length()> words[j+1].length()) {
                    String tmp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = tmp;
                }
            }
        }

    }

    private static String formatName(String name){
        String [] words = name.trim().split(" ");
        StringBuilder result = new StringBuilder();
        sortBylength(words);
        for (String str : words) {
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result.append(Character.toUpperCase(firstChar)).append(str.substring(1)).append(" ");
            } else {
                result.append(str);
            }
        }
        return result.toString();
    }


}