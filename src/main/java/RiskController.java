package main.java;
import java.util.List;

public class RiskController {
    private boolean IsUserKnown;
    private boolean IsClientKnown;
    private static final String IsIPKnown = "10.97.2.0/24";
    private boolean IsIPInternal;
    private int FailedLoginCountLastWeek;

    public List<Risk> Scenarios(){
        //Scenario 1: if user login is seen
        boolean isUserKnown;
        if (isUserKnown = true) {
             System.out.println("Login allowed");
        }
        else{
            System.out.println("Login Denied");
        }

        // Scenario 2: if the computer ever seen before
        boolean isClientKnown;
        if (isClientKnown= true) {
            System.out.println("Login allowed");
        }
        else{
            System.out.println("Login Denied");
        }

        //Scenario 3: if the connecting IP ever seen before
        boolean isIPKnown;
        if (isIPKnown= true) {
            System.out.println("Login allowed");
        }
        else{
            System.out.println("Login Denied");
        }

        //Scenario 4: if the IP address is equal to the IP address above
        String isIPInternal = "";
        if (isIPInternal == "10.97.2.0/24") {
            System.out.println("Login allowed");
        }
        else{
            System.out.println("Login Denied");
        }

        //Scenario 5: Number of logins failed
        final var count = 3;
        if(FailedLoginCountLastWeek == count){
        System.out.println("Login Denied");
        }

        return Scenarios();
    }

}
