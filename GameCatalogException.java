public class GameCatalogException extends IllegalStateException{
    private final String puc;
    private final Game game;
    
    public GameCatalogException(String puc, Game game){
        super("the game's PUC is already in the catalog.");
        this.puc = puc;
        this.game = game;
    }
    
    public String getPuc(){
        return this.puc;
    }
    
    public Game getGame(){
        return this.game;
    }
}
