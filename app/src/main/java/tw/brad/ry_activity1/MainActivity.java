package tw.brad.ry_activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("brad", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad", "onRestart");
    }

    public void test1(View view) {
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        //Toast.makeText(this, "One more", Toast.LENGTH_SHORT).show();

    }

    public void test2(View view) {
        Intent intent = new Intent(this, Page2Activity.class);
        startActivity(intent);
    }
}
