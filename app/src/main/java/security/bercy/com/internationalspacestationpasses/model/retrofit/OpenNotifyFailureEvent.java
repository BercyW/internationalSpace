package security.bercy.com.internationalspacestationpasses.model.retrofit;

/**
 * Created by Bercy on 3/30/18.
 */

public class OpenNotifyFailureEvent {
    private  String onFailureResponse;

    //    Receives the onFailure Response from the OpenNotifyDataParser Failure Event
    public OpenNotifyFailureEvent(String onFailureResponse) {
        this.onFailureResponse=onFailureResponse;
    }

    //    Method to return the onFailure Response received from OpenNotifyDataParser
    public String getOnFailureResponse() {
        return onFailureResponse;
    }
}
