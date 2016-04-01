package Filters;

import Data.DataBaseOfCars;
import Data.OfferCar;

import java.util.List;

/**
 * Created by L on 25.03.2016.
 */
public class Mileage implements FilteringCollectionOfOffers {

    private int lowerLimit;
    private int higherLimit;

    public Mileage(int higherLimit, int lowerLimit) {
        this.higherLimit = higherLimit;
        this.lowerLimit = lowerLimit;
    }

    private int getHigherLimit() {
        return higherLimit;
    }


    private int getLowerLimit() {
        return lowerLimit;
    }


    public boolean canDisplay(DataBaseOfCars offerCar) {
        return lowerLimit >= 0;
    }

    public void displayOffer(DataBaseOfCars offerCar) {


        List<OfferCar> offerCarList = offerCar.getOfferCars();
        offerCarList
                .stream()
                .filter(car -> (car.getMileage() > getLowerLimit()) && (car.getMileage() < getHigherLimit()))
                .forEach(System.out::println);
    }
}
