package security.bercy.com.internationalspacestationpasses.model.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import security.bercy.com.internationalspacestationpasses.model.retrofit.OpenNotifyPOJO.OpenNotify;

public interface OpenNotifyDataInterface {
    //    Passing the latitude and longitude values of the Device and completing the URL to make the network call.
    @GET("iss-pass.json?")
    Call<OpenNotify> getData(@Query("lat") Double lat, @Query("lon") Double lon);
}
