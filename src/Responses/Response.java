package Responses;

import java.time.LocalDate;

public class Response {

    //Return'ler Response Tipindedir.
    public String code;
    private String date;

    public Response(String code, String date) {
        this.code = code;
        this.date = LocalDate.now().toString();
    }

    // Dışarıdan işlemleri Getter ve Setter'lar üzerinden yapıyoruz
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
