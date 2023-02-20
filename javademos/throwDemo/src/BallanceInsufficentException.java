public class BallanceInsufficentException extends Exception {
    String massage;
    public BallanceInsufficentException(String massage){
        this.massage=massage;
    }
    public String getMassage(){
        return this.massage;
    }
}
