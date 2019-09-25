package homework2;

public class Exercise2 {
    public static void main(String[] args) {
        int n = 38735;
        int[] result = new int[5];
        int max = result[0];
        int min = result[0];
        for (int i = 0; i < 5; i++) {
            result[i] = n % 10;
            n = n / 10;
            if (i >= 1) {
                if (result[i - 1] > result[i]) {
                    max = result[i - 1];
                    min = result[i];
                } else {
                    max = result[i];
                    min = result[i - 1];
                }
            }
            System.out.print(result[i] + " ");
        }
        System.out.println("\n" + "max = " + max);
        System.out.println("min = " + min);
    }
}
