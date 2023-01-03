package com.beyz.masterclassgiris

class dilekvesikayet {
    var id:Int =0
    var adsoyad:String =""
    var mail:String=""
    var telno:Int=0
    var konu: String=""
    var sikayet: String=""

    constructor(adsoyad:String, konu: String,sikayet:String,telno:Int, mail:String) {
        this.adsoyad=adsoyad
        this.konu=konu
        this.sikayet=sikayet
        this.telno=telno
        this.mail=mail

    }
    constructor(){

    }


}