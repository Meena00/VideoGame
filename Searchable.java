public interface Searchable{
    boolean matches(ReleasedGame<String, Game> game);
}