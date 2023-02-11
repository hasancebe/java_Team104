package Projects.P01_Movie;

import java.util.*;

public class GuessNameOfMovie {

        /*TASK:

        "JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"
       select any of the movies in the movie list above according to the index number of the movie without seeing the movie name .
       Create a method that allows you to guess the name of the selected movie and decide how many times user can guess ...

       Here's the TRICK...
       Print the number  of letters of selected movie by the user to the console.
       Print how many times the user can guess
       Print the number of remaining rights  to the console.
       Print the number of correct and incorrect predictions to the console for each guess of the user.
       Print the name of the movie when the user has lost or won

       */

        static Scanner scan = new Scanner(System.in);

        // all created as static variables because we are planing to use them in static methods
        static List<String> list = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));

        static int guessRights =0;
        static int numberOfGuesses=0;

    public static void main(String[] args) {

        // from main method we called the method
        letsPlayAGame();

    }

    private static void letsPlayAGame() {

        //1) user shuld enter a number to choose the movie
        System.out.println("please enter a value between 1-8");
        // to get the index of the list we used -1

        // if user enters a letter instead of a number, try catch will restart program from theegining
        int index = 0;
        try {
            index = scan.nextInt()-1;
        } catch (Exception e) {
            letsPlayAGame();
        }

        // by using the index, we took the name of the movie from the list
        String movieName = list.get(index);

        //to show underlines to the user, we created a stringBuilder
        //we are planing to change it a lot of time, so instead of String, we used StringBuilder
        StringBuilder underLines = new StringBuilder();

        // We should print lines and number of lines shuld be same with the letter number of the movie
        for (int i = 0; i < movieName.length(); i++) {

            underLines.append("-");
        }

        //user will have chance to guess
        guessRights=movieName.length()*2;


        // there are two conditions to end this game
        //1) finding the name of the movie
        //2) out of rigths
        do {
            //Showed the lines
            System.out.println(underLines);
            System.out.println("Please enter a letter");
            // We are planning to use this char int stringBuilder with setCharAt() method so It should be a char
            char letter = scan.next().toUpperCase().charAt(0);  // to take the first letter as a capital,

            // first checked if the name of movie has the letter
            if (movieName.contains(""+letter)){   // String.valueOf(letter))
                // if it has, we checked every letter of the movie
                for (int i = 0; i < movieName.length(); i++) {
                    // when the letter is same with a letter of the movie, we will change "-" symbol with the letter
                    if (movieName.substring(i,i+1).equalsIgnoreCase(""+letter)){
                        //setting the letter
                        underLines.setCharAt(i,letter);
                    }
                }
            }

            // if the stringBuilder is same with the name of the movie
            if (underLines.toString().equalsIgnoreCase(movieName)){

                System.out.println(movieName);
                System.out.println("BROVOOO! BRAVOO!! YOU ARE THE NUMBER ONE");
                break;
            }

            // everytime user enters a letter, it will increase the value of numberOfGuesses
            numberOfGuesses++;
            // In this line user will see how many rights he has
            System.out.println("You have left only "+ (guessRights-numberOfGuesses) );

            // If user lost the game because of the lack of rights
            if (numberOfGuesses==guessRights){
                System.out.println("Noooo, you could not do it");

            }
        // loop will continue as long as user has rights
        }while (numberOfGuesses<guessRights);


        // we set answer value outside the loop
        String answer ="";

        // does user want to continue?
        do {

            System.out.println("Do you want to play again Y/N");
            // we took the first letter of entered value
            answer = scan.next().toUpperCase().substring(0,1);

            if (answer.equalsIgnoreCase("Y")){
                // to start from begining we should reset everything
                numberOfGuesses=0;
                guessRights=0;
                letsPlayAGame();


            } else if (answer.equalsIgnoreCase("N")) {

                System.out.println("Thank you very much for playing the game");

            }else {
                System.out.println("What do you want to do?");
            }

        // as long as user does not choose one of Y or N, loop will continue
        }while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"));



    }
}
