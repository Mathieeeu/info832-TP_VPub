package fr.usmb.vpub;

/**
 * <p>Boisson class.</p>
 *
 * @author doche
 */
public class Boisson {

    private String nom;
    private Boolean alcoolise;
    private Float degre;
    private Float volume; // volume de la bouteille, cennette, fut ...
    private Float prix;

    /**
     * <p>Constructor for Boisson.</p>
     *
     * @param nom a {@link java.lang.String} object
     */
    public Boisson(String nom){
        this.nom = nom;
        this.alcoolise = false;
    }

    /**
     * <p>Constructor for Boisson.</p>
     *
     * @param nom a {@link java.lang.String} object
     * @param degre a {@link java.lang.Float} object
     */
    public Boisson(String nom, Float degre){
        if (degre < 0F){
            throw new IllegalArgumentException("Le degre d'alcool ne peut pas etre negatif");
        }
        this.nom = nom;
        if (degre == 0F){
            this.alcoolise = false;
        }else{
            this.alcoolise = true;
            this.degre = degre;
        }
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
        String retour = this.nom;
        if(Boolean.TRUE.equals(this.alcoolise) && this.degre > 0F){
            return retour + " (l'abus d'alcool est dangereux pour la sante)";
        }else{
            return retour;
        }
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
     * <p>Setter for the field <code>nom</code>.</p>
     *
     * @param nom a {@link java.lang.String} object
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * <p>Getter for the field <code>prix</code>.</p>
     *
     * @return a {@link java.lang.Float} object
     */
    public Float getPrix() {
        return prix;
    }

    /**
     * <p>Setter for the field <code>prix</code>.</p>
     *
     * @param prix a {@link java.lang.Float} object
     */
    public void setPrix(Float prix) {
        this.prix = prix;
    }

    /**
     * <p>Getter for the field <code>volume</code>.</p>
     *
     * @return a {@link java.lang.Float} object
     */
    public Float getVolume() {
        return volume;
    }

    /**
     * <p>Setter for the field <code>volume</code>.</p>
     *
     * @param volume a {@link java.lang.Float} object
     */
    public void setVolume(Float volume) {
        this.volume = volume;
    }

    /**
     * <p>Getter for the field <code>degre</code>.</p>
     *
     * @return a {@link java.lang.Float} object
     */
    public Float getDegre() {
        return degre;
    }

    /**
     * <p>Setter for the field <code>degre</code>.</p>
     *
     * @param degre a {@link java.lang.Float} object
     */
    public void setDegre(Float degre) {
        this.degre = degre;
    }

    /**
     * <p>Getter for the field <code>alcoolise</code>.</p>
     *
     * @return a {@link java.lang.Boolean} object
     */
    public Boolean getAlcoolise() {
        return alcoolise;
    }

    /**
     * <p>Setter for the field <code>alcoolise</code>.</p>
     *
     * @param alcoolise a {@link java.lang.Boolean} object
     */
    public void setAlcoolise(Boolean alcoolise) {
        this.alcoolise = alcoolise;
    }
}
