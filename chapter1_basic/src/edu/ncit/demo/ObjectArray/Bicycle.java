package edu.ncit.demo.ObjectArray;

import java.util.Date;

public class Bicycle {
    private String handleSize;
    private String cycleOwnwer;
    private String ringSize;
    private String cycleVendor;
    private Date manufacturateDate;

    public Bicycle(String handleSize, //prameteraized constructor
                   String cycleOwnwer,
                   String ringSize,
                   String cycleVendor,
                   Date manufacturateDate) {
        this.handleSize = handleSize;
        this.cycleOwnwer = cycleOwnwer;
        this.ringSize = ringSize;
        this.cycleVendor = cycleVendor;
        this.manufacturateDate = manufacturateDate;
    }

    public Bicycle(){ //empty constructor
        this.handleSize = "";
        this.cycleOwnwer = "";
        this.ringSize = "";
        this.cycleVendor = "";
        this.manufacturateDate = new Date();
    }


    public Date getManufacturateDate() {
        return manufacturateDate;
    }

    public void setManufacturateDate(Date manufacturateDate) {
        this.manufacturateDate = manufacturateDate;
    }



    public String getHandleSize() {
        return handleSize;
    }

    public void setHandleSize(String handleSize) {
        this.handleSize = handleSize;
    }

    public String getCycleOwnwer() {
        return cycleOwnwer;
    }

    public void setCycleOwnwer(String cycleOwnwer) {
        this.cycleOwnwer = cycleOwnwer;
    }

    public String getRingSize() {
        return ringSize;
    }

    public void setRingSize(String ringSize) {
        this.ringSize = ringSize;
    }

    public String getCycleVendor() {
        return cycleVendor;
    }

    public void setCycleVendor(String cycleVendor) {
        this.cycleVendor = cycleVendor;
    }





}

