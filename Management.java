package package1;




import java.util.*;
class Management
{public static void main(String arg[])
   { 
       Scanner obj=new Scanner(System.in);
       System.out.print("Enter college name:-");
       String cname=obj.next();
       System.out.print("Enter city:-");
       String ccity=obj.next();
       System.out.println();
       College c=new College(cname,ccity);
       int x;
       TreeSet<String> ts=new TreeSet<String>();
       
       while(true)
       {  System.out.println("1:Enter Department.");
       System.out.println("2:Enter Student.");
       System.out.println("3:Upgrade Faculty.");
       System.out.println("4:State count.");
       System.out.println("5:Enter 0 to exit:");
       System.out.println("Enter your choice:");
       x=obj.nextInt();
       System.out.println();
       System.out.println();
       System.out.println();
       if(x==1)
      { String name;
         System.out.print("Enter dept name:");
          name=obj.next();
          
          int capacity;
          System.out.print("Enter capacity:");
            capacity=obj.nextInt();
            System.out.println();
            System.out.println("Enter Faculty details:");
           String na;
             System.out.print("Enter name:");
                na=obj.next();
                 String gen;
            System.out.print("Enter gender:");
                     gen=obj.next();
             String stat;
               System.out.print("Enter State:");
              stat=obj.next();
                String q;
                 System.out.print("Enter qualification:");
                    q=obj.next();
                      int exp;
                   System.out.print("ENter experience:");
                   exp=obj.nextInt();
      Faculty p=new Faculty(na,gen,stat,q,exp);
      int a=c.addDepartment(name,capacity,p);
      System.out.println("Number of dept:"+a);
      System.out.println();
      System.out.println();
    }
    else if(x==2)
      {   System.out.println("Enter Student details");
          String sname;
          System.out.println("Enter student name:");
          sname=obj.next();
          String sgender;
          System.out.println("Enter Gender;");
          sgender=obj.next();
          String sstate;
          System.out.println("Enter state:");
          sstate=obj.next();
          ts.add(sstate);
    Student p=new Student(sname,sgender,sstate);
    System.out.println("Department list:");
    for(int i=0;i<c.dp.size();i++)
     {System.out.println((i+1)+"."+c.dp.get(i).getdepartment());
        }
     System.out.println("Enter choice:");
     int y=obj.nextInt();
     if(y>=1&&y<=c.dp.size() )
       { String sdname=c.dp.get(y-1).getdepartment();
           int b=c.addstudent(sdname,p,y-1);
           System.out.println("Number of students ="+b);
           System.out.println();
           System.out.println();
        }
        else
        System.out.println("Invalid chohice");
    }
    else if(x==3)
      { System.out.println("Enter Faculty Details:");
                    String una;
             System.out.println("Enter name:");
                una=obj.next();
                 String ugen;
            System.out.println("Enter gender:");
                     ugen=obj.next();
             String ustat;
               System.out.println("Enter State:");
              ustat=obj.next();
                String uq;
                 System.out.println("Enter qualification:");
                    uq=obj.next();
                      int uexp;
                   System.out.println("ENter experience:");
                   uexp=obj.nextInt();
      Faculty up=new Faculty(una,ugen,ustat,uq,uexp);   
      System.out.println("Department list:");
    for(int i=0;i<c.dp.size();i++)
     {System.out.println((i+1)+"."+c.dp.get(i).getdepartment());
        }
     System.out.println("Enter department number in which u want to upgrade :");
              int u=obj.nextInt();
              String upg=c.dp.get(u-1).getdepartment();
             
              boolean upsc=c.upgradeFaculty( upg,up, u);
              if(upsc==true)
                         System.out.println("Upgraded");
                         else 
                         System.out.println("Not qualified");
                         
                         System.out.println();
                         System.out.println();
                         System.out.println();
                        }
    else if(x==4)
     {
         System.out.println("Select a state:");
         System.out.println(ts);
         String sel=obj.next();
         int gs=c.getstatecount(sel);
    System.out.println("Numbber of studnts in "+sel+"is : "+gs);
    System.out.println();
    System.out.println();
           }
           else if(x==0)
           break;
    
    }
}
}