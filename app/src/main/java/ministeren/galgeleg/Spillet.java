package ministeren.galgeleg;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Spillet extends Activity implements View.OnClickListener{

    ImageView galge;
    TextView ord,brugt;
    EditText gaet;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spillet);

        galge = (ImageView) findViewById(R.id.imageView);

        ord = (TextView) findViewById(R.id.ord);
        brugt = (TextView) findViewById(R.id.brugte);

        gaet = (EditText) findViewById(R.id.bogstav);

        go = (Button) findViewById(R.id.guess);

    }

    @Override
    public void onClick(View v) {
        String input = gaet.getText().toString();

    }
}
