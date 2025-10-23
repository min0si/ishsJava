public class Jetpack implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName()+"이(가) 제트팩을 타고 슝 날아다닙니다");
    }
}
