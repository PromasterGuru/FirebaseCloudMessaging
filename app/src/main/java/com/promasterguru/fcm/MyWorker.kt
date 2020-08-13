package com.promasterguru.fcm

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(appContext: Context, workParams: WorkerParameters): Worker(appContext, workParams) {
    override fun doWork(): Result {
        Log.d(TAG, "Performing long running task in scheduled job")
        return Result.success()
    }
    companion object{
        private val TAG = this.javaClass.simpleName
    }
}
