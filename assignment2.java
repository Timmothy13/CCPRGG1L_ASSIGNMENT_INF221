public class App {
    public static void main(String[] args) throws Exception {

        //For Loop
        //Break
        for (int firstNameCount = 5; firstNameCount != 0; firstNameCount--) {
           
           if (firstNameCount == 4) {
                System.out.println("Wait! Timeout! I need to go to the bathroom!");
                break;
            }
            System.out.println("Jan-Timmothy");
        }
    
           
        //While Loop
        //Continue
             int nickNameCount = 5;
             
             while (nickNameCount != 0) {
                 nickNameCount--;
                 
                if (nickNameCount == 3) {
                System.out.println("Go ahead i will skip this third loop. i will ride on the next loop!");
                continue;
                }
                
            System.out.println("Timmothy");
           
            
           }
           
           //Do-While Loop
                int lastNameCount = 5;

        do {
            System.out.println("Lukban");
            lastNameCount--;
        } while (lastNameCount != 0);
        
   

    }
}
