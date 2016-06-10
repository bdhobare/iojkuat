package gdg.iojkuat.multiwindow;

import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import gdg.iojkuat.R;

public abstract class ParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    /**
     * Set the description text if a TextView with the id <code>description</code> is available.
     */
    protected void setDescription(@StringRes int textId) {
        // Set the text and background color
        TextView description = (TextView) findViewById(R.id.description);
        if (description != null) {
            description.setText(textId);
        }
    }

    /**
     * Set the background color for the description text.
     */
    protected void setBackgroundColor(@ColorRes int colorId) {
        View scrollView = findViewById(R.id.scrollview);
        if (scrollView != null) {
            scrollView.setBackgroundResource(colorId);
        }
    }
}
