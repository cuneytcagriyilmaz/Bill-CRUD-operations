package Services;

import Exceptions.BalanceException;
import Responses.Response;

import java.util.Date;

public class BillService implements Client {
    public boolean status = true;
    //implement edilen metotlar override edildi.
    @Override
    public Response payment(int billType, double balance, double amount) throws BalanceException {
        //Bakiye durumu kontrol edildi. Eğer bakiye yetersiz ise BalanceException fırlatıldı.
        if (balance < amount) throw new BalanceException("Yetersiz bakiye");
        else {
            return new Response("0","2022-06-17");
        }
    }

    @Override
    public Response check(int billType, String memberCode) {
        if (status){
            return new Response("0","2022-06-17");
        }else {
            return new Response("1","2022-06-17");
        }
    }
    @Override
    public Response cancelPayment(int billType, String memberCode, double amount, int paymentId, Date invoiceDate) {
        return new Response("0","2022-06-17");
    }
}
