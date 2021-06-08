package by.anegin.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity?.title = "Login screen"

        view.findViewById<View>(R.id.buttonLogin).setOnClickListener {

            // do login and then go main screen

            findNavController().navigate(MainGraphDirections.toMainScreen())
        }
    }

}