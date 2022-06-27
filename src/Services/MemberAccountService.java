package Services;

import Entities.MemberAccount;

//Member Account'da bilgileri değiştirebilmek için MemberAccountService class'ı oluşturuldu.
//Create,Read,Update,Delete (CRUD) Metotları Yazıldı.
public class MemberAccountService {

    public static MemberAccountService create(String name, String surname, String phoneNumber, double balance){
        System.out.println("Üye oluşturuldu");
        return null;
    }
    public static void read(MemberAccount memberAccount){
        System.out.println("Üye Bilgileri Gösterildi.");
    }
    public static void update(MemberAccount memberAccount, MemberAccount newNumber){
        System.out.println("Üye Güncellendi.");
    }
    public static void delete(MemberAccount memberAccount){
        System.out.println("Üye Silindi.");
    }
}
