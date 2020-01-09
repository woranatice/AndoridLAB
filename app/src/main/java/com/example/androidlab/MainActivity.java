package com.example.androidlab;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void doClick(View v) {
        Context context = getApplicationContext();
        CharSequence txt = "Woranat Intus";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context,txt,duration).show();


    }
    public void doCustom(View v){
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom,null);
        TextView txt =  view.findViewById(R.id.txt1);
        txt.setText("HelloWorld");
        Toast toast = new Toast(MainActivity.this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }
}
