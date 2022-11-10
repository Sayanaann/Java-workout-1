import java.util.*;

public class Faculty {
    int facultyid;
    float salary;
}
class FulltimeFaculty extends Faculty{
    float basic;
    float allowence;

    FulltimeFaculty(float basic,float allowence){
        this.basic=basic;
        this.allowence=allowence;

    }
    float salaryF(){
        float salary1;
        salary1=(basic+allowence);
        return salary1;
    }
    void display1(){
        System.out.println("Salary for fulltime  "+salaryF());
    }
}
class ParttimeFaculty extends Faculty{
    int hour;
    float rate;

    ParttimeFaculty(int hour,float rate){
        this.hour=hour;
        this.rate=rate;

    }
    float salaryP(){
        float salary2;
        salary2=(hour*rate);
        return salary2;

    }
    void display2(){
        System.out.println("Salary for Parttime  "+salaryP());
    }

}
   class DriverClass{

    public static void main(String[] args){
        Scanner scn1=new Scanner(System.in);
        System.out.println("Enter the details of F1");
        FulltimeFaculty F1 = new FulltimeFaculty(scn1.nextFloat(),scn1.nextFloat());
        System.out.println("Enter the details of F2");
        FulltimeFaculty F2 = new FulltimeFaculty(scn1.nextFloat(),scn1.nextFloat());
        System.out.println("Enter the details of P1");
        ParttimeFaculty P1 = new ParttimeFaculty(scn1.nextInt(),scn1.nextFloat());
        System.out.println("Enter the details of P2");
        ParttimeFaculty P2 = new ParttimeFaculty(scn1.nextInt(),scn1.nextFloat());
        F1.display1();
        F1.display1();
        P1.display2();
        P2.display2();
    }
   }
