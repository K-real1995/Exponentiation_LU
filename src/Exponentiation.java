import java.util.InputMismatchException;
import java.util.Scanner;

public class Exponentiation{
    //Cоздаем метод выводящий меню, принимающий на вход с консоли числа и запускающий поток на возведение в степень
    public static void exponentation() {
        Scanner in = new Scanner(System.in);
        String menu = """
                ____МЕНЮ____
                1.Произвести возведение числа в степень
                2.Выход
                """;
        int choice;
        while (true){
            System.out.println(menu);
            try {
                choice = in.nextInt();
                switch (choice){
                    case 1 -> {
                        Scanner firstInput = new Scanner(System.in);
                        System.out.println("Введите число которое хотите возвести в степень: ");
                        int num1 = firstInput.nextInt();
                        Scanner secondInput = new Scanner(System.in);
                        System.out.println("Введите степень в которую хотите возвести: ");
                        int num2 = secondInput.nextInt();
                        MyThread thread = new MyThread(num1,num2);
                        thread.start();
                    }
                    case 2 -> {
                        System.out.println("Выходим из программы...");
                        System.exit(0);
                    }
                    default -> System.out.println("Нет такого пункта меню попробуйте еще раз");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Нет такого пункта меню попробуйте еще раз");
            }
            in.nextLine();
        }
    }
}
