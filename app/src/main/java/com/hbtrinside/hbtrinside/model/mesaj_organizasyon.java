package com.hbtrinside.hbtrinside.model;

/**
 * Created by DoGan on 11.01.2017.
 */

public class mesaj_organizasyon {
    public int ID ;
    public int ORG_NO ;
    public int MESAJ_ID ;

    public gen_organizasyon gen_organizasyon ;
    public mesaj mesaj ;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getORG_NO() {
        return ORG_NO;
    }

    public void setORG_NO(int ORG_NO) {
        this.ORG_NO = ORG_NO;
    }

    public int getMESAJ_ID() {
        return MESAJ_ID;
    }

    public void setMESAJ_ID(int MESAJ_ID) {
        this.MESAJ_ID = MESAJ_ID;
    }

    public com.hbtrinside.hbtrinside.model.gen_organizasyon getGen_organizasyon() {
        return gen_organizasyon;
    }

    public void setGen_organizasyon(com.hbtrinside.hbtrinside.model.gen_organizasyon gen_organizasyon) {
        this.gen_organizasyon = gen_organizasyon;
    }

    public com.hbtrinside.hbtrinside.model.mesaj getMesaj() {
        return mesaj;
    }

    public void setMesaj(com.hbtrinside.hbtrinside.model.mesaj mesaj) {
        this.mesaj = mesaj;
    }

}
