package com.example.calculator_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.calculator_.databinding.FragmentBaseOperationsBinding

class BaseOperationsFragment : Fragment(), View.OnClickListener {

    private lateinit var binding:   FragmentBaseOperationsBinding
    private val viewModel: CalculatorViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBaseOperationsBinding.inflate(inflater)
        viewModel.messageForFragment.observe(viewLifecycleOwner, {
            viewModel.message.value = viewModel.messageForFragment.value
        })
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btn1.setOnClickListener { inputDigits("1")}
        binding.btn2.setOnClickListener { inputDigits("2")}
        binding.btn3.setOnClickListener { inputDigits("3")}
        binding.btn4.setOnClickListener { inputDigits("4")}
        binding.btn5.setOnClickListener { inputDigits("5")}
        binding.btn6.setOnClickListener { inputDigits("6")}
        binding.btn7.setOnClickListener { inputDigits("7")}
        binding.btn8.setOnClickListener { inputDigits("8")}
        binding.btn9.setOnClickListener { inputDigits("9")}
        binding.btnZero.setOnClickListener { inputDigits("0")}

        binding.btnPlus.setOnClickListener {
            if(viewModel.message.value != null) inputDigits("+")
        }
        binding.btnSub.setOnClickListener {
            /*if(viewModel.message.value != null)*/ inputDigits("-")
        }
        binding.btnDiv.setOnClickListener {
            if(viewModel.message.value != null) inputDigits("/")
        }
        binding.btnMul.setOnClickListener {
            if(viewModel.message.value != null) inputDigits("*")
        }
        binding.btnPoint.setOnClickListener {
            if(viewModel.message.value != null) inputDigits(".")
        }
        binding.btnReminder.setOnClickListener {
            if(viewModel.message.value != null) inputDigits("%")
        }
        binding.btnClear.setOnClickListener {
            if(viewModel.message.value != null) {
                viewModel.message.value = "0"
                viewModel.messageForMemory.value = ""
            }
        }
        binding.btnChangeSign.setOnClickListener {
            if(viewModel.message.value != null){
                if(!viewModel.message.value.toString().startsWith("-") and
                    !viewModel.message.value.toString().startsWith("+")){
                    if(!viewModel.message.value.toString().startsWith("(")){
                        viewModel.message.value = "+" + viewModel.message.value.toString()
                    }
                    else{
                        viewModel.message.value.toString().replaceFirst("(", "+")
                        viewModel.message.value = "(" + viewModel.message.value.toString()
                    }
                }
                var temp: String = viewModel.message.value.toString()
                    .replace("+", "#")
                temp = temp.replace("-","+")
                viewModel.message.value = temp.replace("#", "-")
                /*if(viewModel.message.value.toString().replace("+", "#"))*/
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
        binding.btnOther.setOnClickListener {
            viewModel.changeMode()
            viewModel.messageChangeMode.value = CalculatorViewModel.Mode.SCIENTIFIC.toString()
        }

    }

    private fun evaluate(str: String) {
        viewModel.result = str
        viewModel.evaluate()
    }

    companion object {
        @JvmStatic
        fun newInstance() = BaseOperationsFragment()

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    private fun inputDigits(str: String){
        if(viewModel.message.value == null) viewModel.message.value = ""
        if(viewModel.message.value == "0") viewModel.message.value = ""
        if(viewModel.yFlag){
            viewModel.y += str
        }
        viewModel.message.value += str

    }
}