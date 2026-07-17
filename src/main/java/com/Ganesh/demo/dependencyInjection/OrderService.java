package com.Ganesh.demo.dependencyInjection;

import ch.qos.logback.core.CoreConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    //@Autowired
    private PaymentService ps;
    //constructer injection
//    @Autowired
//    OrderService(PaymentService ps){
//        this.ps=ps;
//    }
    //setter injection
    @Autowired
    public void setPaymentService(PaymentService ps){
        this.ps=ps;
    }


    public void placeOrder(){
        ps.payment();
        System.out.println("order placed");
    }

}
