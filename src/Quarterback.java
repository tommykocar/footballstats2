//Project 0 Created by Tommy Kocar//

public class Quarterback extends Player{
    protected int passAttempts;
    protected int passYards;
    protected int passCompletions;
    protected int rushAttempt;
    protected int rushYard;
    protected int touchdowns;
    protected int interceptions;
    protected int fumbles;
    protected int sacks;

    public Quarterback(String position, String name, float weight, int age, int passAttempts, int passCompletions,
                       int passYards, int rushAttempts, int rushYards, int touchdowns, int interceptions, int fumbles, int sacks){
        super(position, name, weight, age);
        this.passAttempts = passAttempts;
        this.passCompletions = passCompletions;
        this.passYards = passYards;
        this.rushAttempt = rushAttempts;
        this.rushYard = rushYards;
        this.touchdowns = touchdowns;
        this.interceptions = interceptions;
        this.fumbles = fumbles;
        this.sacks = sacks;
    }
    public Quarterback(String position, String name, float weight, int age){
        super(position,name,weight,age);
    }
    public int getPassAttempts(){
        return passAttempts;
    }
    public void setPassAttempts(int passAttempts){
        this.passAttempts =passAttempts;
    }
    public int getPassYards(){
        return passYards;
    }
    public void setPassYards(int passYards){
        this.passYards = passYards;
    }
    public int getPassCompletions(){
        return passCompletions;
    }
    public void setPassCompletions(int passCompletions){
        this.passCompletions = passCompletions;
    }
    public int getRushAttempts(){
        return rushAttempt;
    }
    public void setRushAttempts(int rushAttempts){
        this.rushAttempt = rushAttempts;
    }
    public int getRushYards(){
        return rushYard;
    }
    public void setRushYards(int rushYards){
        this.rushYard = rushYards;
    }
    public  int getTouchdowns(){
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }
    public int getInterceptions(){
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }
    public int getFumbles(){
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }
    public int getSacks(){
        return sacks;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    public String toString() {
        return position + " " + name + " "+ weight + " " + age + " " + passAttempts + " " + passCompletions + " " + passYards + " " +
                rushAttempt + " " + rushYard + " "+ touchdowns + " " + interceptions + " " + fumbles + " " + sacks;
    }
}
