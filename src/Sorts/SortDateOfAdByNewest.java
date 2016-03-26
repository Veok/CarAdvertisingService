package Sorts;
import Data.DataBaseOfCars;
import Data.OfferCar;
import java.util.Collections;
import java.util.List;

/**
 * Created by L on 26.03.2016.
 */
public class SortDateOfAdByNewest implements SortingCollectionOffers{

    public boolean canDisplay(DataBaseOfCars offerCar) {
        return  offerCar.getOfferCars() != null;
    }

    public void displayOffer(DataBaseOfCars offerCar) {

        List<OfferCar> offerCarList = offerCar.getOfferCars();
        Collections.sort((List<OfferCar>) offerCarList, (o1, o2) -> o2.getDateOfOffer().compareTo(o1.getDateOfOffer()));
}}