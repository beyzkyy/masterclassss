package com.beyz.masterclassgiris


class personel{
    var id:Int =0
    var adsoyad:String =""
    var okul:String=""
    var bolum:String=""
    var ders: String=""
    var telno:Int=0
    var mail:String=""
    var iban:Int=0
    var tarih:Int=0

    constructor(adsoyad:String, okul:String ,bolum:String , ders: String , telno :Int , mail:String,iban:Int, tarih:Int) {
        this.adsoyad=adsoyad
        this.okul=okul
        this.bolum=bolum
        this.ders=ders
        this.telno=telno
        this.mail=mail
        this.iban=iban
        this.tarih=tarih
    }
    constructor(){

    }

}