package ma.dev7hd.figure;

import ma.dev7hd.observable.Observateur;

import java.util.ArrayList;
import java.util.List;

public class Parametrage {
    private static Parametrage instance;
    private final List<Observateur> observers = new ArrayList<>();

    private int epaisseurContour;
    private int couleurContour;
    private int couleurRemplissage;

    @Override
    public String toString() {
        return "epaisseurContour=" + epaisseurContour +
                ", couleurContour=" + couleurContour +
                ", couleurRemplissage=" + couleurRemplissage ;
    }

    public Parametrage() {}

    public static Parametrage getInstance() {
        if (instance == null) {
            instance = new Parametrage();
        }
        return instance;
    }

    public void addObserver(Observateur o) {
        observers.add(o);
    }

    public void notifyObservers() {
        for (Observateur o : observers) {
            o.update(this);
        }
    }

    public void changerParametres(int epaisseur, int couleurContour, int couleurRemplissage){
        this.epaisseurContour = epaisseur;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
        notifyObservers();
    }

    public int getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        notifyObservers();
    }

    public int getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
        notifyObservers();
    }

    public int getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setEpaisseurContour(int epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
        notifyObservers();
    }
}
