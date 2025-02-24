package fr.usmb.vpub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class BoissonTest {
    private String nom="Coca";
    private Float degree= 12.0F;

    protected void setUp(){
        Boisson boisson = new Boisson(nom);
    }

    @Test
    public void CreationBoissonNonAlcoolise(){
        Boisson boisson = new Boisson(nom);
        assertEquals(nom,boisson.toString());
    }

    @Test
    public void CreationBoissonAlcoolise(){
        Boisson boisson = new Boisson(nom,degree);
        assertEquals(nom + " (l'abus d'alcool est dangereux pour la sante)",boisson.toString());
    }

    @Test
    public void CreationBoisson0Degrees(){
        Boisson boisson = new Boisson(nom,0.0F);
        assertEquals(nom, boisson.toString());
    }

    @Test
    public void CreationBoissonAntiAlcoolise(){
        assertThrows(IllegalArgumentException.class, () -> {
            Boisson boisson = new Boisson(nom,-1.0F);
        });
    }
}