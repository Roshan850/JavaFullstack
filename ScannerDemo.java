import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws Exception {
        // try (Scanner sc = new Scanner(System.in)) {
        //     String str = sc.nextLine();
        //        try {
        //         System.setOut(new PrintStream(new FileOutputStream("Ab.txt")));
        //     } catch (Exception e) {
        //         e.printStackTrace();
        //     }

             System.out.println(str);
        // }

          PrintStream out = new PrintStream("Ab.txt");

        out.println("Hello, this is printed without System.out!");
        out.println("Everything goes directly to output.txt");

        out.close(); 
        //        System.out.println("Enter the age: "); // use of next and nextLine
        //        int age = sc.nextInt();
        //        System.out.println("Enter the name: ");
        //        String name = sc.next();
        //        System.out.println("Enter the marks: ");
        //        int marks = sc.nextInt();
        //
        //        System.out.println(name);
        //        System.out.println(age);
        //        System.out.println(marks);b

    }
}
//1. The next it read only single word it will not read after appearing space it
//2. Using nextLine -> after reading intiger value  BufferNext is come this next line store in string of method nextLine
//3. explain  System.out.print(); // ->System is class out is object of PrintStream class present in System class for calling and print is a method of PrintStream Class
//4. explain  PrintStream class
//5. PrintStream class in this class  out object present
//6. out object present in System class which is object  of PrintSteam class
//7. default value of out is null and when we change the null to any
//8. change the default location of output by changing -> System.setOut(new PrintStream(" filePath");
// we can display data without System by making PrintStream out = new PrintStream("File path");
//-> use out.print("hello");  // now the hello not display in console it is display in file
// AT THE CONCLUSION WE CAN DISPLY WITHOUT adding  System

// work is change the default value of InputStream object->in = null ,
// also using System without using Scanner class
// System.setIn()

//codeforwin patters -> patrns

