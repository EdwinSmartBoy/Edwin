package edwin.example.com.edwin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化界面
        initView();
    }

    /**
     * 初始化界面
     */
    private void initView() {
        //设置界面布局
        setContentView(R.layout.activity_main);
    }
}
