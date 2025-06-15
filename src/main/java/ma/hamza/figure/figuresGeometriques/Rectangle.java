package ma.dev7hd.figure.figuresGeometriques;

import ma.dev7hd.figure.Parametrage;

public class Rectangle implements Figure {
    private final Point coinSupGauche;
    private final double hauteur;
    private final double largeur;
    private int epaisseurContour, couleurContour, couleurRemplissage;

    public Rectangle(Point coin, double l, double h) {
        this.coinSupGauche = coin;
        this.largeur = l;
        this.hauteur = h;
    }

    @Override
    public double perimetre() {
        return (hauteur + largeur) * 2;
    }

    @Override
    public double surface() {
        return hauteur * largeur;
    }

    @Override
    public void afficher() {
        System.out.println("Rectangle : Coin = " + coinSupGauche + ", Largeur = " + largeur + ", Hauteur = " + hauteur);
    }

    @Override
    public void update(Parametrage p) {
        // Mettre à jour les attributs du rectangle en fonction du paramétrage
        this.epaisseurContour = p.getEpaisseurContour();
        this.couleurContour = p.getCouleurContour();
        this.couleurRemplissage = p.getCouleurRemplissage();
        System.out.println("Rectangle mis à jour avec le paramétrage : " + p);
    }
}
