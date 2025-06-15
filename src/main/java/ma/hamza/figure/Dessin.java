package ma.dev7hd.figure;

import ma.dev7hd.figure.figuresGeometriques.Figure;
import ma.dev7hd.stratigies.TraitementStrategy;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private final List<Figure> figures = new ArrayList<>();
    private TraitementStrategy strategy;

    /**
     * Définit la stratégie de traitement.
     * @param strategy La stratégie à utiliser.
     */
    public void setStrategy(TraitementStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Applique la stratégie de traitement sur le dessin.
     */
    public void traiter() {
        if (strategy != null) {
            strategy.traiter(this);
        } else {
            System.out.println("Aucune stratégie de traitement définie.");
        }
    }

    /**
     * Ajoute une figure au dessin.
     * @param figure La figure à ajouter.
     */
    public void ajouterFigure(Figure figure) {
        figures.add(figure);
    }

    /**
     * Supprime une figure du dessin.
     * @param figure La figure à supprimer.
     */
    public void supprimerFigure(Figure figure) {
        figures.remove(figure);
    }

    /**
     * Retourne la liste des figures du dessin.
     * @return La liste des figures.
     */
    public List<Figure> getFigures() {
        return figures;
    }
}
