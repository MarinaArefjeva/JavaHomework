import java.util.Scanner;

public class UserFullName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Привет как тебя зовут?");
        String firstName = reader.nextLine();

        System.out.println("Какая у тебя фамилия?");
        String secondName = reader.nextLine();

        String fullName = firstName + " " + secondName;
        System.out.println("Марина Арефьева: " + fullName);

        reader.close();
    }
}




