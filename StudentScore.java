import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int n = sc.nextInt();

        String highName = "", highId = "";
        String lowName = "", lowId = "";

        int highScore = -1;
        int lowScore = 101;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String id = sc.next();
            int score = sc.nextInt();

            if (score > highScore) {
                highScore = score;
                highName = name;
                highId = id;
            }

            if (score < lowScore) {
                lowScore = score;
                lowName = name;
                lowId = id;
            }
        }

        System.out.println("Highest: " + highName + " " + highId);
        System.out.println("Lowest: " + lowName + " " + lowId);
    }
}