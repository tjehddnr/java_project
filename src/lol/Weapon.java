package lol;

public class Weapon {
    private String name;
    private int damage;
    private int cost;
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public int getCost(){
        return cost;
    }
    public void setName(String name) {this.name = name;}
    public void setDamage(int damage) {this.damage = damage;}
    public void setCost(int cost) {this.cost = cost;}
}
