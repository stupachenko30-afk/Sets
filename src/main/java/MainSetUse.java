import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainSetUse {
    public static void main(String[] args) {
        String s = "performance";
        printOriginalChars(s);
        String s2 = "apple kiwi banana melon grape apple lemon cherry melon";
        printWorldsReverseOrder(s2);
    }
    public static void printWorldsReverseOrder(String s){
        ComparatorStringReverse comp = new ComparatorStringReverse();

        TreeSet<String> set = new TreeSet<>();
        String[] ar = s.split(" ");
        for (String st: ar){
            set.add(st);

        }

        Set<String> rset = set.descendingSet();
        for ( String str: rset){
            System.out.println(str);
        }

//        Iterator<String> iter  = set.descendingIterator();
//        while (iter.hasNext() == true){
//            System.out.println(iter.next());
//        }

//        for (String str: set){
//            System.out.println(str);
//        }



        ////////////////////////////////////////////////
//         Object[] arr = set.toArray();
//        for (int i = arr.length-1;i>=0; i--){
//            System.out.println(arr[i]);
//        }

    }
    /*
    s = "apple kiwi banana melon grape apple lemon cherry melon"
    s.split(" ");

    melon
    lemon
    kiwi
    grape
    cherry
    banana
    apple
     */

    public static void printOriginalChars(String s){
        TreeSet<Character> set = new TreeSet<>();
        for (int i=0; i < s.length(); i++){
            char sym = s.charAt(i);
            set.add(sym);

        }
        for (char c: set){
            System.out.println(c);

    }
}}
/*
TreeSet<Character> set
    i++
s= "performance"
a
c
e
f
m
n
o
p
r
 */