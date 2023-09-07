package com.openclassrooms.api.model;

import javax.swing.text.StringContent;

public class Car {
    private int id;
    private String modele;
    private String marque;

    private String couleur;

    public Car (int id, String modele, String marque, String couleur){
        this.id = id;
        this.modele =modele;
        this.marque=marque;
        this.couleur=couleur;
    }
    public Car (){
        this.id = 1;
        this.modele = "trz";
        this.marque ="audi";
        this.couleur ="violine";
    }
    public int getId() {
        return id;
    }

    public String getModele() {
        return modele;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String toString() {
        return this.id + "\n" + "le model est : " + this.modele + "\n" + "La marque de la voiture est  : " + this.marque + "\n" + "La couleur de la voiture est :" + this.couleur ;
    }
}
