import java.util.List;
import java.util.*;

public class StringSubSeq {
    

    // Function to return all subsequences (non-recursive)
    public static List<String> getAllSubsequences(String str) {
        List<String> result = new ArrayList<>();
        int n = str.length();
        int total = 1 << n; // 2^n subsequences

        for (int i = 0; i < total; i++) {
            StringBuilder subseq = new StringBuilder();

            for (int j = 0; j < n; j++) {
                // if i-th bit is set, include str.charAt(i)
                if ((i & (1 << j)) != 0) {
                    subseq.append(str.charAt(j));
                }
            }
            result.add(subseq.toString()); // add subsequence ("" also included)
        }

        return result;
    }

    public void subCode(String str, String empty) {
        if (str.length() <= 0) {
            System.out.print(empty+" ");
            return;
        }
        char ch = str.charAt(0);
        subCode(str.substring(1), empty + ch);
        subCode(str.substring(1), empty);
        
    }

    public static void main(String[] args) {
        String input = "joy";

        List<String> subsequences = getAllSubsequences(input);

        System.out.println("Subsequences of \"" + input + "\": " + subsequences);
        StringSubSeq s = new StringSubSeq();
        s.subCode(input, " ");
    }
}