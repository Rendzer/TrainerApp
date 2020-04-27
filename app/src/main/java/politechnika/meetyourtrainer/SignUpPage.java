package politechnika.meetyourtrainer;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

=======
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

>>>>>>> 962d22a9a79ea868ed5c58ad2a3dd97be31d040d
public class SignUpPage extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        button = (Button) findViewById(R.id.button2);

        MainMenu();
<<<<<<< HEAD
    };
=======
    }

    ;
>>>>>>> 962d22a9a79ea868ed5c58ad2a3dd97be31d040d

    private void MainMenu() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpPage.this, MainActivity.class));
            }
        });
    }

}
