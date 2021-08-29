package com.beyonda.githubbrowser.common.di

import android.content.Context
import androidx.room.Room
import com.beyonda.githubbrowser.common.data.cache.Cache
import com.beyonda.githubbrowser.common.data.cache.GitHubDatabase
import com.beyonda.githubbrowser.common.data.cache.RoomCache
import com.beyonda.githubbrowser.common.data.cache.dao.GitHubDao
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class CacheModule {

    @Binds
    abstract fun bindCache(cache: RoomCache): Cache

    companion object {

        @Provides
        @Singleton
        fun provideDatabase(
            @ApplicationContext context: Context
        ) : GitHubDatabase {
            return Room.databaseBuilder(
                context,
                GitHubDatabase::class.java,
                "github.db"
            )
                .build()
        }

        @Provides
        fun provideAnimalDao(
            gitHubDatabase: GitHubDatabase
        ) : GitHubDao = gitHubDatabase.gitHubDao()
    }
}