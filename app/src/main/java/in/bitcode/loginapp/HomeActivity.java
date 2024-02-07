package in.bitcode.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HomeActivity extends Activity {

    private TextView txtWelcomeMessage;
    private ImageView imgUser;

    private String username;
    private int rating;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);
        imgUser = findViewById(R.id.imgUser);

        Intent intent = getIntent();
        Bundle inputBundle = intent.getExtras();
        username = inputBundle.getString("username");
        rating = inputBundle.getInt("rating");

        txtWelcomeMessage.setText("Welcome " + username + " (" + rating + ")");

        imgUser.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent imagesActivityIntent = new Intent(HomeActivity.this, ImagesActivity.class);
                        startActivityForResult(imagesActivityIntent, 1);
                    }
                }
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data != null) {
            int imageId = data.getExtras().getInt("image_id");
            imgUser.setImageResource(imageId);
        }
    }
}
