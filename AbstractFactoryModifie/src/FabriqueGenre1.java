public class FabriqueGenre1 implements IEtreVivantFactory {
    @Override
    public Personne creerPersonne() {
        return new Homme();
    }

    @Override
    public Animal creerAnimal() {
        return new Male();
    }
}