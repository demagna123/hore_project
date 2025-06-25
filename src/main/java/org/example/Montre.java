package org.example;

public class Montre {
    private int heures;
    private int minutes;


    public Montre(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
    }
    public String afficherHeure() {
        return String.format("%02dh%02d", heures, minutes);
    }

    public void reglerHeure(int heure, int min) {
        this.heures = heure;
        this.minutes = min;
    }

    public Montre cloner() {
        return new Montre(this.heures, this.minutes);
    }

}
