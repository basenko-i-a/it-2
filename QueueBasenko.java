import java.util.PriorityQueue;
import java.util.Scanner;

public class bobobochered {
    public static void main(String[] args){
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 4 целых числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        myPriorityQueue.add(a);
        myPriorityQueue.add(b);
        myPriorityQueue.add(c);
        myPriorityQueue.add(d);
        System.out.println("Очередь:" +myPriorityQueue);
        System.out.println("Введите числo:");
        int e = scan.nextInt();
        myPriorityQueue.remove(a);
        myPriorityQueue.remove(b);
        myPriorityQueue.remove(c);
        myPriorityQueue.remove(d);

        myPriorityQueue.add(a+e);
        myPriorityQueue.add(b+e);
        myPriorityQueue.add(c+e);
        myPriorityQueue.add(+e);
        System.out.println("Очередь:" +myPriorityQueue);
        }
}