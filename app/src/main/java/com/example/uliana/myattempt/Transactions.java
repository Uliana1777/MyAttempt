package com.example.uliana.myattempt;

public class Transactions {
    private String title;
    private int sum;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Transactions(String title, int sum,String date) {
        this.title = title;
        this.sum = sum;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSum() {
        return Integer.toString(sum);
    }

    public void setSum(int  sum) {
        this.sum = sum;
    }
}
