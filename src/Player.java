/*
Opgave 2: Definere klassen Player
Attributter:
    int playerId
    String name
    int age
    double score

Metoder:
    Konstruktør til at initialisere alle attributter.
    Getter- og setter-metoder for alle attributter.
    En metode displayDetails til at vise spillerens detaljer.
    En metode updateScore til at opdatere spillerens score med en ny værdi.
 */

import java.util.ArrayList;

public class Player {

    //region Player Attributes
    private int playerID;
    private String playerName;
    private int playerAge;
    private double playerScore;
    //endregion


    //region Constructors
    public Player() {

    }

    public Player(int playerID, String playerName, int playerAge, double playerScore) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerScore = playerScore;
    }
    //endregion

    //region Gets and Sets
    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public double getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(double playerScore) {
        this.playerScore = playerScore;
    }
    //endregion

    //region Methods
    public void displayPlayerDetails() {
        System.out.println("Chosen players ID: " + this.playerID);
        System.out.println("Players name is: " + this.playerName);
        System.out.println(this.playerName + " is " + this.playerAge + " years old");
        System.out.println("Their score is: " + this.playerScore);
        System.out.println("***********************************************");
    }// Prints out the Parameters of a Game object

    public void updateScore(double newScore) {
        this.playerScore = newScore;

    }
    //endregion

}// Player Class End