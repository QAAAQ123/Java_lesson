public class BookExam1 {
    public static void main(String args[]){
        Book b1 = new Book();
        //b1.price = 100;//private필드는 직접 접근 불가능
       b1.setPrice(500);
       System.out.println(b1.getPrice());
       //setter,getter 메소드->프로퍼티(property)

       b1.setTitle("abcdefg");
       System.out.println(b1.getTitle());
    }
}
