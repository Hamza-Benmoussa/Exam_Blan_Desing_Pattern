package ma.dev7hd;

import ma.dev7hd.figure.*;
import ma.dev7hd.figure.figuresGeometriques.Cercle;
import ma.dev7hd.figure.figuresGeometriques.Figure;
import ma.dev7hd.figure.figuresGeometriques.Point;
import ma.dev7hd.figure.figuresGeometriques.Rectangle;
import ma.dev7hd.stratigies.traitements.TraitementAffichage;
import ma.dev7hd.stratigies.traitements.TraitementPerimetreTotal;
import ma.dev7hd.stratigies.traitements.TraitementSurfaceTotale;


public class Main {

    public static void main(String[] args) {

        // Création du paramétrage observable
        Parametrage parametrage = new Parametrage();

        // Création des figures géométriques
        Cercle cercle1 = new Cercle(new Point(2, 3), 5);
        Rectangle rectangle1 = new Rectangle(new Point(5, 6), 10, 4);

        // Enregistrement des figures comme observateurs du paramétrage
        parametrage.addObserver(cercle1);
        parametrage.addObserver(rectangle1);

        // Création d'un groupe de figures (Composite pattern)
        Groupe groupe = new Groupe();
        groupe.ajouterFigure(cercle1);
        groupe.ajouterFigure(rectangle1);

        // Le groupe lui-même est observateur
        parametrage.addObserver(groupe);

        // Changer le parametrage - Vérifier la notification automatique observer
        System.out.println("\n======= MIS A JOUR LE PARAMETRAGE =======");
        parametrage.changerParametres(2, 0x000000, 0xFFFFFF); // épaisseur:2, contour:noir, remplissage:blanc

        // Création du dessin et ajout figures/groupe
        Dessin dessin = new Dessin();

        dessin.ajouterFigure(groupe);
        dessin.ajouterFigure(new Cercle(new Point(0, 0), 3));

        // Affichage toutes les figures du dessin
        System.out.println("\n======= AFFICHAGE DESSIN INITIAL =======");
        dessin.getFigures().forEach(Figure::afficher);

        // Sans appliquer un algorithme de traitement (Pattern Strategy)
        System.out.println("\n======= TRAITEMENT SANS STRATEGIE =======");
        dessin.traiter();

        // Appliquer un algorithme de traitement (Pattern Strategy)
        System.out.println("\n======= TRAITEMENT AVEC STRATEGIE AFFICHAGE =======");
        dessin.setStrategy(new TraitementAffichage());
        dessin.traiter();

        // Appliquer un algorithme de traitement (Pattern Strategy)
        System.out.println("\n======= TRAITEMENT AVEC STRATEGIE PERIMETRE TOTAL =======");
        dessin.setStrategy(new TraitementPerimetreTotal());
        dessin.traiter();

        // Appliquer un algorithme de traitement (Pattern Strategy)
        System.out.println("\n======= TRAITEMENT AVEC STRATEGIE SURFACE TOTALE =======");
        dessin.setStrategy(new TraitementSurfaceTotale());
        dessin.traiter();

        // Suppression d'une figure
        dessin.supprimerFigure(groupe);
        System.out.println("\n======= AFFICHAGE APRES SUPPRESSION DU GROUPE =======");
        dessin.getFigures().forEach(Figure::afficher);

    }
}