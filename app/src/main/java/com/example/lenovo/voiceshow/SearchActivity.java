package com.example.lenovo.voiceshow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.File;

import config.PathConfig;

public class SearchActivity extends Activity implements View.OnClickListener{

    private ImageButton s_search;
    private TextView lookmore;
    // 底部菜单ImageView
    private ImageView iv_discovery;
    private ImageView iv_hot;
    private ImageView iv_person;
    private TextView tv_discovery;
    private TextView tv_find;
    private ImageButton ib_search;//搜索按钮


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        // 底部菜单ImageView
        RelativeLayout rl_bottom = (RelativeLayout)findViewById(R.id.layout_bottom);
        iv_hot = (ImageView)rl_bottom.findViewById(R.id.iv_hot);
        iv_person = (ImageView)rl_bottom.findViewById(R.id.iv_person);

        tv_discovery = (TextView) rl_bottom.findViewById(R.id.tv_discovery);
        iv_discovery = (ImageView)rl_bottom.findViewById(R.id.iv_discovery);

        iv_discovery.setImageResource(R.drawable.ic_tab_discovery_pressed);
        tv_discovery.setTextColor(getResources().getColor(R.color.main_color));

        iv_hot.setOnClickListener(this);
        iv_person.setOnClickListener(this);

        s_search=(ImageButton)findViewById(R.id.s_search);//搜索按钮
        lookmore=(TextView)findViewById(R.id.lookmore);//查看更多分类按钮
    }
    public void onClick(View v) {
        // ImageView和TetxView置为绿色，页面随之跳转
        switch (v.getId()) {
            case R.id.iv_hot:
                Intent intent_discovery=new Intent(SearchActivity.this,HotActivity.class);
                startActivity(intent_discovery);
                break;
            case R.id.iv_person:
                Intent intent_person=new Intent(SearchActivity.this,Person1Activity.class);
                startActivity(intent_person);
                break;
            case R.id.s_search:
                //搜索后跳转到的界面
                break;
            case R.id.lookmore:
                Intent intent = new Intent(SearchActivity.this, FindActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
