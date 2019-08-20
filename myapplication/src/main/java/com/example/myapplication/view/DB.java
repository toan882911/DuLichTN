package com.example.myapplication.view;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.myapplication.model.dataFood;
import com.example.myapplication.model.dataHotel;
import com.example.myapplication.model.data_map;


import java.util.ArrayList;
import java.util.List;

public class DB extends SQLiteOpenHelper {
    private static final String DB_NAME = "dl";
    private final String DB_TABLE = "dulich";
    private static final String CREATE_HOME = "CREATE TABLE dulich(madulich TEXT PRIMARY KEY  NOT NULL , tendulich TEXT DEFAULT 'null' , noidung TEXT ,noidung2 TEXT,anh TEXT,anh2 TEXT,anh3 TEXT, x REAL , y REAL)";
    private static final String CREATE_HOT = "CREATE TABLE dulich_hot(id INTEGER PRIMARY KEY  NOT NULL, name TEXT DEFAULT 'null' , noidung TEXT ,noidung2 TEXT, x REAL , y REAL,img TEXT,img2 TEXT,img3 TEXT)";
    private static final String CREATE_HOTEL = "CREATE TABLE hotel(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, anh TEXT , tenkhachsan TEXT ,diachi TEXT,madulich TEXT DEFAULT 'null')";
    private static final String CREATE_FOOD = "CREATE TABLE monan(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , tenmonan TEXT DEFAULT 'null' , noidung TEXT ,noidung2 TEXT,anh TEXT,anh2 TEXT,anh3 TEXT,madulich TEXT DEFAULT 'null')";


    private static int dbVersion = 1;
    private SQLiteDatabase db;

    public DB(Context context) {
        super(context, DB_NAME, null, dbVersion);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_HOT);
        sqLiteDatabase.execSQL(CREATE_HOME);
        sqLiteDatabase.execSQL(CREATE_HOTEL);
        sqLiteDatabase.execSQL(CREATE_FOOD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        if (newVersion > oldVersion) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + "dulich");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + "dulich_hot");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + "hotel");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + "monan");
            onCreate(sqLiteDatabase);
        }
    }

    public List<data_map> getall() {
        SQLiteDatabase db = getWritableDatabase();
        List<data_map> data = new ArrayList<>();
        String sql = "SELECT * FROM dulich";
        Cursor cursor = getReadableDatabase().rawQuery(sql, null);
        if (cursor != null && cursor.moveToFirst()) {
            do {
                data.add(new data_map(cursor.getString(0), cursor.getString(1), cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getDouble(7),cursor.getDouble(8)));
            } while (cursor.moveToNext());
        }
        cursor.close();
        this.close();
        return data;
    }

    public List<data_map> getAllHot() {
        SQLiteDatabase db = getWritableDatabase();
        List<data_map> data = new ArrayList<>();
        String sql = "SELECT * FROM dulich_hot";
        Cursor cursor = getReadableDatabase().rawQuery(sql, null);
        if (cursor != null && cursor.moveToFirst()) {
            do {
                data.add(new data_map(cursor.getString(1), cursor.getString(2), cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getDouble(8),cursor.getDouble(9)));
            } while (cursor.moveToNext());
        }
        cursor.close();
        this.close();
        return data;
    }
    public List<dataHotel> getHotel() {
        SQLiteDatabase db = getWritableDatabase();
        List<dataHotel> data = new ArrayList<>();
        String sql = "SELECT * FROM hotel";
        Cursor cursor = getReadableDatabase().rawQuery(sql, null);
        if (cursor != null && cursor.moveToFirst()) {
            do {
                data.add(new dataHotel(cursor.getString(1), cursor.getString(2), cursor.getString(3),cursor.getString(4)));
            } while (cursor.moveToNext());
        }
        cursor.close();
        this.close();
        return data;
    }
    public List<dataFood> getFood() {
        SQLiteDatabase db = getWritableDatabase();
        List<dataFood> data = new ArrayList<>();
        String sql = "SELECT * FROM monan";
        Cursor cursor = getReadableDatabase().rawQuery(sql, null);
        if (cursor != null && cursor.moveToFirst()) {
            do {
                data.add(new dataFood(cursor.getString(1), cursor.getString(2), cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7)));
            } while (cursor.moveToNext());
        }
        cursor.close();
        this.close();
        return data;
    }
    public void insertDD(String madulich,String tendulich, String noidung, String noidung2, String anh, String anh2, String anh3, double x, double y) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues value = new ContentValues();
        value.put("madulich", madulich);
        value.put("tendulich", tendulich);
        value.put("noidung", noidung);
        value.put("noidung2", noidung2);
        value.put("anh", anh);
        value.put("anh2", anh2);
        value.put("anh3", anh3);
        value.put("x", x);
        value.put("y", y);

        db.insert("dulich", null, value);
        this.close();
    }

    public void insertDDHot(String name, String noidung, String noidung2, String img, String img2, String img3, double x, double y) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues value = new ContentValues();
        value.put("name", name);
        value.put("noidung", noidung);
        value.put("noidung2", noidung2);
        value.put("img", img);
        value.put("img2", img2);
        value.put("img3", img3);
        value.put("x", x);
        value.put("y", y);

        db.insert("dulich_hot", null, value);
        this.close();
    }
    public void insertHT(String img, String tenkhachsan, String address,String madulich) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues value = new ContentValues();
        value.put("anh", img);
        value.put("tenkhachsan", tenkhachsan);
        value.put("diachi", address);
        value.put("madulich", madulich);
        db.insert("hotel", null, value);
        this.close();
    }
    public void insertFD(String tenmonan, String noidung, String noidung2, String img, String img2, String img3,String madulich) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues value = new ContentValues();
        value.put("tenmonan", tenmonan);
        value.put("noidung", noidung);
        value.put("noidung2", noidung2);
        value.put("anh", img);
        value.put("anh2", img2);
        value.put("anh3", img3);
        value.put("madulich", madulich);
        db.insert("monan", null, value);
        this.close();
    }
    public int checkCount() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db
                .query(DB_TABLE, null, null, null, null, null, null);
        if (cursor != null)
            return cursor.getCount();
        cursor.close();
        return 0;
    }

    public int checkCountHot() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db
                .query("dulich_hot", null, null, null, null, null, null);
        if (cursor != null)
            return cursor.getCount();
        cursor.close();
        return 0;
    }
    public int checkCountHotel() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db
                .query("hotel", null, null, null, null, null, null);
        if (cursor != null)
            return cursor.getCount();
        cursor.close();
        return 0;
    }
    public int checkCountFood() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db
                .query("monan", null, null, null, null, null, null);
        if (cursor != null)
            return cursor.getCount();
        cursor.close();
        return 0;
    }
    public void open() {
        db = getWritableDatabase();
    }

    public void close() {
        if (db != null && db.isOpen()) {
            db.close();
        }
    }

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }
}
