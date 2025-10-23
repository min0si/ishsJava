import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
//        int randomNumber =(int) (Math.random() * 3); //0~2
//        System.out.println(randomNumber);

        Pokemon playerPokemon = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("플레이어 포켓몬스터 선택\n 1) 피카츄 2) 꼬부기 3) 리자몽");
        int number = scanner.nextInt();
        if (number-1 ==0)
            playerPokemon = new Pikachu(100,27, new Nofly());
        else if(number-1 == 1)
            playerPokemon = new Squirtle(120,21,new Nofly());
        else if(number-2 == 2)
            playerPokemon = new Rizamong(200, 40, new Wings());


        int randomNumber =(int) (Math.random() * 3); //0~2
        Pokemon enemyPokemon;
        System.out.println("야생의 포켓몬스터가 나타났다!");
        if (randomNumber-1 ==0)
            enemyPokemon = new Pikachu(100,27, new Nofly());
        else if(randomNumber-1 == 1)
            enemyPokemon = new Squirtle(120,21,new Nofly());
        else if(randomNumber-2 == 2)
            enemyPokemon = new Rizamong(200, 40, new Wings());



//        Pokemon playerPokemon = new Pikachu(100,27, new Nofly());
//        Pokemon playerPokemon = new Rizamong(200, 40, new Wings());
//        Pokemon playerPokemon = new Squirtle(120, 21, new Nofly());

//        Jetpack jetpack = new Jetpack() ;
//
//        Pikachu p1 = new Pikachu(100, 27, new Nofly());
//        //p1.setFlyingTool(new Nofly());
//        p1.performFlyable();
//        p1.setFlyingTool(jetpack) ;  //젯팩 추진기 득템
//        p1.performFlyable();
//
//
//        //Pikachu p2 = new Pikachu(100, 28);
//        //Squirtle s1 = new Squirtle(120, 21);
//        Rizamong r1= new Rizamong(200,40, new Wings());
//        //r1.setFlyingTool(new Wings());
//        r1.performFlyable();
//
//        System.out.println("배틀 시작!");
//        System.out.println(p1);
//        System.out.println(r1);
//        System.out.println("==============");
//
//        int turn = 1;
//        while(!p1.isFainted() && !r1.isFainted()){
//            System.out.println("턴 " + turn + "시작.");
//            p1.attack(r1);
//            if(r1.isFainted()){
//                System.out.println(r1.getName() + "이(가) 기절했습니다! " + p1.getName() + " 승리!");
//                break;
//            }
//            r1.attack(p1);
//            if(p1.isFainted()){
//                System.out.println(p1.getName() + "이(가) 기절했습니다! " + r1.getName() + " 승리!");
//                break;
//            }
//            System.out.println("==============");
//            turn++;
//        }
//        System.out.println("종료");
    }
}
