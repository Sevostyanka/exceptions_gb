public class NullException extends ArithmeticException{
    public NullException(String message, Exception e) {
        super(message);
        m = e.getMessage();
    }
    private String m;
    public String getInfo(){
        return m;
    }

}
