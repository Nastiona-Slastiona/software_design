package com.example.calculator_
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.calculator_.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

        val SAVE_OP = "saved_operation"
        val SAVE_RES = "saved_result"
        val SAVE_MODE = "saved_mode"

        private val viewModel: CalculatorViewModel by viewModels()
        lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN;
            actionBar?.hide()

            if (savedInstanceState != null) {
                with(savedInstanceState) {
                    binding.mathOperation.text = getString(SAVE_OP)
                    binding.mathOp2.text = getString(SAVE_RES)

                    if(getString(SAVE_MODE) == "BASIC")
                        viewModel.mode = CalculatorViewModel.Mode.BASIC
                    else viewModel.mode = CalculatorViewModel.Mode.SCIENTIFIC
                }

            }

            if(viewModel.mode == CalculatorViewModel.Mode.BASIC)
                openFrag(BaseOperationsFragment(), R.id.fragment_container)
            else
                openFrag(ScientificOperationsFragment(), R.id.fragment_container)

            binding.mathOperation.text = "0"

            viewModel.message.observe(this, {
                if (binding.mathOperation.text == "0") binding.mathOperation.text = ""
                binding.mathOperation.text = it
            })
            viewModel.messageForMemory.observe(this, {
                /*if (binding.mathOp2.text != ""){} *//*binding.mathOperation.text = ""*/
                binding.mathOp2.text = it
            })
            viewModel.messageChangeMode.observe(this, {
                if(viewModel.mode == CalculatorViewModel.Mode.BASIC)
                    openFrag(BaseOperationsFragment(), R.id.fragment_container)
                else
                    openFrag(ScientificOperationsFragment(), R.id.fragment_container)
            })


            math_operation.setOnTouchListener(object: OnSwipeTouchListener(){
            override fun onSwipeLeft() {
                val str: String = binding.mathOperation.text.toString()
                val result: String = binding.mathOp2.text.toString()

                when {
                    str.isNotEmpty() and result.isEmpty() -> {
                        binding.mathOperation.text = str.substring(0, str.length - 1)

                    }
                    str.isNotEmpty() and result.isNotEmpty() -> {
                        binding.mathOperation.text = binding.mathOperation.text.toString().substring(0, str.length - 1)
                        binding.mathOp2.text = ""

                    }
                    else -> {
                        binding.mathOperation.text = ""
                        binding.mathOp2
                    }
                }
                viewModel.messageForFragment.value = binding.mathOperation.text.toString()
                if(binding.mathOperation.text == "") binding.mathOperation.text = "0"
            }
        }
        )
        }

        private fun openFrag(f: Fragment, idHolder: Int){
            supportFragmentManager
                .beginTransaction()
                .replace(idHolder, f)
                .commit()
        }

        override fun onSaveInstanceState(outState: Bundle) {
            outState.run {
                putString(SAVE_OP, math_operation.text.toString())
                putString(SAVE_RES, math_op_2.text.toString())
                putString(SAVE_MODE, viewModel.mode.name.toString())
                Log.d("Name of mode" , viewModel.mode.name.toString())

            }

            super.onSaveInstanceState(outState)
        }

    }

