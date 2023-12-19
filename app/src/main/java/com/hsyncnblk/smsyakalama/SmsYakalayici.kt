package com.hsyncnblk.smsyakalama

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SmsYakalayici : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"sms geldi",Toast.LENGTH_SHORT).show()
    }
}