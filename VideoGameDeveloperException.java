public class VideoGameDeveloperException extends IllegalArgumentException{
    private final String developer;
    private final Videogame videogame;
    
    public VideoGameDeveloperException(String developer, Videogame videogame){
        super("a developer is preventing adding the videogame to the catalog.");
        this.developer = developer;
        this.videogame = videogame;
    }
    
    
    public String getDeveloper(){
        return this.developer;
    }
    
    public Videogame getVideogame(){
        return this.videogame;
    }
    
    
}
