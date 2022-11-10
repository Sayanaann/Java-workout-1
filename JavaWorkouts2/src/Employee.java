public class Employee {
    String name;
    int empID;
    int ass1;
    int ass2;
    int ass3;
    String result;
   public void Employee(String name,int empID, int ass1,
             int ass2,int ass3) {
       this.name = name;
       this.empID = empID;
       this.ass1 = ass1;
       this.ass2 = ass2;
       this.ass3 = ass3;
       this.result=result;
   }
   public String calculate(){
        if (ass1>=75 && ass1<=100 &&
                ass2>=75 && ass2<=100 &&
                ass3>=75 && ass3<=100){
            result = "Promoted";
            return result;
        }
        else{
            result="Demoted";
            return result;
        }
    }
public int total(int ass1,
                 int ass2,int ass3){
        int total=ass1+ass2+ass3;
        return total;
}
    public float Percentage(int total){
        float Percentage = (((total)*100)/300);
        return Percentage;
    }

    public void value(){
        System.out.println("Name: "+name);
        System.out.println("Emp ID:  "+empID);
        System.out.println("Result:"+result);
        System.out.println("Percentage: "+Percentage());
    }
        public static void main(String[] args) {
            Employee a = new Employee("Sayana", 3214, 78, 56, 90);
            a.calculate();
            a.Percentage();
            a.value();
        }
    }
