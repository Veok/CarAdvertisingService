package Filters;

import Data.DataBaseOfCars;
import Data.OfferCar;

import java.util.List;

/**
 * Created by L on 25.03.2016.
 */
public class DateOfAd implements FilteringCollectionOfOffers {

    private String dateOfAd;

    public DateOfAd(String dateOfAd) {
        this.dateOfAd = dateOfAd;
    }

    public String getDateOfAd() {
        return dateOfAd;
    }

    public DateOfAd setDateOfAd(String dateOfAd) {
        this.dateOfAd = dateOfAd;
        return this;
    }


    public boolean canDisplay(DataBaseOfCars offerCar) { return dateOfAd!=null;}

    public void displayOffer(DataBaseOfCars offerCar) {

        List<OfferCar> offerCarList = offerCar.getOfferCars();
        offerCarList
                .stream()
                .filter(cars -> cars.data3().startsWith(dateOfAd))
                .forEach(System.out::println);
    }
}
