package com.tide.network.injection;

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.tide.spacex.network.BuildConfig
import com.tide.spacex.network.api.SpaceXApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    private const val BASE_URL = "https://api.spacexdata.com/v4/"

    private fun plainOkHttpBuilder(): OkHttpClient.Builder {
        val builder: OkHttpClient.Builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
                .setLevel(HttpLoggingInterceptor.Level.HEADERS)
            builder.addInterceptor(httpLoggingInterceptor)
        }
        return builder
    }

    @Provides
    @Singleton
    fun getOkHttpClient(): OkHttpClient {
        return plainOkHttpBuilder().build()
    }

    @Provides
    @Singleton
    fun getSpaceXAPI(retrofit: Retrofit): SpaceXApi {
        return retrofit.create(SpaceXApi::class.java)
    }

    @Provides
    @Singleton
    fun getRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun getSharedPreference(@ApplicationContext context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}