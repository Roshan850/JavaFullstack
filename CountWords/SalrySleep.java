import java.util.Scanner;

class SalrySleep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Salery : ");
        float basic = sc.nextFloat();

       float hra = 0.20 * basic;
        float da = (50 / basic)*100;
        System.out.println("Gs : "+ hra + da + basic);

    }
}
