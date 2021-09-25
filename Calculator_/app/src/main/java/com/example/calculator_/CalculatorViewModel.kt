package com.example.calculator_
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder
import kotlin.math.*

class CalculatorViewModel : ViewModel(){
    enum class Mode {BASIC, SCIENTIFIC}
    val message: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val messageForMemory: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val messageForFragment: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val messageChangeMode: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }

    var result: String
    private var mathOp: Double
    var mode: Mode
    var y: String
    var yFlag: Boolean

    init {
        result = ""
        mathOp = 0.0
        mode = Mode.BASIC
        y = ""
        yFlag = false
    }

    fun evaluate(){
        result = try {
            val expression = ExpressionBuilder(result).build()
            val res = expression.evaluate()

            val longRes = res.toLong()
            if (res == longRes.toDouble()) {
                longRes.toString()
            } else {
                res.toString()
            }
        } catch (e: java.lang.Exception) {
            Log.d("Ошибка", "Ошибка: ${e.message}")
            "Error:${e.message}"
        }
    }



    fun applyFunction(function: String)
    {
        result = if(message.value == null) "0"
        else message.value.toString()
        evaluate()
        mathOp = result.toDouble()
        when(function) {
            "log10" -> if (mathOp > 0) mathOp = log10(mathOp)
            "ln"->  if (mathOp > 0) mathOp = ln(mathOp)
            "eˣ" ->  mathOp = exp(mathOp)
            "sin" ->  mathOp = sin(mathOp)
            "cos" ->  mathOp = cos(mathOp)
            "tan" ->  mathOp = tan(mathOp)
            "ctg" ->  mathOp = 1/tan(mathOp)
            "√" ->  mathOp = sqrt(mathOp)
            "backward" ->  if (mathOp != 0.0) mathOp = 1/mathOp
            "x²" -> mathOp *= mathOp
            "xʸ" -> mathOp = mathOp.pow(y.toDouble())
            "module" ->  mathOp = abs(mathOp)
            "reminder" -> mathOp /= 100
            "π" -> mathOp = PI
            "e" -> mathOp = E
        }
        result = mathOp.toString()
    }

    fun fact(){
        result = message.value.toString()
        evaluate()
        mathOp = result.toDouble()
        var factorial: Long = 1
        for(i in 1..mathOp.toInt()){
            factorial *= i.toLong()
        }
        result = factorial.toString()
    }

    fun changeMode(){
        mode = when (mode) {
            Mode.BASIC -> Mode.SCIENTIFIC
            else -> Mode.BASIC
        }
    }

    /*override fun toString(): String {
        val temp = result.split('.')
        if(temp[1] == "0") {
            return temp[0]
        }
        else if(temp[1].length > 7)
        {
            return "%.3f".format(result)
        }
        else return result
    }*/

}