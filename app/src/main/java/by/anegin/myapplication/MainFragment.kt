package by.anegin.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.anegin.myapplication.R

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity?.title = "Main screen"
    }

}