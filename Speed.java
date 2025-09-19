public class Speed {
    public static void main(String[] args) {
        String name = "Yash";
        long startTime = System.nanoTime();
        for(int i = 0 ;i< 100000;i++){
            name = name + "A";
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        
        StringBuilder st = new StringBuilder("Yash");
        long startTime2 = System.nanoTime();
        for(int i = 0 ;i< 100000;i++){
            st.append("A");
        }
        
        long endTime2 = System.nanoTime();
        System.out.println(endTime2 - startTime2);

    }
}
