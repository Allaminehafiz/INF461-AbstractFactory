public class ClientEtreVivant {

    public static void main(String[] args) {
        IEtreVivantFactory fabrique1 = new FabriqueGenre1();
        IEtreVivantFactory fabrique2 = new FabriqueGenre2();

        Personne personne = null;
        Animal animal = null;

        System.out.println("--- Utilisation de la Fabrique 1 (Homme / Mâle) ---");
        personne = fabrique1.creerPersonne();
        animal = fabrique1.creerAnimal();
        personne.decrirePersonne();
        animal.decrireAnimal();

        System.out.println("\n--- Utilisation de la Fabrique 2 (Femme / Femelle) ---");
        personne = fabrique2.creerPersonne();
        animal = fabrique2.creerAnimal();
        personne.decrirePersonne();
        animal.decrireAnimal();
    }
}