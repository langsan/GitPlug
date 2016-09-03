package wxy.gitplug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        TextView tv=new TextView(this);
//        tv.setText("Hello World....");
//        setContentView(tv);

//        View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_main, null);
//
//        setContentView(view);

        View view = View.inflate(MainActivity.this, R.layout.activity_main, null);

        setContentView(view);
    }
}
