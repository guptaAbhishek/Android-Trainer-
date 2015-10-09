package com.example.siddarthshikhar.yomtrainerside;

/**
 * Created by Abhishek on 22-Sep-15.
 */
public class GetConsumer {
    private String consumerName;
    private String consumerAddress;
    private String consumerPhone;
    private int consumerId;
    private int scheduleId;

    private String consumerGender;


    public int getScheduleId(){
        return scheduleId;
    }

    public void setScheduleId(int scheduleId){
        this.scheduleId = scheduleId;
    }


    public int getConsumerId(){
        return consumerId;
    }

    public void setConsumerId(int consumerId){
        this.consumerId = consumerId;
    }


    public String getConsumerName(){
        return consumerName;
    }

    public void setConsumerName(String consumerName){
        this.consumerName = consumerName;
    }

    public String getConsumerAddress(){
        return consumerAddress;
    }

    public void setConsumerAddress(String consumerAddress){
        this.consumerAddress = consumerAddress;
    }

    public String getConsumerPhone(){
        return consumerPhone;
    }

    public void setConsumerPhone(String consumerPhone){
        this.consumerPhone = consumerPhone;
    }

    public String getConsumerGender(){
        return consumerGender;
    }

    public void setConsumerGender(String consumerGender){
        this.consumerGender = consumerGender;
    }



}
