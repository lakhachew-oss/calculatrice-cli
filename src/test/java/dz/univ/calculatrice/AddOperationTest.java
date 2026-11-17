package dz.univ.calculatrice;

/** Addition de deux nombres réels. */
public class AddOperation implements Operation {
    @Override
    public double execute(final double first, final double second) {
        return first + second;
    }

    @Override
    public String symbol() {
        return "+";
    }
}