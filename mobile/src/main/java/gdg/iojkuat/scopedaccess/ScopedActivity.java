package gdg.iojkuat.scopedaccess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import gdg.iojkuat.R;

public class ScopedActivity extends AppCompatActivity {
    private static final String FRAGMENT_TAG = ScopedDirectoryAccessFragment.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, ScopedDirectoryAccessFragment.newInstance(), FRAGMENT_TAG)
                    .commit();
        }
    }
}
