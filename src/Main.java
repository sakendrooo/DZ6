public class Main {
    public static void main(String[] args ){
        Boss boss = new Boss();
        boss.setDamage(70);
        boss.setHealths(100);
        boss.weapon.setWeaponName("clinok");
        boss.weapon.setWeapon(WeyponType.HOT_WEAPON);
        System.out.println(boss.getDamage()+ boss.getHealths()+boss.weapon.getWeaponName()+boss.weapon.getWeapon());


    }
}
