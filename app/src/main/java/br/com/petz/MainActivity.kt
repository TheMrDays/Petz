package br.com.petz

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.petz.databinding.ActivityMainBinding
import dagger.android.AndroidInjection
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var context: Context

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(binding.root)
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        lifecycle.addObserver(viewModel)

        viewModel.name.observe(this, Observer { name ->
            Toast.makeText(context, name, Toast.LENGTH_LONG).show()
            Timber.i(name)
            binding.txtTitle.text = name
        })



    }
}
