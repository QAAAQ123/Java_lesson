public class PersonTest {
    public static void main(String args[]){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";//문자열은  new를 사용하지 않고 인스턴스를 사용할 수 있다.  
        p2.name = "조조";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.isVip);
        System.out.println("---------------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip+"\n");

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);
        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);

        p1.printName();
        p1.printCount();

        Person.count++;
        p1.printCount();

    }
}
