package ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리 : " + e.toString());
        }

        String a = new String("A");
        String b = new String("A");
        System.out.println(a == b);
    }
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
