import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private   static  void showMenu() {
        System.out.println("Выберите тип коллекции: ");
        System.out.println("1. List");
        System.out.println("2. Set");
        System.out.println("3. Deque");
        System.out.println("4. Map");
        System.out.print(">");
    }

    private static void showMenuOfSet(){

    }

    private  static void showMenuOfMap(){

    }

    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    new ListUiHandler().call();
                    break;
                case 2:
                    showMenuOfSet();
                    break;
                case 3:
                    new DequeUiHanler().call();
                    break;
                case 4:
                    showMenuOfMap();
                    break;

                default:
                    return;

            }

        }



    }


}
