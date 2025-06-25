package org.example;

public class Personne  {
    private String nom;
    private Montre montre;

    public Personne(String nom) {
        this.nom = nom;
        this.montre = null;
    }


    public boolean porterMontre(Montre m) {
        if (this.montre == null) {
            this.montre = m;
            return true;
        }
        return false;
    }

    public void enleverMontre() {
        this.montre = null;
    }


    public String donnerHeure() {
        if (this.montre != null) {
            return  montre.afficherHeure();
        }
        return "";
    }

    public void demanderHeure(Personne p) {
        String heureD = p.donnerHeure();
        if (!heureD.isEmpty()) {
            System.out.println(this.nom + " chez moi il est   : " + heureD);
        } else {
            System.out.println(p.nom + " Désolé " + this.nom + " je  n'ai pas de montre.");
        }
    }
}
