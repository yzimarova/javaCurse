package homework2;

public class Exercise2 {
    public static void main(String[] args) {
        getMax(getDigits());
        getMin(getDigits());
    }

    public static int[] getDigits() {
        int n = 38735;
        int n1 = n / 10000;
        int n2 = (n % 10000) / 1000;
        int n3 = (n % 1000) / 100;
        int n4 = (n % 100) / 10;
        int n5 = n % 10;
        int[] result = {n1, n2, n3, n4, n5};
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
        return result;
    }

    public static int getMax(int[] result) {
        int max = result[0];
        for (int i = 1; i < 5; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }
        System.out.println("max = " + max);
        return max;
    }

    public static int getMin(int[] result) {
        int min = result[0];
        for (int i = 1; i < 5; i++) {
            if (result[i] < min) {
                min = result[1];
            }
        }
        System.out.println("min = " + min);
        return min;
    }
}
