package com.example.studentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Registerevent(view: View) {
        var getsname=findViewById<EditText>(R.id.sname)
        var getsroll=findViewById<EditText>(R.id.srollno)
        var getadmission=findViewById<EditText>(R.id.sadmission)
        var getcollege=findViewById<EditText>(R.id.scollege)
        var getpname=findViewById<EditText>(R.id.pname)
        var getpmail=findViewById<EditText>(R.id.pmail)
        var getmobile=findViewById<EditText>(R.id.pmob)
        var getusername=findViewById<EditText>(R.id.username)
        var getpassword=findViewById<EditText>(R.id.spassword)

        Toast.makeText(this,getsname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getsroll.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getadmission.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getcollege.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpmail.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getmobile.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getusername.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpassword.text.toString(),Toast.LENGTH_LONG).show()
    }
}