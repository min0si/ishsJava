public class Balloon implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName()+"이(가) 풍선을 타고 둥실 날아다닙니다");
    }
}
