import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/*
 * implements released game array list 
 */
public class ReleasedGame<K,V extends Comparable<V>> implements Comparable<ReleasedGame<K,V>>{
    private final K key;
    private final V value;
    
    public ReleasedGame(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    public K getKey(){
        return this.key;
    }
    
    public V getValue(){
        return this.value;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof ReleasedGame && ((ReleasedGame) obj).getValue().equals(this.getValue())){
            return true;
        }
        
        return false;
    }
    
    @Override
    public int compareTo(ReleasedGame<K,V> game){
        return 1;
    }

}
