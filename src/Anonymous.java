public class Anonymous {
    public static void main(String args[]){
        Instance I = new Instance(){
            public void print(){
                System.out.println("익명 클래스");
            }
        };

        I.print();
    }
}
