import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class Videogame extends Game{
    private final String publisher;
    private final String director;
    private final Collection<Format> formats;
    private final Collection<String> developers;
    private final String title;
    private final int year;
    
    public Videogame(String puc, Collection<String> genres, String publisher, String director, Collection<Format> formats, Collection<String> developers, String title, int year) throws VideoGameException {
        super(puc, genres);
        
        if(publisher == null){
            throw new VideoGameException("publisher");
        }
        
        if(director == null){
            throw new VideoGameException("director");
        }
        
        if(formats == null || formats.size() == 0 || formats.contains(null)){
            throw new VideoGameException("formats");
        }
        
        if(developers == null || developers.size() == 0 || developers.contains(null)){
            throw new VideoGameException("developers");
        }
        
        if(title == null){
            throw new VideoGameException("title");
        }
        
        if(year < 1977 || year > 2077){
            throw new VideoGameException("year");
        }
        
        this.publisher = publisher;
        this.director = director;
        this.formats = formats;
        this.developers = developers;
        this.title = title;
        this.year = year;
    }
    
    public String getPublisher(){
        return this.publisher;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public Collection<Format> getFormats(){
        return this.formats;
    }
    
    public Collection<String> getDevelopers(){
        return this.developers;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String toString(){
        StringBuilder stb = new StringBuilder();
        stb.append("Publisher: " + this.getPublisher());
        stb.append(", director: " + this.getDirector());
        stb.append(", formats: " + Arrays.deepToString(this.getFormats().toArray()));
        stb.append(", developers: " + Arrays.deepToString(this.getDevelopers().toArray()));
        stb.append(", Title: " + this.getTitle());
        stb.append(", year: " + this.getYear());
        stb.append(super.toString());
        return stb.toString();
    }
    
    @Override
    public int compareTo(Game game){
        return 1;
    }
}
