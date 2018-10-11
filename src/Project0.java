//Project 0 Created by Tommy Kocar//



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Project0 {
    public static void main(String [] args){
        try{
            BufferedReader Players = new BufferedReader(new FileReader("playerinfo.txt.url" ));
            String position,name;
            float sacksf, weight;
            int tackles, age,receptions, receptionYards, passingAttempts, passingCompletions, passingYards, rushingAttempts, rushingYards, touchdowns, interceptions, fumbles, sacks;
            ArrayList<Player>people= new ArrayList<>();
            while(true){
                position = Players.readLine();
                if(position == null){
                    for(int i=0;i<10; i++ ) {
                        System.out.println(people.get(i));
                    }
                    break;
                }
                else if (position.equalsIgnoreCase("Quarterback")){
                    name= Players.readLine();
                   weight = new Float(Players.readLine());
                   age= new Integer(Players.readLine());
                   passingAttempts = new Integer(Players.readLine());
                   passingCompletions= new Integer(Players.readLine());
                   passingYards = new Integer(Players.readLine());
                   rushingAttempts = new Integer(Players.readLine());
                   rushingYards = new Integer(Players.readLine());
                   touchdowns = new Integer(Players.readLine());
                   interceptions = new Integer(Players.readLine());
                   fumbles = new Integer(Players.readLine());
                   sacks = new Integer(Players.readLine());
                   Quarterback p1 = new Quarterback(position,name,weight,age,passingAttempts,passingCompletions,passingYards,rushingAttempts, rushingYards,touchdowns,interceptions,fumbles,sacks);
                   people.add(p1);

                }
                else if (position.equalsIgnoreCase("defense")){
                    name =Players.readLine();
                    weight = new Float(Players.readLine());
                    age = new Integer(Players.readLine());
                    tackles =new Integer(Players.readLine());
                    sacksf = new Float(Players.readLine());
                    interceptions = new Integer(Players.readLine());
                    Defensive p1 = new Defensive(position,name,weight,age,tackles,sacksf,interceptions);
                    people.add(p1);

                }
                else if(position.equalsIgnoreCase("receiver")){
                    name= Players.readLine();
                    weight = new Float(Players.readLine());
                    age = new Integer(Players.readLine());
                    receptions= new Integer(Players.readLine());
                    receptionYards = new Integer(Players.readLine());
                    rushingAttempts = new Integer(Players.readLine());
                    rushingYards = new Integer(Players.readLine());
                    touchdowns = new Integer(Players.readLine());
                    fumbles = new Integer(Players.readLine());
                    Receiver p3= new Receiver(position,name,weight,age,receptions,receptionYards,rushingAttempts,rushingYards,touchdowns,fumbles);
                    people.add(p3);
                }



            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
