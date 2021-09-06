package Tasks;


import java.util.Scanner;

public class LoginPassword {
    private final String login ;
    private final String password ;

    private LoginPassword(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {
        String[] logPassArr = setLoginPass();
        LoginPassword loginPassword = new LoginPassword(logPassArr[0], logPassArr[1]);
        logPassArr = setLoginPass();
        LoginPassword loginPassword1 = new LoginPassword(logPassArr[0], logPassArr[1]);
        checkLodPass(loginPassword, loginPassword1);


    }

    private static String[] setLoginPass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login.");
        String login = scanner.nextLine();
        System.out.println("Enter your password(8-15).");
        String password = scanner.nextLine();
        if (password.length() < 8 || password.length() > 15) {
            System.out.println("Enter your password again(8-15).");
            password = scanner.nextLine();
        }
        return new String[]{login, password};
    }


    private static void checkLodPass(LoginPassword loginPassword, LoginPassword loginPassword1) {
        if (loginPassword.login.equals(loginPassword1.login) && loginPassword.password.equals(loginPassword1.password)) {
            System.out.println(loginPassword.login + " " + loginPassword.password);
        } else {
            System.out.println("You entered incorrect login or password !!! Good bye!!!");
        }

    }


}
