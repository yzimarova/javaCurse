package homework2;
import java.util.Scanner;
// Напишите программу, в которой задаются данные(строки): имя, фамилия и отчество и  выводящую эти  данные
public class Exercise1 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("ФИО: ");
        String name = in.nextLine();
        String course = "Курс: Java core";
        String student = "Студент";
        drawStars(getLength(name));
        drawText(name, course);
        drawText(name, student);
        drawName(name);
        drawStars(getLength(name));
    }

    public static int getLength(String name) {
        int length = name.length();
        return length;
    }

    public static void drawStars(int length) {
        for(int i = 1; i <= length + 4; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawName(String name) {
        System.out.println("* " + name + " *");
    }

    public static void drawText(String name, String text) {
        int gaps = (name.length() - text.length())/2;
        System.out.print("*");
        for (int i = 0; i <= gaps; i++) {
            System.out.print(" ");
        }
        System.out.print(text);
        for (int i = 0; i <= gaps; i++) {
            System.out.print(" ");
        }
        if (name.length()%2 == 0) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
