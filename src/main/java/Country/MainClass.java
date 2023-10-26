package Country;

import Country.Country;

public class MainClass {
    public static void printALL(Country[] countrys) {
        for (Country country : countrys) {
            country.print();
        }
    }


    public static void main(String[] args) {
        Country[] countries = new Country[5];
        countries[0] = new Country("Russia", 17.23F, 15F, "Moscow", 12);
        countries[1] = new Country("Finland",338, 5.5F,"Helsinki", 655);
        countries[2] = new Country("France",643.8F,67.8F,"Paris",2.1F);
        countries[3] = new Country("Andorra", 467,85.4F,"Andorra la Vella", 22.6F);
        countries[4] = new Country("Singapore",725, 5.7f);

        printALL(countries);
    }
}

