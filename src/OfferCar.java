import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * Created by L on 23.03.2016.
 */
public class OfferCar {

    private String model;
    private String mark;
    private Date dateOfProduction;
    private int mileage;
    private double price;
    private Date dateOfOffer;
    private String title;


    public OfferCar(int year, int month, int day, String title, int year1, int month1, int day1, String mark, int mileage, String model, double price) {

        this.mark = mark;
        this.mileage = mileage;
        this.model = model;
        this.price = price;
        this.title = title;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        GregorianCalendar calendar1 = new GregorianCalendar(year1, month1 - 1, day1);
        dateOfProduction = calendar1.getTime();
        dateOfOffer = calendar.getTime();
    }

    public Date getDateOfOffer() {
        return dateOfOffer;
    }

    public OfferCar setDateOfOffer(Date dateOfOffer) {
        this.dateOfOffer = dateOfOffer;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public OfferCar setTitle(String title) {
        this.title = title;
        return this;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public OfferCar setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
        return this;
    }

    public String getMark() {
        return mark;
    }

    public OfferCar setMark(String mark) {
        this.mark = mark;
        return this;
    }

    public double getMileage() {
        return mileage;
    }

    public OfferCar setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getModel() {
        return model;
    }

    public OfferCar setModel(String model) {
        this.model = model;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public OfferCar setPrice(double price) {
        this.price = price;
        return this;
    }

    public String data1() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfProduction1 = DATE_FORMAT.format(dateOfProduction);
        return dateOfProduction1;
    }

    public String data2() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfOffer1 = DATE_FORMAT.format(dateOfOffer);
        return dateOfOffer1;
    }

    public  String data3(){
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM");
        String dateOfOffer1 = DATE_FORMAT.format(dateOfOffer);
        return dateOfOffer1;
}

    public String data4() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy");
        String dateOfProduction1 = DATE_FORMAT.format(dateOfProduction);
        return dateOfProduction1;
    }



    @Override
    public String toString() {
        return
                "Date of Ofert: "+data2() +
                        " | Title: " + title+
                        " | Mark: "+mark +
                        " | Model: "+model +
                        " | Date of Production: "+ data1() +
                        " | Mileage: "+ mileage +
                        " | Price: " + price +"$";

    }


}