import approver.ApproverServiceStub;

import java.math.BigDecimal;
import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException {
        ApproverServiceStub stub = new ApproverServiceStub();
        ApproverServiceStub.ApproveOperation request = new ApproverServiceStub.ApproveOperation();
        ApproverServiceStub.PropType data = new ApproverServiceStub.PropType();
        data.setName("Anna");
        data.setAddress("");
        data.setAmount(BigDecimal.ZERO);
        request.setData(data);
        ApproverServiceStub.ApproveOperationResponse resp = stub.approveOperation(request);
        System.out.println("Response : " + resp.getRate());
    }
}
