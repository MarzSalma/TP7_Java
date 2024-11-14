class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }
    double calculeSurface() {
        return 3.14 * rayon * rayon;
    }
}