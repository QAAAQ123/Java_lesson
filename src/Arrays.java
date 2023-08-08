import java.util.Arrays;
public class Arrays{
    public static void main(String args[]){
        int[] copyFrom = {1,2,3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom,copyFrom.length);

        for(int c : copyTo){
            System.out.println(c);
        }
        System.out.println("------------------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom,5);

        for(int c: copyTo2){
            System.out.println(c);
        }
        System.out.println();

        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,5};

        int compare = java.util.Arrays.compare(array1,array2);
        System.out.println(compare);
    }
    //깊은 복사 vs 얕은 복사
}