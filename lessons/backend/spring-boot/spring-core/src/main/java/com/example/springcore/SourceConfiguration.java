package com.example.springcore;

import com.example.springcore.define.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SourceConfiguration {


    @Bean
     MyBean myBean(){
        MyBean myBean = new MyBean();
        myBean.setMyDouble(12.4);
        myBean.setMyString("deneme");
        myBean.setMyLong(1234);
        return myBean;
    }

    @Bean
    MySpec mySpec(){
        MySpec mySpec = new MySpecImpl();
        return mySpec;
    }

    @Value("${my-contract.my-field}")
    private String myField;
    @Bean
    MyContract myContract(){
        MyContract myContract = new MyContractImpl();
        myContract.setMyField(myField);
        return myContract;
    }
}
