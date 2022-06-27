package Services;

import Entities.MemberAccount;
import Exceptions.BalanceException;
import Responses.Response;

import java.util.Date;

//BillService class ını inherit edecek bir de Client class.
public interface Client {
    //Response deðer dönecek olan metod
    Response payment(int billType, double balance,double amount) throws BalanceException;

    Response check(int billType,String memberCode);

    Response cancelPayment(int billType, String memberCode, double amount, int paymentId, Date invoiceDate);

}
