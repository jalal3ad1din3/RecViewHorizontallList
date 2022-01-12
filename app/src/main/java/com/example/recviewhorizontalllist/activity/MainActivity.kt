package com.example.recviewhorizontalllist.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recviewhorizontalllist.R
import com.example.recviewhorizontalllist.adapter.CustomAdapter
import com.example.recviewhorizontalllist.modul.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         initView()
         val member = prepareMemberList()
        refreshAdapter(member)

    }
    @SuppressLint("WrongConstant")
    private fun initView(){
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)
    }
   fun refreshAdapter(member: List<Member>){

         val adapter = CustomAdapter(member)
       recyclerView.adapter = adapter

    }
    fun prepareMemberList():List<Member>{
        val member = ArrayList<Member>()

        for (i in 0..6){
            member.add(Member("Laku"+i,"Rope"+i))
        }
    return member
    }
}