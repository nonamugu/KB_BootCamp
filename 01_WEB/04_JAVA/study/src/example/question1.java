package example;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        int t = (int)(Math.random() * 100);
        int result = 0;
        int add = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 ~ 100 사이의 숫자가 발생했습니다. ");
        while (t != result) {
            add++;
            System.out.print("숫자 입력 : ");
            result = scanner.nextInt();

            if(t > result) {
                System.out.println(result + "보다 큰 숫자입니다.");
            } else if(t < result) {
                System.out.println(result + "보다 작은 숫자입니다.");
            } else {
                System.out.println("딩동뎅.." + add + "번 만에 맞추셨습니다.");
            }
        }
    }
}
