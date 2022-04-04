import static java.lang.Math.pow;
//Создаем свой поток, наследуемся от класса Thread
public class MyThread extends Thread{
    public int num1;
    public int num2;

//Создаем конструктор принимающий два
    public MyThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    //Переопределяем метод run на возведение числа в степень
    @Override
    public void run() {
        try {
            System.out.println("Вычисляю...\n");
            MyThread.sleep(10000);
            System.out.println("Результат возведения числа- " + num1 + " в степень- " + num2 +
                    ". Равен: " + pow(num1, num2) + "\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
