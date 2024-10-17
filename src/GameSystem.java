/*
Opgave 3: Administrere spil og spillere
Opret en klasse GameSystem, der skal administrere spil og spillere.
Klassen skal have to arrays:
Et til at gemme spil.
Et til at gemme spillere.

Implementer følgende metoder:
Metode addGame til at tilføje et nyt spil til systemet.
Metode addPlayer til at tilføje en ny spiller til systemet.
Metode displayAllGames til at vise detaljer om alle spil i systemet.
Metode displayAllPlayers til at vise detaljer om alle spillere i systemet.
Metode updatePlayerScore til at opdatere en spillers score baseret på deres playerId.
Metode findGameById til at finde og returnere et spil baseret på dets gameId.
Metode findPlayerById til at finde og returnere en spiller baseret på deres playerId.

Opgave 4: Tilføj flere funktioner til GameSystem
Udvid GameSystem-klassen med følgende funktioner:
Metode calculateTotalRevenue til at beregne den samlede indtjening fra alle solgte spil.
Metode findTopScoringPlayer til at finde og returnere spilleren med den højeste score.

 */


import java.util.ArrayList;


public class GameSystem {

    //region GameSystem Attributes
    public Game[] gamesArray = new Game[5];
    public Player[] playersArray = new Player[5];
    private int gameCount;
    private int playerCount;
    //endregion

    public GameSystem(int gameCount, int playerCount) {
        this.gameCount = gameCount;
        this.playerCount = playerCount;
    }

    public void addGame(Game gameObject) {
        for (int i = 0; i < gamesArray.length; i++) {
            // Checks if array is full, if it is full, then it creates a new array, that is twice the size and copies the old array data to the new one
            if (gamesArray[gamesArray.length - 1] != null) {
                Game[] newGamesArray = new Game[gamesArray.length * 2];
                for (int j = 0; j < gamesArray.length; j++) {
                    newGamesArray[j] = gamesArray[j];
                }
                gamesArray = newGamesArray;
            }
            // Checks if array index is empty, if its is it then fills it what an object.
            if (gamesArray[i] == null) {
                gamesArray[i] = gameObject;
            }
        }
    }

    public void addPlayer(Player playerObject) {
        for (int i = 0; i < playersArray.length; i++) {
            if (playersArray[playersArray.length - 1] != null) {
                Player[] newPlayerArray = new Player[playersArray.length * 2];
                for (int j = 0; j < playersArray.length; j++) {
                    newPlayerArray[j] = playersArray[j];
                }
                playersArray = newPlayerArray;
            }

            if (playersArray[i] == null) {
                playersArray[i] = playerObject;
            }
        }
    }

    public void displayAllGames() {
        for (int i = 0; i < gamesArray.length; i++) {
            gamesArray[i].displayGameDetails();
        }
    }

    public void displayAllPlayers() {
        for (int i = 0; i < playersArray.length; i++) {
            playersArray[i].displayPlayerDetails();
        }
    }

    public void updatePlayerScore(int playerID, double newScore) {
        playersArray[playerID].updateScore(newScore);
    }


    /*
    public static void findGameById(){


    }

    public static void findGameById(){


    }

    public static void findPlayerById(){


    }
    */


}