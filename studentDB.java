package com.example.sqlite;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;
public class StudentDB extends SQLiteOpenHelper {
 public StudentDB(@Nullable Context context, @Nullable String name, @Nullable String 
usn, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
 super(context, name, factory, version);
 }
 @Override
 public void onCreate(SQLiteDatabase sqLiteDatabase) {
 sqLiteDatabase.execSQL("create table student (USN TEXT,NAME TEXT,DEPARTMENT 
TEXT)");
 }
 @Override
 public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
 } }
