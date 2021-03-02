package com.axisapp;

import approver.ApproveOperation;
import approver.ApproveOperationResponse;
import approver.ApproverServiceSkeleton;
import approver.PropType;

import javax.jws.WebService;
import java.math.BigDecimal;

@WebService
public class ApproverService extends ApproverServiceSkeleton {
    @Override
    public ApproveOperationResponse approveOperation(ApproveOperation approveOperation) {
        ApproveOperationResponse response = new ApproveOperationResponse();

        PropType data = approveOperation.getData();
        if (data.getName().startsWith("A")) {
            response.setRate(BigDecimal.valueOf(1));
        } else {
            response.setRate(BigDecimal.valueOf(5));
        }

        return response;
    }
}
