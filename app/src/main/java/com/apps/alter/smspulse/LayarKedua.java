package com.apps.alter.smspulse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.TextView;
import android.widget.Toast;

public class LayarKedua extends AppCompatActivity {
    TextView tv;
    Bundle dataExtra;
    String stringfortv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layar_kedua);
    tv = (TextView) findViewById(R.id.txtHasil);


    dataExtra = getIntent().getExtras();
    stringfortv = dataExtra.getString("alter");

        tv.setText(stringfortv);
        sendSmsByManager(stringfortv);



    }

    public void sendSmsByManager(String isipesan) {

        try {

            // Get the default instance of the SmsManager

            SmsManager smsManager = SmsManager.getDefault();

            smsManager.sendTextMessage("087784293949",null,isipesan,

            null,

            null);

            Toast.makeText(getApplicationContext(), "Your sms has successfully sent!",

                    Toast.LENGTH_LONG).show();

        } catch (Exception ex) {

            Toast.makeText(getApplicationContext(),"Your sms has failed...",

                    Toast.LENGTH_LONG).show();

            ex.printStackTrace();

        }

    }


}
