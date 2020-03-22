import java.util.EmptyStackException;
import java.util.Stack;
public class steck2{


        static void showpush(Stack st, int a) {
            st.push(new Integer(a));
            System.out.println("Добавить(" + a + ")");
            System.out.println("Стек: " + st);
        }

        static void showpop(Stack st) {
            System.out.print("Delete ");
            Integer a = (Integer) st.pop();
            System.out.println(a);
            System.out.println("Стек: " + st);
        }

        public static void main(String args[]) {
            Stack st = new Stack();
            System.out.println("Стек: " + st);
            showpush(st, 42);
            showpush(st, 66);
            showpush(st, 99);
            showpop(st);
            showpop(st);
            showpop(st);
            try {
                showpop(st);
            } catch (EmptyStackException e) {
                System.out.println("Пустой стек");
            }
        }
    }

