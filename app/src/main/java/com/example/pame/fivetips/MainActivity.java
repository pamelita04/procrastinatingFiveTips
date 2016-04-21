package com.example.pame.fivetips;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageTip;
    TextView textTip;
    TextView textTipEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tip_choose(View view) {
        ImageView imageTip= (ImageView) findViewById(R.id.image_tip);
        imageTip.setImageResource(R.drawable.elige_camino);
        TextView textTip = (TextView) findViewById(R.id.text_tip);
        TextView textTipEnd = (TextView) findViewById(R.id.text_tip_end);

        textTip.setText("El primer paso para vencer la procrastinación implica comprometerte con tus principios. Tienes que tomar una decisión sobre aquello en lo que quieres convertirte o hacer. Aunque todavía no tengas toda la información, conocimientos, habilidades, capital o tiempo para hacer que suceda, sigues teniendo que tomar una decisión de antemano. Sea cual sea el camino que tomes, debes prometerte que harás todo el trabajo duro y darás toda la determinación necesaria para conseguirlo. De lo contrario, será muy fácil cambiar tu opinión tan pronto como encuentres un obstáculo o un problema en el camino.");
        textTipEnd.setText("“Quizás” y “no estoy seguro” son signos de advertencia de procrastinación, así que ¡cuidado!");
    }

    public void tip_actitude(View view) {
        ImageView imageTip= (ImageView) findViewById(R.id.image_tip);
        imageTip.setImageResource(R.drawable.actitud);
        TextView textTip = (TextView) findViewById(R.id.text_tip);
        TextView textTipEnd = (TextView) findViewById(R.id.text_tip_end);
        textTip.setText("Muchas personas no han tenido responsabilidades en sus vidas. Puede que hayan tomado una decisión, pero terminan culpando a otros por sus sueños no realizadosm");
        textTipEnd.setText("No importa cómo sople el viento, debes hacerte cargo de tu vida, tus sueños y tus decisiones.");
    }
}
