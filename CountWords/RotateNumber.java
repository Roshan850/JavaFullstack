import java.util.Scanner;

public  class RotateNumber {

    public int rotate(int num, int k) {
        // Step 1: Count digits
        int n = num, digits = 0;
        while (n > 0) {
            n /= 10;
            digits++;
        }

        // Step 2: Normalize k (in case k > digits or negative)
        k = k % digits;
        if (k < 0) { // convert negative rotation (left) to equivalent right rotation
            k = k + digits;
        }

        // Step 3: Split number
        int pow = 1;
        for (int i = 1; i <= k; i++) {
            pow *= 10;
        }

        int rightPart = num % pow; // last k digits
        int leftPart = num / pow; // remaining digits

        // Step 4: Combine
        return rightPart * (int) Math.pow(10, digits - k) + leftPart;
    }

    public static void main(String[] args) {
        RotateNumber r = new RotateNumber();
        System.out.println(r.rotate(12345, -1));
       
         Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;
      
        for (int j = 0; j <= name.length() - 1; j++) {
            char ch = name.charAt(j);
            

            if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                count++;
        }
        System.out.println(count);
        
sc.close();
        

    }
}



