package com.hbtrinside.hbtrinside.model.ResultObjects;

import com.hbtrinside.hbtrinside.model.ParameterObjects.sonuc;
import com.hbtrinside.hbtrinside.model.gen_personel;

/**
 * Created by DoGan on 11.01.2017.
 */

public class PersonelBilgisiGetirResultParameter {
    public gen_personel[] PersonelBilgi;
    public sonuc Sonuc;

    public gen_personel[] getPersonelBilgi() {
        return PersonelBilgi;
    }

    public void setPersonelBilgi(gen_personel[] personelBilgi) {
        PersonelBilgi = personelBilgi;
    }

    public sonuc getSonuc() {
        return Sonuc;
    }

    public void setSonuc(sonuc sonuc) {
        Sonuc = sonuc;
    }
}
