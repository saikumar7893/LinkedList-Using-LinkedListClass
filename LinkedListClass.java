import java.util.*;
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        {
            li.addFirst(1);
            li.addFirst(2);
            li.addFirst(3);
            li.addLast(4);
           System.out.println(li);
           li.addLast(5);
           System.out.println(li);
           li.removeFirst();
           System.out.println(li);
           li.remove();
           System.out.println(li);
           System.out.println(li.size());
           for(int i=0;i<li.size();i++)
           {
            System.out.print(li.get(i)+"-->");
           }
           System.out.println("Null");

        }
    }

    
}
