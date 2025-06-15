package ma.dev7hd.figure.figuresGeometriques;

import ma.dev7hd.figure.Parametrage;

public class Cercle implements Figure {
    private final Point centre;
    private final double rayon;
    private int epaisseurContour, couleurContour, couleurRemplissage;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void afficher() {
        System.out.println("Cercle : Centre = " + centre + ", Rayon = " + rayon);
    }

    @Override
    public void update(Parametrage p) {
        // Mettre à jour les attributs du cercle en fonction du paramétrage
        this.epaisseurContour = p.getEpaisseurContour();
        this.couleurContour = p.getCouleurContour();
        this.couleurRemplissage = p.getCouleurRemplissage();
        System.out.println("Cercle mis à jour avec le paramétrage : " + p);
    }
}