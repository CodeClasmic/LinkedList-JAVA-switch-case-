import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Integer;
public class linkedlist 
{
    static Scanner sc=new Scanner(System.in);
    static LinkedList<Integer> list=new LinkedList<>();
    static int a;
      static void create()
    {
        System.out.print("enter the data=");
        System.out.println("");
         a=sc.nextInt();
        
    }
    static void display()
    {
        System.out.println("the display");
        for(int i=0;i<=list.size()-1;i++)
        {
           System.out.println(list.get(i));
        }
    }
    
    public static void main(String[] args)
    {
        System.out.print("enter the number of element of list=");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
         create();
         list.add(a);
        }
        display();

        int flag=1;
        while(flag!=0)
        {
            System.out.println("press 1 to insert element");
            System.out.println("press 2 to delete element");
            System.out.println("press 3 to display element");
            System.out.println("press 4 to  exit");
            int c=sc.nextInt();
            int y;
            switch(c)
            {
                 case 1:
                 System.out.println("press 1 to insert At First");
                 System.out.println("press 2 to insert At last ");
                 System.out.println("press 3 to insert at your position");
                 System.out.println("press 4 to insert after a node");
                 int cc=sc.nextInt();
                 switch(cc)
                 {
                     case 1:
                         create();
                         list.addFirst(a);
                         System.out.println("element added");
                         break;
                     case 2:    
                         create();
                         System.out.println("element added");
                         list.addLast(a);
                         break;
                     case 3:
                         create();
                         System.out.println("enter the position");
                         int x=sc.nextInt();
                         if(list.size()<x)
                         {
                             System.out.println("enter within the size of list");
                             System.out.println("element not added");
                         }
                         else
                         {
                             System.out.println("element added");
                             list.add((x-1),a);
                         }
                         break;
                     case 4:    
                         create();
                         System.out.println("enter the index");
                          y=sc.nextInt();
                         int ind=list.indexOf(y);
                         int t=0;
                        for(int i=0;i<=list.size()-1;i++)
                        {
                               if(list.get(i)==y)
                               {
                                   System.out.println("element added");
                                   list.add((ind+1),a);
                                   t=1;
                               }
                        }
                         if(t==0)
                               {
                                   System.out.println("index element not found");
                                   System.out.println("element not added");
                               }
                        break; 
                     default:
                         System.out.println("bhen ke loude gand mara ");
                         break;  
                 }
                     break;
                 case 2:
                    System.out.println("press 1 to DELETE At First");
                 System.out.println("press 2 to DELETE At last ");
                 System.out.println("press 3 to DELETE at your position");
                 System.out.println("press 4 to DELETE a element ");
                 int ccc=sc.nextInt();
                 switch(ccc)
                 {
                     case 1:   
                         list.removeFirst();
                         System.out.println("element DELETED");
                         break;
                     case 2:    
                         System.out.println("element DELETED");
                         list.removeLast();
                         break;
                     case 3:
                         System.out.println("enter the position");
                         int b=sc.nextInt();
                         if(list.size()<b || b<0)
                         {
                             System.out.println("enter within the size of list");
                             System.out.println("element not deleted");
                         }
                         else
                         {
                            list.remove(list.get(b));
                             System.out.println("element deleted");         
                         }
                         break;
                     case 4:    
                         System.out.println("enter the element to delete");
                         int k=sc.nextInt();
                         int t=0;
                         for(int i=0;i<=list.size()-1;i++)
                        {
                               if(list.get(i)==k)
                               {
                                    list.remove(list.get(i));
                                    System.out.println("element deleted");  
                                    t=1;
                               }
                        }
                         if(t==0)
                         {
                             System.out.println("element not found");  
                         }
                        break; 
                     default:
                         System.out.println("raja gandu chooda magi");
                         break;  
                 }
                     break;          
                 case 3:
                     display();
                     break;
                 case 4:
                     flag=0;
                     break;
                 default:
                     System.out.println("mike ke mume lowda");
                     break;
            }
        }
        display();
    }
}