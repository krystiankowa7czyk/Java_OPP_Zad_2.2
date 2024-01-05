package zad2_2;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int rokWydania;
    private String wydawnictwo;
    private int liczbaStron;
    private String gatunek;

    public Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

    public Ksiazka(String tytul, String autor, int rokWydania, String wydawnictwo) {
        this(tytul, autor);
        this.rokWydania = rokWydania;
        this.wydawnictwo = wydawnictwo;
    }

    public Ksiazka(String tytul, String autor, int rokWydania, String wydawnictwo, int liczbaStron, String gatunek) {
        this(tytul, autor, rokWydania, wydawnictwo);
        this.liczbaStron = liczbaStron;
        this.gatunek = gatunek;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }
}
