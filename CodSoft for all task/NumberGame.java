import java.util.*;
class NumberGame
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int chances=8;
    int finals=0;
    boolean playAgain=true; 
    System.out.println("WelCome Dude!");
    System.out.println("heyy Dude you have " +chances + " chances to play game ");
    while(playAgain)
    {
int rand=getrandN(1,100);
boolean guess=false;
for(int i=1;i<=chances;i++)
{
    System.out.println("chance:"+(i) + "  Enter your guess:");
    int user=sc.nextInt();
    if(user==rand)
    {
        guess=true;
        finals+=1;
        System.out.println("you won it.");
        break;
    }
    else if(user>rand)
    {
        System.out.println("Too high");
    }
    else
    {
        System.out.println("Too Low");
    }
}
if(guess==false)
{
System.out.println("Sorry DUde. You lost chances. The no. is "+rand);
}
System.out.println("Do You Want Play Again(yes/no)");
String pA=sc.next();
playAgain=pA.equalsIgnoreCase("yes");
}
System.out.println("That's it Dude ,Hope you enjoyed it ");
System.out.println("Here is your Score "+finals);
sc.close();
    }
    public static int getrandN(int min,int max)
    {
        return (int)(Math.random()*(max-min+1)+min);
    }

}
