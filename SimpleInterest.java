import java.util.*;
public class SimpleInterest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int Principal=sc.nextInt();
int Rate=sc.nextInt();
int Time=sc.nextInt();
int simpleInterest=(Principal*Rate*Time)/100;
System.out.println(simpleInterest);
}
}
