        package darkEnergy.class6math;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

        public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main4);

                Button b1 = findViewById(R.id.back1);
                TextView T1 = findViewById(R.id.Exer2_1);
                TextView T2= findViewById(R.id.Exer2_2);
                TextView T3 = findViewById(R.id.Exer2_3);

                b1.setOnClickListener(this);
                T1.setOnClickListener(this);
                T2.setOnClickListener(this);
                T3.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.back1:
                        Intent b = new Intent(MainActivity4.this, startExerise.class);
                        startActivity(b);
                        break;

                    case R.id.Exer2_1:
                        Intent c = new Intent(MainActivity4.this, Ex_2_1.class);
                        startActivity(c);
                        break;

                    case R.id.Exer2_2:
                        Intent d = new Intent(MainActivity4.this, Ex_2_2.class);
                        startActivity(d);
                        break;

                    case R.id.Exer2_3:
                        Intent e = new Intent(MainActivity4.this, Ex_2_3.class);
                        startActivity(e);
                        break;
                }
            }
        }

