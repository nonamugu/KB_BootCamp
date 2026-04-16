package example;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = new String("");
        String tx = new String("");
        String tc = new String("");
        int add = 0;
        int index = 0;

        System.out.print("문자열 입력 : ");
        text = sc.next();
        System.out.print("현재 문자열 입력 : ");
        tx = sc.next();
        System.out.print("바꿀 문자열 입력 : ");
        tc = sc.next();

        if(text.length() < tx.length()) {
            System.out.println("입력한 문자열의 크기가 작습니다.\n치환 할 수 없습니다.");
        } else {

        while((index = text.indexOf(tx, index)) != -1) {
           index += tx.length();
           add++;
        }
        }
        System.out.println(text.replace(tx, tc));
        System.out.println(add + "번 치환");
    }
}
