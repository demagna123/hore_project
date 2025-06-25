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
            return this.nom + " dit qu'il est " + montre.afficherHeure();
        }
        return "";
    }

    public void demanderHeure(Personne p) {
        String reponse = p.donnerHeure();
        if (!reponse.isEmpty()) {
            System.out.println(this.nom + "chez moi il est   : " + reponse);
        } else {
            System.out.println(p.nom + " Désolé " + this.nom + " je  n'ai pas de montre.");
        }
    }
}
