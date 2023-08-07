public class CarExam1 {
    public static void main(String agrs[]){
        Bus b1 = new Bus();
        b1.run();
        b1.안내방송();

        Car c1 = new Bus();
        c1.run();
        //c1.안내방송();

        Bus b2 = (Bus)c1;
        b2.안내방송();

        Car c2 = new SuperCar();
        c2.run();
    }
}
