package com.example.a2kchoice;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        TextView votoAnteto = findViewById(R.id.votosGiannis);
        TextView votoDoncic = findViewById(R.id.votosLuka);
        TextView votojokic = findViewById(R.id.votosJokic);
        TextView votobooker = findViewById(R.id.votosDevin);
        TextView vototatum = findViewById(R.id.votosTatum);
        FirebaseFirestore votacio = FirebaseFirestore.getInstance();
        votacio.collection("VotsJugadors")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                List votos = task.getResult().getDocuments();
                                int votAnteto=0;
                                int votDoncic=0;
                                int votbooker=0;
                                int votjokic=0;
                                int vottatum=0;
                                for(int i = 0 ; i<votos.size();i++){

                                 votAnteto = votAnteto +  task.getResult().getDocuments().get(i).getLong("votanteto").intValue();
                                 votDoncic = votDoncic + task.getResult().getDocuments().get(i).getLong("votdoncic").intValue();
                                 votbooker = votbooker + task.getResult().getDocuments().get(i).getLong("votbooker").intValue();
                                 votjokic = votjokic + task.getResult().getDocuments().get(i).getLong("votjokic").intValue();
                                 vottatum =  vottatum + task.getResult().getDocuments().get(i).getLong("vottatum").intValue();


                            }
                                votoAnteto.setText(votAnteto + " votos");
                                votoDoncic.setText(votDoncic + " votos");
                                votojokic.setText(votjokic + " votos");
                                votobooker.setText(votbooker + " votos");
                                vototatum.setText(vottatum + " votos");
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });


    }
}