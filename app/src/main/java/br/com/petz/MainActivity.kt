package br.com.petz

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        Toast.makeText(context, "Marinho", Toast.LENGTH_LONG).show()

        Timber.i("Marinho")

    }
}
