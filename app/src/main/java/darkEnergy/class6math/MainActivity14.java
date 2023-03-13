package darkEnergy.class6math;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity14 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        button = findViewById(R.id.back11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openstartExerise();
            }
        });
    }
    private void openstartExerise() {
        Intent x =new Intent(this, startExerise.class);
        startActivity(x);
    }}