import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class GameSearcher implements Searchable{
    private final Collection<String> searchTerms;
    
    public GameSearcher(Collection<String> searchTerms){
        this.searchTerms = searchTerms;
    }
    
    public boolean matches(ReleasedGame<String, Game> game){
        for(String searchTerm : searchTerms){
           if(game.getValue().toString().contains(searchTerm)){
               return true;
           }
        }
        
        return false;
    }
    
}
