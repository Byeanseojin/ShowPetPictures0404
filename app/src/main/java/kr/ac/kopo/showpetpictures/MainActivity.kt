package kr.ac.kopo.showpetpictures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var chechstart : CheckBox
    lateinit var  rg: RadioGroup
    lateinit var linearSub: LinearLayout
    lateinit var btnDone : Button
    lateinit var imgV : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chechstart = findViewById<CheckBox>(R.id.checkStart)
        rg = findViewById<RadioGroup>(R.id.rg)
        linearSub = findViewById<RadioGroup>(R.id.linearSub)
        btnDone = findViewById<Button>(R.id.btnDone)
        imgV = findViewById<ImageView>(R.id.imgV)

        linearSub.visibility = View.INVISIBLE

        chechstart.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                linearSub.visibility = View.VISIBLE
            }else{
                linearSub.visibility = View.INVISIBLE
            }
        }
        btnDone.setOnClickListener {
            when(rg.checkedRadioButtonId){
                R.id.radioPuppy -> imgV.setImageResource(R.drawable.puppy)
                R.id.radioKitty -> imgV.setImageResource(R.drawable.kitty)
                R.id.radioBunny -> imgV.setImageResource(R.drawable.bunny)
            }
        }
    }
}