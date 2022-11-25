import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GameCatalog{
    private final List<ReleasedGame<String, Game>> catalog;
    
    public GameCatalog(){
        this.catalog = new ArrayList<ReleasedGame<String, Game>>();
    }
    
    public void add(String puc, Game game){
        if(game instanceof FirstPartyVideogame && (((FirstPartyVideogame) game).getDevelopers().size() > 1 || !(((FirstPartyVideogame) game).getDevelopers().iterator().next().equals(((FirstPartyVideogame) game).getPublisher())))){
            throw new VideoGameDeveloperException(((FirstPartyVideogame) game).getDevelopers().iterator().next(), (FirstPartyVideogame) game);
        }
        
        //check VideoGameDeveloperException SecondPartyVideogame error
        if(game instanceof SecondPartyVideogame){
            //Iterator hold = ((SecondPartyVideogame) game).getDevelopers().iterator();
            
        }
        
        //check VideoGameDeveloperException ThirdPartyVideogame error
        if(game instanceof ThirdPartyVideogame){
            
        }
        
        this.catalog.add(new ReleasedGame(puc, game));
    }
    
    //implement this - needs param too
    public List<ReleasedGame<String, Game>> search(){
        
        return null;
    }
    
    //implement this
    public void sort(){
        
    }
    
}
