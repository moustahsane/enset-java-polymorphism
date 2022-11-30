package bizlayer;

public class DossierRevenus  extends Dossier {


    private double ca;


    public DossierRevenus (int id, double ca) {
        super(id);
        this.ca = ca;
    }

    @Override
    public String toString() {
        return "15% de revenus  " + ca+ ":" +  montant ;
    }

    @Override
    protected void calculerMontant() {

        this.montant =  (ca*0.15);
    }
}
