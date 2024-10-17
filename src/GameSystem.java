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
    public static Game[] gamesArray = new Game[5];
    public static Player[] playersArray = new Player[5];
    private int gameCount;
    private int playerCount;
    //endregion


    public GameSystem(int gameCount, int playerCount) {
        this.gameCount = gameCount;
        this.playerCount = playerCount;
    }

    public static void addGame(Game gameObject, int index) {
        gamesArray[index] = gameObject;
    }

    public static void addPlayer(Player playerObject, int index) {
        playersArray[index] = playerObject;
    }

    public static void displayAllGames() {
        for (int i = 0; i < gamesArray.length; i++) {
            gamesArray[i].displayGameDetails();
        }
    }

    public static void displayAllPlayers() {
        for (int i = 0; i < playersArray.length; i++) {
            playersArray[i].displayPlayerDetails();
        }
    }

    public static void updatePlayerScore(int playerID, double newScore){
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