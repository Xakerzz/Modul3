import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectNumber = false;
        while (!isCorrectNumber){
            String phoneNumber = scanner.nextLine();
            isCorrectNumber = checkNumber(phoneNumber);
            if (!isCorrectNumber){
                System.out.println("Enter your phone number again. Wrong format of phone number.");

            } else {
                System.out.println(formatPhoneNumber(phoneNumber));
            }
        }

    }

    private static boolean checkNumber(String phoneNumber){
        String clean = phoneNumber.replaceAll("[^0-9]","");
        System.out.println(clean.length());

        return clean.length()==11;
    }

    private static String formatPhoneNumber (String phoneNumber){
        String clean = phoneNumber.replaceAll("[^0-9]","");
        System.out.println(clean);

        return "+7 " + clean.substring(1,4) + " " +  clean.substring(4,7) + " " +  clean.substring(7,9) + " " + clean.substring(9,11);
    }
}
