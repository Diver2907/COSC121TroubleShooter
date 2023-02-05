package Troubleshooting;
import java.util.Arrays;
public class Bubblesort{
    public static void main(String[] args){
        final int[] array = {4,6,2,3,5};
        System.out.println(Arrays.toString(array));
        for (int i=0;i<array.length;i++){
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}