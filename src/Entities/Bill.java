package Entities;

import java.util.Date;

public class Bill {
    //Faturanın içinde tutulacak bilgileri private olarak tnaımlıyoruz ve dışardan erişimi engelliyoruz.
    private long id;
    private double amount;
    private String process_date;
    private int bill_type;
    private String memberCode;

    public Bill(long id, double amount, String process_date, int bill_type) {
        this.id = id;
        this.amount = amount;
        this.process_date = process_date;
        this.bill_type = bill_type;
    }
    //Fatura bilgilerine dışardan erişimler Sadece Setter ve Getter'lar üzerinden gerçekleşecek.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getProcess_date() {
        return process_date;
    }

    public void setProcess_date(String process_date) {
        this.process_date = process_date;
    }

    public int getBill_type() {
        return bill_type;
    }

    public void setBill_type(int bill_type) {
        this.bill_type = bill_type;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }
}
