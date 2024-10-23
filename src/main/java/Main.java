import com.Northcoders.Aeroplane;
import com.Northcoders.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started......");

        Car myCar = new Car();
        myCar.move();

        Aeroplane myAeroplane = new Aeroplane();
        myAeroplane.move();

    }
}
