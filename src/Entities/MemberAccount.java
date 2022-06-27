package Entities;

public class MemberAccount {

    //Bilgilerin dışarıdan erişilmesini istediğimiz için private kullanıyoruz.
    private long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String memberCode;
    private double balance;


    public MemberAccount(long id, String name, String surname, String phoneNumber, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        //MemberAccount ın id+ismin ilk 2 harfinden oluşan memberCode.
        this.memberCode = id + name.substring(0,2);
        this.balance = balance;
    }

    //Değişken bilgilerine erişimi Getter ve Setter Üzerinden Yapıyoruz.
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
