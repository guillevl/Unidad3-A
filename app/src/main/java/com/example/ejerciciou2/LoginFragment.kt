package com.example.ejerciciou2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.ejerciciou2.databinding.FragmentLoginBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class LoginFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.findViewById<BottomNavigationView>(R.id.bottom_navigation_view)?.isVisible = false

        view.findViewById<Button>(R.id.btIrHome).setOnClickListener {
            var correo = view.findViewById<EditText>(R.id.txtCorreoLogIn).text
            if (correo.toString()==""||( view.findViewById<EditText>(R.id.txtContraseñaLogIn).text.toString())==""){
                view.findViewById<TextView>(R.id.txtError).text = "RELLENE TODOS LOS CAMPOS"
            }else {
                activity?.supportFragmentManager?.beginTransaction()
                    ?.replace(R.id.nav_host_fragment, HomeFragment())?.commit()
            }
        }
        view.findViewById<Button>(R.id.btIrRegistro).setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.nav_host_fragment,RegistroFragment())?.addToBackStack(null)?.commit()
        }
    }

    override fun onStop() {
        super.onStop()
        activity?.findViewById<BottomNavigationView>(R.id.bottom_navigation_view)?.isVisible = true

    }
}