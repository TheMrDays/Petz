package br.com.petz.di.module

import android.content.Context
import br.com.petz.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(
    private val context: Context
) {

    @Singleton
    @Provides
    fun provideContext() = context

    @Singleton
    @Provides
    fun provideRequestOptions() = RequestOptions
        .placeholderOf(R.drawable.not_found)
        .error(R.drawable.not_found)

    @Singleton
    @Provides
    fun provideGlide(requestOptions: RequestOptions) =
        Glide
            .with(context)
            .setDefaultRequestOptions(requestOptions)

}
