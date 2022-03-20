package lol;

public class Character {
    private String name;
    private int damage;
    private int hp;
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public int getHp(){
        return hp;
    }
    public void setName(String name) {this.name = name;}
    public void setDamage(int damage) {this.damage = damage;}
    public void setHp(int hp) {this.hp = hp;}
}
