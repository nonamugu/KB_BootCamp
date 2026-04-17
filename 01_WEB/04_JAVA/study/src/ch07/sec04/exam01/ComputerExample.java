package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        Computer cm = new Computer();

        System.out.println(cl.areaCircle(3));
        System.out.println(cm.areaCircle(3));
    }
}
