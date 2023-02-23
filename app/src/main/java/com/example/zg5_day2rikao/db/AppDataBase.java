package com.example.zg5_day2rikao.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserEntity.class},version = 1,exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    public abstract UserDao userDao();


}
