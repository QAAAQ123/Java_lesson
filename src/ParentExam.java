public class ParentExam {
    public static void main(String args[]){
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printIntI();
        System.out.println();

        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printIntI();
        System.out.println();

        Parent p2 = new Child();
        System.out.println(p2.i);
        p2.printIntI();
        p2.printII();
    }
}
