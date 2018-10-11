//Project 0 Created by Tommy Kocar//

public class Defensive extends Player {
    protected int tackles;
    protected float sacks;
    protected int interceptions;

    public Defensive(String position, String name, float weight, int age, int tackles,float sacks, int interceptions){
        super(position,name,weight,age);
        this.tackles = tackles;
        this.sacks = sacks;
        this.interceptions = interceptions;
    }
    public Defensive(String position, String name, float weight, int age){
        super(position,name,weight,age);
    }
    public int getTackles(){
        return tackles;
    }
    public void setTackles(int tackles){
        this.tackles = tackles;
    }
    public float getSacks(){
        return sacks;
    }
    public void setSacks(float sacks){
        this.sacks = sacks;
    }
    public int getInterceptions(){
        return interceptions;
    }
    public void setInterceptions(int interceptions){
        this.interceptions = interceptions;
    }

    public String toString(){
        return position + " " + name + " "+ weight + " " + age + " " + tackles + " " + sacks + " " + interceptions;
    }
}
