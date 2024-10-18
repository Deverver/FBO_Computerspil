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

    public void displayGameDetails() {
        System.out.println("Chosen game's ID: " + this.gameID);
        System.out.println("The game is called: " + this.gameTitle);
        System.out.println("Its genre is: " + this.gameGenre);
        System.out.println("This game costs: " + this.gamePrice);
        System.out.println("***********************************************");
    }// Prints out the Parameters of a Game object

}// Game Class End