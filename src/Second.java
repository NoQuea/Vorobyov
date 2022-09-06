import java.util.Scanner;
//Составить алгоритм: если введенное имя совпадает с
//Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean i = true;
        while (i) {
            if (sc.nextLine().equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
                break;
            } else System.out.println("Нет такого имени");
        }
    }
}