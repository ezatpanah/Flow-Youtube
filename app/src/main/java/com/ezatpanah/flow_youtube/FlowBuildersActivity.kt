package com.ezatpanah.flow_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class FlowBuildersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow_builders)

        /** flowOf() **/
        // flowOf() is function to create a flow from a fixed set of values
/*        lifecycleScope.launch {
            flowOf(4, 2, 5, 1, 7)
                .collect {
                    Log.d("Flow Builders", "flowOf() : $it")
                }
        }*/

        /** asFlow() **/
        //asFlow() is extension functions on various types to convert them into flows
/*        lifecycleScope.launch {
            (1..5).asFlow()
                .collect {
                    Log.d("Flow Builders", "asFlow() : $it")
                }
        }*/

        /** flow {...} **/
        //builder function to construct arbitrary flows from sequential calls to emit function.
/*        lifecycleScope.launch {
            flow {
                (0..10).forEach {
                    emit(it)
                }
            }.collect {
                Log.d("Flow Builders", "flow {...} : $it")
            }
        }*/

        /** channelFlow {...} **/
        //builder function to construct arbitrary flows from potentially concurrent calls to the send function.
        lifecycleScope.launch {
            channelFlow {
                (0..10).forEach {
                    send(it)
                }
            }.collect {
                Log.d("Flow Builders", "channelFlow {...} : $it")
            }
        }
    }
}