package package1;

import java.util.*;
class Department
{String dname;
int dcap;
Faculty hod;
ArrayList<Student> std = new ArrayList<Student>();
    Department(String dname,int cap,Faculty hod)
     {this.dname=dname;
         this.dcap=cap;
       this.hod=hod;
       }
       String getdepartment()
       {return dname;}
    }
     