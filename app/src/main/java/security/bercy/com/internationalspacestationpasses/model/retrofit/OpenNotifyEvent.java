package security.bercy.com.internationalspacestationpasses.model.retrofit;

import java.util.List;

import security.bercy.com.internationalspacestationpasses.model.retrofit.OpenNotifyPOJO.Response;

/**
 * Created by Bercy on 3/30/18.
 */

public class OpenNotifyEvent {
    private List<Response> response;

    //    Receives the List<Response> values from the OpenNotifyDataParser Event
    public OpenNotifyEvent(List<Response> response) {
        this.response = response;
    }

    //    Method to return the List<Response> value received from OpenNotifyDataParser
    public List<Response> getListOfResponse() {
        return response;
    }

}
