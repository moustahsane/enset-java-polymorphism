package bizlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Societe {

    private long id;
    private String raison_sociale;
    private List<Impots> impotsList= new ArrayList();


    @Override
    public String toString() {
        return "Societe : " +
                "" + id +
                " -  " + raison_sociale;
    }


    public Impots getImpots(int annee){

        return impotsList.stream().filter(impots -> impots.getAnnee()==annee).collect(Collectors.toList()).get(0);
    }
    public void add(Impots impots)
    {
        if(Objects.nonNull(impots))
        {
            impotsList.add(impots);
        }


    }

    public Societe(long id, String raison_sociale) {
        this.id = id;
        this.raison_sociale = raison_sociale;
    }

    public void addImpots(Impots imp1) {

        add(imp1);
    }
}
