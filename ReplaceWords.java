import java.util.Scanner;

public class ReplaceWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str = str.replace("python", "temp");
        str = str.replace("java", "python");
        str = str.replace("temp", "java");

        System.out.println(str);
    }
}