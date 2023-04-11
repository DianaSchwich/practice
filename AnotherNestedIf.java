package practice;

public class AnotherNestedIf {
    public static void main(String[] args) {
        //if you have a covid vaccine yes or not
        //if dose =1-> you need 2 be fully vacinated
        //if dose=2 -> you are fully vacinated

        boolean vaccine=true;
        int dose=1;

        if (vaccine){
            System.out.println("you need second dose");

        }else if (dose==2){
            System.out.println("you are fully vaccinated");

        }else if (dose==3){
            System.out.println("you are fully vaccinated with booster");
        }
    }
}

