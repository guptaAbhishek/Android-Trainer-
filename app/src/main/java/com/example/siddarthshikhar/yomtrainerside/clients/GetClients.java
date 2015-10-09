package com.example.siddarthshikhar.yomtrainerside.clients;

/**
 * Created by Abhishek on 29-Sep-15.
 */
public class GetClients {
    private String clientName;
    private String clientAddress;
    private String clientTiming;
    private String clientBudget;
    private String clientPreferredDays;


    public String getClientName(){return clientName;}

    public void setClientName(String clientName){this.clientName = clientName;}

    public String getClientAddress(){return clientAddress;}

    public void setClientAddress(String clientAddress){this.clientAddress = clientAddress;}

    public String getClientBudget(){return clientBudget;}

    public void setClientBudget(String clientBudget){this.clientBudget = clientBudget;}

    public String getClientTiming(){return clientTiming;}

    public void setClientTiming(String clientTiming){this.clientTiming = clientTiming;}

    public String getClientPreferredDays(){return clientPreferredDays;}

    public void setClientPreferredDays(String clientPreferredDays){this.clientPreferredDays = clientPreferredDays;}

}
