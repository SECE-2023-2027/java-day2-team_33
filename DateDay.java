import java.util.Scanner;

public class DateDay {
    public static void main(String[] args) {

        String[] days = {
                "Thursday", "Friday", "Saturday",
                "Sunday", "Monday", "Tuesday",
                "Wednesday"
        };

        int[] monthDays = {
                31,29,31,30,31,30,
                31,31,30,31,30,31
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Month: ");
        int month = sc.nextInt();

        System.out.print("Date: ");
        int date = sc.nextInt();

        int totalDays = date - 1;

        for (int i = 0; i < month - 1; i++) {
            totalDays += monthDays[i];
        }

        System.out.println(days[totalDays % 7]);
    }
}