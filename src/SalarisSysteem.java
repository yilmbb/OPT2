public class SalarisSysteem extends Werknemer {
    private double salaris;

    public SalarisSysteem(String name, String lastname,  int age, String address, String phoneNumber, double salaris) {
        super(name, lastname,  age, address, phoneNumber);
        this.salaris = salaris;
    }


    @Override
    public double BerekenSalaris() {
        return salaris;
    }
}