package com.example.main;



import java.util.Date;

    public class Brani
    {
        private String Titolo;
        private int Tempo;
        private String Autore;
        private String Genere;


        public Brani(String Titolo, int Tempo, String Autore, String Genere){ //costruttore brano

            this.Titolo= Titolo;
            this.Tempo= Tempo;
            this.Autore= Autore;
            this.Genere= Genere;

        }

        public String getTitolo() {
            return Titolo;
        }

        public int getDurata() {
            return Tempo;
        }

        public String getAutore() {
            return Autore;
        }

        public String getGenere() {
            return Genere;
        }

        public void setTitolo(String titolo) {
            this.Titolo = titolo;
        }

        public void setDurata(int durata) {
            this.Tempo = durata;
        }

        public void setAutore(String autore) {
            this.Autore = autore;
        }

        public void setGenere(String genere) {
            this.Genere = genere;
        }


    }