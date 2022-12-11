package pokemon;

import javax.swing.JOptionPane;

public class Pokemonster {
    //포켓몬 이름
    private String name;
    //포켓몬 타입
    private String type;
    //포켓몬 공격력
    private int attack;
    //포켓몬 방어력
    private int defense;
    //포켓몬 체력
    private int hp;
    //포켓몬 레벨
    private int level;
    //포켓몬 스피드
    private int speed;
    //포켓몬 최대 체력
    private int maxHp;
    //포켓몬 공격
    public void attack(Pokemonster enemy) {
        //공격력 - 상대방 방어력
        int damage = this.attack - enemy.defense;
        //만약 방어력이 공격력보다 높다면
        if(damage <= 5) {
            //데미지는 1
            damage = 5;
        }
        //공격 메세지 출력
        System.out.println(this.name + "가 " + enemy.name + "를 공격했다.");
        //유리한 타입의 기술을 쓰면 효과가 굉장했다는 메세지 출력 그리고 데미지 2배
        if (this.type == "불" && enemy.type == "풀") {
            System.out.println("효과가 굉장했다!");
            enemy.hp = enemy.hp - (damage*2);
        } else if (this.type == "물" && enemy.type == "불") {
            System.out.println("효과가 굉장했다!");
            enemy.hp = enemy.hp - (damage*2);
        } else if (this.type == "풀" && enemy.type == "물") {
            System.out.println("효과가 굉장했다!");
            enemy.hp = enemy.hp - (damage*2);
        } else if (this.type == "전기" && enemy.type == "물") {
            System.out.println("효과가 굉장했다!");
            enemy.hp = enemy.hp - (damage*2);
        }
        //불리한 타입의 기술을 쓰면 효과가 별로였다는 메세지 출력 그리고 데미지 1/2배
        else if (this.type == "불" && enemy.type == "물") {
            System.out.println("효과가 별로인듯 하다....!");
            enemy.hp = enemy.hp - (damage / 2);
        } else if (this.type == "물" && enemy.type == "풀") {
            System.out.println("효과가 별로인듯 하다....");
            enemy.hp = enemy.hp - (damage / 2);
        } else if (this.type == "풀" && enemy.type == "불") {
            System.out.println("효과가 별로인듯 하다....");
            enemy.hp = enemy.hp - (damage / 2);
        } else if (this.type == "물" && enemy.type == "전기") {
            System.out.println("효과가 별로인듯 하다....");
            enemy.hp = enemy.hp - (damage / 2);
        }
        //그외에는 일반데미지가 들어감
        else {
            enemy.hp = enemy.hp - damage;
        }
        //상대방 체력이 0보다 작으면
        if (enemy.hp <= 0) {
            //상대방 체력을 0으로 설정
            enemy.hp = 0;
            //상대방이 쓰러졌다는 메세지 출력
            System.out.println(enemy.name + "가 쓰러졌다.");
        }
    }

    //울음소리 공격은 상대의 어택을 3줄인다
    public void attack2(Pokemonster enemy) {
        System.out.println(this.name + "는 울음소리를 사용했다.");
        if (enemy.attack <= 10) {
            enemy.attack = 10; //10까지 떨어지면 더이상 안떨어짐
            System.out.println(enemy.name + "의 공격력은 더이상 떨어지지 않는다.");
            JOptionPane.showMessageDialog(null, enemy.name + "의 공격력은 더이상 떨어지지 않는다.");
        }
        else{
            enemy.attack = enemy.attack - 3;
            System.out.println(enemy.name + "의 공격력이 3 줄었다.");
        }
    }

    //째려보기는 상대의 방어력을 3줄인다
    public void attack3(Pokemonster enemy) {
        System.out.println(this.name + "는 째려보기를 사용했다.");
        if (enemy.defense <= 10) {
            enemy.defense = 10; //10까지 떨어지면 더이상 안떨어짐
            System.out.println(enemy.name + "의 방어력은 더이상 떨어지지 않는다.");
            //더이상 떨어지지 않는다는 메세지창 띄우기
            JOptionPane.showMessageDialog(null, enemy.name + "의 방어력은 더이상 떨어지지 않는다.");
        }
        else{
            enemy.defense = enemy.defense - 3;
            System.out.println(enemy.name + "의 방어력이 3 줄었다.");
        }
    }

    //포켓몬 회복
    public void recover() {
        //체력이 자신의 최대 체력이면 회복할 수 없다는 메세지 출력
        if (this.hp == maxHp) {
            System.out.println("체력이 이미 최대치입니다.");
            JOptionPane.showMessageDialog(null, this.name + "의 체력은 이미 최대치이다.");
        }
        //체력이 100이 아니면
        else {
            if (this.hp + 10 > maxHp) {
                this.hp = maxHp;
            }
            //체력이 maxhp를 넘지 않으면 10씩 회복
            else {
                this.hp = this.hp + 10;
            }
            //체력 회복 메세지 출력
            System.out.println(this.name + "의 체력이 회복되었습니다.");
        }
    }

    //포켓몬 정보 출력
    public void printInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("타입: " + this.type);
        System.out.println("레벨: " + this.level);
        System.out.println("공격력: " + this.attack);
        System.out.println("방어력: " + this.defense);
        System.out.println("체력: " + this.hp);
        System.out.println("경험치: " + this.speed);
    }

 

    //포켓몬 생성자
    public void Pokemonster1(String name, String type, int attack, int defense, int hp, int level, int speed) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.level = level;
        this.speed = speed;
        maxHp=hp;
    }


    public void makepokemon(String name){
        if (name == "이상해씨") {
                    Pokemonster1("이상해씨", "풀", 15, 20, 110, 5, 15);
                }
                else if(name == "꼬부기"){
                    Pokemonster1("꼬부기", "물", 25, 15, 120, 5, 17);
                }
                else if(name == "파이리"){
                    Pokemonster1("파이리", "불", 30, 10, 80, 5, 20);
                }
                else if(name == "피카츄"){
                    Pokemonster1("피카츄", "전기", 20, 15, 100, 5, 30);
                }
                else if(name == "뮤츠"){
                    Pokemonster1("뮤츠", "에스퍼", 50, 30, 150, 70, 80);
                }
    }

    //포켓몬 이름 getter
    public String getName() {
        return name;
    }
    //포켓몬 이름 setter
    public void setName(String name) {
        this.name = name;
    }
    //포켓몬 타입 getter
    public String getType() {
        return type;
    }
    //포켓몬 타입 setter
    public void setType(String type) {
        this.type = type;
    }
    //포켓몬 공격력 getter

    public int getAttack() {
        return attack;
    }

    //포켓몬 공격력 setter
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //포켓몬 방어력 getter
    public int getDefense() {
        return defense;
    }

    //포켓몬 방어력 setter
    public void setDefense(int defense) {
        this.defense = defense;
    }

    //포켓몬 체력 getter
    public int getHp() {
        return hp;
    }

    //포켓몬 체력 setter
    public void setHp(int hp) {
        this.hp = hp;
    }

    //포켓몬 레벨 getter
    public int getLevel() {
        return level;
    }

    //포켓몬 레벨 setter
    public void setLevel(int level) {
        this.level = level;
    }

    //포켓몬 스피드 getter
    public int getSpeed() {
        return speed;
    }

    //포켓몬 스피드 setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxHp() {
        return maxHp;
    }
}
