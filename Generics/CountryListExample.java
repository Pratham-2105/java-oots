package Generics;

import java.util.*;

public class CountryListExample {

    // Method to create a new ArrayList from a collection of countries
    public static List<String> createCountryList(Collection<String> countries) {
        List<String> countryList = new ArrayList<>();
        countryList.addAll(countries); // use addAll to add everything at once
        return countryList;
    }

    // Method to add more countries into an existing ArrayList
    public static void addCountries(List<String> countryList, Collection<String> newCountries) {
        countryList.addAll(newCountries); // use addAll to append elements
    }

    public static void main(String[] args) {
        // Initial collection of countries
        Collection<String> initialCountries = Arrays.asList("India", "USA", "Japan");

        // Create ArrayList from collection
        List<String> countries = createCountryList(initialCountries);
        System.out.println("Initial ArrayList: " + countries);

        // New countries to add
        Collection<String> moreCountries = Arrays.asList("Germany", "France", "Brazil");

        // Add new countries using addCountries method
        addCountries(countries, moreCountries);
        System.out.println("Updated ArrayList: " + countries);
    }
}
