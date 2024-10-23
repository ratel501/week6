public class Question10 {
    public static void main(String[] args) {
        int[] num = {20,30,50,70,90};
        int sum = 0;
        for(int i = 0; i<num.length; i++){
            sum += num[i];
        }
        double avg = (double)sum/num.length;
        System.out.println(avg);
    }
}
