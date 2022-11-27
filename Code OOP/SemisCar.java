public class SemisCar {}
abstract class Car {

    public double price;
    public int year;

    Car(double price, int year) {
        this.price = price;
        this.year = year;
    }
    public abstract double calculateSalePrice();
}


class SportsCar extends Car {

    SportsCar(double price, int year) {
        super(price, year);
        this.price = price;
        this.year = year;
    }

    public double calculateSalePrice() {
        double returnVariable;
        if (this.year > 2000) returnVariable = (this.price - (0.75 * this.price));

        else {
            if (this.year > 1995 && this.year < 2000) returnVariable = this.price - (0.5 * this.price);
            else returnVariable = this.price - (0.25 * this.price);
        }
        return returnVariable;

    }


}

class ClassicCar extends Car {
    ClassicCar(double price, int year) {
        super(price, year);
        this.price = price;
        this.year = year;
    }
    @Override
    public double calculateSalePrice() {

        if (this.year > 2000) {
            return this.price - (0.75 * this.price);
        } else if (this.year > 1995 && this.year < 2000) {
            return this.price - (0.5 * this.price);
        } else {
            return this.price - (0.25 * this.price);
        }
    }

    public static void main(String[] args) {

        SportsCar sportsC = new SportsCar(1245, 2001);
        SportsCar spOne = new SportsCar(2301, 2002);
        ClassicCar classicC = new ClassicCar(100000, 2003);
        ClassicCar cclex = new ClassicCar(8888, 2020);

        System.out.println(sportsC.calculateSalePrice());
        System.out.println(spOne.calculateSalePrice());
        System.out.println(classicC.calculateSalePrice());
        System.out.println(cclex.calculateSalePrice());
    }
}