package com.example.taiki.itudaregame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.bindView
import java.util.*

class MainActivity : AppCompatActivity() {
    val itu: TextView by bindView(R.id.textView2)
    val dokode : TextView by bindView(R.id.textView4)
    val darega : TextView by bindView(R.id.textView6)
    val nanishita : TextView by bindView(R.id.textView8)
    var number = 0

    val ituAraay = arrayListOf("一年前","一週間前","昨日","一ヶ月前")
    val dokodeArray = arrayListOf("山の上で","アメリカで","学校で","クラスで")
    val daregaArray = arrayListOf("僕が","大統領が","先生が","友達が")
    val nanishitaArray = arrayListOf("叫んだ","演説した","怒った","踊った")

    val change : Button by bindView(R.id.button)
    val reset : Button by bindView(R.id.button2)
    val random : Button by bindView(R.id.button3)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        change.setOnClickListener{
            itu.setText(ituAraay[number])
            dokode.setText(dokodeArray[number])
            darega.setText(daregaArray[number])
            nanishita.setText(nanishitaArray[number])
            number++
            if(number>3){
                number=0
            }
        }
        reset.setOnClickListener {
            itu.setText("...")
            dokode.setText("...")
            darega.setText("...")
            nanishita.setText("...")
            number=0
        }
        random.setOnClickListener({
            var ituNumber = Random().nextInt(4)
            var dokodeNumber = Random().nextInt(4)
            var daragaNumber = Random().nextInt(4)
            var nanishitaNumber = Random().nextInt(4)
            print(ituNumber)
            print(dokodeNumber)
            print(daragaNumber)
            print(nanishitaNumber)
            itu.setText(ituAraay[ituNumber])
            dokode.setText(dokodeArray[dokodeNumber])
            darega.setText(daregaArray[daragaNumber])
            nanishita.setText(nanishitaArray[nanishitaNumber])


        })
    }

}
