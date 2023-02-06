package com.example.boardfragment.di

import android.content.Context
import android.content.SharedPreferences
import com.example.boardfragment.ui.utils.Preference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providePrefs(@ApplicationContext context: Context): Preference {
        return Preference(context)
    }
}