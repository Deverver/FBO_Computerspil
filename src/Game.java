/*
Opgave 1: Definere klassen Game
Attributter:
    int playerId
    String name
    int age
    double score

Metoder:
    Konstruktør til at initialisere alle attributter.
    Getter- og setter-metoder for alle attributter.
    En metode displayDetails til at vise spillets detaljer.
 */

import java.util.ArrayList;

public class Game {

    //region Game Attributes
    private int gameID;
    private String gameTitle;
    private String gameGenre;
    private double gamePrice;
    //endregion

    //region Constructors
    public Game() {

    }

    public Game(int gameID, String gameTitle, String gameGenre, double price) {
        this.gameID = gameID;
        this.gameTitle = gameTitle;
        this.gameGenre = gameGenre;
        this.gamePrice = price;
    }
    //endregion

    //region Gets and Sets
    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }
    //endregion

    //region Game Methods
    public void displayGameDetails() {
        System.out.println("Chosen game's ID: " + this.gameID);
        System.out.println("The game is called: " + this.gameTitle);
        System.out.println("Its genre is: " + this.gameGenre);
        System.out.println("This game costs: " + this.gamePrice);
        System.out.println("***********************************************");
    }// Prints out the Parameters of a Game object
    //endregion

}// Game End