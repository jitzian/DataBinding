package mac.training.android.com.org.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import mac.training.android.com.org.myapplication.databinding.ActivityMainBinding;
import mac.training.android.com.org.myapplication.model.Person;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Person person = new Person("Bruce", "Wayne", "https://avatars.githubusercontent.com/u/7937304?v=3");
        activityMainBinding.setPerson(person);

        EventListener eventListener = new EventListener();
        activityMainBinding.setEvent(eventListener);


    }
}
