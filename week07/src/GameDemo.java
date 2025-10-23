public class GameDemo {
    public static void main(String[] args) {
        Jetpack jetpack = new Jetpack() ;

        Pikachu p1 = new Pikachu(100, 27, new Nofly());
        //p1.setFlyingTool(new Nofly());
        p1.performFlyable();
        p1.setFlyingTool(jetpack) ;  //젯팩 추진기 득템
        p1.performFlyable();


        //Pikachu p2 = new Pikachu(100, 28);
        //Squirtle s1 = new Squirtle(120, 21);
        Rizamong r1= new Rizamong(200,40, new Wings());
        //r1.setFlyingTool(new Wings());
        r1.performFlyable();

        System.out.println("배틀 시작!");
        System.out.println(p1);
        System.out.println(r1);
        System.out.println("==============");

        int turn = 1;
        while(!p1.isFainted() && !r1.isFainted()){
            System.out.println("턴 " + turn + "시작.");
            p1.attack(r1);
            if(r1.isFainted()){
                System.out.println(r1.getName() + "이(가) 기절했습니다! " + p1.getName() + " 승리!");
                break;
            }
            r1.attack(p1);
            if(p1.isFainted()){
                System.out.println(p1.getName() + "이(가) 기절했습니다! " + r1.getName() + " 승리!");
                break;
            }
            System.out.println("==============");
            turn++;
        }
        System.out.println("배틀 종료");
    }
}
