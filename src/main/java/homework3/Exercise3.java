package homework3;

// Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Exercise3 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Choose length of array (from 10 to 100): ");
        int length = in.nextInt();
        validate(length);
    }

    public static void validate(int length) {

        if (length >= 10 && length <= 100) {
            fillArray(length);
        } else {
            System.out.println("Number shoud be more than 10 and less than 100");
        }
    }

    public static void fillArray(int length) {
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
            System.out.print(randomArray[i] + " ");
        }
        System.out.print("\n Digit by three: ");
        for (int y = 0; y < length; y++) {
            if ((randomArray[y] % 3) == 0) {
                System.out.print(randomArray[y] + " ");
            }
        }
    }
}
