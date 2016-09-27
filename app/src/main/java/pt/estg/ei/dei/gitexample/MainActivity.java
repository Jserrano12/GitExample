package pt.estg.ei.dei.gitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnNextPage(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        Button nomeParaOBotao = (Button) findViewById(R.id.button2);
        startActivity(i);
    }
}
