import java.util.List;


/**
 * Created by L on 23.03.2016.
 */
public class Price implements FilteringCollectionOfOffers {

    private double lowerLimit;
    private  double higherLimit;

    public double getHigherLimit() {
        return higherLimit;
    }

    public Price setHigherLimit(double higherLimit) {
        this.higherLimit = higherLimit;
        return this;
    }

    public double getLowerLimit() {
        return lowerLimit;
    }

    public Price setLowerLimit(double lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public Price(double higherLimit, double lowerLimit) {
        this.higherLimit = higherLimit;
        this.lowerLimit = lowerLimit;
    }

    public boolean canDisplay(DataBaseOfCars offerCar) { return lowerLimit>=0;}

    public void displayOffer(DataBaseOfCars offerCar) {


        List<OfferCar> offerCarList = offerCar.getOfferCars();
            offerCarList
                    .stream()
                    .filter(car -> (car.getPrice() > getLowerLimit()) && (car.getPrice() < getHigherLimit()))
                    .forEach(System.out::println);
        }
    }









