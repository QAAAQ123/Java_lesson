public class VendingMachineMain {
    public static void main(String agrs[]){
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

       String product =  vm1.pushProductButton(100);
       System.out.println(product);
    }
}
