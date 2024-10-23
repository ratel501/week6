public class Question9 {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};
        int[] copy=new int[num.length];

        for(int i=0;i<num.length;i++){
            copy[i]=num[i];
        }
        for(int i=0;i<num.length;i++){
            System.out.print(copy[i]+"/ "+num[i]);
        }

    }
}
