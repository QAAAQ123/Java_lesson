import java.util.IntSummaryStatistics;

public class GenericBoxMain {
    public static void main(String args[]){
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("Kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(new Integer(5));
        Integer intValue = intBox.get();
        System.out.println(intValue);

        
    }
}
