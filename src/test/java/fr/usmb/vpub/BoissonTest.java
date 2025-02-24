package fr.usmb.vpub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class BoissonTest {
    private final String nom="Coca";

    @Test
    void CreationBoissonNonAlcoolise(){
        Boisson boisson = new Boisson(nom);
        assertEquals(nom,boisson.toString());
    }

    @Test
    void CreationBoissonAlcoolise(){
        Boisson boisson = new Boisson(nom, 12.0F);
        assertEquals(nom + " (l'abus d'alcool est dangereux pour la sante)",boisson.toString());
    }

    @Test
    void CreationBoisson0Degrees(){
        Boisson boisson = new Boisson(nom,0.0F);
        assertEquals(nom, boisson.toString());
    }

    @Test
    void CreationBoissonAntiAlcoolise(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Boisson(nom,-1.0F);
        });
    }
}