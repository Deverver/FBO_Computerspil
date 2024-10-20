

public class Main {
    public static void main(String[] args) {
        GameSystem gameSystem = new GameSystem(0,0);

        //region List of Game Objects
        Game game01 = new Game(0,"Bloodborne","Souls-like",60);
        Game game02 = new Game(1,"Hollow Knight","Metroidvania",15);
        Game game03 = new Game(2,"DOTA 2","MOBA", 0);
        Game game04 = new Game(3,"Killing Floor 2","Co-Op Shooter",28);
        Game game05 = new Game(4,"Rain World","Simulated Survival",25);
        //endregion

        //region List of Player Objects
        Player player01 = new Player(1,"James",22,455);
        Player player02 = new Player(2,"Jonathan",30,652);
        Player player03 = new Player(3,"John",28,666);
        Player player04 = new Player(4,"Jameson",40,324);
        Player player05 = new Player(5,"Jones",26,748);
        //endregion

        //region Adds Game objects to gamesArray in GameSystem
        gameSystem.addGame(game01);
        gameSystem.addGame(game02);
        gameSystem.addGame(game03);
        gameSystem.addGame(game04);
        gameSystem.addGame(game05);
        //endregion

        //region Adds Player objects to playersArray in GameSystem
        gameSystem.addPlayer(player01);
        gameSystem.addPlayer(player02);
        gameSystem.addPlayer(player03);
        gameSystem.addPlayer(player04);
        gameSystem.addPlayer(player05);
        //endregion

        /* Displays a Game Object or Player Object
        game03.displayGameDetails();
        player04.displayPlayerDetails();
        */

        /* Displays that a players score can be updated both from the PLayer object and the GameSystem
        player04.displayPlayerDetails();
        player04.updateScore(643);
        player04.displayPlayerDetails();
        gameSystem.updatePlayerScore(3,666);
        gameSystem.playersArray[3].displayPlayerDetails();
        */

        /* Displays information from both Arrays in GameSystem
        gameSystem.gamesArray[1].displayGameDetails();
        gameSystem.playersArray[2].displayPlayerDetails();

        gameSystem.displayAllGames();
        gameSystem.displayAllPlayers();
        */

        /* Displays that both player and game object can be found by ID value, and returns an error if no match has been found
        gameSystem.findPlayerById(2);
        gameSystem.findGameById(3);
        gameSystem.findGameById(5);
        */

        /* Displays name and score of the player object with the highest score
        gameSystem.findTopScoringPlayer();
           Displays total value of the game objects in game system
        System.out.println("If the games in gameSystem were sold they would have value equal a total revenue of: " + gameSystem.calculateTotalRevenue() + "€" );
        */

        /* Displays the number of slots filled in each Array in gameSystem
        System.out.println(gameSystem.gameCount);
        System.out.println(gameSystem.playerCount);
        */

        /* Displays that gamesArray slot 5 remains empty as more games has yet to be added
        System.out.println(gameSystem.gamesArray[5]);
        */


    }// main End
}// class Main End