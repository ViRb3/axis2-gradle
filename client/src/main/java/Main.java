import approver.ApproverServiceStub;
import approver.ErrorMessage;

import java.math.BigDecimal;
import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException, ErrorMessage {
        ApproverServiceStub stub = new ApproverServiceStub();
        ApproverServiceStub.PropElem dataElem = new ApproverServiceStub.PropElem();
        ApproverServiceStub.PropType data = new ApproverServiceStub.PropType();
        data.setName("Anna");
        data.setAddress("");
        data.setAmount(BigDecimal.ZERO);
        dataElem.setPropElem(data);
        ApproverServiceStub.RateElem rateElem = stub.approveOperation(dataElem);
        System.out.println("Response : " + rateElem.getRateElem());
    }
}
