package fr.usmb.vpub;

import java.util.ArrayList;
import java.util.List;

public class Cave {
    private ArrayList<Boisson> rayons;

    /**
     *
     */
    public Cave(){
        this.rayons = new ArrayList<Boisson>();
    }

    /**
     * Adds a new Boisson to the cave.
     * @param b the Boisson to add
     */
    public void add(Boisson b){
        this.rayons.add(b);
    }

    /**
     * @param nom
     * @return
     */
    public Boisson take(String nom) {
    Boisson retour = this.rayons.stream()
        .filter(b -> b.getNom().equalsIgnoreCase(nom))
        .findFirst()
        .orElse(null);

    if (retour != null) {
        this.rayons.remove(retour);
    }
    
    return retour;
}


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        StringBuilder retour = new StringBuilder();
        String eol = System.lineSeparator();
        retour.append("Cave : ").append(eol);
        for (Boisson b : this.rayons) {
            retour.append("\t").append(b.toString()).append(eol);
        }
        return retour.toString();
    }

    public List<Boisson> getRayons() {
        return rayons;
    }
}
