package ma.dev7hd.figure.figuresGeometriques;

import ma.dev7hd.observable.Observateur;

public interface Figure extends Observateur {
    double perimetre();
    double surface();
    void afficher();
}
