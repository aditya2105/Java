package package1;


class Person
{String nam;
String gender;
String State;
    Person(String a,String b,String c)
    {nam=a;
        gender=b;
        State=c;
    }
}
class Student extends Person
{       
int rollno;
String dept;
Student(String nam, String gender,String State)
{super(nam,gender,State);}

}
class Faculty extends Person
{ String qu;
    int experience;
      Faculty(String nam,String gender,String State,String qu,int experience)
       {super(nam,gender,State);
           this.qu=qu;
           this.experience=experience;
        }
     String getqualification()
      {return qu;}
    
      
      int getexperience()
       {return experience;}
       
       
       }
