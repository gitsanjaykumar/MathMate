package darkEnergy.class6math;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Ex_2_1 extends AppCompatActivity {

    private TextView text1;
    private PDFView pdfView;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mref = database.getReference("EX2_1");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex21);
        pdfView = (PDFView) findViewById(R.id.Exercise2_1);
        text1 = (TextView) findViewById(R.id.T_Ex2_1);
        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value =snapshot.getValue(String.class);
                text1.setText(value);
                String url = text1.getText().toString();
                new RetrivePdfStream().execute(url);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(Ex_2_1.this,"Failed to Load", Toast.LENGTH_SHORT).show();

            }
        });}
    class RetrivePdfStream extends AsyncTask<String, Void, InputStream>{

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream=null;
            try {
                URL uRl=new URL(strings[0]);
                HttpsURLConnection urlConnection=(HttpsURLConnection) uRl.openConnection();
                if (urlConnection.getResponseCode()==200)
                {
                    inputStream=new BufferedInputStream(urlConnection.getInputStream());

                }

            }catch (IOException e){
                return null;

            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();
        }
    }
}


