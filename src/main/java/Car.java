import java.util.Objects;

public class Car implements Comparable<Car>  {

    private String model;
    private int year;
    private int regNumer;



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", regNumer=" + regNumer +
                '}';
    }

    public Car(String model, int year, int regNumer) {
        this.model = model;
        this.year = year;
        this.regNumer = regNumer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRegNumer() {
        return regNumer;
    }

    public void setRegNumer(int regNumer) {
        this.regNumer = regNumer;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Car car = (Car) other;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regNumer);
    }

    @Override
    public int compareTo(Car other) {
        return this.model.compareToIgnoreCase(other.model) ;
    }
}
