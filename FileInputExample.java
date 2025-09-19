import java.io.File;
import java.util.Scanner;
import java.io.InputStream;
import java.io.PrintStream;

import javax.swing.JOptionPane;

// public class InputChange {

//     public static void main(String[] args) throws Exception {

//         //   String name = JOptionPane.showInputDialog("Enter your name:");
//         // JOptionPane.showMessageDialog(null, "Hello, " + name);
//         // Scanner sc = new Scanner(System.in);

//         File file = new File("Inp.txt");
//         Scanner sc = new Scanner(file);

//         while (sc.hasNextLine()) {
//             String line = sc.nextLine();
//             System.out.println("Read: " + line);
//         }

//         sc.close();

//         int a = sc.nextInt();
//         System.out.println(a);
//     }

// }





public class FileInputExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("Inp.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
}

