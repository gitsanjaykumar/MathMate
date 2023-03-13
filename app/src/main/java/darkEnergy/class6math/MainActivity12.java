package darkEnergy.class6math;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity12 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        button = findViewById(R.id.back9);
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
    }
}