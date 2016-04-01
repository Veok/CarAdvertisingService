package Sorts;

import Data.DataBaseOfCars;

import java.util.Scanner;

/**
 * Created by L on 26.03.2016.
 */
public class Menu {


    public Menu() {
    }

    public static void sortingSwitch(DataBaseOfCars dataBaseOfCars) {

        Scanner in = new Scanner(System.in);
        int userChoice;


        System.out.println("\nWhat you like to do now?");
        System.out.println("1. Sort offers by price.");
        System.out.println("2. Sort offers by year of production.");
        System.out.println("3. Sort offers by date of ad.");
        System.out.println("4. Sort offers by title of ad");
        System.out.println("5. Choose number: ");
        userChoice = in.nextInt();


        switch (userChoice) {

            case 1: {

                Scanner p = new Scanner(System.in);
                int choicePrice;
                System.out.println("1. Sort by lowest.");
                System.out.println("2.Sort by highest.");
                System.out.println("Your choice: ");
                choicePrice = p.nextInt();

                switch (choicePrice) {

                    case 1: {
                        SortCollectionOffers sort1 = new PriceByLowest();
                        dataBaseOfCars.applySort(sort1);
                        break;
                    }
                    case 2: {
                        SortCollectionOffers sort1 = new PriceByHighest();
                        dataBaseOfCars.applySort(sort1);
                        break;
                    }
                }
                break;
            }
            case 2: {
                Scanner y = new Scanner(System.in);
                int choiceProductionYear;
                System.out.println("1.Sort by oldest.");
                System.out.println("2.Sort by newest.");
                System.out.println("Your choice: ");
                choiceProductionYear = y.nextInt();

                switch (choiceProductionYear) {
                    case 1: {
                        SortCollectionOffers sort2 = new ProductionYearByOldest();
                        dataBaseOfCars.applySort(sort2);
                        break;


                    }
                    case 2: {
                        SortCollectionOffers sort2 = new ProductionYearByNewest();
                        dataBaseOfCars.applySort(sort2);
                        break;
                    }
                }
                break;
            }
            case 3: {
                Scanner ya = new Scanner(System.in);
                int choiceAdDate;
                System.out.println("1.Sort by oldest.");
                System.out.println("2.Sort by newest.");
                System.out.println("Your choice: ");
                choiceAdDate = ya.nextInt();

                switch (choiceAdDate) {
                    case 1: {
                        SortCollectionOffers sort3 = new DateByOldest();
                        dataBaseOfCars.applySort(sort3);
                        break;

                    }
                    case 2: {
                        SortCollectionOffers sort3 = new DateByNewest();
                        dataBaseOfCars.applySort(sort3);
                        break;
                    }
                }
                break;
            }
            case 4: {
                Scanner t = new Scanner(System.in);
                int choiceSortOfTitle;
                System.out.println("1.Sort A-Z");
                System.out.println("2.Sort Z-A");
                System.out.println("Your choice: ");
                choiceSortOfTitle = t.nextInt();

                switch (choiceSortOfTitle) {
                    case 1: {
                        SortCollectionOffers sort4 = new AlphabeticalTitle();
                        dataBaseOfCars.applySort(sort4);
                        break;
                    }
                    case 2: {
                        SortCollectionOffers sort4 = new NonAlphabeticalTitle();
                        dataBaseOfCars.applySort(sort4);
                        break;
                    }
                }
            }

        }


    }
}
