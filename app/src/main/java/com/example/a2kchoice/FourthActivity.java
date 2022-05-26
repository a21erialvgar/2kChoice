package com.example.a2kchoice;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        TextView nom = findViewById(R.id.nom);
        TextView nacionalidad = findViewById(R.id.nacionalidad);
        TextView estatura = findViewById(R.id.estatura);
        TextView valoracion = findViewById(R.id.valoracion);
        TextView ppg = findViewById(R.id.ppg);
        TextView apg = findViewById(R.id.apg);
        TextView rpg = findViewById(R.id.rpg);

        db.collection("Jugadors")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {


                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                String nomJugador = task.getResult().getDocuments().get(0).getString("Nombre");
                                String nacionalidadJugador = task.getResult().getDocuments().get(0).getString("Nacionalidad");
                                String estaturaJugador = task.getResult().getDocuments().get(0).getString("Estatura");
                                String valoracionJugador = task.getResult().getDocuments().get(0).getString("Valoracion");
                                String ppgJugador = task.getResult().getDocuments().get(0).getString("ppg");
                                String apgJugador = task.getResult().getDocuments().get(0).getString("apg");
                                String rpgJugador = task.getResult().getDocuments().get(0).getString("rpg");
                                nom.setText(nomJugador);
                                nacionalidad.setText("Nacionalidad: " + nacionalidadJugador);
                                estatura.setText("Estatura: " + estaturaJugador);
                                valoracion.setText("Valoració: " + valoracionJugador);
                                ppg.setText("PPG: " + ppgJugador);
                                apg.setText("APG: " + apgJugador);
                                rpg.setText("RPG: " + rpgJugador);
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }


    public void votaJugador(View view) {
        Intent intent = new Intent(FourthActivity.this, LastActivity
                .class);
        startActivity(intent);
    }
}