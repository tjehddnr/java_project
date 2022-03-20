package lol;

import java.util.Random;
import java.util.Scanner;

public class Helper {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    private final String[] GAME_MODE = {"일반게임", "랭크게임", "우르프", "단일챔피언", "AI"};

    public int selectParty() {
        System.out.print("파티원의 수를 정해주세요 : ");
        int party = scan.nextInt();
        return party;
    }

    public int printGameMode() {
        System.out.println("게임을 선택해 주세요.");
        for(int i=0;i<5;i++){
            System.out.println(i+1 + ". " + GAME_MODE[i]);
        }
        int answer = scan.nextInt();
        return answer;
    }

    public void getGameMode(int gameMode) {
        System.out.println(GAME_MODE[gameMode-1]+"을 선택하셨습니다. "+GAME_MODE[gameMode-1]+"을 매칭 하겠습니다..............\n");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("게임이 매칭되었습니다.\n");
    }

    public void printTeam(){
        int Team = rand.nextInt(2);
        String[] team = {"블루", "레드"};
        System.out.println("팀 진형은 "+team[Team]+"입니다.\n");
    }

    public int[] getPosition() {
        int[] people = new int[5];
        for(int i=0; i<5; i++){
            people[i] = rand.nextInt(5);
            for(int j=0; j<i; j++){
                if(people[i] == people[j]){
                    i--;
                }
            }
        }
        return people;
    }

    public void printPosition(int[] getPosition, int party) {
        String[] position = {"탑", "정글", "미드", "원딜", "서폿"};
        System.out.println("페이커님의 포지션은 "+ position[getPosition[0]]);
        for(int i=1;i<5;i++) {
            int c=i-party+1;
            if(i<party) System.out.println("파티원" + i + "의 포지션은 " + position[getPosition[i]]);
            else if(i>=party) System.out.println("외부인" + c + "의 포지션은 " + position[getPosition[i]]);
        }
    }

    public void rematch(int party) {
        int a = rand.nextInt(10);
        if(a==1&&party!=5)
            try {

                System.out.println("......누군가 게임을 취소해 다시 매칭을 시작합니다......");
                Thread.sleep(4000); // 4초

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
    }
    public void playGame() {
        Character Yasuo = new Character();
        Yasuo.setName("야스오");
        Yasuo.setDamage(100);
        Character Talon = new Character();
        Talon.setName("탈론");
        Talon.setHp(1000);
        Weapon Doran_sword = new Weapon();
        Doran_sword.setName("도란검");
        Doran_sword.setDamage(5);
        Doran_sword.setCost(400);
        Weapon Doran_ring = new Weapon();
        Doran_ring.setName("도란링");
        Doran_ring.setDamage(1);
        Doran_ring.setCost(400);
        Weapon Doran_shield = new Weapon();
        Doran_shield.setName("도란방패");
        Doran_shield.setDamage(-10);
        Doran_shield.setCost(450);
        Weapon shoes = new Weapon();
        shoes.setName("신발");
        shoes.setDamage(0);
        shoes.setCost(300);
        System.out.println("\n페이커의 포지션은 미드이고 야스오를 선택했습니다.");
        System.out.println("페이커의 기본공격은 100입니다.");
        System.out.println("상대 캐릭터 탈론의 체력은 1000입니다.\n");
        System.out.println("도란검을 선택했습니다.\n");
        while(Talon.getHp()>0){
            int attack = scan.nextInt();
            if(attack==1){
                int total_damage = Yasuo.getDamage()+Doran_sword.getDamage();
                if(total_damage>=Talon.getHp()){
                    System.out.println("공격을 시작합니다. 적에게 준 피해량 " + total_damage + ", 탈론의 남은 체력 0. " + "탈론이 죽었습니다.\n");
                    System.out.println("승리");
                    break;
                }
                Talon.setHp(Talon.getHp()-(Yasuo.getDamage()+Doran_sword.getDamage()));
                System.out.println("공격을 시작합니다. 적에게 준 피해량 " + total_damage + ", 탈론의 남은 체력 " + Talon.getHp() + ".");
            }
        }
    }
}
