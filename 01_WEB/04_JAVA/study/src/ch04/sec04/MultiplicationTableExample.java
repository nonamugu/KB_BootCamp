package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            System.out.println("*** " + i + "단 ***");
            for(int t = 1; t <= 9; t++) {
                System.out.println(i + " x " + t + " = " + i*t);
            }
        }
    }
}
