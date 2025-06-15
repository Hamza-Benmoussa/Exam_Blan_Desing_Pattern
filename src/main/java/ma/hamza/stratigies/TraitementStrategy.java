package ma.dev7hd.stratigies;

import ma.dev7hd.figure.Dessin;

/**
 * Interface définissant un contrat pour les algorithmes de traitement.
 */
public interface TraitementStrategy {
    /**
     * Traite un dessin.
     * @param dessin Le dessin à traiter.
     */
    void traiter(Dessin dessin);
}