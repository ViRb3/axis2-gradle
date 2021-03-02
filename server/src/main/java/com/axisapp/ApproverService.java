package com.axisapp;

import approver.ApproverServiceSkeleton;
import approver.PropElem;
import approver.PropType;
import approver.RateElem;

import javax.jws.WebService;
import java.math.BigDecimal;

@WebService
public class ApproverService extends ApproverServiceSkeleton {
    @Override
    public RateElem approveOperation(PropElem propElem) {
        RateElem rateElem = new RateElem();
        PropType data = propElem.getPropElem();
        if (data.getName().startsWith("A")) {
            rateElem.setRateElem(BigDecimal.valueOf(1));
        } else {
            rateElem.setRateElem(BigDecimal.valueOf(5));
        }
        return rateElem;
    }
}
