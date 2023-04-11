package practice;

public class nestedif {
    public static void main(String[] args) {
         boolean driverLicense=true;
         boolean car=true;
         if(driverLicense){
             System.out.println("Lets check if you have a car");
             if(car){
                 System.out.println("You can drive to work");
             }else{
                 System.out.println("You will need to take a bus or uber");
             }

         }else{
             System.out.println("You should get a DL");
         }
    }
}
