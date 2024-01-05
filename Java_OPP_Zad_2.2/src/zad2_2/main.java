package zad2_2;

public class main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("1984", "George Orwell");
        Ksiazka ksiazka2 = new Ksiazka("Władca Pierścieni", "J.R.R. Tolkien", 1954, "Allen & Unwin");
        Ksiazka ksiazka3 = new Ksiazka("Dune", "Frank Herbert", 1965, "Chilton Books", 412, "Science fiction");

        ksiazka1.setRokWydania(1949);
        ksiazka1.setWydawnictwo("Secker & Warburg");

        String tytulKsiazki = ksiazka3.getTytul();
        System.out.println("Tytuł książki: " + tytulKsiazki);
    }
    }

