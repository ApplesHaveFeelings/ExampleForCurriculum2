package com.example.kenny.exampleforcurriculum;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;


public class CurriculumMainActivity extends Activity {
    private ImageView imageView;
    private Button button ;
    private RelativeLayout mylayout;
    private ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum_main);
        button = (Button) findViewById(R.id.button);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);

        imageView = (ImageView) findViewById(R.id.imageView);
        mylayout =(RelativeLayout)findViewById(R.id.layout);
        mylayout.setBackgroundResource(R.drawable.bob);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (imageView.isShown() == true)
                    imageView.setVisibility(View.INVISIBLE);
                else
                    imageView.setVisibility(View.VISIBLE);
            }
        });


        toggleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean on = ((ToggleButton) v).isChecked();

                if(on)
                  mylayout.setBackgroundResource(R.drawable.bob);
                else
                  mylayout.setBackgroundResource(0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_curriculum_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
