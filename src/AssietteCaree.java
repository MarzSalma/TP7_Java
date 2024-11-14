class AssietteCarree extends Assiette{
    private double cote;

    public AssietteCarree(int annee,double cote){
        super(annee);
        this.cote=cote;
    }
    double calculeSurface(){
        return cote * cote;
    }
    double calculeValeurTotatle() {
        return super.calculeValeurTotatle() *5;
    }
}