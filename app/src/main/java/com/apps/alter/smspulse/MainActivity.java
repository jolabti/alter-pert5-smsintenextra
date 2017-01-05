package com.apps.alter.smspulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnintent = (Button)findViewById(R.id.btnpassing);

        btnintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent toLayarKedua = new Intent (MainActivity.this, LayarKedua.class);
                 toLayarKedua.putExtra("alter",  "www.alterationstudio.web.id");
                 startActivity(toLayarKedua);
            }
        });

    }





























    /*  protected void sendSMSMessage() {
      phoneNo = txtphoneNo.getText().toString();
      message = txtMessage.getText().toString();

      if (ContextCompat.checkSelfPermission(this,
         Manifest.permission.SEND_SMS)
         != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
               Manifest.permission.SEND_SMS)) {
            } else {
               ActivityCompat.requestPermissions(this,
                  new String[]{Manifest.permission.SEND_SMS},
                  MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
      }
   }*/


    /*
    Intent sendIntent = new Intent();
    sendIntent.setAction(Intent.ACTION_SEND);
    sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
    sendIntent.setType("text/plain");
    startActivity(sendIntent);*/

   /* Intent i = new Intent(FirstScreen.this, SecondScreen.class);

    String keyIdentifer  = null;

    i.putExtra("STRING_I_NEED", strName);//adding additional data using putExtras()

    Then, to retrieve the value you can use the below mentioned code:

    Bundle extras;

    String newString;

    if (savedInstanceState == null)

    {

//fetching extra data passed with intents in a Bundle type variable

        extras = getIntent().getExtras();

        if(extras == null)

        {        newString= null;

        }

        else

        {            *//* fetching the string passed with intent using ‘extras’*//*

            newString= extras.getString("STRING_I_NEED");

        }
*/
}
