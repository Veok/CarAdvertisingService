package Data;

import Filters.FilteringCollectionOfOffers;
import Sorts.SortingCollectionOffers;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by L on 23.03.2016.
 */
public class DataBaseOfCars {

    private List<OfferCar> offerCars;

    public DataBaseOfCars() {
       offerCars = new ArrayList<>();
    }

    public void addCar(OfferCar offerCar) {
        offerCars.add(offerCar);
    }

    public List<OfferCar> getOfferCars() {
        return offerCars;
    }



    public void printCars() {
        for (OfferCar offerCar : offerCars) {
            System.out.println(offerCar);
        }
    }

    public void applyFilrt(FilteringCollectionOfOffers collectionOfOffers){
    if (collectionOfOffers.canDisplay(this)){
        collectionOfOffers.displayOffer(this);
    }
}
    public void applySort(SortingCollectionOffers collectionOfOffers){
        if (collectionOfOffers.canDisplay(this)){
            collectionOfOffers.displayOffer(this);
        }
    }
}

