import java.util.Scanner;

public class Timetable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter First number :");
        m = input.nextInt();
        System.out.println("Enter Last Number :");
        n = input.nextInt();
        input.close();
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
            System.out.println("\n\n");

        }

    }

}
