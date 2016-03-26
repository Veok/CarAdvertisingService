package Filters;
import Data.DataBaseOfCars;
import Data.OfferCar;
import java.util.List;

/**
 * Created by L on 25.03.2016.
 */
public class DateOfProduction implements FilteringCollectionOfOffers {

    private String dateOfProduction;

    public DateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public DateOfProduction setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
        return this;
    }

    public boolean canDisplay(DataBaseOfCars offerCar) { return dateOfProduction!=null;}

    public void displayOffer(DataBaseOfCars offerCar) {

        List<OfferCar> offerCarList = offerCar.getOfferCars();
        offerCarList
                .stream()
                .filter(cars -> cars.data4().startsWith(dateOfProduction))
                .forEach(System.out::println);
    }
}
