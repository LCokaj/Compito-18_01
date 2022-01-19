package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnInserisci;
    EditText txtTitolo;
    EditText txtTempo;
    EditText txtAutore;
    Spinner spnGenere;
    GestioneBrani gb;
    String[] elencoGeneri= {"Rap", "Trap", "Hip pop"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitolo=(EditText) findViewById(R.id.Text);
        txtAutore=(EditText) findViewById(R.id.txtA);
        txtTempo=(EditText) findViewById(R.id.txtT);
        btnInserisci=(Button) findViewById(R.id.Insert);
        spnGenere=(Spinner) findViewById(R.id.spnGen);
        ArrayAdapter<String> spGen=
                new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,elencoGeneri);
        spnGenere.setAdapter(spGen);
        gb=new GestioneBrani();
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testo= spnGenere.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),testo,Toast.LENGTH_LONG).show();
                gb.addBrani(txtTitolo.getText().toString(), Integer.getInteger(txtTempo.getText().toString()),
                        txtAutore.getText().toString(),spnGenere.getSelectedItem().toString());
            }
        });





    }
}