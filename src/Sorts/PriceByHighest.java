package Sorts;

import Data.DataBaseOfCars;
import Data.OfferCar;

import java.util.Collections;
import java.util.List;

/**
 * Created by L on 26.03.2016.
 */
class PriceByHighest implements SortCollectionOffers {

    public boolean canDisplay(DataBaseOfCars offerCar) {
        return offerCar.getOfferCars() != null;
    }

    public void displayOffer(DataBaseOfCars offerCar) {

        List<OfferCar> offerCarList = offerCar.getOfferCars();
        Collections.sort(offerCarList, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(offerCarList);
    }
}

