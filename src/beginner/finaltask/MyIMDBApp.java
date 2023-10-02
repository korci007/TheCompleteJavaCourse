package beginner.finaltask;

/*
1. Go to imdb and choose an actor/actress
2. their age and date of birth, movie titles with their rating
3. store them in variables name, year of birth, array of movies, array of ratings
4. print out the name of the person
5, print out the year of birth and calculate age
6. print out the movie titles
7. create a function that returns the following strings
rating              result
<= 5,0              bad
> 5.0 && <= 6.5     average
> 6.5 && <= 7.0     good
> 7.0 && <= 8.0     very good
> 8.0               amazing

8. Add the function result to the movie
 */
public class MyIMDBApp {

    public static void main(String[] args) {
        String name = "Margot Robbie";
        int dateOfBirth = 1990;
        int currentDate = 2023;
        String[] movieTitles = {"Barbie", "Tarzan legendája", "A Wall Street farkasa", "A vágyak földjén", "I.C.U"};
        double[] movieRatings = {7.1, 6.2, 8.2, 5.9, 2.6};

        System.out.println("A színész neve: " + name);
        System.out.println("Született: " + dateOfBirth + " (" + (currentDate - dateOfBirth) + " éves)" );
        System.out.println("Munkássága:");
        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(" " + movieTitles[i] + " - " + getRating(movieRatings[i]));
        }
    }
    static String getRating(double rating) {
        if (rating <= 5.0) {
            return "pusztulat";
        } else if (rating <= 6.5) {
            return "átlagos";
        } else if (rating <= 7.0) {
            return "nézhető";
        } else if (rating <= 8.0) {
            return "remek";
        } else {
            return "kiválló";
        }
    }
}
