public class Cuillere  extends Ustensile {
    private double longueur;

    public Cuillere(int annee, double longueur) {
        super(annee);
        this.longueur = longueur;
    }


    public double calculerValeur() {
        int age = 2024 - annee;
        if (age < 50) {
            return 0;
        } else {
            return age - 50;
        }
    }
}

