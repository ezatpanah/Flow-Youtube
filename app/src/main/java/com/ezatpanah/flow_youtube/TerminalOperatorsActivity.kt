package com.ezatpanah.flow_youtube

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.fold
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.launch

class TerminalOperatorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terminal_operators)

/*        lifecycleScope.launch {
            (1..5).asFlow()
                .filter {
                    it % 2 == 0
                }
                .map {
                    it * it
                }
                .collect() {
                    Log.d("Terminal Operators", "collect:  $it")
                }
        }*/

/*        lifecycleScope.launch {
            val  item = (13..20).asFlow().first{ it % 2 == 0 }
            Log.d("Terminal Operators", " first : $item")
        }*/

/*        lifecycleScope.launch {
            val item =(20..30).asFlow().last()
            Log.d("Terminal Operators", " last : $item")
        }*/

/*        val flowNumbers= flow {
            delay(100)
            emit(1)
            delay(100)
            emit(2)
        }

        lifecycleScope.launch {
            val item=flowNumbers.toList()
            Log.d("Terminal Operators", "toList: $item")
        }*/

/*        lifecycleScope.launch {
            val sum = (1..5).asFlow()
                .reduce { a, b -> a + b } // 1+2+3+4+5
            Log.d("Terminal Operators", "reduce: $sum")
        }*/

        lifecycleScope.launch {
            val sum = (1..5).asFlow()
                .fold(10) { a, b -> a + b } // 1+2+3+4+5 +10
            Log.d("Terminal Operators", "fold: $sum")
        }

    }
}