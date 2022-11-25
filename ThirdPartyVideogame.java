import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ThirdPartyVideogame extends Videogame{
    public ThirdPartyVideogame(String puc, Collection<String> genres, String publisher, String director, Collection<Format> formats, Collection<String> developers, String title, int year) throws VideoGameException {
        super(puc, genres, publisher, director, formats, developers, title, year);
    }
    
    public String getType(){
        return "Third-Party";
    }
}
