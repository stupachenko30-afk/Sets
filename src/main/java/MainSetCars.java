import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class MainSetCars {
    public static void main(String[] args) {

                Car c1 = new Car("BMW X5", 2020, 1001);
                Car c2 = new Car("Audi A6", 2019, 1003);
                Car c3 = new Car("Mercedes C200", 2021, 1002);
                Car c4 = new Car("Volkswagen Golf", 2018, 1004);
                Car c5 = new Car("Toyota Corolla", 2022, 1008);
                Car c6 = new Car("Honda Civic", 2020, 1006);
                Car c7 = new Car("Ford Focus", 2017, 1007);
                Car c8 = new Car("Skoda Octavia", 2023, 1005);
                Car c9 = new Car("BMW X5", 2020, 1020);

                LinkedHashSet<Car> cset = new LinkedHashSet<>();
                cset.add(c1);
                cset.add(c2);
                cset.add(c3);
                cset.add(c4);
                cset.add(c5);
                cset.add(c6);
                cset.add(c7);
                cset.add(c8);
                cset.add(c9);

                printCarSet(cset);


                TreeSet<Car> tset = new TreeSet<>();
        tset.add(c1);
        tset.add(c2);
        tset.add(c3);
        tset.add(c4);
        tset.add(c5);
        tset.add(c6);
        tset.add(c7);
        tset.add(c8);
        tset.add(c9);
        printCarSet(tset);



    }

    private static void printCarSet(Set<Car> set) {
       for (Car c: set){
           System.out.println(c);
       }
        System.out.println("*******************************");
    }
}
