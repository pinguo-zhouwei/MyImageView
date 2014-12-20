package us.pinguo.myimageview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        MyImageView imageView = (MyImageView) findViewById(R.id.test_imageview);
        imageView.setResourseId(R.drawable.baby_avatar_default);
        MyImageView imageView1 = (MyImageView) findViewById(R.id.test_imageview2);
        imageView1.setResourseId(R.drawable.baby);
        MyImageView imageView2 = (MyImageView) findViewById(R.id.test_imageview3);
        imageView2.setResourseId(R.drawable.baby_test);
    }


}
