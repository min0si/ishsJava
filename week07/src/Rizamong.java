public class Rizamong extends Pokemon {
    public Rizamong(int hp, int attackPower, Wings wings){
        super("리자몽", hp, attackPower, wings);  // 부모클래스의 생성자 호출
        System.out.println("자몽자몽!");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 2;
        System.out.println(getName() + " -> " + target.getName() + "에게 '불대문자' 사용! (데미지: " + damage + ")"); // name is private
        target.receiveDamage(damage); // target.setHp(target.getHp()-damage);
//        System.out.println(name + " -> " + target.getName() + "에게 '물대포' 사용");  // name is protected
        System.out.println(target.getName() + "의 남은 Hp: " + target.getHp());
    }
}
