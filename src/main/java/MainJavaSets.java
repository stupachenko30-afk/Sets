import java.util.*;

public class MainJavaSets {
    public static void main(String[] args) {
        String s1 = "banana";
        System.out.println(s1.hashCode());
        String s2 = "apple";
        System.out.println(s2.hashCode());
        String s3 = "kiwi";
        System.out.println(s3.hashCode());
        String s4 = "grape";
        System.out.println(s4.hashCode());
        String s5 = "melon";
        System.out.println(s5.hashCode());
        String s6 = "lemon";
        System.out.println(s6.hashCode());
        String s7 = new String("lemon");
        System.out.println(s7.hashCode());
        HashSet<String> hset = new HashSet<>();
        hset.add(s2);
        hset.add(s1);
        hset.add(s3);
        hset.add(s4);
        hset.add(s5);
        hset.add(s6);
        hset.add(s7);
        System.out.println(hset);
        //[banana, apple, kiwi, lemon, grape, melon]

        LinkedHashSet<String> dset = new LinkedHashSet<>();
        dset.add(s1);
        dset.add(s2);
        dset.add(s3);
        dset.add(s4);
        dset.add(s5);
        dset.add(s6);
        dset.add(s7);
        System.out.println(dset);
        //[banana, apple, kiwi, grape, melon, lemon] Сохраняет порядок

        TreeSet<String> tset = new TreeSet<>();
        tset.add(s1);
        tset.add(s2);
        tset.add(s3);
        tset.add(s4);
        tset.add(s5);
        tset.add(s6);
        tset.add(s7);
        System.out.println(tset);
        //[apple, banana, grape, kiwi, lemon, melon] В алфавитном порядке
    }


}
   /*
                                                 Iterable
                                                      |
                                                     Set
                                                     ____
                                   |                               |
                                HashSet                         TreeSet
                                   |
                             LinkedHashSet

    */