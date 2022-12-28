package com.ezatpanah.flow_youtube

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class OtherOperatorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_operators)

/*        lifecycleScope.launch{
            flowOnSample().collect{
                Log.d("OtherOperators", "flowOn Collect: $it ")
            }
        }*/

        lifecycleScope.launch {
            (1..10).asFlow()
                .map {
                    check( it != 3) {"Value $it"}
                    it*it
                }
                .onCompletion {
                    Log.d("OtherOperators", "onCompletion")
                }
                .catch { e ->
                    Log.d("OtherOperators", "Caught $e")
                }
                .collect{
                    Log.d("OtherOperators", it.toString())
                }
        }

        

    }

    fun flowOnSample(): Flow<Int> = flow {
        for (i in 1..3) {
            delay(1000)
            Log.d("OtherOperators", "Emitting: $i ")
            emit(i)
        }
    }.flowOn(Dispatchers.Default)
}