package com.example.zg5_day2rikao.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insert(UserEntity userEntity);
    @Update
    void update(UserEntity userEntity);
    @Delete
    void delete(UserEntity userEntity);
    @Query("select * from UserEntity")
    List<UserEntity> quer();
}
