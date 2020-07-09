
public class FreeSubscription implements Subscription {
    public String getType(){
        return("Free");
    }
    public int getBillAmount(){
        return (0);
    }
}