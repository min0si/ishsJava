public class Nofly implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName()+"은(는) 날 수 없습니다");
    }
}
