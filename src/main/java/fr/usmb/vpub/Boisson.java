package fr.usmb.vpub;

public class Boisson {

    private String nom;
    private Boolean alcoolise;
    private Float degre;
    private Float volume; // volume de la bouteille, cennette, fut ...
    private Float prix;

    /**
     * @param nom
     */
    public Boisson(String nom){
        this.nom = nom;
        this.alcoolise = false;
    }

    /**
     * @param nom
     * @param degre
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
    public String toString(){
        String retour = this.nom;
        if(Boolean.TRUE.equals(this.alcoolise) && this.degre > 0F){
            return retour + " (l'abus d'alcool est dangereux pour la sante)";
        }else{
            return retour;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getDegre() {
        return degre;
    }

    public void setDegre(Float degre) {
        this.degre = degre;
    }

    public Boolean getAlcoolise() {
        return alcoolise;
    }

    public void setAlcoolise(Boolean alcoolise) {
        this.alcoolise = alcoolise;
    }
}
