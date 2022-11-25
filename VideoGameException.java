public class VideoGameException extends Exception{
    private final String fieldName;
    
    public VideoGameException(String fieldName){
        super("an argument has null or illegal values.");
        this.fieldName = fieldName;
    }
    
    public String getFieldName(){
        return this.fieldName;
    }
}
