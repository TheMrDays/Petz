package br.com.petz.ui

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.petz.base.activity.BaseActivity
import br.com.petz.base.viewmodel.MainViewModelFactory
import br.com.petz.databinding.ActivityMainBinding
import br.com.petz.di.data.repository.DogRepositoryImpl
import com.bumptech.glide.RequestManager
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var context: Context

    @Inject
    lateinit var userRepository: DogRepositoryImpl

    @Inject
    lateinit var glide: RequestManager

    private val factory by lazy { MainViewModelFactory(userRepository) }

    lateinit var viewModel: MainActivityViewModel

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this, factory).get(MainActivityViewModel::class.java)
        lifecycle.addObserver(viewModel)

        viewModel.dogProfile.observe(this, Observer { dog ->

            glide
                .load(dog.image)
                .into(binding.imgDog)

            binding.dogName.text = dog.name
            binding.dogBreed.text = dog.breed
            binding.dogGenre.text = dog.genre
            binding.dogHumanParents.text = dog.humanParents
        })
    }
}
