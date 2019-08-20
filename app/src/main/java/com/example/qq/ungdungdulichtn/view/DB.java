package com.example.qq.ungdungdulichtn.view;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.qq.ungdungdulichtn.model.data_map;

import java.util.ArrayList;
import java.util.List;

public class DB extends SQLiteOpenHelper {
    private static final String DB_NAME="dl";
    private final String DB_TABLE="dulich";
    private static final String CREATE_HOME = "CREATE TABLE dulich(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , name TEXT DEFAULT 'null' , noidung TEXT , x REAL , y REAL,img TEXT )";
    private static int dbVersion=1;
    private SQLiteDatabase db;
    public DB(Context context){
        super(context,DB_NAME,null,dbVersion);
    }
    @Override

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_HOME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        if(newVersion > oldVersion){
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DB_TABLE);
            onCreate(sqLiteDatabase);
        }
    }
    public List<data_map> getall(){
        SQLiteDatabase db = getWritableDatabase();
        List<data_map> data= new ArrayList<>();
        String sql="SELECT * FROM dulich";
        Cursor cursor = getReadableDatabase().rawQuery(sql,null);
        if(cursor != null && cursor.moveToFirst()){
            do {
                data.add(new data_map(cursor.getString(1),cursor.getString(2),cursor.getString(5),cursor.getDouble(3),cursor.getDouble(4)));
            }while (cursor.moveToNext());
        }
        cursor.close();
        this.close();
        return data;
    }
    public void insertDD(String name, String noidung, String img, double x, double y) {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues value = new ContentValues();
        value.put("name", name);
        value.put("noidung", noidung);
        value.put("img", img);
        value.put("x", x);
        value.put("y", y);

        db.insert("dulich", null, value);
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
    public void open(){db=getWritableDatabase();}
    public void close(){
        if(db !=null&&db.isOpen()){
            db.close();
        }
    }
    protected void finalize() throws Throwable{
        this.close();
        super.finalize();
    }
}
