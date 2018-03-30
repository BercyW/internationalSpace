package security.bercy.com.internationalspacestationpasses.model.dagger;


import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import security.bercy.com.internationalspacestationpasses.model.retrofit.OpenNotifyData;
import security.bercy.com.internationalspacestationpasses.model.retrofit.OpenNotifyDataParser;
import security.bercy.com.internationalspacestationpasses.utils.GPSDevice;
import security.bercy.com.internationalspacestationpasses.utils.internetCheck.InternetCheck;
@Module
public class OpenNotifyModule {

    private final Context context;

    public OpenNotifyModule(Context context) {
        this.context=context;
    }



    //    Method to get Context of the Application
    @Singleton
    @Provides
    Context provideContext(){
        return context;
    }

    //    Method to get Retrofit instance from the OpenNotifyData class
    @Singleton
    @Provides
    @Named("Real")
    Retrofit providesRetrofitAdapter(){
        return new OpenNotifyData().getRetrofitAdapter();
    }

    @Singleton
    @Provides
    @Named("Dummy")
    Retrofit provideRetrofitForTesting() {
        return new OpenNotifyData().getRetrofitForTesting();
    }


    //    Method to get the instance of the OpenNotifyDataParser class
    /*@Singleton
    @Provides
    OpenNotifyDataParser providesOpenNotifyDataParser(Retrofit retrofit){
        return new OpenNotifyDataParser(retrofit);
    }*/

    @Singleton
    @Provides
    OpenNotifyDataParser providesOpenNotifyDataParser(){
        return new OpenNotifyDataParser();
    }

    //    Method to get the instance of the InternetCheck class
    @Singleton
    @Provides
    InternetCheck providesInternetCheck(Context context){
        return new InternetCheck(context);
    }

    //    Method to get the instance of the GPSDevice class
    @Singleton
    @Provides
    GPSDevice providesGPSDevice(Context context){
        return new GPSDevice(context);
    }


}
