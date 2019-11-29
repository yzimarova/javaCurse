package homework3;

// Программа должна определить, является ли последовательность палиндромом.

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type string: ");
        String string = in.nextLine();
        char[] chars = string.toCharArray();
        char[] array1 = new char[chars.length];
        char[] array2 = new char[chars.length];
        boolean a = true;
        printResult(compareArreys(getString1(chars, array1), getString2(chars, array2), a));
    }

    public static char[] getString1(char[] chars, char[] array1) {
        for (int i = 0; i < chars.length / 2; i++) {
            array1[i] = chars[i];
//            System.out.print(array1[i]);
        }
        return array1;
    }

    public static char[] getString2(char[] chars, char[] array2) {
        int x = 0;
        if (chars.length%2 == 0) {
            for (int j = chars.length - 1; j >= chars.length / 2; j--) {
                array2[x] = chars[j];
//                System.out.print(array2[x]);
                x++;
            }
        } else {
            for (int j = chars.length - 1; j > chars.length / 2; j--) {
                array2[x] = chars[j];
//                System.out.print(array2[x]);
                x++;
            }
        }
        return array2;
    }

    public static boolean compareArreys(char array1[], char array2[], boolean a) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                a = true;
            } else {
                a = false;
                return a;
            }
        }
        return a;
    }

    public static void printResult(boolean a) {
        if (a == true) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
