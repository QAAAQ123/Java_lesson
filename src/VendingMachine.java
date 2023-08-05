public class VendingMachine {
    public static void printVersion(){
        System.out.println("Version 1.0");
    }

    public String pushProductButton(int menuId){
        System.out.println(menuId + "를 전달 받았습니다.");
        return "콜라";
    }
}
