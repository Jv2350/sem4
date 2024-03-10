package com.example.database;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "user_data.db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_USERS = "users";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_EMAIL = "email";
    private static final String TABLE_CREATE = "CREATE TABLE " + TABLE_USERS + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_NAME + " TEXT, " + COLUMN_EMAIL + "    TEXT);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int
            newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }
    public long insertUser(String name, String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, name);
        values.put(COLUMN_EMAIL, email);
        long userId = db.insert(TABLE_USERS, null, values);
        db.close();
        return userId;
    }
    @SuppressLint("Range")
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_USERS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor != null && cursor.moveToFirst()) {
            do {
                User user = new User();
                user.setId(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)));
                user.setName(cursor.getString(cursor.getColumnIndex(COLUMN_NAME)));
                user.setEmail(cursor.getString(cursor.getColumnIndex(COLUMN_EMAIL)));
                users.add(user);
            } while (cursor.moveToNext());
            cursor.close();
        }
        db.close();
        return users;
    }
    @SuppressLint("Range")
    public User getUserById(long userId) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                TABLE_USERS,
                new String[]{COLUMN_ID, COLUMN_NAME, COLUMN_EMAIL},
                COLUMN_ID + "=?",
                new String[]{String.valueOf(userId)},
                null,
                null,

                null,
                null
        );
        User user = null;
        if (cursor != null && cursor.moveToFirst()) {
            user = new User();
            user.setId(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)));
            user.setName(cursor.getString(cursor.getColumnIndex(COLUMN_NAME)));
            user.setEmail(cursor.getString(cursor.getColumnIndex(COLUMN_EMAIL)));
            cursor.close();
        }
        db.close();
        return user;
    }
}