import java.util.Scanner;
public class HIW {

    public static void main(String[] args) {

        String i = "Привет мир!" , o = "Hello World!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Чтобы увидеть Привет мир! нажмите еденицу, чтобы увидеть Hello World! любое другое целое число");
        if(sc.hasNextInt()) {
            int t = sc.nextInt();
            if (t == 1) {
                System.out.println(i);
            }
            else {
                System.out.println(o);
            }
        }
        else {
            System.out.println("Все же стоило выбрать целое число...");
        }


    }
}
