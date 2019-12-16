/* Разработать программу.
Программа ожидает 2 параметра на входе: имя файла (относительное либо полный путь) и строку/регулярное выражение
После программа выводить все строки (с номером строки в файле), в которых найдена строка либо регулярное выражение.
*/

package homework7;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class TextFinder {
    public static void main(String[] args) {
        String path = args[0];
        String text = args[1];

        File file = new File(path);
//        if (!file.exists() || !file.isFile()) {
//            System.out.println("You can not open this file " + path);
//            throw new IllegalArgumentException("File is not exist or you don't have access to this file");
//        }

        Scanner scanner = null;
        try {
            scanner = new Scanner(file, "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("You can not open this file " + path);
            throw new IllegalArgumentException("File is not exist or you don't have access to this file");
        }
        scanner.useDelimiter("\n");
        String currentLine;
        int lineNumber = 0;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            if (currentLine.indexOf(text) >= 0) {
                System.out.println(lineNumber + ": " + currentLine);
            }
            lineNumber++;
        }
    }
}
