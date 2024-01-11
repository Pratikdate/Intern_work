package com.example.camgallery;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1;
    ImageView image;
    private final int REQUEST_CODE_CAMERA =1;
    private final int REQUEST_CODE_GALLERY =2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn1);
        btn1=findViewById(R.id.btn2);
        image=findViewById(R.id.img);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camintent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camintent,REQUEST_CODE_CAMERA);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallintent=new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(gallintent,REQUEST_CODE_GALLERY);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE_CAMERA && resultCode==RESULT_OK)
        {
            Bitmap ima=(Bitmap)(data.getExtras().get("data"));
            image.setImageBitmap(ima);
        } else if (requestCode==REQUEST_CODE_GALLERY && resultCode==RESULT_OK )
        {

            image.setImageURI(data.getData());

        }

    }
}