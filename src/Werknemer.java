public class Werknemer {
    private String naam;
    private String achternaam;
    private int leeftijd;
    private String adres;
    private String nummer;

    public Werknemer(String naam, String achternaam, int leeftijd, String adres, String nummer) {
        this.naam = naam;
        this.achternaam = achternaam;
        this.leeftijd = leeftijd;
        this.adres = adres;
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public String getAchterNaam() {
        return achternaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String getAdres() {
        return adres;
    }

    public String getNummer() {
        return nummer;
    }


    public double BerekenSalaris() {
        return 0;
    }
}