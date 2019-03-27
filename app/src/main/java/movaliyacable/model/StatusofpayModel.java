package movaliyacable.model;

public class StatusofpayModel {

  public String id;
    public String customername;
    public String address;
    public String mobilenumber,boxnumber;

    public StatusofpayModel(String customername, String address, String mobilenumber, String boxnumber) {
        this.customername = customername;
        this.address = address;
        this.mobilenumber = mobilenumber;
        this.boxnumber = boxnumber;
    }
}
