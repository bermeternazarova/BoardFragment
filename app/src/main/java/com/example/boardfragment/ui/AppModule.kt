package com.example.boardfragment.ui

import android.content.Context
import com.example.boardfragment.utils.Preference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun providePrefs(@ApplicationContext context: Context):Preference{
        return Preference(context)
    }
}