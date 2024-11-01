import java.util.*;
public class Main {
    public static void main(String[] arg){
Random r=new Random();
Scanner s=new Scanner(System.in);
int opption=1;
boolean theSame=false;
do{
    int r1=r.nextInt(10);
    int r2=r.nextInt(10);
    int r3=r.nextInt(10);
    System.out.println(r1+" "+r2+" "+r3);
    //congrat message
    if(r1==r2||r1==r3||r2==r3){
        System.out.println("today is your lucky day!");
    } else {
        System.out.println("next time loser!");
    }
    System.out.println("if u want to exit  press '0' ");
    opption=s.nextInt();
    if(opption==0){
        break;
    }
    if (r1==r2||r1==r3||r2==r3){
        theSame=true;
    }else {
        theSame=false;
    }
}while (theSame==true);

    }
}
