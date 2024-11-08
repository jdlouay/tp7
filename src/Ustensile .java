abstract class Ustensile  {
      int annee;

    public Ustensile  (int annee) {
        this.annee = annee;
    }

    public  double calculerValeur(){


            int age = 2024 - annee;
            if (age < 50) {
                return 0;
            } else {
                return age - 50;
            }


}
}



