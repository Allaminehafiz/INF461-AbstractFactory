public class FabriqueGenre2 implements IEtreVivantFactory {
    @Override
    public Personne creerPersonne() {
        return new Femme();
    }

    @Override
    public Animal creerAnimal() {
        return new Femelle();
    }
}