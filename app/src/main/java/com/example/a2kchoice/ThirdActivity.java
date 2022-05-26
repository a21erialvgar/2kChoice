package com.example.a2kchoice;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }


    public void mostraDevin(View view) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
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
                                List jugador = task.getResult().getDocuments();
                                for (int i = 0; i < jugador.size(); i++) {
                                    String jugadorDB = task.getResult().getDocuments().get(i).getString("Nombre");
                                    if (jugadorDB.startsWith("DEVIN")) {
                                        String nomJugador = task.getResult().getDocuments().get(i).getString("Nombre");
                                        String nacionalidadJugador = task.getResult().getDocuments().get(i).getString("Nacionalidad");
                                        String estaturaJugador = task.getResult().getDocuments().get(i).getString("Estatura");
                                        String valoracionJugador = task.getResult().getDocuments().get(i).getString("Valoracion");
                                        String ppgJugador = task.getResult().getDocuments().get(i).getString("ppg");
                                        String apgJugador = task.getResult().getDocuments().get(i).getString("apg");
                                        String rpgJugador = task.getResult().getDocuments().get(i).getString("rpg");
                                        nom.setText(nomJugador);
                                        nacionalidad.setText("Nacionalidad: " + nacionalidadJugador);
                                        estatura.setText("Estatura: " + estaturaJugador);
                                        valoracion.setText("Valoración: " + valoracionJugador);
                                        ppg.setText("PPG: " + ppgJugador);
                                        apg.setText("APG: " + apgJugador);
                                        rpg.setText("RPG: " + rpgJugador);
                                    }

                                }
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }

    public void mostraGiannis(View view) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
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
                                List jugador = task.getResult().getDocuments();
                                for (int i = 0; i < jugador.size(); i++) {
                                    String jugadorDB = task.getResult().getDocuments().get(i).getString("Nombre");
                                    if (jugadorDB.startsWith("GIANNIS")) {
                                        String nomJugador = task.getResult().getDocuments().get(i).getString("Nombre");
                                        String nacionalidadJugador = task.getResult().getDocuments().get(i).getString("Nacionalidad");
                                        String estaturaJugador = task.getResult().getDocuments().get(i).getString("Estatura");
                                        String valoracionJugador = task.getResult().getDocuments().get(i).getString("Valoracion");
                                        String ppgJugador = task.getResult().getDocuments().get(i).getString("ppg");
                                        String apgJugador = task.getResult().getDocuments().get(i).getString("apg");
                                        String rpgJugador = task.getResult().getDocuments().get(i).getString("rpg");
                                        nom.setText(nomJugador);
                                        nacionalidad.setText("Nacionalidad: " + nacionalidadJugador);
                                        estatura.setText("Estatura: " + estaturaJugador);
                                        valoracion.setText("Valoración: " + valoracionJugador);
                                        ppg.setText("PPG: " + ppgJugador);
                                        apg.setText("APG: " + apgJugador);
                                        rpg.setText("RPG: " + rpgJugador);
                                    }

                                }
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }

    public void mostraTatum(View view) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
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
                                List jugador = task.getResult().getDocuments();
                                for (int i = 0; i < jugador.size(); i++) {
                                    String jugadorDB = task.getResult().getDocuments().get(i).getString("Nombre");
                                    if (jugadorDB.startsWith("JAYSON")) {
                                        String nomJugador = task.getResult().getDocuments().get(i).getString("Nombre");
                                        String nacionalidadJugador = task.getResult().getDocuments().get(i).getString("Nacionalidad");
                                        String estaturaJugador = task.getResult().getDocuments().get(i).getString("Estatura");
                                        String valoracionJugador = task.getResult().getDocuments().get(i).getString("Valoracion");
                                        String ppgJugador = task.getResult().getDocuments().get(i).getString("ppg");
                                        String apgJugador = task.getResult().getDocuments().get(i).getString("apg");
                                        String rpgJugador = task.getResult().getDocuments().get(i).getString("rpg");
                                        nom.setText(nomJugador);
                                        nacionalidad.setText("Nacionalidad: " + nacionalidadJugador);
                                        estatura.setText("Estatura: " + estaturaJugador);
                                        valoracion.setText("Valoración: " + valoracionJugador);
                                        ppg.setText("PPG: " + ppgJugador);
                                        apg.setText("APG: " + apgJugador);
                                        rpg.setText("RPG: " + rpgJugador);
                                    }

                                }
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }

    public void mostraLuka(View view) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
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
                                List jugador = task.getResult().getDocuments();
                                for (int i = 0; i < jugador.size(); i++) {
                                    String jugadorDB = task.getResult().getDocuments().get(i).getString("Nombre");
                                    if (jugadorDB.startsWith("LUKA")) {
                                        String nomJugador = task.getResult().getDocuments().get(i).getString("Nombre");
                                        String nacionalidadJugador = task.getResult().getDocuments().get(i).getString("Nacionalidad");
                                        String estaturaJugador = task.getResult().getDocuments().get(i).getString("Estatura");
                                        String valoracionJugador = task.getResult().getDocuments().get(i).getString("Valoracion");
                                        String ppgJugador = task.getResult().getDocuments().get(i).getString("ppg");
                                        String apgJugador = task.getResult().getDocuments().get(i).getString("apg");
                                        String rpgJugador = task.getResult().getDocuments().get(i).getString("rpg");
                                        nom.setText(nomJugador);
                                        nacionalidad.setText("Nacionalidad: " + nacionalidadJugador);
                                        estatura.setText("Estatura: " + estaturaJugador);
                                        valoracion.setText("Valoración: " + valoracionJugador);
                                        ppg.setText("PPG: " + ppgJugador);
                                        apg.setText("APG: " + apgJugador);
                                        rpg.setText("RPG: " + rpgJugador);
                                    }

                                }
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }

    public void mostraJokic(View view) {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
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
                                List jugador = task.getResult().getDocuments();
                                for (int i = 0; i < jugador.size(); i++) {
                                    String jugadorDB = task.getResult().getDocuments().get(i).getString("Nombre");
                                    if (jugadorDB.startsWith("NIKOLA")) {
                                        String nomJugador = task.getResult().getDocuments().get(i).getString("Nombre");
                                        String nacionalidadJugador = task.getResult().getDocuments().get(i).getString("Nacionalidad");
                                        String estaturaJugador = task.getResult().getDocuments().get(i).getString("Estatura");
                                        String valoracionJugador = task.getResult().getDocuments().get(i).getString("Valoracion");
                                        String ppgJugador = task.getResult().getDocuments().get(i).getString("ppg");
                                        String apgJugador = task.getResult().getDocuments().get(i).getString("apg");
                                        String rpgJugador = task.getResult().getDocuments().get(i).getString("rpg");
                                        nom.setText(nomJugador);
                                        nacionalidad.setText("Nacionalidad: " + nacionalidadJugador);
                                        estatura.setText("Estatura: " + estaturaJugador);
                                        valoracion.setText("Valoración: " + valoracionJugador);
                                        ppg.setText("PPG: " + ppgJugador);
                                        apg.setText("APG: " + apgJugador);
                                        rpg.setText("RPG: " + rpgJugador);
                                    }

                                }
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }

    public void votaJugador(View view) {
        TextView nom = findViewById(R.id.nom);
        String nomJugador = nom.getText().toString();

        FirebaseFirestore votacio = FirebaseFirestore.getInstance();
        votacio.collection("VotsJugadors")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {


                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                int votAnteto = task.getResult().getDocuments().get(0).getLong("votanteto").intValue();
                                int votDoncic = task.getResult().getDocuments().get(0).getLong("votdoncic").intValue();
                                int votbooker = task.getResult().getDocuments().get(0).getLong("votbooker").intValue();
                                int votjokic = task.getResult().getDocuments().get(0).getLong("votjokic").intValue();
                                int vottatum = task.getResult().getDocuments().get(0).getLong("vottatum").intValue();
                                if (nomJugador.startsWith("LUKA")) {
                                    int votacioDoncic = ++votDoncic;
                                    HashMap<String, Object> vot = new HashMap<>();
                                    vot.put("votdoncic", votacioDoncic);
                                    vot.put("votbooker", votbooker);
                                    vot.put("votanteto", votAnteto);
                                    vot.put("vottatum", vottatum);
                                    vot.put("votjokic", votjokic);

                                    votacio.collection("VotsJugadors")
                                            .add(vot)
                                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                @Override
                                                public void onSuccess(DocumentReference documentReference) {
                                                    Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                                }
                                            })
                                            .addOnFailureListener(new OnFailureListener() {
                                                @Override
                                                public void onFailure(@NonNull Exception e) {
                                                    Log.w(TAG, "Error adding document", e);
                                                }
                                            });
                                } else if (nomJugador.startsWith("DEVIN")) {
                                    int votacioDevin = ++votbooker;
                                    HashMap<String, Object> vot = new HashMap<>();
                                    vot.put("votdoncic", votDoncic);
                                    vot.put("votbooker", votacioDevin);
                                    vot.put("votanteto", votAnteto);
                                    vot.put("vottatum", vottatum);
                                    vot.put("votjokic", votjokic);

                                    votacio.collection("VotsJugadors")
                                            .add(vot)
                                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                @Override
                                                public void onSuccess(DocumentReference documentReference) {
                                                    Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                                }
                                            })
                                            .addOnFailureListener(new OnFailureListener() {
                                                @Override
                                                public void onFailure(@NonNull Exception e) {
                                                    Log.w(TAG, "Error adding document", e);
                                                }
                                            });
                                } else if (nomJugador.startsWith("JAYSON")) {
                                    int votacioJayson = ++vottatum;
                                    HashMap<String, Object> vot = new HashMap<>();
                                    vot.put("votdoncic", votDoncic);
                                    vot.put("votbooker", votbooker);
                                    vot.put("votanteto", votAnteto);
                                    vot.put("vottatum", votacioJayson);
                                    vot.put("votjokic", votjokic);

                                    votacio.collection("VotsJugadors")
                                            .add(vot)
                                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                @Override
                                                public void onSuccess(DocumentReference documentReference) {
                                                    Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                                }
                                            })
                                            .addOnFailureListener(new OnFailureListener() {
                                                @Override
                                                public void onFailure(@NonNull Exception e) {
                                                    Log.w(TAG, "Error adding document", e);
                                                }
                                            });
                                } else if (nomJugador.startsWith("GIANNIS")) {
                                    int votacioAnteto = ++votAnteto;
                                    HashMap<String, Object> vot = new HashMap<>();
                                    vot.put("votdoncic", votDoncic);
                                    vot.put("votbooker", votbooker);
                                    vot.put("votanteto", votacioAnteto);
                                    vot.put("vottatum", vottatum);
                                    vot.put("votjokic", votjokic);

                                    votacio.collection("VotsJugadors")
                                            .add(vot)
                                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                @Override
                                                public void onSuccess(DocumentReference documentReference) {
                                                    Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                                }
                                            })
                                            .addOnFailureListener(new OnFailureListener() {
                                                @Override
                                                public void onFailure(@NonNull Exception e) {
                                                    Log.w(TAG, "Error adding document", e);
                                                }
                                            });
                                } else if (nomJugador.startsWith("NIKOLA")) {
                                    int votacioJokic = ++votjokic;
                                    HashMap<String, Object> vot = new HashMap<>();
                                    vot.put("votdoncic", votDoncic);
                                    vot.put("votbooker", votbooker);
                                    vot.put("votanteto", votAnteto);
                                    vot.put("vottatum", vottatum);
                                    vot.put("votjokic", votacioJokic);

                                    votacio.collection("VotsJugadors")
                                            .add(vot)
                                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                @Override
                                                public void onSuccess(DocumentReference documentReference) {
                                                    Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                                }
                                            })
                                            .addOnFailureListener(new OnFailureListener() {
                                                @Override
                                                public void onFailure(@NonNull Exception e) {
                                                    Log.w(TAG, "Error adding document", e);
                                                }
                                            });

                                }
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        Intent intent = new Intent(ThirdActivity.this, LastActivity
                .class);
        startActivity(intent);
    }


}