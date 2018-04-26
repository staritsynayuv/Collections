import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUiHandler implements UiHandler {
    private final Scanner in = new Scanner(System.in);

    @Override
    public void call() {
        List list = new ArrayList();
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("List.isEmpty() == " + list.isEmpty());
                    break;
                case 2:
                    contains(list);
                    break;
                case 3:
                    add(list);
                    break;
                case 4:
                    System.out.println("Введите индекс и элемент");
                    list.add(in.nextInt(), in.next());
                    break;
                case 5:
                    System.out.println("Введите элемент ");
                    list.remove(in.next());
                    break;
                case 6:
                    System.out.println("Введите позицию элемента");
                    list.remove(in.nextInt());
                    break;
                case 7:
                    System.out.println(list);
                    break;

                default:
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println("\nВыберите действие над коллекцией: ");
        System.out.println("1. isEmpty");
        System.out.println("2. contains");
        System.out.println("3. add");
        System.out.println("4. addBylndex");
        System.out.println("5. remove");
        System.out.println("6. removeByIndex");
        System.out.println("7. showItems");
        System.out.println("8. goToMainMenu");
        System.out.print(">");
    }

    private void contains(List list) {
        System.out.println("Введите элемент ");
        String item = in.next();
        System.out.println(String.format("List.contains(%s) == %b", item, list.contains(item)));
    }

    private void add(List list) {
        System.out.println("Введите элемент ");
        String item = in.next();
        System.out.println(String.format("List.add(%s) == %b", item, list.add(item)));
    }
}
