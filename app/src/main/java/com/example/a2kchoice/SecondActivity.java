package com.example.a2kchoice;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void toThirdActivity(View view){
        EditText user = findViewById(R.id.useredittext) ;
        EditText password = findViewById(R.id.passedittext) ;
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("Usuaris")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                List users = task.getResult().getDocuments();
                                for (int i=0;i<users.size();i++){
                                    String userDB = task.getResult().getDocuments().get(i).getString("user");
                                    String userEdit = user.getText().toString();
                                    if(userDB.equals(userEdit)){
                                        List pass = task.getResult().getDocuments();
                                        for (int x=0;x<pass.size();x++){
                                            String passDB = task.getResult().getDocuments().get(i).getString("pass");
                                            String passEdit = password.getText().toString();
                                            if(passDB.equals(passEdit)){
                                                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                                                startActivity(intent);
                                            }
                                        }
                                    }
                                }

                            }
                            } else {
                                Log.w(TAG, "Error getting documents.", task.getException());
                            }
                        }
                    });





    }

    public void registra(View view){
        String urlString = "https://nba.2k.com/es-ES";
        Uri webpage = Uri.parse(urlString);
        Intent registra = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(registra);
    }
}