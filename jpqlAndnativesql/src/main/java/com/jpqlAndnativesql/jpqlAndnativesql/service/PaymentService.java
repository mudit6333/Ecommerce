package com.jpqlAndnativesql.jpqlAndnativesql.service;

import com.jpqlAndnativesql.jpqlAndnativesql.entity.*;
import com.jpqlAndnativesql.jpqlAndnativesql.repos.PaymentJoinedRepository;
import com.jpqlAndnativesql.jpqlAndnativesql.repos.PaymentSingleRepository;
import com.jpqlAndnativesql.jpqlAndnativesql.repos.PaymentTablePerClassRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    @Autowired
    PaymentSingleRepository paymentSingleRepository;
    @Autowired
    PaymentTablePerClassRepsoitory paymentTablePerClassRepository;
    @Autowired
    PaymentJoinedRepository paymentJoinedRepository;

    public void paymentSingle() {
        ChequeSingle chequeSingle = new ChequeSingle();

        chequeSingle.setId(1);
        chequeSingle.setAmount(200.0);
        chequeSingle.setChequeNumber("2833414593");
        paymentSingleRepository.save(chequeSingle);
    }
    public void paymentJoined(){

        CardJoined cardJoined = new CardJoined();
        cardJoined.setId(2);
        cardJoined.setAmount(500.0);
        cardJoined.setCreditCard("23465749666");
        paymentJoinedRepository.save(cardJoined);
    }

    public void paymentPerClass(){

        ChequeTablePerClass chequeTablePerClass = new ChequeTablePerClass();

        chequeTablePerClass.setId(3);
        chequeTablePerClass.setAmount(2500.0);
        chequeTablePerClass.setChequeNumber("2576822345789");
        paymentTablePerClassRepository.save(chequeTablePerClass);
    }


}


