//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entity;

public class customer {
    private String cname;
    private int cid;
    private int cage;
    private long cphno;
    private String cemail;
    private double cAmt;
    private CustomerAddress caddress;

    public customer(String cname, int cid, int cage, long cphno, String cemail, CustomerAddress caddress) {
        this.cname = cname;
        this.cid = cid;
        this.cage = cage;
        this.cphno = cphno;
        this.cemail = cemail;
        this.caddress = caddress;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return this.cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCage() {
        return this.cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    public long getCphno() {
        return this.cphno;
    }

    public void setCphno(long cphno) {
        this.cphno = cphno;
    }

    public String getCemail() {
        return this.cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public CustomerAddress getCaddress() {
        return this.caddress;
    }

    public void setCaddress(CustomerAddress caddress) {
        this.caddress = caddress;
    }

    public double getcAmt() {
        return this.cAmt;
    }

    public void setcAmt(double cAmt) {
        this.cAmt = cAmt;
    }

    public String toString() {
        String var10000 = this.cname;
        return "customer{cname='" + var10000 + "', cid=" + this.cid + ", cage=" + this.cage + ", cphno=" + this.cphno + ", cemail='" + this.cemail + "', caddress=" + String.valueOf(this.caddress) + "}";
    }
}
