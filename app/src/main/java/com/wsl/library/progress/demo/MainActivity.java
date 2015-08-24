package com.wsl.library.progress.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.wsl.library.progress.ProgressWheel2;
import com.wsl.library.progress.SimpleProgressBar;

public class MainActivity extends AppCompatActivity {

    private SimpleProgressBar progressBar1;
    private ProgressWheel2 progressBar2;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar1 = (SimpleProgressBar) findViewById(R.id.progress1);
        progressBar2 = (ProgressWheel2) findViewById(R.id.progress2);
        progressBar1.setProgress(progress);
        progressBar2.setProgress(progress);
        progressBar2.setText(Integer.toString(progress));
    }

    public void changeProgress(View view) {
        progressBar1.setProgress(progress);
        progressBar2.setProgress(progress);
        progressBar2.setText(Integer.toString(progress));
        if(progress >= 100) {
            progress = 0;
        } else {
            progress += 10;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
