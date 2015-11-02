package ministeren.galgeleg;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    Button start;
    //Drawable[] galger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //galger[0] = getResources().getDrawable(R.drawable.galge, getTheme());
        //galger[1] = getResources().getDrawable(R.drawable.forkert1, getTheme());
       // galger[2] = getResources().getDrawable(R.drawable.forkert2, getTheme());
       // galger[3] = getResources().getDrawable(R.drawable.forkert3,getTheme());
        // galger[4] = getResources().getDrawable(R.drawable.forkert4,getTheme());
      //  galger[5] = getResources().getDrawable(R.drawable.forkert5,getTheme());
      //  galger[6] = getResources().getDrawable(R.drawable.forkert6,getTheme());

        start = (Button) findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Spillet.class));
            }});

    }
}
