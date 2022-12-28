package com.ezatpanah.flow_youtube

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.withIndex
import kotlinx.coroutines.launch

class IntermediateOperatorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intermediate_operators)

        val nameFlow = listOf("Alex", "Rey", "Emd", "Frank").asFlow()

/*        lifecycleScope.launch {
            nameFlow
                .map { name ->
                    name.length
                }
                .collect{
                    Log.d("Intermediate Operators", "map: $it ")
                }
        }*/

/*        lifecycleScope.launch {
            nameFlow
                .filter { it == "Rey" }
                .collect{
                    Log.d("Intermediate Operators", "filter: $it ")
                }
        }*/

/*        lifecycleScope.launch {
            nameFlow
                .take(2)
                .collect{
                    Log.d("Intermediate Operators", "take: $it ")
                }
        }*/

/*        val flowDigits = flowOf(1,2,3).onEach { delay(10) }
        val flowString = flowOf("a","b","c").onEach { delay(15) }
        lifecycleScope.launch {
            flowDigits.zip(flowString){
                i , s ->
                i.toString() + s
            }
                .collect{
                    Log.d("Intermediate Operators", "zip : $it")
                }
        }*/

/*        lifecycleScope.launch {
            flowOf(1,2,3,4,5)
                .dropWhile { it < 2 }
                .collect{
                    Log.d("Intermediate Operators", "dropWhile : $it")
                }
        }*/

/*        lifecycleScope.launch {
            flowOf(1, 2, 3, 4, 5, 1)
                .transform {
                    emit(it)
                    emit(it * 10)
                }
                .collect {
                    Log.d("Intermediate Operators", "transform : $it")
                }
        }*/

        lifecycleScope.launch {
            nameFlow
                .withIndex()
                .collect {
                    Log.d("Intermediate Operators", "withIndex : $it")
                }
        }


    }
}
