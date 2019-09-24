package homework1;

public class Exercise2 {
    public static void main(String arg[]) {
        cutByDigits();
    }

    public static void cutByDigits() {
        int n = 876543;
        int[] res = new int[6];
        for (int i = 0; i < 6; i++) {
            res[i] = n % 10;
            n = n / 10;
            System.out.println(res[i]);
        }
    }
}
