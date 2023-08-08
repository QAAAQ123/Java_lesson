import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class SetExam2 {
    public static void main(String args[]){
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim",500));
        mySet.add(new MyData("lee",200));
        mySet.add(new MyData("hong",700));

        Iterator<MyData> iterator = mySet.iterator();
        while(iterator.hasNext()){
            MyData myData = iterator.next();
            System.out.println(myData);
        }
    }
    
}

class MyData{
    private String name;
    private int value;

    public MyData(String name,int value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }

    public String toString(){
        return "MyData{" + "name= " + name + '\'' + ", vlaue= " + value + '}';
    }
}
