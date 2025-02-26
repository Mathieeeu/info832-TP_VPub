package fr.usmb.vpub;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Cocktail class.</p>
 *
 * @author doche
 */
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
     *
     * @param nom a {@link java.lang.String} object
     */
    public Cocktail(String nom){
        this.nom = nom;
        this.ingredients = new ArrayList<>();
        this.alcoolise = false;
    }

    /**
     * add a new element into the Cocktail.
     *
     * @param ingredient a {@link java.lang.String} object
     * @param quantite a {@link java.lang.Double} object
     */
    public void add(String ingredient, Double quantite){
        this.ingredients.add(new Ingredient(ingredient, quantite));
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /**
     * <p>toString.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String toString(){
        StringBuilder retour = new StringBuilder(this.nom + " : ");
        for (Ingredient current : this.ingredients) {
            retour.append(current.getNom()).append(" ").append(current.getQuantite()).append("%").append("\t");
        }
        return retour.toString();
    }

    /**
     * <p>Getter for the field <code>nom</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getNom() {
        return nom;
    }
    /**
     * <p>Getter for the field <code>ingredients</code>.</p>
     *
     * @return a {@link java.util.List} object
     */
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    /**
     * <p>Getter for the field <code>alcoolise</code>.</p>
     *
     * @return a {@link java.lang.Boolean} object
     */
    public Boolean getAlcoolise() {
        return alcoolise;
    }
}

