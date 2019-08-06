package sg.edu.rp.c346.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var value = ""
    var value1 = ""
    var total = 0.0
    var operator = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        val btnSelected = view as Button

        if(output.text.toString() == "0") {

            output.text = ""

            when(btnSelected.id){
                btn0.id -> output.text = output.text.toString() + "0"
                btn1.id -> output.text = output.text.toString() + "1"
                btn2.id -> output.text = output.text.toString() + "2"
                btn3.id -> output.text = output.text.toString() + "3"
                btn4.id -> output.text = output.text.toString() + "4"
                btn5.id -> output.text = output.text.toString() + "5"
                btn6.id -> output.text = output.text.toString() + "6"
                btn7.id -> output.text = output.text.toString() + "7"
                btn8.id -> output.text = output.text.toString() + "8"
                btn9.id -> output.text = output.text.toString() + "9"
                btnDecimal.id -> output.text = output.text.toString() + "."
            }

            Toast.makeText(this, output.text, Toast.LENGTH_SHORT).show()
            value = output.text.toString()
        } else {
            when(btnSelected.id){
                btn0.id -> output.text = output.text.toString() + "0"
                btn1.id -> output.text = output.text.toString() + "1"
                btn2.id -> output.text = output.text.toString() + "2"
                btn3.id -> output.text = output.text.toString() + "3"
                btn4.id -> output.text = output.text.toString() + "4"
                btn5.id -> output.text = output.text.toString() + "5"
                btn6.id -> output.text = output.text.toString() + "6"
                btn7.id -> output.text = output.text.toString() + "7"
                btn8.id -> output.text = output.text.toString() + "8"
                btn9.id -> output.text = output.text.toString() + "9"
                btnDecimal.id -> output.text = output.text.toString() + "."
            }
        }




    }

    fun btnOpOnClick(view: View) {
        value1 = output.text.toString()
        output.text = ""
        val btnSelected = view as Button
        when(btnSelected.id){
            btnDivide.id -> operator = "/"
            btnMultiply.id -> operator = "*"
            btnMinus.id -> operator = "-"
            btnPlus.id -> operator = "+"
            btnAc.id -> Reset()
        }
        Toast.makeText(this, operator, Toast.LENGTH_SHORT).show()
    }

    fun Reset() {
        output.text = "0"
    }

    fun btnEqualOnClick(view: View) {
        if(operator.equals("/")){
            total = value1.toDouble() / output.text.toString().toDouble()
        } else if (operator.equals("*")){
            total = value1.toDouble() * output.text.toString().toDouble()
        } else if (operator.equals("-")){
            total = value1.toDouble() - output.text.toString().toDouble()
        } else if (operator.equals("+")){
            total = value1.toDouble() + output.text.toString().toDouble()
        }
        output.text = total.toString()
    }



}
