package security.bercy.com.internationalspacestationpasses.view;

import android.app.ProgressDialog;
import android.content.Context;


public class OpenNotifyProgressbar {
    private final ProgressDialog openNotifyProgressBar;

    public OpenNotifyProgressbar(Context context) {
        super();
        openNotifyProgressBar = new ProgressDialog(context);
        openNotifyProgressBar.setMessage("Loading..."); // Setting Message
        openNotifyProgressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner

//        openNotifyProgressBar.setCancelable(false);
    }

    public ProgressDialog getOpenNotifyProgressBar() {
        return openNotifyProgressBar;
    }
}
