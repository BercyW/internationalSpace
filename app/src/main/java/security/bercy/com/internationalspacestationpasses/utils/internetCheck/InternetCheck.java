package security.bercy.com.internationalspacestationpasses.utils.internetCheck;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import org.greenrobot.eventbus.EventBus;


public class InternetCheck {
    private Context context;

    public InternetCheck(Context context) {
        this.context = context;
    }


//  Method to Check the Internet Connection Status

    public void getInternetConnectionStatus(){

        ConnectivityManager connectivityManager =(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

//        Boolean value for the Internet is available or not
//        If Available its true or else false
        boolean isConnected = networkInfo != null && networkInfo.isConnectedOrConnecting();

//        Event to Update the UI depending on the Internet Network Status
        EventBus.getDefault().post(new InternetCheckEvent(isConnected));
    }

}
