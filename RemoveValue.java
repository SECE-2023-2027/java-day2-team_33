public class RemoveValue {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 6, 2};
        int value = 6;

        int count = 0;

        for (int num : arr) {
            if (num != value) {
                count++;
            }
        }

        System.out.println("New Length: " + count);
    }
}