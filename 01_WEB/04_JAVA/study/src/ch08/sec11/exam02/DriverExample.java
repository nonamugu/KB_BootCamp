package ch08.sec11.exam02;

import java.util.Scanner;

public class DriverExample {
    public static void main(String[] args) {
//        Driver driver = new Driver();
//
//        Bus bus = new Bus();
//        Taxi taxi = new Taxi();
//
//        driver.drive(bus);
//        driver.drive(taxi);

        System.out.println("운전할 차를 선택하세요. 1) Taxi, 2) Bus");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if(num == 1) {
//            Taxi taxi = new Taxi();
//            taxi.run();
//        } else if(num == 2) {
//            Bus bus = new Bus();
//            bus.run();
//        }

        Vehicle[] cars = {
                new Taxi(),
                new Bus(),
                new Truck()
        };

        cars[num-1].run();
    }
}
