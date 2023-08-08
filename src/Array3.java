import java.util.Arrays;
public class Array3 {
    public static void main(String args[]){
        Item[] items = new Item[5];
        items[0] = new Item("Java",5000);
        items[1] = new Item("파이썬",4);
        items[2] = new Item("C#",545);
        items[3] = new Item("javascript",155);
        items[4] = new Item("Dart",500);

        //람다 표현식
        Arrays.sort(items,(item1,item2)-> item1.getName().compareTo(item2.getName()));

        for(Item item: items){
            System.out.println(item);
        }

    }
}
//Compareable는 어떤 Item이 큰지 ,작은지 기준을 정하는 인터페이스
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }

    //Object가 매개변수이지만 실제로 Item이 들어온다
    public int compareTo(Object o){
        Item d = (Item)o;
        return this.name.compareTo(d.name);  
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
//명령을 실행할때 성공하면 아무런 메세지도 출력하지 않는다.->Unix 철학
//Unix는 작은 명령들을 조합해서 또 다른 명령을 만든다.(쉘 스크립트 작성)