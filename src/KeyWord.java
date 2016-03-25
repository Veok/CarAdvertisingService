import java.util.List;

/**
 * Created by L on 25.03.2016.
 */
public class KeyWord implements  FilteringCollectionOfOffers{

    private String keyWord;

    public String getKeyWord() {
        return keyWord;
    }

    public KeyWord setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    public KeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public boolean canDisplay(DataBaseOfCars offerCar) { return keyWord!=null;}

    public void displayOffer(DataBaseOfCars offerCar) {

        List<OfferCar> offerCarList = offerCar.getOfferCars();
        offerCarList
                .stream()
                .filter(cars -> cars.getTitle().contains(keyWord))
                .forEach(System.out::println);
    }
    }

