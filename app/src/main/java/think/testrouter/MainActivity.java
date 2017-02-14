package think.testrouter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.mzule.activityrouter.annotation.Module;
import com.github.mzule.activityrouter.annotation.Modules;
import com.github.mzule.activityrouter.router.Routers;

import think.router.B;

@Module("app")
@Modules({"app","testa","testb"})
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button tv_testa;
    private Button tv_testb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_testa = (Button) findViewById(R.id.tv_testa);
        tv_testb = (Button) findViewById(R.id.tv_testb);
        tv_testa.setOnClickListener(this);
        tv_testb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_testa:
//                Intent intent = new Intent();
//                intent.setClassName(this, Utils.TESTA);
//                startActivity(intent);

                Routers.open(this, "test://testA");
                break;
            case R.id.tv_testb:
                B b = new B();
                b.age = 10;
                b.text = "test";
//                intent = new Intent();
//                intent.setClassName(this, Utils.TESTB);

                Intent intent = Routers.resolve(this, "test://testB");
                intent.putExtra("test", b);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
