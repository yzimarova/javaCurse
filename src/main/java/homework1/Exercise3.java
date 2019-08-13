package homework1;

public class Exercise3 {
    public static void main(String arg[]) {
        vector();
    }

    public  static void vector() {
        double x = 27;
        double y = 21;
        double z = 16;
        double length;
        length = Math.sqrt(x*x + y*y + z*z);
        double xNew = x/length;
        double yNew = y/length;
        double zNew = z/length;
      //  System.out.printf("Единичный вектор для вектора (%d, %d, %d) => (%d, %d, %d)", x, y, z, xNew, yNew, zNew);
        System.out.println("Единичный вектор для вектора (" + x + ", " + y + ", " + z + ") => (" + xNew + ", " + yNew + ", " + zNew + ")");
    }
}
