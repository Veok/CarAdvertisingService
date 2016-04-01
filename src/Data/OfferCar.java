package Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

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

    public double getMileage() {
        return mileage;
    }


    public double getPrice() {
        return price;
    }

    private String data1() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        return DATE_FORMAT.format(dateOfProduction);
    }

    private String data2() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        return DATE_FORMAT.format(dateOfOffer);
    }

    public String data3() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM");
        return DATE_FORMAT.format(dateOfOffer);
    }

    public String data4() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy");
        return DATE_FORMAT.format(dateOfProduction);
    }


    @Override
    public String toString() {
        return
                "Date of Ofert: " + data2() +
                        " | Title: " + title +
                        " | Mark: " + mark +
                        " | Model: " + model +
                        " | Date of Production: " + data1() +
                        " | Mileage: " + mileage +
                        " | Price: " + price + "$";

    }


}