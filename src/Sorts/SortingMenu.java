package Sorts;

import Data.DataBaseOfCars;

import java.util.Scanner;

/**
 * Created by L on 26.03.2016.
 */
public class SortingMenu {


    public SortingMenu() {
    }

    public static void sortingSwitch(DataBaseOfCars dataBaseOfCars){

        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;

        System.out.println("What you like to do now?");
        System.out.println("1. Sort offers by price.");
        System.out.println("2. Sort offers by year of production.");
        System.out.println("3. Sort offers by date of ad.");
        System.out.println("4. Sort offers by title of ad");
        System.out.println("5. Quit.");
        System.out.println("6. Choose number: ");
        userChoice = in.nextInt();


        switch(userChoice){

            case 1: {

                Scanner p = new Scanner(System.in);
                int choicePrice;
                System.out.println("1. Sort by lowest.");
                System.out.println("2.Sort by highest.");
                System.out.println("Your choice: ");
                choicePrice = p.nextInt();

                switch(choicePrice){

                    case 1: {
                            SortingCollectionOffers sort1 = new SortPriceByLowest();
                            dataBaseOfCars.applySort(sort1);
                            break;
                    }
                    case 2: {
                            SortingCollectionOffers sort1 = new SortPriceByHighest();
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

                switch (choiceProductionYear){
                    case 1: {
                        SortingCollectionOffers sort2 = new SortProductionYearByOldest();
                        dataBaseOfCars.applySort(sort2);
                        break;


                    }
                    case 2: {
                        SortingCollectionOffers sort2 = new SortProductionYearByNewest();
                        dataBaseOfCars.applySort(sort2);
                        break;
                    }
                }
                break;
            }
            case 3 :{
                Scanner ya = new Scanner(System.in);
                int choiceAdDate;
                System.out.println("1.Sort by oldest.");
                System.out.println("2.Sort by newest.");
                System.out.println("Your choice: ");
                choiceAdDate = ya.nextInt();

                switch (choiceAdDate){
                    case 1: {
                        SortingCollectionOffers sort3 = new SortDateOfAdByOldest();
                        dataBaseOfCars.applySort(sort3);
                        break;

                    }
                    case 2: {
                        SortingCollectionOffers sort3 = new SortDateOfAdByNewest();
                        dataBaseOfCars.applySort(sort3);
                        break;
                    }
                }
                break;
            }
            case 4:{
                Scanner t = new Scanner(System.in);
                int choiceSortOfTitle;
                System.out.println("1.Sort A-Z");
                System.out.println("2.Sort Z-A");
                System.out.println("Your choice: ");
                choiceSortOfTitle = t.nextInt();

                switch (choiceSortOfTitle){
                    case 1: {
                        SortingCollectionOffers sort4 = new SortTitleInAlphabeticalOrder();
                        dataBaseOfCars.applySort(sort4);
                        break;
                    }
                    case 2:{
                        SortingCollectionOffers sort4 = new SortTitlneInNonAlphabeticalOrder();
                        dataBaseOfCars.applySort(sort4);
                        break;
                    }
                }
            }
            case 5: {
                System.out.println("Goodbye!");
                break;
            }
        }



    }
}
