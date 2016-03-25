import java.util.List;

/**
 * Created by L on 24.03.2016.
 */
public class OfferCarManager {

   public static OfferCar getCheapest(List<OfferCar> offerCars){
        if(offerCars == null || offerCars.size()==0){
            return null;
        }
        OfferCar cheapest = offerCars.get(0);
        for(int i = 1; i<offerCars.size(); cheapest.getPrice()){
            if(offerCars.get(i).getPrice()<cheapest.getPrice()){
                cheapest = offerCars.get(i);
            }
        }
        return cheapest;
    }

    public static OfferCar getTheMostExpensive(List<OfferCar> offerCars){
        if(offerCars == null || offerCars.size()==0){
            return null;
        }
        OfferCar theMostExpensive = offerCars.get(0);
        for(int i = 1; i<offerCars.size(); theMostExpensive.getPrice()){
            if(offerCars.get(i).getPrice()<theMostExpensive.getPrice()){
                theMostExpensive = offerCars.get(i);
            }
        }
        return theMostExpensive;
    }
    }

