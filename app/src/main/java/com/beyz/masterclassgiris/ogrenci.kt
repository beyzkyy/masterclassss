package com.beyz.masterclassgiris

class ogrenci{
    var id:Int =0
    var adsoyad:String =""
    var okul:String=""
    var ders: String=""
    var dersgunleri: String=""
    var derssaatleri: String=""
    var sinif: String=""
    var telno:Int=0
    var velino:Int=0
    var mail:String=""
    var tarih:Int=0

    constructor(adsoyad:String, okul:String ,ders:String , dersgunleri: String,derssaatleri:String,sinif:String,telno:Int,velino:Int, mail:String, tarih:Int) {
        this.adsoyad=adsoyad
        this.okul=okul
        this.ders=ders
        this.dersgunleri=dersgunleri
        this.derssaatleri=derssaatleri
        this.sinif=sinif
        this.telno=telno
        this.velino= velino
        this.mail=mail
        this.tarih=tarih
    }
    constructor(){

    }


}