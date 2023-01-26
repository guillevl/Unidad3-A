package com.example.ejerciciou2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso
import java.io.Serializable

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Picasso.get().load("https://i.blogs.es/66b2a4/photo-1511367461989-f85a21fda167/1366_2000.jpeg").into(
            view?.findViewById<ImageView>(R.id.imgPerfil))
        val nombre = arguments?.getString("datos")
        view.findViewById<TextView>(R.id.textoCorreo).text = "jorgeCremdes@gmail.com"
        view.findViewById<TextView>(R.id.textoNombre).text = "Jorge"
        view.findViewById<TextView>(R.id.textoApellido).text = "Cremades"
        view.findViewById<TextView>(R.id.textofechaNacimineto).text = "20-02-1990"

    }
}