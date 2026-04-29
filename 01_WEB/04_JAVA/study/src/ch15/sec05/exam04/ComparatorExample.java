package ch15.sec05.exam04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new Comparator<Fruit>() {
            public int compare(Fruit o1, Fruit o2) {
//                return o1.price - o2.price; // 오름차순
//                return o2.price - o1.price; // 내림차순

                return -o1.name.compareTo(o2.name);
            }
        });
        ArrayList<Fruit> arrayList = new ArrayList<>();

        arrayList.add(new Fruit("포도", 3000));
        arrayList.add(new Fruit("수박", 10000));
        arrayList.add(new Fruit("딸기", 6000));

        arrayList.sort(new Comparator<Fruit>() {
            public int compare(Fruit o1, Fruit o2) {
                return o1.price - o2.price; // 오름차순
//                return o2.price - o1.price; // 내림차순
            }
        });

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        System.out.println("-- TreeSet --");
        for(Fruit fruit : treeSet) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
        System.out.println();
        System.out.println("-- ArrayList --");
        for(Fruit fruit : arrayList) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}
