package ca.campbell.lab3buggy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class OtherActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
    }
    
    public void doToastAndExit(View view) {
        EditText editText = (EditText)findViewById(R.id.text);
        String text = editText.getText().toString();
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
        finish();
    }
}
