package com.example.recycleviewproject;

public class ItemData {
    private int id;
    private String fname;
    private String lname;
    private int mno;
   ItemData(int id,String fname,String lname,int mno){
       this.id=id;
       this.fname=fname;
       this.lname=lname;
       this.mno=mno;
   }
    public int getMno() {
        return mno;
    }

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public int getId() {
        return id;
    }
}
