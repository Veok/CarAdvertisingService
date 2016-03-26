import Data.DataBaseOfCars;
import Data.OfferCar;
import Filters.*;
import Sorts.SortingMenu;

import java.util.Scanner;

/**
 * Created by L on 23.03.2016.
 */
public class Main {

    public static void main(String[] args){

        OfferCar record1 = new OfferCar(2016,03,23,"Super Ford! Buy now!",2000,02,10, "Ford", 1560000, "Focus", 800);
        OfferCar record2 = new OfferCar(2016,03,22,"Great Car! Occasion!",1998,11,12, "Volkswagen", 2230000, "Golf", 569.99);
        OfferCar record3 = new OfferCar(2016,02,21,"Looks like new and low mileage!! ",2004,07,01, "Opel", 840000, "Astra", 4625);
        OfferCar record4 = new OfferCar(2016,03,20, "Beautiful colour! Seat Leon!!!",2009,05,23, "Seat", 2250000, "Leon", 10000);
        OfferCar record5 = new OfferCar(2016,03,20,"Great Nissan Primera!",2004,12,11, "Nissan", 1880000, "Primera", 1499.99);
        OfferCar record6 = new OfferCar(2016,03,23,"Super eletric car! MODEL S",2016,01,17, "Tesla", 10000, "Model S", 50000);
        OfferCar record7 = new OfferCar(2016,01,02,"Brand new car! New model!",2016,01,02, "Tesla", 5, "Model X", 132000);
        OfferCar record8 = new OfferCar(2015,12,12,"Only for parts",1997,06,29, "Volkswagen", 2900000, "Golf", 499.99);
        OfferCar record9 = new OfferCar(2016,01,12,"Japanese technical thought!",2002,10,10, "Toyota", 990000, "Corolla", 1200);
        OfferCar record10 = new OfferCar(2016,02,29,"AUDI A4, only 15k$!",2007,11,05, "Audi", 1920000, "A4", 15000);
        OfferCar record11 = new OfferCar(2015,11,11,"Like new! FORD FIESTA",2011,12,06, "Ford", 20000, "Fiesta", 14000);
        OfferCar record12 = new OfferCar(2016,03,10,"GREAT CITROEN C4",2011,04,10, "Citroen", 1350000, "C4", 9999);


        DataBaseOfCars dataBaseOfCars = new DataBaseOfCars();
        dataBaseOfCars.addCar(record1);
        dataBaseOfCars.addCar(record2);
        dataBaseOfCars.addCar(record3);
        dataBaseOfCars.addCar(record4);
        dataBaseOfCars.addCar(record5);
        dataBaseOfCars.addCar(record6);
        dataBaseOfCars.addCar(record7);
        dataBaseOfCars.addCar(record8);
        dataBaseOfCars.addCar(record9);
        dataBaseOfCars.addCar(record10);
        dataBaseOfCars.addCar(record11);
        dataBaseOfCars.addCar(record12);


        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;
        int userChoice1;


            System.out.println("What you like to do?");
            System.out.println("1. Flirt offers by price (from/to)");
            System.out.println("2. Flirt offers by keyword");
            System.out.println("3. Flirt offers by date of ad");
            System.out.println("4. Flirt offers by year of production");
            System.out.println("5. Flirt offers by mileage");
            System.out.println("6. Show all offers");
            System.out.println("7. Quit");
            System.out.println("Choose number: ");
            userChoice = in.nextInt();

            switch (userChoice){

                case 1: {
                    double lowerPrice;
                    double highPrice;

                    System.out.println("Please enter a lower limit price: ");
                    Scanner lw = new Scanner(System.in);
                    lowerPrice = lw.nextDouble();

                    System.out.println("Please enter a max limit price: ");
                    Scanner hw = new Scanner(System.in);
                    highPrice = hw.nextDouble();

                    FilteringCollectionOfOffers filrt1 = new Price(highPrice, lowerPrice);

                    if(filrt1.canDisplay(dataBaseOfCars) == false){
                        System.out.println("You entered invalid price.");
                    }
                    else
                        dataBaseOfCars.applyFilrt(filrt1);
                        SortingMenu.sortingSwitch(dataBaseOfCars);
                        dataBaseOfCars.applyFilrt(filrt1);
                    break;
                }
                case 2: {
                    String keyWord;

                    System.out.println("Enter a keyword: ");
                    Scanner kw = new Scanner(System.in);
                    keyWord = kw.nextLine();

                    FilteringCollectionOfOffers filrt2 = new KeyWord(keyWord);
                    dataBaseOfCars.applyFilrt(filrt2);
                    SortingMenu.sortingSwitch(dataBaseOfCars);
                    dataBaseOfCars.applyFilrt(filrt2);
                    break;

                }
                case 3: {
                    String dateOfAd;

                    System.out.println("Enter a year and a month from which you want search an offer (yyyy-MM)");
                    Scanner oa = new Scanner(System.in);
                    dateOfAd= oa.nextLine();

                    FilteringCollectionOfOffers filrt3 = new DateOfAd(dateOfAd);
                    dataBaseOfCars.applyFilrt(filrt3);
                    SortingMenu.sortingSwitch(dataBaseOfCars);
                    dataBaseOfCars.applyFilrt(filrt3);
                    break;
                }
                case 4: {
                    String dateOfProduction;

                    System.out.println("Enter a year of a car production, that you want to search.");
                    Scanner op = new Scanner(System.in);
                    dateOfProduction = op.nextLine();

                    FilteringCollectionOfOffers filrt4= new DateOfProduction(dateOfProduction);
                    dataBaseOfCars.applyFilrt(filrt4);
                    SortingMenu.sortingSwitch(dataBaseOfCars);
                    dataBaseOfCars.applyFilrt(filrt4);
                    break;
                }
                case 5:{
                    int lowerLimit;
                    int higherLimit;

                    System.out.println("Please enter a lower limit of mileage: ");
                    Scanner ll = new Scanner(System.in);
                    lowerLimit = ll.nextInt();

                    System.out.println("Please enter a max limit of mileage: ");
                    Scanner hl = new Scanner(System.in);
                    higherLimit = hl.nextInt();

                    FilteringCollectionOfOffers filrt5 = new Price(higherLimit, lowerLimit);

                    if(filrt5.canDisplay(dataBaseOfCars) == false){
                        System.out.println("You entered invalid mileage.");
                    }
                    else
                        dataBaseOfCars.applyFilrt(filrt5);
                    SortingMenu.sortingSwitch(dataBaseOfCars);
                    dataBaseOfCars.applyFilrt(filrt5);
                    break;
                }
                case 6: {
                    dataBaseOfCars.printCars();
                }
                case 7: {
                    System.out.println("\nGoodbye");
                    break;
                }
            }
    }


}


