package com.example.pame.fivetips;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays an image, title of the tip and its respective explanation
     * */
    public void init(View view) {
        TextView titleTip = (TextView) findViewById(R.id.title_tip);
        ImageView imageTip= (ImageView) findViewById(R.id.image_tip);
        TextView textTip = (TextView) findViewById(R.id.text_tip);

        titleTip.setText(R.string.title_ini);
        imageTip.setImageResource(R.drawable.img_ini);
        textTip.setText(R.string.text_ini);
    }

    /**
     * This method displays an image, title of the tip and its respective explanation
     * */
    public void tip_1_choose(View view) {
        TextView titleTip = (TextView) findViewById(R.id.title_tip);
        ImageView imageTip= (ImageView) findViewById(R.id.image_tip);
        TextView textTip = (TextView) findViewById(R.id.text_tip);

        titleTip.setText(R.string.title_tip_1);
        imageTip.setImageResource(R.drawable.img_tip1);
        textTip.setText(R.string.text_tip_1);


    }

    /**
     * This method displays an image, title of the tip and its respective explanation
     * */
    public void tip_2_actitude(View view) {
        TextView titleTip = (TextView) findViewById(R.id.title_tip);
        ImageView imageTip= (ImageView) findViewById(R.id.image_tip);
        TextView textTip = (TextView) findViewById(R.id.text_tip);

        titleTip.setText(R.string.title_tip_2);
        imageTip.setImageResource(R.drawable.img_tip2);
        textTip.setText(R.string.text_tip_2);
    }

    /**
     * This method displays an image, title of the tip and its respective explanation
     * */
    public void tip_3_plan(View view) {
        TextView titleTip = (TextView) findViewById(R.id.title_tip);
        ImageView imageTip= (ImageView) findViewById(R.id.image_tip);
        TextView textTip = (TextView) findViewById(R.id.text_tip);

        titleTip.setText(R.string.title_tip_3);
        imageTip.setImageResource(R.drawable.img_tip3);
        textTip.setText(R.string.text_tip_3);
    }

    /**
     * This method displays an image, title of the tip and its respective explanation
     * */
    public void tip_4_urgency(View view) {
        TextView titleTip = (TextView) findViewById(R.id.title_tip);
        ImageView imageTip= (ImageView) findViewById(R.id.image_tip);
        TextView textTip = (TextView) findViewById(R.id.text_tip);

        titleTip.setText(R.string.title_tip_4);
        imageTip.setImageResource(R.drawable.img_tip4);
        textTip.setText(R.string.text_tip_4);
    }

    /**
     * This method displays an image, title of the tip and its respective explanation
     * */
    public void tip_5_action(View view) {
        TextView titleTip = (TextView) findViewById(R.id.title_tip);
        ImageView imageTip= (ImageView) findViewById(R.id.image_tip);
        TextView textTip = (TextView) findViewById(R.id.text_tip);

        titleTip.setText(R.string.title_tip_5);
        imageTip.setImageResource(R.drawable.img_tip5);
        textTip.setText(R.string.text_tip_5);
    }

}
