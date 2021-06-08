package by.anegin.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class StartFragment : Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        if (isLoggedIn()) {
            findNavController().navigate(MainGraphDirections.toMainScreen())
        } else {
            findNavController().navigate(StartFragmentDirections.toLoginFlow())
        }

    }

    private fun isLoggedIn() = false

}