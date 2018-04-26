import java.util.*;

public class DequeUiHanler implements UiHandler {
    private final Scanner in = new Scanner(System.in);
    public void call() {
        Deque deque = new LinkedList();
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println(deque);
                    break;
                case 2:
                    System.out.println("Deque.isEmpty() == " + deque.isEmpty());
                    break;
                case 3:
                    contains(deque);
                    break;
                case 4:
                    System.out.println("Введите элемент");
                    deque.addFirst(in.next());
                    break;
                case 5:
                    System.out.println("Введите элемент");
                    deque.addLast(in.next());
                    break;
                case 6:
                    try{
                        System.out.println("Deque.removeFirst() == %s" + deque.removeFirst());
                    } catch (NoSuchElementException e) {
                        System.out.println("Deque.removeFirst() == %s" + e);
                        }
                    break;
                case 7:
                    try {
                        System.out.println("Deque.removeLast() == %s" + deque.removeLast());
                    } catch (NoSuchElementException e) {
                        System.out.println("Deque.removeLast() == %s" + e);
                    }
                    break;
                case 8:
                    System.out.println("Deque.getFirst() == %s" + deque.getFirst());
                    break;
                case 9:
                    System.out.println("Deque.getLast()  == %s" + deque.getLast());
                    break;
                case 10:
                    System.out.println("Deque.pollFirst() == %s" + deque.pollFirst());
                    break;
                case 11:
                    System.out.println("Deque.pollLast() == %s" + deque.pollLast());
                    break;
                default:
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println("\n Выберите действие над коллекцией: ");
        System.out.println("1.  showItems");
        System.out.println("2.  isEmpty");
        System.out.println("3.  contains");
        System.out.println("4.  addFirst");
        System.out.println("5.  addLast");
        System.out.println("6.  removeFirst");
        System.out.println("7.  removeLast");
        System.out.println("8.  getFirst");
        System.out.println("9.  getLast");
        System.out.println("10. pollFirst");
        System.out.println("11. pollLast");
        System.out.println("12. goToMainMenu");
        return;
    }

    private void contains(Deque deque) {
        System.out.println("Введите элемент ");
        String item = in.next();
        System.out.println(String.format("Decue.contains(%s) == %b", item, deque.contains(item)));
    }


}
