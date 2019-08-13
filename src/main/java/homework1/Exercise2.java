package homework1;

public class Exercise2 {
    public static void main(String arg[]) {
        cutByDigits();
    }

    public static void cutByDigits() {
        int n = 876543;
        int n1 = n/100000;
        int n2 = (n%100000)/10000;
        int n3 = (n%10000)/1000;
        int n4 = (n%1000)/100;
        int n5 = (n%100)/10;
        int n6 = n%10;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }
}
