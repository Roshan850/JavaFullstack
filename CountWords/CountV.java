import java.util.Scanner;

public class CountV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         int count = 0;
      
//         for (int i = 0; i <= name.length() - 1; i++) {
//             char ch = name.charAt(i);

//             if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//                     || ch == 'O' || ch == 'U')
//                 count++;
//         }
//         System.out.println(count);
        
// sc.close();

int n = sc.nextInt();

long fact = 1;
for (int i = 1; i <= n; i++) {
    fact = fact * i;
}

System.out.println(fact);
    }
    
}
