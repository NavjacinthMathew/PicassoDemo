package mathew.navjacinth.com.picassodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);

        Picasso.with(this)
                .load("https://c2.staticflickr.com/4/3531/3869245383_ebf96c4d07.jpg")
                .placeholder(R.drawable.icon_wait)
                .into(imageView);
    }
}