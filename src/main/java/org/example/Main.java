package org.example;

public class Main {
    public static void main(String[] args) {

        Montre m1 = new Montre(13, 45);
        Montre m2 = m1.cloner();

        Personne alice = new Personne("Alice");
        Personne bob = new Personne("Bob");

        alice.porterMontre(m1);

        bob.demanderHeure(alice); // Bob demande l'heure à Alice
        alice.demanderHeure(bob); // Alice demande l'heure à Bob (qui n’a pas de montre)
    }
}