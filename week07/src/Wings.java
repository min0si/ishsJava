public class Wings implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName()+"이(가)훨훨 날아다닙니다");
    }
}
