package cn.ucai.superwechat.ui;

import android.os.Bundle;
import android.view.Window;

import cn.ucai.superwechat.R;

public class GuideActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_guide);
    }
}
