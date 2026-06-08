import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainPersonSet {
    public static void main(String[] args) {

        Person p1 = new Person("Alice", 101, 25.5);
        Person p2 = new Person("Bob", 102, 30.0);
        Person p3 = new Person("David", 103, 19.5);
        Person p4 = new Person("Emma", 104, 42.0);
        Person p5 = new Person("John", 105, 35.5);
        Person p6 = new Person("Kate", 106, 28.0);
        Person p7 = new Person("Michael", 107, 50.5);
        Person p8 = new Person("Alice", 101, 25.5);
        Person p9 = new Person("Alice", 113, 55.5);

        LinkedHashSet<Person> dset = new LinkedHashSet<>();
        dset.add(p1);
        dset.add(p2);
        dset.add(p3);
        dset.add(p4);
        dset.add(p5);
        dset.add(p6);
        dset.add(p7);
        dset.add(p8);


        printPersonsSet(dset);

        //////////////////////////

        TreeSet<Person> tset = new TreeSet<>();
        tset.add(p1);
        tset.add(p2);
        tset.add(p3);
        tset.add(p4);
        tset.add(p5);
        tset.add(p6);
        tset.add(p7);
        tset.add(p8);
        tset.add(p9);

        printPersonsSet(tset);

    }

    private static void printPersonsSet(Set<Person> set) {
        for (Person p: set){
            System.out.println(p);

        }
        System.out.println("*****************************");

    }

}
/*

homework
1.
            Car
            -------
            model(String)
            year(int)
            regNumber(int)

            MainSetCars
            1.Create HashSet<Car> and TreeSet<Car>
            2.write method printCarSet()
 */