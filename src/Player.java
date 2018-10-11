//Project 0 Created by Tommy Kocar//

public class Player {
    protected String position;
    protected String name;
    protected float weight;
    protected int age;
    public Player (String position, String name, float weight, int age) {
        super();
        this.position = position;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Player(){
        this("","",0,0);
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
