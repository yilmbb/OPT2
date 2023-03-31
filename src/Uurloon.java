public class Uurloon extends Werknemer {
    private double uurloon;
    private int gewerkteUren;

    public Uurloon(String naam, String achternaam, int leeftijd, String adres, String nummer, double uurloon, int gewerkteUren) {
        super(naam, achternaam, leeftijd, adres, nummer);
        this.uurloon = uurloon;
        this.gewerkteUren = gewerkteUren;
    }

    public double getUurLoon() {
        return uurloon;
    }


    public int getGewerkteUren() {
        return gewerkteUren;
    }


    @Override
    public double BerekenSalaris() {
        return uurloon * gewerkteUren;
    }
}