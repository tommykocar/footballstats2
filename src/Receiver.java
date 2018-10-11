//Project 0 Created by Tommy Kocar//

public class Receiver extends Player{

    protected int receptions;
    protected int reciptionYards;
    protected int rushAttempts;
    protected int rushYards;
    protected int touchdown;
    protected int fumble;

    public Receiver (String position, String name, float weight, int age, int receptions,int reciptionYards,int rushAttempts, int rushYards, int touchdown, int fumble){
        super(position,name,weight,age);
        this.receptions = receptions;
        this.reciptionYards = reciptionYards;
        this.rushAttempts = rushAttempts;
        this.rushYards = rushYards;
        this.touchdown = touchdown;
        this.fumble = fumble;
    }
    public Receiver(String position, String name, float weight, int age){
        super(position, name,weight, age);
    }
    public int getReceptions(){
        return receptions;
    }

    public void setReceptions(int receptions) {
        this.receptions = receptions;
    }

    public int getReciptionYards() {
        return reciptionYards;
    }

    public void setReciptionYards(int reciptionYards) {
        this.reciptionYards = reciptionYards;
    }

    public int getRushAttempts() {
        return rushAttempts;
    }

    public void setRushAttempts(int rushAttempts) {
        this.rushAttempts = rushAttempts;
    }

    public int getRushYards() {
        return rushYards;
    }

    public void setRushYards(int rushYards) {
        this.rushYards = rushYards;
    }
    public int getTouchdown(){
        return touchdown;
    }

    public void setTouchdown(int touchdown) {
        this.touchdown = touchdown;
    }

    public int getFumble() {
        return fumble;
    }

    public void setFumble(int fumble) {
        this.fumble = fumble;
    }

    public String toString(){
        return position + " " + name + " "+ weight + " " + age + " " + receptions + " " + reciptionYards + " " + rushAttempts + " " + rushYards+ " " + touchdown + " " + fumble;
    }
}
