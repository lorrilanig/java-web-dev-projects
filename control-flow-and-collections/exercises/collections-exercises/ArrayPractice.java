public class ArrayPractice {
    public static void main(String [] args) {
        int nums[] = {1, 2, 3, 4, 5, 8};

        for (int i : nums) {
//            System.out.println(i);
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }

}
