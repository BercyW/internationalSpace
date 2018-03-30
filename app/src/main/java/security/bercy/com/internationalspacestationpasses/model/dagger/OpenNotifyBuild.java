package security.bercy.com.internationalspacestationpasses.model.dagger;


import android.app.Application;

public class OpenNotifyBuild extends Application{

    private OpenNotifyComponent openNotifyComponent;
    private static OpenNotifyBuild openNotifyBuild;

    @Override
    public void onCreate() {
        super.onCreate();

//        Instance of the OpenNotifyBuild class
        openNotifyBuild=this;

//        Building the Dagger Component
        openNotifyComponent=DaggerOpenNotifyComponent.builder()
                .openNotifyModule(new OpenNotifyModule(this))
                .build();
    }

    // Getter for the Instance of the OpenNotifyBuild

    public static OpenNotifyBuild getOpenNotifyBuild(){
        return openNotifyBuild;
    }


    //    Getter for the OpenNotifyComponent

    public OpenNotifyComponent getOpenNotifyComponent(){
        return openNotifyComponent;
    }
}
