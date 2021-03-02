package com.axisapp;

import approver.*;

import javax.jws.WebService;
import java.math.BigDecimal;

@WebService
public class ApproverService extends ApproverServiceSkeleton {
    @Override
    public RateElem approveOperation(PropElem propElem) throws ErrorMessage {
        RateElem rateElem = new RateElem();
        PropType data = propElem.getPropElem();
        if (data.getName().equals("Error")) {
            throw new ErrorMessage("An error");
        } else if (data.getName().startsWith("A")) {
            rateElem.setRateElem(BigDecimal.valueOf(5));
        }
        return rateElem;
    }
}
