package com.example.fragmenttofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() ,Communicator{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmantA= FragmentA();
        supportFragmentManager.beginTransaction().replace(R.id.content_id,fragmantA).commit();
    }

    override fun passDataCom(edit_input: String)
    {
        val bundle=Bundle();
            bundle.putString("input_txt",edit_input);

        val transaction=this.supportFragmentManager.beginTransaction();
        val fragmentB=FragmentB();
        fragmentB.arguments=bundle;

        transaction.replace(R.id.content_id,fragmentB);
        transaction.addToBackStack(null);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
    }
}