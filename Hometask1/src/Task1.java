import java.util.*;
class Sweets
{
 Scanner sc=new Scanner(System.in);
 static int no_of_c;
 static int no_of_can;
 int qu=0;
 
 public Sweets() {}
 
 public Sweets(int chocolates,int candies,int quantity)
 {
  no_of_c=chocolates;
  no_of_can=candies;
  qu=quantity;
 }
 public void total_we()
 {
  System.out.println(no_of_c+no_of_can+qu);
 }
 
}
class Choclates extends Sweets
{
 String t;
 Scanner scann=new Scanner(System.in);
 String value_name[]=new String[no_of_c];
 
 public void input()
 {
 Scanner scann=new Scanner(System.in);
 for(int i=0;i<no_of_c;i++)
 {
  System.out.println("Enter choclate name:");
  value_name[i]=scann.next();
 }
 }
 public void sorting(String sweet)
 {
  for(int i=0; i<no_of_c; i++)
        {
            for(int k=1; k<no_of_c; k++)
            {
                if(value_name[k-1].compareTo(value_name[k])>0)
                {
                    t=value_name[k-1];
                    value_name[k-1]=value_name[k];
                    value_name[k]=t;
                }
            }
        }
  if(sweet.equals("A"))
   for(int i=0;i<no_of_c;i++)
    System.out.println(value_name[i]);
  else if(sweet.equals("D"))
   for(int i=(no_of_c-1);i>=0;i--)
    System.out.println(value_name[i]);
 }
}
class Candies extends Sweets
{
 public void count()
 {
  if( no_of_can<=50 && no_of_can>10)
   System.out.println(" No. of candies lies btw 50 & 10 ");
  else if(no_of_can<=10 && no_of_can>0)
   System.out.println("No. of candies lies btw 1 & 10");
  else
   System.out.println("Candies are greater than 50");
   
 }
}
public class Task1
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  int nc,nca,ch,ns;
  System.out.println("Enter no.of gifts:");
  int n=sc.nextInt();
  for(int x=0;x<n;x++)
  {
   System.out.println("Enter total no.of sweets:");
   ns=sc.nextInt();
   System.out.println("Enter no. of candies:");
   nca=sc.nextInt();
   System.out.println("Enter no. of choclates:");
   nc=sc.nextInt();
   Sweets s1=new Sweets(nc,nca,ns);
   Choclates c1=new Choclates();
   c1.input();
   while(true)
   {
   System.out.println("1.Total weight\n2.Sorting the choclates\n3.No.of candies\n4.Exit");
   ch=sc.nextInt();
   if(ch==1)
    s1.total_we();
   else if(ch==2)
   {
    System.out.println("Enter 'A' for ascending order or Enter 'D' for descending order:");
    String sweet=sc.next();
    c1.sorting(sweet); 
   }
   else if(ch==3)
   {
    if(nca==0)
     System.out.println("No candies");
    else
    {
     Candies c2=new Candies();
     c2.count();
    }
   }
   else if(ch==4) {
	   System.exit(1);
   }
   else
    break;
   }
   System.out.println((x+1)+" gifts completed");
   System.out.println("Enter new gifts:");
  }
   
 }
}