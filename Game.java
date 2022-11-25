import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class Game implements Comparable<Game>{
    private final String puc;
    private final Collection<String> genres;
    
    public Game(String puc, Collection<String> genres) throws VideoGameException{
        if(genres == null || genres.size() == 0 || genres.contains(null)){
            throw new VideoGameException("genres");
        }
        if(puc == null){
            throw new VideoGameException("puc");
        }
        this.genres = genres;
        this.puc = puc;
    }
    
    public String getPuc(){
        return this.puc;
    }
    
    public Collection<String> getGenres(){
        return this.genres;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Game && ((Game)obj).getPuc().equals(this.puc)){
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        String hold = "Type: " + this.getType() + ",PUC: " + this.puc + ",Genres: ";
        //append genres still
        hold += Arrays.deepToString(this.genres.toArray());
        
        return hold;
    }
    
    public abstract String getType();
}
