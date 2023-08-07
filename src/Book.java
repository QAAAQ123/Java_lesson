public class Book {
    private int price; //field price
    private String title;
    //필드의 값을 수정하거나 얻기 위해서 메소드를 만든다
    //setter,getter메소드 사용
    public int getPrice(){//price property
        return this.price; //this는 내 자신 인스턴스를 참조하는 예약어
    }

    public void setPrice(int price){//price property
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    //Book class는 property를 2개 가지고 있다
}
