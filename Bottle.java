import java.util.*;
public class Bottle{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int money=100;
        int x=10;
        int bottle=100/10;
        int empty=bottle;
        while(empty>=3){
            int newBottle=empty/3;
            bottle=bottle+newBottle;
            int remaining=empty%3;
            empty=remaining+newBottle;
        }
        System.out.println("Bottles: "+bottle);
        System.out.println("Remaining: "+empty);
    }
}
