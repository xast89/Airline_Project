package com.learning.analyzer.ScheduleChangeAnalizer;

/**
 * Created by Cyprian on 2017-02-09.
 */
public class Wrapper {

    private String adresat;
    private String tytul;
    private String tresclistu;

    public Wrapper(String adresat, String tytul, String tresclistu) {
        this.adresat = adresat;
        this.tytul = tytul;
        this.tresclistu = tresclistu;
    }

    public String getAdresat() {
        return adresat;
    }

    public void setAdresat(String adresat) {
        this.adresat = adresat;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getTresclistu() {
        return tresclistu;
    }

    public void setTresclistu(String tresclistu) {
        this.tresclistu = tresclistu;
    }
}
