package homework1;

public class Exercise1 {
    public static void main(String arg[]) {
        calculateLong();
        calculateInt();
        calculateFloat();
        calculateDouble();
    }

    private static long calculateLong() {
        long x = 590093938;
        long y = 23000050;
        long z = 14448;
        long n = 18;
        long res1;
        res1 = x - (y + 23) / z * n;
        System.out.println(x + " - " + "(" + y + " + 23)/" + z + "*" + n + " = " + res1);
        return res1;
    }

    private static int calculateInt() {
        int x = 7880;
        int y = 93949494;
        int z = 666;
        int n = 8;
        int res2;
        res2 = (x + (50 - y * z) / n) - x;
        System.out.println("(" + x + " + " + "(50 - " + y + "*" + z + ")/" + n + ") - " + x + " = " + res2);
        return res2;
    }

    private static float calculateFloat() {
        float x = 7867.468f;
        float y = 9394.43f;
        float z = 666.3f;
        float n = 8.7f;
        float res3;
        res3 = x/(y*(z - 1) - 564) + n;
        System.out.println(x + "/(" + y + "*(" + z + " - 1)" + " - 564" + " + " + n + " = " + res3);
        return res3;
    }

    private static double calculateDouble() {
        double x = 789767.468;
        double y = 93394.43;
        double z = 61166.3;
        double n = 86.7;
        double res4;
        res4 = -x/-y + z/(n - 15);
        System.out.println("-" + x + "/-" + y + " + " + z + "/(" + n + " - 15)"  + " = " + res4);
        return res4;
    }
}
