package com.company;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args){
        Deck gameDeck = new Deck();
        int cardCounter = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Would you like to play a game of Blackjack? Enter 'y' for yes, and 'n' for no: ");
        String game = input.nextLine();
        int userScore = 0;
        int dealerScore = 0;

        if (game.equals("y")){
            while (game.equals("y")){
                gameDeck.shuffle();
                cardCounter = 0;
                userScore = 0;
                dealerScore = 0;
                int won = 0;
                int x;
                int aceValue;
                System.out.println("");

                //User Draw # 1
                System.out.println("You drew: " + gameDeck.getNewDeck()[cardCounter]);
                if (gameDeck.draw(cardCounter).substring(0,1).equals("J")){
                    userScore = userScore + 10;
                }
                else if (gameDeck.draw(cardCounter).substring(0,1).equals("Q")){
                    userScore = userScore + 10;
                }
                else if (gameDeck.draw(cardCounter).substring(0,1).equals("K")){
                    userScore = userScore + 10;
                }
                else if ((gameDeck.draw(cardCounter).substring(0,1).equals("A"))) {
                    System.out.print("Wow! You drew an ace! Would you like the ace to be counted as 1 point, or 11 points: ");
                    aceValue = input.nextInt();
                    userScore = userScore + aceValue;
                }
                else if(Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 2 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 3 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 4 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 5 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 6 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 7 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 8 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 9){
                    userScore = userScore + Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1));
                }
                else{
                    userScore = userScore + 10;
                }
                System.out.println("Your score is now: " + userScore);
                cardCounter++;
                System.out.println("");

                //User Draw # 2
                System.out.println("You drew: " + gameDeck.draw(cardCounter));
                if (gameDeck.draw(cardCounter).substring(0,1).equals("J")){
                    userScore = userScore + 10;
                }
                else if (gameDeck.draw(cardCounter).substring(0,1).equals("Q")){
                    userScore = userScore + 10;
                }
                else if (gameDeck.draw(cardCounter).substring(0,1).equals("K")){
                    userScore = userScore + 10;
                }
                else if ((gameDeck.draw(cardCounter).substring(0,1).equals("A"))) {
                    System.out.print("Wow! You drew an ace! Would you like the ace to be counted as 1 point, or 11 points: ");
                    aceValue = input.nextInt();
                    userScore = userScore + aceValue;
                }
                else if(Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 2 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 3 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 4 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 5 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 6 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 7 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 8 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 9){
                    userScore = userScore + Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1));
                }
                else{
                    userScore = userScore + 10;
                }
                System.out.println("Your score is now: " + userScore);
                cardCounter++;

                if (userScore == 21){
                    System.out.println("Hooray! You won!");
                    won = 1;
                    break;
                }
                else if (userScore > 21) {
                    System.out.println("Oops! You lost! ");
                    won = 2;
                    break;
                }

                System.out.println("");

                //Dealer Draw # 1
                System.out.println("Dealer drew: " + gameDeck.draw(cardCounter));
                if (gameDeck.draw(cardCounter).substring(0,1).equals("J")){
                    dealerScore = dealerScore + 10;
                }
                else if (gameDeck.draw(cardCounter).substring(0,1).equals("Q")){
                    dealerScore = dealerScore + 10;
                }
                else if (gameDeck.draw(cardCounter).substring(0,1).equals("K")){
                    dealerScore = dealerScore + 10;
                }
                else if ((gameDeck.draw(cardCounter).substring(0,1).equals("A")) && userScore <= 10) {
                    dealerScore = dealerScore + 11;
                }
                else if ((gameDeck.draw(cardCounter).substring(0,1).equals("A")) && userScore > 10){
                    dealerScore = dealerScore + 1;
                }
                else if(Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 2 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 3 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 4 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 5 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 6 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 7 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 8 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 9){
                    dealerScore = dealerScore + Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1));
                }
                else{
                    dealerScore = dealerScore + 10;
                }
                System.out.println("Dealer score is now: " + dealerScore);
                cardCounter++;
                System.out.println("");

                x = cardCounter;

                //Dealer Draw # 2
                System.out.println("Dealer drew a card. ");
                if (gameDeck.draw(cardCounter).substring(0,1).equals("J")){
                    dealerScore = dealerScore + 10;
                }
                else if (gameDeck.draw(cardCounter).substring(0,1).equals("Q")){
                    dealerScore = dealerScore + 10;
                }
                else if (gameDeck.draw(cardCounter).substring(0,1).equals("K")){
                    dealerScore = dealerScore + 10;
                }
                else if ((gameDeck.draw(cardCounter).substring(0,1).equals("A")) && userScore <= 10) {
                    dealerScore = dealerScore + 11;
                }
                else if ((gameDeck.draw(cardCounter).substring(0,1).equals("A")) && userScore > 10){
                    dealerScore = dealerScore + 1;
                }
                else if(Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 2 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 3 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 4 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 5 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 6 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 7 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 8 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 9){
                    dealerScore = dealerScore + Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1));
                }
                else{
                    dealerScore = dealerScore + 10;
                }
                System.out.println("Dealer score has been updated.");
                cardCounter++;

                if (dealerScore == 21){
                    System.out.println("Oops! You lost! ");
                    won = 2;
                    break;
                }
                else if (dealerScore > 21) {
                    System.out.println("Hooray! You won! ");
                    won = 1;
                    break;
                }

                System.out.println("");

                System.out.print("Type 'h' to hit and draw another card, and type 's' to stay: ");
                String hitOrStay = input.nextLine();
                //User keeps "hitting"
                while (hitOrStay.equals("h")){
                    System.out.println("");
                    //User Draw
                    System.out.println("You drew: " + gameDeck.draw(cardCounter));
                    if (gameDeck.draw(cardCounter).substring(0,1).equals("J")){
                        userScore = userScore + 10;
                    }
                    else if (gameDeck.draw(cardCounter).substring(0,1).equals("Q")){
                        userScore = userScore + 10;
                    }
                    else if (gameDeck.draw(cardCounter).substring(0,1).equals("K")){
                        userScore = userScore + 10;
                    }
                    else if ((gameDeck.draw(cardCounter).substring(0,1).equals("A"))) {
                        System.out.print("Wow! You drew an ace! Would you like the ace to be counted as 1 point, or 11 points: ");
                        aceValue = input.nextInt();
                        userScore = userScore + aceValue;
                    }
                    else if(Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 2 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 3 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 4 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 5 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 6 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 7 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 8 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 9){
                        userScore = userScore + Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1));
                    }
                    else{
                        userScore = userScore + 10;
                    }
                    System.out.println("");
                    System.out.println("Your score is now: " + userScore);
                    cardCounter++;
                    if (userScore == 21){
                        System.out.println("Hooray! You won!");
                        won = 1;
                        break;
                    }
                    else if (userScore > 21){
                        System.out.println("Oops! You lost!");
                        won = 2;
                        break;
                    }
                    System.out.println("");

                    System.out.print("Type 'h' if you would like to draw another card, and type 's' to stay: ");
                    hitOrStay = input.nextLine();
                }
                //If user has not won or lost yet
                if (won == 0){
                    System.out.println("Dealer had drawn: " + gameDeck.draw(x));
                    System.out.println("Dealer score is now " + dealerScore);
                    System.out.println("");
                    while (dealerScore < 17) {
                        //Dealer Draw
                        System.out.println("Dealer drew: " + gameDeck.draw(cardCounter));
                        if (gameDeck.draw(cardCounter).substring(0, 1).equals("J")) {
                            dealerScore = dealerScore + 10;
                        }
                        else if (gameDeck.draw(cardCounter).substring(0, 1).equals("Q")) {
                            dealerScore = dealerScore + 10;
                        }
                        else if (gameDeck.draw(cardCounter).substring(0, 1).equals("K")) {
                            dealerScore = dealerScore + 10;
                        }
                        else if ((gameDeck.draw(cardCounter).substring(0, 1).equals("A")) && userScore <= 10) {
                            dealerScore = dealerScore + 11;
                        }
                        else if ((gameDeck.draw(cardCounter).substring(0, 1).equals("A")) && userScore > 10) {
                            dealerScore = dealerScore + 1;
                        }
                        else if(Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 2 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 3 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 4 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 5 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 6 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 7 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 8 || Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1)) == 9){
                            dealerScore = dealerScore + Integer.parseInt(gameDeck.draw(cardCounter).substring(0,1));
                        }
                        else{
                            dealerScore = dealerScore + 10;
                        }
                        System.out.println("Dealer score is now: " + dealerScore);
                        cardCounter++;

                        if (dealerScore == 21){
                            System.out.println("Oops! You lost!");
                            won = 2;
                            break;
                        }
                        else if (dealerScore > 21){
                            System.out.println("Hooray! You won!");
                            won = 1;
                            break;
                        }
                    }
                }

                if (won == 1 || won == 2){
                    System.out.print("Type 'y' if you would like to play again, and type 'n' if you wish to quit: ");
                    game = input.nextLine();
                }
                else{
                    if (userScore > dealerScore){
                        System.out.println("Hooray! You won!");
                        System.out.print("Type 'y' if you would like to play again, and type 'n' if you wish to quit: ");
                        game = input.nextLine();
                    }
                    else if (userScore < dealerScore){
                        System.out.println("Oops! You lost!");
                        System.out.print("Type 'y' if you would like to play again, and type 'n' if you wish to quit: ");
                        game = input.nextLine();
                    }
                    else {
                        System.out.println("Oh! You tied!");
                        System.out.print("Type 'y' if you would like to play again, and type 'n' if you wish to quit: ");
                        game = input.nextLine();
                    }
                }
            }
        }

    }
}
