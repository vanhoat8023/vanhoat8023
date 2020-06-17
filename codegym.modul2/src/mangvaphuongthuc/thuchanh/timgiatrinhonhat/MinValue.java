package mangvaphuongthuc.thuchanh.timgiatrinhonhat;

public class MinValue {
    public static void main(String[] args) {
        int[] array={9,2,3,4,5,6};
        int result=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<result){
                result=array[i];
            }
        }
        System.out.println("result: "+result);
    }
}
