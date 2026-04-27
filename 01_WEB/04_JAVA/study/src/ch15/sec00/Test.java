package ch15.sec00;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");

        // 초기 데이터 구성
        // List.of() => readonly라 밖에서 add로 추가 불가
        List<String> list2 = List.of("Test1", "Test2", "Test3");
        System.out.println(list2);

//        list2.add("Test4"); // 예외 발생(readonly)
        System.out.println(list2);
    }

}
