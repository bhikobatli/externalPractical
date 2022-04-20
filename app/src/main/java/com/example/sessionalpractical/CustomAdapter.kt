package com.example.sessionalpractical

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class CustomAdapter(
    var allstudents: AllStudents,
    var rno: ArrayList<String>,
    var name: ArrayList<String>
):BaseAdapter() {
    override fun getCount(): Int {
       return rno.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var inview = LayoutInflater.from(allstudents).inflate(R.layout.listitems,p2, false)
        var rn = inview.findViewById<TextView>(R.id.tvrnolist)
        var nm = inview.findViewById<TextView>(R.id.tvnamelist)
            rn.text = rno[p0]
            nm.text = name[p0]
        return inview
    }

}
