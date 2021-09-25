package com.example.calculator_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.calculator_.databinding.FragmentScientificOperations2Binding

class ScientificOperationsFragment : Fragment() {
    private lateinit var binding: FragmentScientificOperations2Binding
    private val viewModel: CalculatorViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScientificOperations2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnLog.setOnClickListener {
            inputOperations("log10")
        }
        binding.btnLn.setOnClickListener {
            inputOperations("ln")
        }
        binding.btnSin.setOnClickListener {
            inputOperations("sin")
        }
        binding.btnCos.setOnClickListener {
            inputOperations("cos")
        }
        binding.btnCtg.setOnClickListener {
            inputOperations("ctg")
        }
        binding.btnTan.setOnClickListener {
            inputOperations("tan")
        }
        binding.btnSqrt.setOnClickListener {
            inputOperations("√")
        }
        binding.btnBackword.setOnClickListener {
            inputOperations("backward")
        }
        binding.btnX2.setOnClickListener {
            inputOperations("x²")
        }
        binding.btnXY.setOnClickListener {
            viewModel.result = viewModel.message.value.toString()
            viewModel.evaluate()
            viewModel.message.value = "(" + viewModel.result + ")^"
            viewModel.yFlag = true
        }
        binding.btnLBr.setOnClickListener {
            if(viewModel.message.value == null) {
                viewModel.message.value = ""
                viewModel.message.value += "("
            }
            else if (viewModel.message.value.toString().endsWith("+") or
                        viewModel.message.value.toString().endsWith("-") or
                        viewModel.message.value.toString().endsWith("*") or
                        viewModel.message.value.toString().endsWith("/") or
                        viewModel.message.value.toString().endsWith("%"))
                        {
                viewModel.message.value += "("
            }
        }
        binding.btnRBr.setOnClickListener {
            if(viewModel.message.value == null) {
                viewModel.message.value = ""
                viewModel.message.value += ")"
            }
            else if (!(viewModel.message.value.toString().endsWith("+") or
                        viewModel.message.value.toString().endsWith("-") or
                        viewModel.message.value.toString().endsWith("*") or
                        viewModel.message.value.toString().endsWith("/") or
                        viewModel.message.value.toString().endsWith("%")))
                        {
                viewModel.message.value += ")"
            }
        }
        binding.btnReturnTo.setOnClickListener {
            viewModel.changeMode()
            viewModel.messageChangeMode.value = CalculatorViewModel.Mode.BASIC.toString()
        }
        binding.btnModule.setOnClickListener {
            inputOperations("module")
        }
        binding.btnExp.setOnClickListener {
            inputOperations("eˣ")
        }
        binding.btnFact.setOnClickListener {
            if(viewModel.message.value == null) viewModel.message.value = "0"
            viewModel.messageForMemory.value = viewModel.message.value + "!"
            viewModel.fact()
            viewModel.message.value = viewModel.result
        }
        binding.btnPi.setOnClickListener {
            if((viewModel.message.value != null) and
                (viewModel.message.value.toString().endsWith("+") or
                        viewModel.message.value.toString().endsWith("-") or
                        viewModel.message.value.toString().endsWith("*") or
                        viewModel.message.value.toString().endsWith("/") or
                        viewModel.message.value.toString().endsWith("%")))
                        {
                viewModel.message.value = viewModel.message.value.toString() + "π"
            }
            else if (viewModel.message.value == null){
                viewModel.message.value = "π"
            }

        }
        binding.btnE.setOnClickListener {
            if((viewModel.message.value != null) and
                (viewModel.message.value.toString().endsWith("+") or
                        viewModel.message.value.toString().endsWith("-") or
                        viewModel.message.value.toString().endsWith("*") or
                        viewModel.message.value.toString().endsWith("/") or
                        viewModel.message.value.toString().endsWith("%"))){
                viewModel.message.value = viewModel.message.value.toString() + "E"
            }
            else if (viewModel.message.value == null) {
                viewModel.message.value = "E"
            }

        }
        binding.btnEq.setOnClickListener {
            if(viewModel.message.value != null) {
                if(viewModel.yFlag){
                    viewModel.applyFunction("x_y")
                    viewModel.yFlag = false
                    viewModel.y = ""
                }
                viewModel.messageForMemory.value = viewModel.message.value
                evaluate(viewModel.message.value.toString())
                viewModel.message.value = viewModel.result
            }
        }
    }

    private fun inputOperations(str: String){
        try{
            if((viewModel.message.value != "Infinity") and
                !((viewModel.message.value?.startsWith("("))!! or
                        (viewModel.message.value.toString() == "-(")or
                        (viewModel.message.value.toString() == "-"))
            ){
                if(viewModel.message.value != null){
                    viewModel.applyFunction(str)
                    viewModel.messageForMemory.value = str + "(" + viewModel.message.value + ")"
                    viewModel.message.value = viewModel.result
                }

                else if(str != ("backward")){
                    viewModel.message.value = "0"
                    viewModel.applyFunction(str)
                    viewModel.messageForMemory.value = str + "(" + viewModel.message.value + ")"
                    viewModel.message.value = viewModel.result
                }
            }
        }catch (e:Exception){
            viewModel.message.value = e.message
        }


    }

    companion object {

        @JvmStatic
        fun newInstance() = ScientificOperationsFragment()
    }
    private fun evaluate(str: String) {
        viewModel.result = str
        viewModel.evaluate()
    }
}