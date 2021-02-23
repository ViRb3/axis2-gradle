import approver.ApproverServiceStub;

import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException {
        ApproverServiceStub stub = new ApproverServiceStub();
        ApproverServiceStub.ApproveOperation request = new ApproverServiceStub.ApproveOperation();
        request.setName("Anna");
        ApproverServiceStub.ApproveOperationResponse resp = stub.approveOperation(request);
        System.out.println("Response : " + resp.getRate());
    }
}
