package darkEnergy.class6math;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button b1 = findViewById(R.id.back);
        TextView T1 = findViewById(R.id.Exer1_1);
        TextView T2= findViewById(R.id.Exer1_2);
        TextView T3 = findViewById(R.id.Exer1_3);

        b1.setOnClickListener(this);
        T1.setOnClickListener(this);
        T2.setOnClickListener(this);
        T3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
   switch (v.getId()){
       case R.id.back:
           Intent b = new Intent(MainActivity3.this, startExerise.class);
           startActivity(b);
           break;

       case R.id.Exer1_1:
           Intent c = new Intent(MainActivity3.this, Ex_1_1.class);
           startActivity(c);
           break;

       case R.id.Exer1_2:
           Intent d = new Intent(MainActivity3.this, Ex_1_2.class);
           startActivity(d);
           break;

       case R.id.Exer1_3:
           Intent e = new Intent(MainActivity3.this, Ex_1_3.class);
           startActivity(e);
           break;
   }
    }
}


