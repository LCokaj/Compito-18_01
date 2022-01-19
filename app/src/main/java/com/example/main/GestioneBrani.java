package com.example.main;




import android.widget.ArrayAdapter;

import java.util.ArrayList;

    public class GestioneBrani
    {
            ArrayList<Brani> listabr;

            public GestioneBrani()
            {
                listabr=new ArrayList<Brani>();
            }



        public void addBrani(String Titolo, int Tempo, String Autore, String Genere) {

                Brani b=new Brani(Titolo,Tempo,Autore,Genere);
                listabr.add(b);

        }
    }

