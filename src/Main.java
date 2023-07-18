public class Main {

    // Garbage Collector (gc) räumt auf
    private static Artikel eineMethode() {
        int lokaleVariable = 7;
        Artikel b2 = new Artikel(2, "Stift");
        System.out.println(b2.getBezeichnung());
        return b2;
    }

    public static void main(String[] args) {
        Artikel a1 = new Artikel(1, "Buch");
        Artikel a2 = eineMethode();
        // b2 ist Geschichte, gibt nicht mehr, bzw. kein Zugriff mehr
        // a2 ist der neue Name des Objekts, dass früher b2 hieß

        System.out.println(a1.getBezeichnung());
    }
}
