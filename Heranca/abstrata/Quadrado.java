public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
            super.largura = lado;
            super.altura = lado;
        } else {
            throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
    }

    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }
}