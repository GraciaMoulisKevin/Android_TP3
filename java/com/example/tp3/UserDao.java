package com.example.tp3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getUsers();

    @Query("SELECT * FROM user WHERE surname LIKE :surname AND " +
            "name LIKE :name LIMIT 1")
    User findByName(String surname, String name);

    @Insert(onConflict = REPLACE)
    void insert(User user);

    @Delete
    void delete(User user);
}
