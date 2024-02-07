package in.bitcode.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ImagesActivity extends AppCompatActivity {

    private ImageView img1, img2, img3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.images_activity);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        img1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent resultIntent = new Intent();
                        resultIntent.putExtra("image_id", R.drawable.bitcode);
                        setResult(1, resultIntent);
                        finish();
                    }
                }
        );

        img3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent resultIntent = new Intent();
                        resultIntent.putExtra("image_id", R.drawable.laptop);
                        setResult(1, resultIntent);
                        finish();
                    }
                }
        );

        img2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent resultIntent = new Intent();
                        resultIntent.putExtra("image_id", R.drawable.flag);
                        setResult(1, resultIntent);
                        finish();
                    }
                }
        );


    }
}
