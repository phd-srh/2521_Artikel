public class Artikel {
    // 1. Attribute (Styling Guide - nicht verpflichtend, aber empfohlen)
    private String bezeichnung;
    private int artikelnummer;

    // 2. Konstruktor(en)
    public Artikel(int artikelnummer, String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.artikelnummer = artikelnummer;
    }

    protected void finalize() {
        System.out.println("Der Artikel existiert nun nicht mehr");
    }

    // 3. Getter/Setter
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    // 4. alle anderen Methoden
    public void auszeichnen() {
        // keine Ahnung was man hier macht
    }

    public void verkaufen() {
        // ebenso keine Ahnung (s.o.)
    }

}
