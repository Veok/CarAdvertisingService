import java.util.List;

/**
 * Created by L on 25.03.2016.
 */
public class Mileage implements  FilteringCollectionOfOffers {

    private int lowerLimit;
    private  int higherLimit;

    public Mileage(int higherLimit, int lowerLimit) {
        this.higherLimit = higherLimit;
        this.lowerLimit = lowerLimit;
    }

    public int getHigherLimit() {
        return higherLimit;
    }

    public Mileage setHigherLimit(int higherLimit) {
        this.higherLimit = higherLimit;
        return this;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public Mileage setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public boolean canDisplay(DataBaseOfCars offerCar) { return lowerLimit>=0;}

    public void displayOffer(DataBaseOfCars offerCar) {


        List<OfferCar> offerCarList = offerCar.getOfferCars();
        offerCarList
                .stream()
                .filter(car -> (car.getMileage() > getLowerLimit()) && (car.getMileage() < getHigherLimit()) )
                .forEach(System.out::println);
    }
}
