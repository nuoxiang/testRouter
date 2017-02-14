package think.testb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.mzule.activityrouter.annotation.Module;
import com.github.mzule.activityrouter.annotation.Router;

import think.router.B;

/**
 * Created by dazhuanjia_rx on 17/2/13.
 */

@Module("testb")
@Router("testB")
public class TestBAct extends AppCompatActivity {
    private TextView testb_content;

    private B test;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testb_act_main);
        testb_content = (TextView) findViewById(R.id.testb_content);

        test = getIntent().getParcelableExtra("test");
        testb_content.setText(test.text + "---" + test.age);
    }
}
