public class Main {
    public static void main(String[] args) {
        Tort t = new Tort(3,4);
        Tort t2 = new Tort(2,5);

        Tort sz = t.szoroz(t2);
        sz.kiir();

        t.setNevezo(5);
        t.kiir();
    }
}