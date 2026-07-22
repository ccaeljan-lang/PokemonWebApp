package ph.edu.dlsu.lbycpob.pokemonwebapp.model;

// Pokemon Factory
public class PokemonFactory {
    private static final AtomicInteger counter = new AtomicInteger(0);
    public static Pokemon createPokemon(String name, double weight, double height,
                                        double attack, double defense, double stamina, String type) {
        return new Pokemon(counter.incrementAndGet(), name, weight, height, attack, defense, stamina, type);
    }
    private static double parseWeight(String weightStr) {
        return Double.parseDouble(weightStr.replace("kg", ""));
    }
}