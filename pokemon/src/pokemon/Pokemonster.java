package pokemon;

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
    //포켓몬 경험치
    private int exp;
    //포켓몬 공격
    public void attack(Pokemonster enemy) {
        //공격력 - 상대방 방어력
        int damage = this.attack - enemy.defense;
        //공격 메세지 출력
        System.out.println(this.name + "가 " + enemy.name + "를 공격했다.");
        //유리한 타입의 기술을 쓰면 효과가 굉장했다는 메세지 출력 그리고 데미지 2배
        if (this.type == "불" && enemy.type == "풀") {
            System.out.println("효과가 굉장했다!");
            enemy.hp = enemy.hp - damage*2;
        } else if (this.type == "물" && enemy.type == "불") {
            System.out.println("효과가 굉장했다!");
            enemy.hp = enemy.hp - damage*2;
        } else if (this.type == "풀" && enemy.type == "물") {
            System.out.println("효과가 굉장했다!");
            enemy.hp = enemy.hp - damage*2;
        }
        //불리한 타입의 기술을 쓰면 효과가 별로였다는 메세지 출력 그리고 데미지 1/2배
        else if (this.type == "불" && enemy.type == "물") {
            System.out.println("효과가 별로인듯 하다....!");
            enemy.hp = enemy.hp - damage / 2;
        } else if (this.type == "물" && enemy.type == "풀") {
            System.out.println("효과가 별로인듯 하다....");
            enemy.hp = enemy.hp - damage / 2;
        } else if (this.type == "풀" && enemy.type == "불") {
            System.out.println("효과가 별로인듯 하다....");
            enemy.hp = enemy.hp - damage / 2;
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
            //경험치 획득
            this.exp = this.exp + 100;
            //레벨업
            this.levelUp();
        }
    }

    //포켓몬 회복
    public void recover() {
        //체력이 자신의 최대 체력이면 회복할 수 없다는 메세지 출력
        if (this.hp == 100) {
            System.out.println("체력이 이미 최대치입니다.");
        }
        //체력이 100이 아니면
        else {
            //체력이 100이 넘으면 100으로 설정
            if (this.hp + 10 > 100) {
                this.hp = 100;
            }
            //체력이 100이 넘지 않으면 10씩 회복
            else {
                this.hp = this.hp + 10;
            }
            //체력 회복 메세지 출력
            System.out.println(this.name + "의 체력이 회복되었습니다.");
        }
    }

    //포켓몬 경험치 획득
    public void gainExp(int exp) {
        this.exp = this.exp + exp;
    }

    //포켓몬 레벨업
    public void levelUp() {
        //레벨업 조건
        if (this.exp >= 100) {
            //레벨업
            this.level = this.level + 1;
            //레벨업 후 경험치 초기화
            this.exp = 0;
            //레벨업 후 공격력 증가
            this.attack = this.attack + 10;
            //레벨업 후 방어력 증가
            this.defense = this.defense +
            10;
            //레벨업 후 체력 증가
            this.hp = this.hp + 10;
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
        System.out.println("경험치: " + this.exp);
    }
    //포켓몬 생성자
    public Pokemonster(String name, String type, int attack, int defense, int hp, int level, int exp) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.level = level;
        this.exp = exp;
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

    //포켓몬 경험치 getter
    public int getExp() {
        return exp;
    }

    //포켓몬 경험치 setter
    public void setExp(int exp) {
        this.exp = exp;
    }
}
