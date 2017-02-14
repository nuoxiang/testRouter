package think.testa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.mzule.activityrouter.annotation.Module;
import com.github.mzule.activityrouter.annotation.Router;

/**
 * Created by dazhuanjia_rx on 17/2/13.
 */

@Module("testa")
@Router("testA")
public class TestAAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testa_main_act);
    }
}
