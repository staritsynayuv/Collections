import java.util.Scanner;

public class Main {
    private final Scanner in = new Scanner(System.in);
    private final ListUiHandler listUiHandler = new ListUiHandler();
    private final SetUiHandler setUiHandler = new SetUiHandler();
    private final DequeUiHanler dequeUiHanler = new DequeUiHanler();
    private final MapUiHandler mapUiHandler = new MapUiHandler();

    public static void main(String[] args) {
        new Main().call();
    }

    private void call() {
        while (true) {
            showMenu();
            getHandler().call();
        }
    }

    private UiHandler getHandler() {
        switch (in.nextInt()) {
            case 1:
                return listUiHandler;

            case 2:
                return setUiHandler;

            case 3:
                return dequeUiHanler;

            case 4:
                return mapUiHandler;

            default:
                return new FinalUiHandler();
        }
    }

    private void showMenu() {
        System.out.println("Выберите тип коллекции: ");
        System.out.println("1. List");
        System.out.println("2. Set");
        System.out.println("3. Deque");
        System.out.println("4. Map");
        System.out.print(">");
    }
}
