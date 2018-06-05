package com.example.dell.fifthclassassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterationDetails extends AppCompatActivity implements View.OnClickListener{
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration_details);
        Intent i=getIntent();
        back=(Button)findViewById(R.id.backBtn);
        String username=i.getStringExtra("name");
        String phone=i.getStringExtra("phone");
        String email=i.getStringExtra("email");
        String password=i.getStringExtra("password");
       String country=i.getStringExtra("country");
        String state=i.getStringExtra("state");

        tv1=(TextView)findViewById(R.id.textV1);
        tv1.setText(username);

        tv2=(TextView)findViewById(R.id.textV2);
        tv2.setText(phone);

        tv3=(TextView)findViewById(R.id.textV3);
        tv3.setText(email);

        tv4=(TextView)findViewById(R.id.textV4);
        tv4.setText(password);

    tv5=(TextView)findViewById(R.id.textV5);
        tv5.setText(country);

        tv6=(TextView)findViewById(R.id.textV6);
        tv6.setText(state);

       back.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(RegisterationDetails.this,MainActivity.class);
        intent.putExtra("name2",tv1.getText().toString());
        intent.putExtra("mail2",tv3.getText().toString());
        intent.putExtra("phone2",tv2.getText().toString());

        startActivity(intent);
    }

}
