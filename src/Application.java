import com.subscriptionModel.SubscriptionModel;
import com.subscriptionModel.SubscriptionVariable;

public class Application {

    public static void main(String args[]){
        SubscriptionVariable b = new SubscriptionVariable();
        SubscriptionModel model = new SubscriptionModel();

        model.subscribeA(b);
        model.printSubscriptionValues();
        model.updateA();
        model.printSubscriptionValues();
    }
}
