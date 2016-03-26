package Sorts;

import Data.DataBaseOfCars;
import Data.OfferCar;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by L on 26.03.2016.
 */
public class SortPriceByHighest implements  SortingCollectionOffers{

        public boolean canDisplay(DataBaseOfCars offerCar) {
            return  offerCar.getOfferCars() != null;
        }

        public void displayOffer(DataBaseOfCars offerCar) {

            List<OfferCar> offerCarList = offerCar.getOfferCars();
            Collections.sort((List<OfferCar>) offerCarList, new Comparator<OfferCar>() {
                @Override
                public int compare(OfferCar o1, OfferCar o2) {
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
            });
        }
    }

