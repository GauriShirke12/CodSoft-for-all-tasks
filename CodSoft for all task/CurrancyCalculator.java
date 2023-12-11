import java.util.*;
class CurrancyCalculator
{
    public static void main(String[] args) 
    {
Scanner sc = new Scanner(System.in);

System.out.println("choose any one from the following base and target currency");
System.out.println("1.INR TO USD");
System.out.println("2.USD TO INR");
System.out.println("3.EUR TO INR");
System.out.println("4.INR TO EUR");
System.out.println("5.AUD TO INR");
System.out.println("6.INR TO AUD");
int exchange = sc.nextInt();
switch(exchange)
{
    case 1:{
        System.out.println("Enter the amount of INR");
        double INR=sc.nextDouble();
        if(INR>=0)
        {
            System.out.println(INR + " INR is = " + INR*0.012 + "USD" );
        }
        else{
          System.out.println("no is not positive");
        }
    }
    break;
case 2:{
    System.out.println("Enter the amount of USD");
    double USD=sc.nextDouble();
    if(USD>=0)
    {
        System.out.println(USD +  " USD is = " + USD*83.43 + "INR");
    }
    else{
        System.out.println("no. is not positive");
    }
}
break;
case 3:{
    System.out.println("Enter the amount of EUR");
    double EUR=sc.nextDouble();
    if(EUR>=0){
        System.out.println(EUR + " EUR is = " + EUR*89.88 + "INR");
    }
    else{
        System.out.println("no. is not positive");
    }
}
break;
    case 4:{
        System.out.println("Enter the amount of INR");
        double INR=sc.nextDouble();
        if(INR>=0){
            System.out.println(INR + " INR is = " + INR*0.011 + "EUR");
        }
        else{
            System.out.println("no is not positive");
        }
    }
    break;
    case 5:{
        System.out.println("Enter the amount of AUD");
        double AUD =sc.nextDouble();
        if(AUD>=0)
        {
            System.out.println(AUD + " AUD is = " + AUD*54.96 + "INR");
        }
        else{
            System.out.println("no is not positive");
        }
    }
    break;
    case 6:{
        System.out.println("Enter the amount of INR");
        double INR=sc.nextDouble();
        if(INR>=0){
            System.out.println(INR +" INR is = " + INR*0.018 + "AUD");
        }
        else{
            System.out.println("no is not positive");
        }
    }
    break;

    }
    sc.close();
}
}
    