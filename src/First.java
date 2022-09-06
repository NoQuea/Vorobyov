import java.util.Scanner;
//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean i = true;
        while (i) {
            if (sc.nextInt() > 7) {
                System.out.println("Привет");
                break;
            } else System.out.println("Wrong number");
        }
    }
}
