public class Ustensile {
    protected int annee;
    public Ustensile(int annee) {
        this.annee = annee;
    }
    double calculeValeurTotatle(){
        int age = 2019 - annee;
        double resultat = 0;
        if(age<50){
            resultat=0;
        }
        else{
            resultat=age;
        }
        return resultat;
    }
}
