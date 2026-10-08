package MutiThreading;

public class Example12_2 {
    public static void main(String[] args) {
        Thread speakElephant;                   //声明线程
        Thread speakCar;

        ElephantTarget elephant = new ElephantTarget();
        CarTarget car = new CarTarget();

        speakElephant = new Thread(elephant);
        speakCar = new Thread(car);

        speakElephant.start();
        speakCar.start();
        for(int i =1; i<=15; i++){
            System.out.print("House" + i + "  ");
        }
    }

    static class ElephantTarget implements Runnable{
        public void run(){
            for( int i =1 ; i<=20; i++){
                System.out.print("Elephant" + i + "  ");
            }
        }
    }

    static class CarTarget implements Runnable{
        public void run(){
            for( int i =1 ; i<=20; i++){
                System.out.print("Car" + i + "  ");
            }
        }
    }
}
