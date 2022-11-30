package bizlayer;

public abstract class Dossier {


    private int id;
    protected double montant;
    public Dossier(int id) {
        this.id = id;
    }

    protected abstract void calculerMontant();
}
