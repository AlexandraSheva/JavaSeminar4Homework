import java.util.LinkedList;
import java.util.List;

/**
 * Task0. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class Task0 {

  public static void main(String[] args) {
    task0();
  }

  static void task0() {
    List <Integer> list = new LinkedList<>();
    list.add(10);
    list.add(11);
    list.add(12);
    list.add(13);
    list.add(14);
    list.add(15);
    System.out.println(list);
    List <Integer> newList = new LinkedList<>();
    for(int i = list.size()-1; i>=0; i--) {
      newList.add(list.get(i));
    }
    System.out.println(newList);
  }
}