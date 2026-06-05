import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainSetMethods {
    public static void main(String[] args) {
       // LinkedHashSet<String> set = new LinkedHashSet<>();

        TreeSet<String> set = new TreeSet<>();
        set.add("banana");
        set.add("kiwi");
        set.add("grape");
        set.add("apple");
        set.add("orange");
        set.add("lemon");
        System.out.println(set);
        //[banana, kiwi, grape, apple, orange, lemon]

        boolean res = set.contains("apple"); //Возврат True/False
        System.out.println(res);
        System.out.println(set.size());
        set.remove("kiwi");
        System.out.println(set);

        Object[] ar = set.toArray();
        for (String s: set){
        System.out.println(s);

        }
        for (int i = ar.length-1; i>=0; i--){  //реверс
            System.out.println(ar[i] + " ");
    }

}
}


//-> set [banana, kiwi, grape, apple, orange, lemon]

//                  0         1      2    3      4        5
//->set-> toArray [banana] [kiwi][grape][apple][orange][lemon]