
package activity2;

public class Activity2 {

public int loop(int i, int j, int rows)
{
rows = 5;
        for(i = rows; i >= 1; --i)
        {
            for(j = 1; j <= i; ++j)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i = 2; i <= rows; ++i)
        {
            for(j = 1; j <= i; ++j)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
}
public int loop()
{
int i = 4; int j = 0;
 
        do
        {
            do
                {
                    System.out.print("*");
                    j++;
                }
            while(j<=i);
            j=0;
            System.out.print("\n");
            i--;
        }
        while(i>=j);
        j=0; i=0;
        do
        {
            do
            {
                System.out.print("*");
                j++;
            }
            while(j!=i+1);
            j=0;
            i++;
            System.out.print("\n");
        }
        while(i!=5);
        return 0;
}
public double loop(int i, int j)
{
i=4; j=0;
       
        while(i>=j)
        {
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            j=0;
            System.out.print("\n");
            i--;
        }
       
        j=0; i=0;
       
        while(i!=5)
        {
            while(j!=i+1)
            {
                System.out.print("*");
                j++;
            }
            j=0;
            i++;
            System.out.print("\n");
        }
            return 0;
}


public static void main(String args[])
{
Activity2 l = new Activity2();
               
System.out.println(l.loop());
System.out.println(l.loop());
System.out.println(l.loop());
}
}     
    
  