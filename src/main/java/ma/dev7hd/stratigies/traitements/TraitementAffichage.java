package ma.dev7hd.stratigies.traitements;

import ma.dev7hd.figure.Dessin;
import ma.dev7hd.figure.figuresGeometriques.Figure;
import ma.dev7hd.stratigies.TraitementStrategy;

/**
 * Algorithme de traitement : affiche toutes les figures du dessin.
 */
public class TraitementAffichage implements TraitementStrategy {
    @Override
    public void traiter(Dessin dessin) {
        System.out.println("=== Affichage des Figures ===");
        for (Figure figure : dessin.getFigures()) {
            figure.afficher(); // Affiche chaque figure
        }
        System.out.println("============================");
    }
}
