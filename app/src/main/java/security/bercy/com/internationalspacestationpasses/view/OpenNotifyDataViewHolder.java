package security.bercy.com.internationalspacestationpasses.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import security.bercy.com.internationalspacestationpasses.R;


public class OpenNotifyDataViewHolder extends RecyclerView.ViewHolder {TextView duration,time;

    public OpenNotifyDataViewHolder(View itemView) {
        super(itemView);
        duration=itemView.findViewById(R.id.duration);
        time=itemView.findViewById(R.id.time);
    }

}
