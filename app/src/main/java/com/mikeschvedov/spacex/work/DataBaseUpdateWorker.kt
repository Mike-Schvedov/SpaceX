package com.mikeschvedov.spacex.work

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class DataBaseUpdateWorker(private val context: Context, private val params: WorkerParameters): Worker(context, params) {

    override fun doWork(): Result {

        // Do work
        println("Doing work")
        // Return a result
        return  Result.success()

    }
}