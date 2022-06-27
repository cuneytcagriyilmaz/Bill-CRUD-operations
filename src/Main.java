import Entities.Bill;
import Entities.MemberAccount;
import Exceptions.BalanceException;
import Responses.Response;
import Services.BillService;
import Services.MemberAccountService;

public class Main {
    public static void main(String[] args) throws BalanceException {

        //CRUD işlemleri için memberAccountService nesnesi oluşturuldu
        MemberAccountService memberAccountService = new MemberAccountService();

        //MemberAccount'da sabit bir üye oluşturuldu
        MemberAccount memberAccount = new MemberAccount(1,"Cagri","Yilmaz","+901234567",10000.0);

        //Create Methodu
        MemberAccountService memberAccountService1 = MemberAccountService.create("Ali","Yilmaz","+90321654897",5000.0);

        Bill bill = new Bill(1,300.0,"06-16-2022",1);

        //BillService Nesnesi oluşturuldu
        BillService billService = new BillService();
        //Main metodlardan dönen response.getCode().equals("0") ise işlem başarılı mesajı vereldi, ("1" ==>  Başarısız, "0" ==> Başarılı.
        // Date bilgisini de ekrana yazdırıldı.
        Response response = billService.payment(1,1000,500);
        if (response.getCode().equals("0")){
            System.out.println("İşlem tamamlandı: "+response.getDate());
        }else if(response.getCode().equals("1")){
            System.out.println("Yetersiz Bakiye: " + response.getCode() +" "+response.getDate());
        }else {
            System.out.println("Ödeme Türü Yanlış Seçildi");
        }




    }
}
