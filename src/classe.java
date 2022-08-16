/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
public class classe {

    private int id;
    private int taille;
    private String nom;
    private String etage;

    public classe(int id, int taille, String nom, String etage) {
        this.id = id;
        this.taille = taille;
        this.nom = nom;
        this.etage = etage;
    }

    public classe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        return "classe{" + "id=" + id + ", taille=" + taille + ", nom=" + nom + ", etage=" + etage + '}';
    }



}