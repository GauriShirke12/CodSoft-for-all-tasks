import java.util.*;
class GradeCalculator
{
    public static void main(String args[])
    {
        int maths,sci,geo,eng,total;
        double per;
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the marks of each subject");
        maths=sc.nextInt();
        sci=sc.nextInt();
        geo=sc.nextInt();
        eng=sc.nextInt();
total=maths+sci+geo+eng;
per=(total*100)/400;
System.out.println("total marks is="+total);
System.out.println("average percentage is="+per);
 
if(per<=100 && per>=80)
{
    System.out.println("Grade-A");
}
else if(per<80 && per>=60)
{
    System.out.println("Grade-B");
}
else{
    System.out.println("Grade-C");
}
sc.close();
  }
}