import java.util.*;

public class ListExam {
    public static void main(String args[]){
        Collection<String> collection = new HashSet<>();
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str); 
        }
    }
    
}
