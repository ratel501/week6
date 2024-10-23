public class Question5 {
    public static void main(String[] args) {
        int[] nums ={12,3,19,7,5};
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            System.out.println("max: " + min);
            System.out.println("i: " + i);
            System.out.println("/num[i] = " + nums[i]);
            if(min > nums[i]) {
                min = nums[i];
            }
            System.out.println();
        }
        System.out.println(min);
    }
}
