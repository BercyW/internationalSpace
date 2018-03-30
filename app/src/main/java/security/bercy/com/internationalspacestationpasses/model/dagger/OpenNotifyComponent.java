package security.bercy.com.internationalspacestationpasses.model.dagger;

import javax.inject.Singleton;

import dagger.Component;
import security.bercy.com.internationalspacestationpasses.MainActivity;
import security.bercy.com.internationalspacestationpasses.Presenter.MainFragmentPresenter;
import security.bercy.com.internationalspacestationpasses.model.retrofit.OpenNotifyDataParser;

@Singleton
// List of module classes that contain Dagger provide methods
@Component(modules = {OpenNotifyModule.class})
public interface OpenNotifyComponent {

    //    Classes where Dagger is being Injected
    void inject(MainFragmentPresenter mainFragment);
    void inject(MainActivity mainActivity);
    void inject(OpenNotifyDataParser openNotifyDataParser);

}
