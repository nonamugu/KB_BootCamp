package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
//        for 문
        int sum = 0;
//        int add = 100;
//        for(int i = 1; i <= add; i++) {
//            sum += i;
//        }
//        System.out.println("1~100 합 : " + sum);

        int i = 1;
//        while 문
        while(i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1~100 합 : " + sum);
    }
}
