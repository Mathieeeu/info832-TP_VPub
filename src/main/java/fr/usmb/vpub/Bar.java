package fr.usmb.vpub;


import java.util.ArrayList;
import java.util.List;


/**
 * <p>Bar class.</p>
 *
 * @author doche
 */
public class Bar {
    private ArrayList<Boisson> boissonChaude;
    private ArrayList<Boisson> boissonFroide;
    private ArrayList<Boisson> boissonAlcoolisee;
    private ArrayList<Cocktail> cocktailSansAlcool;
    private ArrayList<Cocktail> cocktailAvecAlcool;

    /**
     * <p>Constructor for Bar.</p>
     */
    public Bar(){
        this.boissonChaude = new ArrayList<>();
        this.boissonFroide = new ArrayList<>();
        this.boissonAlcoolisee = new ArrayList<>();
        this.cocktailAvecAlcool = new ArrayList<>();
        this.cocktailSansAlcool = new ArrayList<>();
    }

    /**
     * Ajoute une boisson au bar
     *
     * @param boisson la boisson à ajouter
     */
    public void add(Boisson boisson){
        if(Boolean.TRUE.equals(boisson.getAlcoolise())){
            this.boissonAlcoolisee.add(boisson);
        }else{
            this.boissonFroide.add(boisson);
        }
    }

    /**
     * <p>add.</p>
     *
     * @param cocktail a {@link fr.usmb.vpub.Cocktail} object
     */
    public void add(Cocktail cocktail){
        if(Boolean.FALSE.equals(cocktail.getAlcoolise())){
            this.cocktailSansAlcool.add(cocktail);
        }else{
            this.cocktailAvecAlcool.add(cocktail);
        }
    }

    /**
     * <p>serv.</p>
     *
     * @param command a {@link java.lang.String} object
     * @return a {@link java.lang.Object} object
     */
    public Object serv(String command){

        for (Boisson b : this.boissonFroide) {
            if (b.getNom().equalsIgnoreCase(command)) {
                this.boissonFroide.remove(b);
                return b;
            }
        }

        for (Boisson b : this.boissonAlcoolisee) {
            if (b.getNom().equalsIgnoreCase(command)) {
                this.boissonAlcoolisee.remove(b);
                return b;
            }
        }

        for (Cocktail c : this.cocktailSansAlcool) {
            if (c.getNom().equalsIgnoreCase(command)) {
                this.cocktailSansAlcool.remove(c);
                return c;
            }
        }

        for (Cocktail c : this.cocktailAvecAlcool) {
            if (c.getNom().equalsIgnoreCase(command)) {
                this.cocktailAvecAlcool.remove(c);
                return c;
            }
        }

        for (Boisson b : this.boissonChaude) {
            if (b.getNom().equalsIgnoreCase(command)) {
                this.boissonChaude.remove(b);
                return b;
            }
        }

        return null;
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
        StringBuilder retour = new StringBuilder();
        String eol = System.lineSeparator();

        retour.append("Bar : ").append(eol);

        retour.append("\t Sans alcool").append(eol);
        for (Boisson b : this.boissonFroide) {
            retour.append("\t\t").append(b.toString()).append(eol);
        }

        retour.append("\t Avec alcool").append(eol);
        for (Boisson b : this.boissonAlcoolisee) {
            retour.append("\t\t").append(b.toString()).append(eol);
        }

        retour.append("\t Cocktail sans alcool").append(eol);
        for (Cocktail c : this.cocktailSansAlcool) {
            retour.append("\t\t").append(c.toString()).append(eol);
        }

        retour.append("\t Cocktail avec alcool").append(eol);
        for (Cocktail c : this.cocktailAvecAlcool) {
            retour.append("\t\t").append(c.toString()).append(eol);
        }

        retour.append("\t Boissons chaudes").append(eol);
        for (Boisson b : this.boissonChaude) {
            retour.append("\t\t").append(b.toString()).append(eol);
        }

        return retour.toString();
    }

    /**
     * <p>Getter for the field <code>boissonChaude</code>.</p>
     *
     * @return a {@link java.util.List} object
     */
    public List<Boisson> getBoissonChaude() {
        return boissonChaude;
    }
    /**
     * <p>Getter for the field <code>boissonFroide</code>.</p>
     *
     * @return a {@link java.util.List} object
     */
    public List<Boisson> getBoissonFroide() {
        return boissonFroide;
    }
    /**
     * <p>Getter for the field <code>boissonAlcoolisee</code>.</p>
     *
     * @return a {@link java.util.List} object
     */
    public List<Boisson> getBoissonAlcoolisee() {
        return boissonAlcoolisee;
    }
    /**
     * <p>Getter for the field <code>cocktailSansAlcool</code>.</p>
     *
     * @return a {@link java.util.List} object
     */
    public List<Cocktail> getCocktailSansAlcool() {
        return cocktailSansAlcool;
    }
    /**
     * <p>Getter for the field <code>cocktailAvecAlcool</code>.</p>
     *
     * @return a {@link java.util.List} object
     */
    public List<Cocktail> getCocktailAvecAlcool() {
        return cocktailAvecAlcool;
    }
}
