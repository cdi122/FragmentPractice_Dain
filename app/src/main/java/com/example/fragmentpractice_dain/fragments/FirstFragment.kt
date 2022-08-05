package com.example.fragmentpractice_dain.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentpractice_dain.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment () {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        changeTextBtn.setOnClickListener {
            contentTxt.text = "안녕하세요"
        }
        toastBtn.setOnClickListener {
            Toast.makeText(context, "프래그먼트의 토스트", Toast.LENGTH_SHORT).show()
        }
    }
}