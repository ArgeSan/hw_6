public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(50);
        boss.weapon.setWeaponType(WeaponType.AVTOMAT);
        boss.weapon.setWeaponName("PISTOLET");
        System.out.println("Boss health " + boss.getHealth() + "\nBoss damage " + boss.getDamage()
                + "\nBoss weapon type " + boss.weapon.getWeaponType() + "\nBoss weapon name " + boss.weapon.getWeaponName());

        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(48);
        skeleton.setHealth(200);
        skeleton.setKolichestva(15);
        skeleton.weapon.setWeaponType(WeaponType.NOJ);
        skeleton.weapon.setWeaponName("ghnym");
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setDamage(55);
        skeleton1.setHealth(450);
        skeleton1.setKolichestva(18);
        skeleton1.weapon.setWeaponType(WeaponType.NOJ);
        skeleton1.weapon.setWeaponName("ghnym");
        System.out.println(skeleton1.printInfo());
    }
}