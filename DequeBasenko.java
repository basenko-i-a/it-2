import java.util.ArrayDeque;
import java.util.Scanner;

public class gggg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> hhh = new ArrayDeque<>();
        System.out.println("Введите 4 целых числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        hhh.addFirst(a);
        hhh.add(b);
        hhh.add(c);
        hhh.addLast(d);
        System.out.println(hhh);
        int sum = a+b+c+d;
        hhh.clear();
        hhh.addFirst(a);
        hhh.add(sum);
        hhh.add(b);
        hhh.add(sum);
        hhh.add(c);
        hhh.add(sum);
        hhh.add(d);
        hhh.addLast(sum);
        System.out.println(hhh);
    }
}
