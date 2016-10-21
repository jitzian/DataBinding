package mac.training.android.com.org.myapplication;

import android.util.Log;
import android.view.View;

import mac.training.android.com.org.myapplication.model.Person;

/**
 * Created by raian on 21/10/16.
 */

public class EventListener {
    private static final String TAG = EventListener.class.getName();

    public void goToEvent(View view, Person person){
        Log.d(TAG, "goToEvent Happening");
        Log.d(TAG, person.getName());
        Log.d(TAG, person.getLastName());
        Log.d(TAG, person.getImgURL());


    }

}
