public class Boss extends GameEntity {
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    Weapon weapon = new Weapon();

    public String printInfo() {
        return "Health: " + getHealth() + " Damage: " + getDamage() +
                " Weapon type: " + weapon.getWeaponType() + " Weapon name: " + weapon.getWeaponName();
    }

}
