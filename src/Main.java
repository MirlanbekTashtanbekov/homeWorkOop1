import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Дайте значение для А : ");triangle.a = scanner.nextDouble();
        System.out.print("Дайте значение для B : ");triangle.b = scanner.nextDouble();
        System.out.print("Дайте значение для C : ");triangle.c = scanner.nextDouble();

        triangle.area();





    }
}