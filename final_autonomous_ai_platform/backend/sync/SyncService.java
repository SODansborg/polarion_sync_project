
public class SyncService {

    private AutonomousAgent agent = new AutonomousAgent();

    public void process(String id){
        try{
            System.out.println("Processing "+id);
        }catch(Exception ex){
            agent.selfHeal(ex.getMessage());
        }
    }
}
