package mac.training.android.com.org.myapplication.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by raian on 21/10/16.
 */

public class Person extends BaseObservable{

    private String name;
    private String lastName;
    private String imgURL;

    public Person() {
    }

    public Person(String name, String lastName, String imgURL) {
        this.name = name;
        this.lastName = lastName;
        this.imgURL = imgURL;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @BindingAdapter("bind:img_URL")
    public static void loadImage(ImageView imageView, String imgURL){
        Glide.with(imageView.getContext())
                .load(imgURL)
                .into(imageView);
    }
}
