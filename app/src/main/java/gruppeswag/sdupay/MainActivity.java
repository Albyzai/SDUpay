package gruppeswag.sdupay;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ViewFlipper;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    ViewFlipper flippy;
    ImageButton cartBtn, favBtn, histBtn, menuBtn;
    LinearLayout cartView;
    RelativeLayout background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        flippy = (ViewFlipper) findViewById(R.id.flippy);
        cartBtn = (ImageButton) findViewById(R.id.cartBtn);
        favBtn = (ImageButton) findViewById(R.id.favBtn);
        histBtn = (ImageButton) findViewById(R.id.histBtn);
        menuBtn = (ImageButton) findViewById(R.id.menuBtn);
        cartView = (LinearLayout) findViewById(R.id.cartView);

        background = (RelativeLayout) findViewById(R.id.background);

        cartBtn.setOnClickListener(button_click);
        favBtn.setOnClickListener(button_click);
        histBtn.setOnClickListener(button_click);

    }



    public View.OnClickListener button_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.cartBtn:
                    flippy.setDisplayedChild(0);
                    break;
                case R.id.favBtn:
                    flippy.setDisplayedChild(1);
                    break;
                case R.id.histBtn:
                    flippy.setDisplayedChild(2);

            }
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
