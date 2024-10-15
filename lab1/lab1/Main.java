package lab1;

public class Main {
    public static void main(String[] args) {
        Archer ark = new Archer(1,"15151",2,5,true,10,3);
        ark.Hp = 10;
        ark.attack(ark);
        ark.receiveDamage(2.5f);
        System.out.println(ark.isAlive);
        System.out.println(ark.getHp());
        MobileHome mo = new MobileHome(3,"12",0,0,true);
        mo.move(2,5);
        System.out.println(mo.getX());
        ark.move(-11,5);
        System.out.println(ark.getY());
        Fort nox = new Fort(1,"1222",2,5,true,5);
        nox.attack(ark);
        System.out.println(ark.getHp());
        System.out.println(ark.isAlive());
    }
}