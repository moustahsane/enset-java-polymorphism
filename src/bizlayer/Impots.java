package bizlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Impots {

    private int annee;
    private double totalImpots;

    private List<Dossier> dossiers= new ArrayList();

    public Impots(int annee) {
        this.annee= annee;
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Liste des impôts " +  annee +"\n");
        totalImpots = 0;
        dossiers.forEach(dossier -> {

                dossier.calculerMontant();
                totalImpots+=dossier.montant;
                stringBuffer.append(dossier.toString()+"\n");
        } );
        stringBuffer.append("Total : " +  totalImpots +"\n");
        return stringBuffer.toString();

    }

    public void  add(Dossier dossier){
        if(Objects.nonNull(dossier)){
            dossiers.add(dossier);
        }
    }

    public int getAnnee() {
        return annee;
    }
}
