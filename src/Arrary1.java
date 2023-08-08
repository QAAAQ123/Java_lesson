public class Arrary1 {
    public static void main(String args[]){
    int[] array1 = null;
    int array2[] = null;
    int array3[] = null;

    array1 = new int[5];
    array2 = new int[5];
    array3 = new int[0];

    System.out.println(array1.length);
    System.out.println(array2.length);
    System.out.println(array3.length);

    //기본형타입[] 변수명 = new 기본형타입[배열의 크기];
    //기본형타입[] 변수명 = {값,값,값,...};

    int array4[] = new int[5];
    array4[0] = 1;
    array4[1] = 2;
    
    int[] array5 = new int[]{1,2,3,4,5};
    int[] array6  = {1,2,3,4,5};
    }
}
