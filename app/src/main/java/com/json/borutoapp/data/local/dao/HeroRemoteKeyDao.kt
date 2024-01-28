package com.json.borutoapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.json.borutoapp.domain.model.HeroRemoteKey

@Dao
interface HeroRemoteKeyDao {

    @Query("select * from hero_remote_key_table where id = :heroId")
    suspend fun getRemoteKey(heroId: Int): HeroRemoteKey?


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<HeroRemoteKey>)

    @Query("delete from hero_remote_key_table")
    suspend fun deleteAllRemoteKeys()
}