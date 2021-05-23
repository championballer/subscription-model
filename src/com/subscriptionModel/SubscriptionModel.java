package com.subscriptionModel;

import java.util.ArrayList;

public class SubscriptionModel {

    private int a;
    private ArrayList<SubscriptionVariable> SubscriptionVariables;

    public SubscriptionModel(){
        a = 0;
        SubscriptionVariables = new ArrayList<SubscriptionVariable>();
    }

    public void updateA(){
        this.a += 1;
        updateSubscriptions();
    }

    public void subscribeA(SubscriptionVariable b){
        SubscriptionVariables.add(b);
    }

    private void updateSubscriptions(){
        for(SubscriptionVariable a : SubscriptionVariables){
            a.setVal(this.a);
        }
    }

    public void printSubscriptionValues(){
        for(SubscriptionVariable a : SubscriptionVariables){
            System.out.println(a.getVal());
        }
    }

}
