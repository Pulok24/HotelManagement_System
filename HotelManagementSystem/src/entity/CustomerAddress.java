//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entity;

public class CustomerAddress {
    private int doorno;
    private String Street;
    private String dst;
    private String state;
    private String country;
    private int pincode;

    public CustomerAddress(int doorno, String street, String dst, String state, String country, int pincode) {
        this.doorno = doorno;
        this.Street = street;
        this.dst = dst;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public int getDoorno() {
        return this.doorno;
    }

    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }

    public String getStreet() {
        return this.Street;
    }

    public void setStreet(String street) {
        this.Street = street;
    }

    public String getDst() {
        return this.dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return this.pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String toString() {
        return "CustomerAddress{doorno=" + this.doorno + ", Street='" + this.Street + "', dst='" + this.dst + "', state='" + this.state + "', country='" + this.country + "', pincode=" + this.pincode + "}";
    }
}
