package darkEnergy.class6math;

import static darkEnergy.class6math.R.id.knowing_our_no;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class startExerise extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_exerise);
        Button button1 = findViewById(knowing_our_no);
        Button button2 = findViewById(R.id.b2);
        Button button3 = findViewById(R.id.b3);
        Button button4 = findViewById(R.id.b4);
        Button button5 = findViewById(R.id.b5);
        Button button6 = findViewById(R.id.b6);
        Button button7 = findViewById(R.id.b7);
        Button button8 = findViewById(R.id.b8);
        Button button9 = findViewById(R.id.b9);
        Button button10 = findViewById(R.id.b10);
        Button button11 = findViewById(R.id.b11);
        Button button12 = findViewById(R.id.b12);
        Button button13 = findViewById(R.id.b13);
        Button button14 = findViewById(R.id.b14);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  knowing_our_no:
                Toast.makeText(this, "Knowing Our Numbers", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(startExerise.this, MainActivity3.class);
                startActivity(i);
                break;

                case  R.id.b2:
                Toast.makeText(this, "Whole Numbers", Toast.LENGTH_SHORT).show();
                Intent j = new Intent(startExerise.this, MainActivity4.class);
                startActivity(j);
                break;

                case  R.id.b3:
                Toast.makeText(this, "Playing With Numbers", Toast.LENGTH_SHORT).show();
                Intent k = new Intent(startExerise.this, MainActivity5.class);
                startActivity(k);
                break;


                case  R.id.b4:
                Toast.makeText(this, "Geometrical Ideas", Toast.LENGTH_SHORT).show();
                Intent l = new Intent(startExerise.this, MainActivity6.class);
                startActivity(l);
                break;

                case  R.id.b5:
                Toast.makeText(this, "Elementary Shapes", Toast.LENGTH_SHORT).show();
                Intent m = new Intent(startExerise.this, MainActivity7.class);
                startActivity(m);
                break;

                case  R.id.b6:
                Toast.makeText(this, "Integers", Toast.LENGTH_SHORT).show();
                Intent n = new Intent(startExerise.this, MainActivity8.class);
                startActivity(n);
                break;
                case  R.id.b7:
                Toast.makeText(this, "Fractions", Toast.LENGTH_SHORT).show();
                Intent e = new Intent(startExerise.this, MainActivity9.class);
                startActivity(e);
                break;

                case  R.id.b8:
                Toast.makeText(this, "Decimals", Toast.LENGTH_SHORT).show();
                Intent g = new Intent(startExerise.this, MainActivity10.class);
                startActivity(g);
                break;

                case  R.id.b9:
                Toast.makeText(this, "Data Handling", Toast.LENGTH_SHORT).show();
                Intent h = new Intent(startExerise.this, MainActivity11.class);
                startActivity(h);
                break;

                case  R.id.b10:
                Toast.makeText(this, "Mensuration", Toast.LENGTH_SHORT).show();
                Intent q = new Intent(startExerise.this, MainActivity12.class);
                startActivity(q);
                break;

                case  R.id.b11:
                Toast.makeText(this, "Algebra", Toast.LENGTH_SHORT).show();
                Intent r = new Intent(startExerise.this, MainActivity13.class);
                startActivity(r);
                break;

                case  R.id.b12:
                Toast.makeText(this, "Ratio And Proportion", Toast.LENGTH_SHORT).show();
                Intent s = new Intent(startExerise.this, MainActivity14.class);
                startActivity(s);
                break;

                case  R.id.b13:
                Toast.makeText(this, "Symmetry", Toast.LENGTH_SHORT).show();
                Intent t = new Intent(startExerise.this, Symmetry.class);
                startActivity(t);
                break;

                case  R.id.b14:
                Toast.makeText(this, "Practical Geometry", Toast.LENGTH_SHORT).show();
                Intent x = new Intent(startExerise.this, Practicalgeometry.class);
                startActivity(x);
                break;

        }

    }
}