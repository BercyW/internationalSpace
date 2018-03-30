package security.bercy.com.internationalspacestationpasses.utils.internetCheck;



public class InternetCheckEvent {

    private  boolean isConnected;


    //    Receives the Boolean values from the InternetCheck Event
    public InternetCheckEvent(boolean isConnected) {
        this.isConnected=isConnected;

    }

    //    Method to return the Boolean value received from InternetCheck
    public boolean getConnectionStatus() {
        return isConnected;
    }
}
