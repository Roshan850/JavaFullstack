import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner("This is College.");
        int count = 0;

        while (sc.hasNext()){
            count++;
            sc.next();
        }
        System.out.println("The count: "+count);

    }
}
