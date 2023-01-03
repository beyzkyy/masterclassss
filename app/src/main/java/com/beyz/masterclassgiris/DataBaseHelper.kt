package com.beyz.masterclassgiris

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast


class DataBaseHelper (var context: Context):SQLiteOpenHelper(context,
    database_name,null,1) {

    companion object {
        private const val database_name = "Masterclass.db"
        private const val table_name = "personel"
        private const val sutun_id = "id"
        private const val sutun_name = "ad_soyad"
        private const val sutun_okul = "okul"
        private const val sutun_bolum = "bolum"
        private const val sutun_ders = "ders"
        private const val sutun_telno = "tel_no"
        private const val sutun_mail = "mail"
        private const val sutun_iban = "iban"
        private const val sutun_tarih = "tarih"

        private const val sutun_id2 = "id"
        private const val sutun_name2 = "ad_soyad"
        private const val sutun_okul2 = "okul"
        private const val sutun_ders2 = "ders"
        private const val table_name2 = "ogrenci"
        private const val sutun_dersgunleri = "dersgunleri"
        private const val sutun_derssaatleri = "derssaatleri"
        private const val sutun_sinif = "sinif"
        private const val sutun_velino = "veli_no"
        private const val sutun_telno2 = "tel_no"
        private const val sutun_mail2 = "mail"

        private const val sutun_tarih2 = "tarih"

        private const val table_name3 = "onay"

        private const val sutun_onay = "onay1"
        private const val sutun_onay2 = "onay2"
        private const val sutun_onay3 = "onay3"
        private const val sutun_onay4 = "onay4"

        private const val table_name4 = "dilekvesikayet"
        private const val sutun_konu = "konu"
        private const val sutun_sikayet = "sikayet"




    }

        override fun onCreate(db: SQLiteDatabase?) {
            val createTable = " CREATE TABLE "+ table_name + "("+
                    sutun_id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    sutun_name+" VARCHAR(256),"+
                    sutun_okul+" VARCHAR(256),"+
                    sutun_bolum+" VARCHAR(256),"+
                    sutun_ders+" VARCHAR(256),"+
                    sutun_telno+" INTEGER,"+
                    sutun_mail+" VARCHAR(256),"+
                    sutun_iban+" INTEGER,"+
                    sutun_tarih+" INTEGER)"
            val createTable2 = " CREATE TABLE " + table_name2 +"("+
                    sutun_id2+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    sutun_name2+" VARCHAR(256),"+
                    sutun_okul2+" VARCHAR(256),"+
                    sutun_ders2+" VARCHAR(256),"+
                    sutun_dersgunleri+" VARCHAR(256),"+
                    sutun_derssaatleri+" VARCHAR(256),"+
                    sutun_sinif +" VARCHAR(256),"+
                    sutun_telno2+" INTEGER,"+
                    sutun_velino+" INTEGER,"+
                    sutun_mail2+" VARCHAR(256),"+
                    sutun_tarih2+" INTEGER)"
             val createTable3 = " CREATE TABLE " + table_name3 +"("+
                    sutun_id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    sutun_onay+" BOOLEAN,"+
                    sutun_onay2+" BOOLEAN,"+
                    sutun_onay3+" BOOLEAN,"+
                    sutun_onay4+" BOOLEAN)"
            val createTable4 = " CREATE TABLE " + table_name4 +"("+
                    sutun_id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    sutun_name+" VARCHAR(256),"+
                    sutun_mail+" VARCHAR(256),"+
                    sutun_telno+" INTEGER,"+
                    sutun_konu+" VARCHAR(256),"+
                    sutun_sikayet+" VARCHAR(256))"


            db?.execSQL(createTable)
            db?.execSQL(createTable2)
            db?.execSQL(createTable3)
            db?.execSQL(createTable4)

        }


        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }



    fun insertData(personel: personel) {
        val db= this.writableDatabase
        val cv= ContentValues()
        cv.put(sutun_name,personel.adsoyad)
        cv.put(sutun_okul,personel. okul)
        cv.put(sutun_bolum,personel. bolum)
        cv.put(sutun_ders,personel.ders)
        cv.put(sutun_telno,personel.telno)
        cv.put(sutun_mail,personel.mail)
        cv.put(sutun_iban,personel.iban)
        cv.put(sutun_tarih,personel.tarih)

        val sonuc = db.insert(table_name, null, cv)
        if(sonuc==(-1).toLong()){
            Toast.makeText(context,"Hatali",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Basarili",Toast.LENGTH_LONG).show()
        }
        db.close()


    }

    fun insertData2(ogrenci: ogrenci){
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(sutun_name2, ogrenci.adsoyad)
        cv.put(sutun_okul2, ogrenci.okul)
        cv.put(sutun_ders2, ogrenci.ders)
        cv.put(sutun_dersgunleri, ogrenci.dersgunleri)
        cv.put(sutun_derssaatleri, ogrenci.derssaatleri)
        cv.put(sutun_sinif, ogrenci.sinif)
        cv.put(sutun_telno2, ogrenci.telno)
        cv.put(sutun_velino, ogrenci.velino)
        cv.put(sutun_mail2, ogrenci.mail)
        cv.put(sutun_tarih2, ogrenci.tarih)

        val sonuc = db.insert(table_name2,null,cv)
        if(sonuc==(-1).toLong()){
            Toast.makeText(context,"Hatali",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Basarili",Toast.LENGTH_LONG).show()
        }
        db.close()

    }

    fun insertData3(onay: onay) {
        val db= this.writableDatabase
        val cv= ContentValues()
        cv.put(sutun_onay,onay.onay1)
        cv.put(sutun_onay2,onay.onay2)
        cv.put(sutun_onay3,onay.onay3)
        cv.put(sutun_onay4,onay.onay4)


        val sonuc = db.insert(table_name3, null, cv)
        if(sonuc==(-1).toLong()){
            Toast.makeText(context,"Hatali",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Basarili",Toast.LENGTH_LONG).show()
        }
        db.close()


    }
    fun insertData4(dilekvesikayet: dilekvesikayet) {
        val db= this.writableDatabase
        val cv= ContentValues()
        cv.put(sutun_name,dilekvesikayet.adsoyad)
        cv.put(sutun_mail,dilekvesikayet.mail)
        cv.put(sutun_telno,dilekvesikayet.telno)
        cv.put(sutun_konu,dilekvesikayet.konu)
        cv.put(sutun_sikayet,dilekvesikayet.sikayet)

        val sonuc = db.insert(table_name4, null, cv)
        if(sonuc==(-1).toLong()){
            Toast.makeText(context,"Hatali",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Basarili",Toast.LENGTH_LONG).show()
        }
        db.close()


    }


    @SuppressLint("Range")
    fun readData(): ArrayList<personel> {
        val liste: ArrayList<personel> = ArrayList()
        val selectquery = "SELECT * FROM $table_name"
        val db = this.readableDatabase

        val sonuc: Cursor?

        try {
            sonuc = db.rawQuery(selectquery, null)

        } catch (e: Exception) {

            e.printStackTrace()
            db.execSQL(selectquery)
            return ArrayList()
        }

        if(sonuc.moveToFirst()){
            do{
                val personel=personel()
                personel.id=sonuc.getString(sonuc.getColumnIndex(sutun_id)).toInt()
                personel.adsoyad=sonuc.getString(sonuc.getColumnIndex(sutun_name))
                personel.okul=sonuc.getString(sonuc.getColumnIndex(sutun_okul))
                personel.ders=sonuc.getString(sonuc.getColumnIndex(sutun_ders))
                personel.bolum=sonuc.getString(sonuc.getColumnIndex(sutun_bolum))
                personel.telno=sonuc.getString(sonuc.getColumnIndex(sutun_telno)).toInt()
                personel.mail=sonuc.getString(sonuc.getColumnIndex(sutun_mail))
                personel.iban=sonuc.getString(sonuc.getColumnIndex(sutun_iban )).toInt()
                personel.tarih=sonuc.getString(sonuc.getColumnIndex(sutun_tarih )).toInt()
                liste.add(personel)

            }while (sonuc.moveToNext())
        }

        sonuc.close()
        db.close()
        return liste
    }

    @SuppressLint("Range")
    fun readData2(): ArrayList<ogrenci> {
        val liste: ArrayList<ogrenci> = ArrayList()
        val selectquery = "SELECT * FROM $table_name2"
        val db = this.readableDatabase

        val sonuc: Cursor?

        try {
            sonuc = db.rawQuery(selectquery, null)

        } catch (e: Exception) {

            e.printStackTrace()
            db.execSQL(selectquery)
            return ArrayList()
        }

        if(sonuc.moveToFirst()){
            do{
                val ogrenci=ogrenci()
                ogrenci.id=sonuc.getString(sonuc.getColumnIndex(sutun_id2)).toInt()
                ogrenci.adsoyad=sonuc.getString(sonuc.getColumnIndex(sutun_name2))
                ogrenci.ders=sonuc.getString(sonuc.getColumnIndex(sutun_ders2))
                ogrenci.okul=sonuc.getString(sonuc.getColumnIndex(sutun_okul2))
                ogrenci.dersgunleri= sonuc.getString(sonuc.getColumnIndex(sutun_dersgunleri))
                ogrenci.derssaatleri= sonuc.getString(sonuc.getColumnIndex(sutun_derssaatleri))
                ogrenci.sinif= sonuc.getString(sonuc.getColumnIndex(sutun_sinif))
                ogrenci.telno= sonuc.getString(sonuc.getColumnIndex(sutun_telno2)).toInt()
                ogrenci.velino= sonuc.getString(sonuc.getColumnIndex(sutun_velino)).toInt()
                ogrenci.mail=sonuc.getString(sonuc.getColumnIndex(sutun_mail2))
                ogrenci.tarih=sonuc.getString(sonuc.getColumnIndex(sutun_tarih2 )).toInt()
                liste.add(ogrenci)

            }while (sonuc.moveToNext())
        }

        sonuc.close()
        db.close()
        return liste
    }

   @SuppressLint("Range")
    fun readData3(): ArrayList<onay> {
        val liste: ArrayList<onay> = ArrayList()
        val selectquery = "SELECT * FROM $table_name3"
        val db = this.readableDatabase

        val sonuc: Cursor?

        try {
            sonuc = db.rawQuery(selectquery, null)

        } catch (e: Exception) {

            e.printStackTrace()
            db.execSQL(selectquery)
            return ArrayList()
        }

        if(sonuc.moveToFirst()){
            do{
                val onay =onay()
                onay.id=sonuc.getString(sonuc.getColumnIndex(sutun_id)).toInt()
                onay.onay1= sonuc.getString(sonuc.getColumnIndex(sutun_onay))
                onay.onay2= sonuc.getString(sonuc.getColumnIndex(sutun_onay2))
                onay.onay3= sonuc.getString(sonuc.getColumnIndex(sutun_onay3))
                onay.onay4= sonuc.getString(sonuc.getColumnIndex(sutun_onay4))

                liste.add(onay)

            }while (sonuc.moveToNext())
        }

        sonuc.close()
        db.close()
        return liste
    }
    @SuppressLint("Range")
    fun readData4(): ArrayList<dilekvesikayet> {
        val liste: ArrayList<dilekvesikayet> = ArrayList()
        val selectquery = "SELECT * FROM $table_name4"
        val db = this.readableDatabase

        val sonuc: Cursor?

        try {
            sonuc = db.rawQuery(selectquery, null)

        } catch (e: Exception) {

            e.printStackTrace()
            db.execSQL(selectquery)
            return ArrayList()
        }

        if(sonuc.moveToFirst()){
            do{
                val dilekvesikayet=dilekvesikayet()
                dilekvesikayet.id=sonuc.getString(sonuc.getColumnIndex(sutun_id)).toInt()
                dilekvesikayet.adsoyad=sonuc.getString(sonuc.getColumnIndex(sutun_name))
                dilekvesikayet.mail=sonuc.getString(sonuc.getColumnIndex(sutun_mail))
                dilekvesikayet.telno=sonuc.getString(sonuc.getColumnIndex(sutun_telno)).toInt()
                dilekvesikayet.konu=sonuc.getString(sonuc.getColumnIndex(sutun_konu ))
                dilekvesikayet.sikayet=sonuc.getString(sonuc.getColumnIndex(sutun_sikayet ))
                liste.add(dilekvesikayet)

            }while (sonuc.moveToNext())
        }

        sonuc.close()
        db.close()
        return liste
    }

}



