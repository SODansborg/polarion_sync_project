
public class AutonomousAgent {

    public String analyze(String error){
        if(error.contains("timeout")){
            return "Retry recommended";
        }
        return "Investigate manually";
    }

    public void selfHeal(String error){
        if(error.contains("timeout")){
            System.out.println("Retrying operation...");
        }
    }
}
