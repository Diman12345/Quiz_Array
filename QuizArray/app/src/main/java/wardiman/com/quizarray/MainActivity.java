package wardiman.com.quizarray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout llPilGan, llEssay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llEssay =  findViewById(R.id.essay);
        llPilGan =  findViewById(R.id.pilGan);

        llPilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PilihanGandaActivity.class);
                startActivity(intent);
            }
        });

        llEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EssayActivity.class);
                startActivity(intent);
            }
        });
    }
}
