package package1;

import java.util.*;
class College 
{private String name;
  private String city;
 College(String cname,String ccity)
    {name=cname;
        city=ccity;
    }
  ArrayList <Department> dp=new ArrayList <Department>();
 
 
     
  
  
                    
            int addDepartment(String x,int y,Faculty z)
                    { 
                        String dname=x; 
                        int cap=y; 
                        Faculty hod=z;
                        Department dop =new Department(dname,cap,hod);
                        dp.add(dop);
                        return  dp.size();
                        
                          }
    
            int addstudent(String n,Student st,int c)
                     {String na=n;Student s=st; int ind=c;
                         dp.get(ind).std.add(s);
                             st.rollno=dp.get(ind).std.size();
                         st.dept=na;
                         
                        
                         return dp.get(ind).std.size();
                        }
                    
                                       
                         
                      boolean upgradeFaculty(String u,Faculty p,int uf)
                       {
                         String duname=u; 
                         Faculty udp=p;
                         int dn=uf;
                        if( udp.getqualification().equals(dp.get(dn).hod.getqualification()) &&  udp.getexperience()>dp.get(dn).hod.getexperience() )
                         {dp.get(dn).hod=udp;
                            return true;}
                            else 
                            return false;
                        }
                        
                        int getstatecount(String sn)
                         {String gst=sn;
                             int count =0;
                             
                             for(int k=0;k<dp.size();k++)
                           { 
                             for(int j=0;j<dp.get(k).std.size();j++)
                              {if(dp.get(k).std.get(j).State.equals(gst) )
                                  count++;
                                }}
                              return count;
                            }
                             
          
                        }
                        
                        
                        
                        
                        
                            
                         
                         
                         
                         
                                      
                       