package com.example.navigationsample.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigationsample.R
import com.example.navigationsample.databinding.FragmentJokeBinding
import com.example.navigationsample.datasource.viewmodel.ChuckJokeViewModel
import com.example.navigationsample.ui.control.JokeEntityAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class JokeFragment : Fragment() {

    lateinit var viewModel : ChuckJokeViewModel

    lateinit var jokeListAdapter : JokeEntityAdapter
    lateinit var binding: FragmentJokeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this)[ChuckJokeViewModel::class.java]
        return inflater.inflate(R.layout.fragment_joke, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentJokeBinding.bind(view)

        jokeListAdapter = JokeEntityAdapter()
        binding.apply {
            listJoke.apply {
                adapter = jokeListAdapter
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
            }
        }

        makeCallData()
        binding.btnJokes.setOnClickListener(View.OnClickListener {
            viewModel.getChurcsJoke()
        })
    }

    fun makeCallData() {
        viewModel.observeAllJokes().observe(viewLifecycleOwner, Observer {
            if (it != null ) {

                jokeListAdapter.setItems(ArrayList(it))
//                jokeListAdapter.notifyDataSetChanged()
                binding.progress.visibility = View.GONE
            } else {
                binding.progress.visibility = View.VISIBLE
            }
        })
    }
}