package bizlayer;

public class DossierVehicule extends  Dossier{
    private int nbChv;
    private char categorie;

    public DossierVehicule(int id, int nbChv, char categorie) {
        super(id);
        this.nbChv = nbChv;
        this.categorie = categorie;
    }


    @Override
    protected void calculerMontant() {
     this.montant = 0;
     if(nbChv>=15)
     {
         this.montant = categorie=='E' ? 8000 : 20000;
     } else if (nbChv >=11) {
         this.montant = categorie=='E' ? 3000 : 6000;
         
     } else if (nbChv >=8) {
             this.montant = categorie=='E' ? 650 : 1500;

     }else{
         this.montant = categorie=='E' ? 350 : 700;
     }
    }

    @Override
    public String toString() {
        return "Vehicule "+categorie+" " + nbChv+ " CH, montant:" +  this.montant;
    }
}
