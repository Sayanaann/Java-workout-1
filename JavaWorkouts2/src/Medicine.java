import java.util.Scanner;
public class Medicine {
    public void displayLabel() {
        System.out.println("Company : Globex Pharma");
        System.out.println("Address : Bangalore");
    }
}
      class Tablet extends Medicine{
          public void displayLabel()
          {
              System.out.println("store in a cool dry place");
          }}
class Syrup extends Medicine{
    public void displayLabel()
    {
        System.out.println("Consumption as directed by the physician");
    }}
class Ointment extends Medicine {
    public void displayLabel() {
        System.out.println("for external use only");
    }
}
     class Testmedicine {

        public static void main(String args[]) {
            int i;
            Scanner sc = new Scanner(System.in);

            Tablet[] tabs = new Tablet[3];
            Syrup[] syrs = new Syrup[3];
            Ointment[] oint = new Ointment[3];
            for (i = 0; i < 3; i++) {
                int n = sc.nextInt(3) + 1;

                if (n == 1) {
                    tabs[i] = new Tablet();
                    tabs[i].displayLabel();
                } else if (n == 2) {
                    syrs[i] = new Syrup();
                    syrs[i].displayLabel();
                } else {
                    oint[i] = new Ointment();
                    oint[i].displayLabel();
                }
            }

        }
    }



