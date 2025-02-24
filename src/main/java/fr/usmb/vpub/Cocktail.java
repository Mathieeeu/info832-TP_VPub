package fr.usmb.vpub;

import java.util.ArrayList;
import java.util.List;

public class Cocktail {

    private class Ingredient{
        private String nom;
        private Double quantite;

        public Ingredient(String nom, Double quantite){
            this.nom = nom;
            this.quantite = quantite;
        }

        public String getNom() {
            return nom;
        }
        public Double getQuantite() {
            return quantite;
        }
    }

    private String nom;
    private ArrayList<Ingredient> ingredients;
    private Boolean alcoolise;

    /**
     * Creates a Cocktail with its name
     * @param nom 
     */
    public Cocktail(String nom){
        this.nom = nom;
        this.ingredients = new ArrayList<>();
        this.alcoolise = false;
    }

    /**
     * add a new element into the Cocktail.
     * @param ingredient
     * @param quantite
     */
    public void add(String ingredient, Double quantite){
        this.ingredients.add(new Ingredient(ingredient, quantite));
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        StringBuilder retour = new StringBuilder(this.nom + " : ");
        for (Ingredient current : this.ingredients) {
            retour.append(current.getNom()).append(" ").append(current.getQuantite()).append("%").append("\t");
        }
        return retour.toString();
    }

    public String getNom() {
        return nom;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public Boolean getAlcoolise() {
        return alcoolise;
    }
}

