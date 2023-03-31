import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Werknemer> werknemers = new ArrayList<Werknemer>();

        // Vraag om het aantal werknemers
        System.out.print("Hoeveel werknemers wil je toevoegen? ");
        int aantalWerknemers = scanner.nextInt();

        // Maak de werknemers aan
        for (int i = 1; i <= aantalWerknemers; i++) {
            System.out.println("Werknemer " + i);

            // Vraag om de persoonlijke gegevens
            System.out.print("Voornaam: ");
            String naam = scanner.next();
            System.out.print("Achternaam: ");
            String achternaam = scanner.next();
            System.out.print("Leeftijd: ");
            int leeftijd = scanner.nextInt();
            System.out.print("Adres: ");
            String adres = scanner.next();
            System.out.print("Telefoonnummer: ");
            String telefoonnummer = scanner.next();

            // Vraag om de werktijden
            System.out.print("Aantal gewerkte uren: ");
            int urenGewerkt = scanner.nextInt();

            // Vraag om het uurloon
            System.out.print("Uurloon: ");
            double uurloon = scanner.nextDouble();

            // Maak de werknemer aan en voeg deze 2toe aan de lijst
            werknemers.add(new Uurloon(naam, achternaam, leeftijd, adres, telefoonnummer, uurloon, urenGewerkt) {
            });
        }

        // Print de gegevens van de werknemers
        for (Werknemer werknemer : werknemers) {
            System.out.println("Naam: " + werknemer.getNaam());
            System.out.println("Acthernaam: " + werknemer.getAchterNaam());
            System.out.println("Leeftijd: " + werknemer.getLeeftijd());
            System.out.println("Adres: " + werknemer.getAdres());
            System.out.println("Telefoonnummer: " + werknemer.getNummer());

            if (werknemer instanceof Uurloon) {
                Uurloon uurloonWerknemer = (Uurloon) werknemer;
                System.out.println("Uren gewerkt: " + uurloonWerknemer.getGewerkteUren());
                System.out.println("Uurloon: " + uurloonWerknemer.getUurLoon());
            }

            System.out.println("Salaris: " + werknemer.BerekenSalaris());
            System.out.println();
        }
    }
}