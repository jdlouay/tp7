public class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }


    public double calculerSurface() {
        return cote * cote;
    }


    public double calculerValeur() {



        return 5 * super.calculerValeur();
    }
}
