package collection;

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 12};

        TreeSet<Integer> set = new TreeSet<>();

        for(int data : arr) {
            System.out.println("data = " + data);

            if(set.isEmpty()) {
                System.out.println(-1);
            } else {
                Integer lo = set.lower(data);
                Integer hi = set.higher(data);

                System.out.println(lo + "   " + hi);
            }

            set.add(data);
        }
        System.out.println(set);
    }
}
