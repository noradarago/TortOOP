public class Tort {
    private int szamlalo;
    private int nevezo;

    // konstruktorok de, 2 parameteres

    public Tort() {
    }

    public Tort(int szamlalo, int nevezo) {
        this.szamlalo = szamlalo;
        if (nevezo == 0){
            nevezo = 1;
            System.out.println(" A nevezo nem lehet 0, ezert 1 allitom");
        }
        this.nevezo = nevezo;
    }

    public void kiir(){
        System.out.println(szamlalo + " / " + nevezo + " = " + tortErtek());

    }
    public double tortErtek(){
        return szamlalo / (double)nevezo;

    }
    public Tort szoroz(Tort szorzo){
        int ujSzamlalo = this.szamlalo * szorzo.szamlalo;
        int ujNevezo = this.nevezo * szorzo.nevezo;
        Tort eredmeny = new Tort(ujSzamlalo,ujNevezo);
        return eredmeny;
    }
    public int getSzamlalo() {
        return szamlalo;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    public int getNevezo() {
        return nevezo;
    }

    public void setNevezo(int nevezo) {
        if (nevezo==0){
            System.out.println(" nem lehet nullára állítani a nevezőt!!");
        }else {
        this.nevezo = nevezo;
        }
    }
}
