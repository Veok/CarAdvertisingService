package Sorts;

import Data.DataBaseOfCars;
import Data.OfferCar;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by L on 26.03.2016.
 */
public class SortProductionYearByOldest implements SortingCollectionOffers{


    public boolean canDisplay(DataBaseOfCars offerCar) {
        return  offerCar.getOfferCars() != null;
    }

    public void displayOffer(DataBaseOfCars offerCar) {

        List<OfferCar> offerCarList = offerCar.getOfferCars();
        Collections.sort(offerCarList, new Comparator<OfferCar>() {
            @Override
            public int compare(OfferCar o1, OfferCar o2) {
                return o1.getDateOfProduction().compareTo(o2.getDateOfProduction());
            }
        }) ;
    }
}

