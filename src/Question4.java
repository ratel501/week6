public class Question4 {
    public static void main(String[] args) {
        int[] nums ={3,7,2,9,4};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            System.out.println("max: " + max);
            System.out.println("i: " + i);
            System.out.println("/num[i] = " + nums[i]);
            if(max < nums[i]) {
                max = nums[i];
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
