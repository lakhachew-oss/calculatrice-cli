package dz.univ.calculatrice;

/** Contrat commun des opérations de la calculatrice. */
public interface Operation {
    double execute(double first, double second);

    String symbol();
} 