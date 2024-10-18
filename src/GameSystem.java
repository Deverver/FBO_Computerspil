public class GameSystem {

    //region GameSystem Attributes
    public Game[] gamesArray = new Game[5];
    public Player[] playersArray = new Player[5];
    public int gameCount;
    public int playerCount;
    //endregion

    public GameSystem(int gameCount, int playerCount) {
        this.gameCount = gameCount;
        this.playerCount = playerCount;
    }

    //region GameSystem Methods
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
                this.gameCount++;
                return;
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
                this.playerCount++;
                return;
            }
        }
    }

    public void displayAllGames() {
        for (Game game : gamesArray) {
            game.displayGameDetails();
        }
    }

    public void displayAllPlayers() {
        for (Player player : playersArray) {
            player.displayPlayerDetails();
        }
    }

    public void updatePlayerScore(int playerID, double newScore) {
        playersArray[playerID].updateScore(newScore);
    }

    public void findGameById(int gameID) {
        System.out.println("Checking database...");
        boolean isIDValid = true;
        for (Game game : gamesArray) {
            if (gameID != game.getGameID()) {
                isIDValid = false;
            } else if (gameID == game.getGameID()) {
                System.out.println("Match found...");
                game.displayGameDetails();
                return;
            }
        }
        if (!isIDValid) {
            System.out.println("Error: ID had no match in system...");
        }
    }

    public void findPlayerById(int playerID) {
        System.out.println("Checking database...");
        boolean isIDValid = true;
        for (Player player : playersArray) {
            if (playerID != player.getPlayerID()) {
                isIDValid = false;
            } else if (playerID == player.getPlayerID()) {
                System.out.println("Match found...");
                player.displayPlayerDetails();
                return;
            }
        }
        if (!isIDValid) {
            System.out.println("Error: ID had no match in system...");
        }
    }

    public double calculateTotalRevenue(){
        double sumOfGamesInSystem = 0;
        for (Game game : gamesArray) {
            sumOfGamesInSystem += game.getGamePrice();
        }
        return sumOfGamesInSystem;
    }

    public void findTopScoringPlayer(){
        int topScoreID = 0;
        for (int i = 0 ; i < playersArray.length ; i++){
            if (playersArray[i].getPlayerScore()> topScoreID){
                topScoreID = i;
            }
        }
        System.out.println("Player with the highest score was: " + playersArray[topScoreID].getPlayerName());
        System.out.println("Their score was: " + playersArray[topScoreID].getPlayerScore());
    }
    //endregion

} // GameSystem Class End