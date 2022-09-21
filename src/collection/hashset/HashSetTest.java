package collection.hashset;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("임정순"));
        hashSet.add(new String("박현정"));
        hashSet.add(new String("홍연의"));
        hashSet.add(new String("홍연의"));


        System.out.println(hashSet);


    }
}
