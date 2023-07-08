/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;
import java.util.Queue;

public class Task1 {
  public static void main(String[] args) {
    System.out.println(enqueue());
    System.out.println(dequeue(enqueue()));
    System.out.println(first(enqueue()));
  }

  static Queue<Integer> enqueue() {
    Queue<Integer> queue = new LinkedList<Integer> ();
    queue.add (1);
    queue.add (2);
    queue.add (3);
    queue.add (4);
    queue.add (5);
    queue.add (6);
    queue.add (7);
    return queue;
    
  }

  static Integer dequeue(Queue<Integer> queue) {
    return queue.remove();
  }

  static Integer first(Queue<Integer> queue) {
    return queue.element();
  }


}
