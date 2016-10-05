package laskin;

public class Laskin {

    private static double tulos;  // Muuttuja tulokselle

    public void nollaa() {     // Nollaa tuloksen
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;     // Bugi
    }

    public void kerro(int n) {
        tulos = n * tulos;
    }

    public void jaa(int n) {
        tulos = tulos / n;
    }

    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
        tulos = Math.sqrt(n);         // Bugi
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }

    
}
