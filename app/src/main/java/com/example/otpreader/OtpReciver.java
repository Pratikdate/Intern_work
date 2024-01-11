package com.example.otpreader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.widget.EditText;

import androidx.annotation.RequiresApi;

public class OtpReciver extends BroadcastReceiver {

    private static EditText otp_;

    public void setOTP(EditText editText){
        otp_=editText;

    }

    @RequiresApi(api= Build.VERSION_CODES.KITKAT)

    @Override
    public void onReceive(Context context, Intent intent) {
        SmsMessage[] smsMessages= Telephony.Sms.Intents.getMessagesFromIntent(intent);
        for(SmsMessage smsMessage:smsMessages){
            String message_body=smsMessage.getMessageBody();
            String message=message_body.split(":")[1];
            otp_.setText(message);
        }



    }
}
