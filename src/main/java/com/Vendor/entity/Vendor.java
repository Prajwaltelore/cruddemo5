package com.Vendor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vendor {

    @Id
    int VendorId;
    String VendorName;
    String Code;
    String Address;
    String City;
    String state;
    String Phone;
    String Pincode;
    String EmailAddress;

    public int getVendorId() {
        return VendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public String getCode() {
        return Code;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return Phone;
    }

    public String getPincode() {
        return Pincode;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setVendorId(int vendorId) {
        VendorId = vendorId;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public void setCode(String code) {
        Code = code;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }
}
