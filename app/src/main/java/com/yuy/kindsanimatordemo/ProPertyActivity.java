package com.yuy.kindsanimatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

import static android.animation.ObjectAnimator.ofFloat;

public class ProPertyActivity extends AppCompatActivity {


    private final static String TAG = ProPertyActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_perty);


    }

    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.btnValueAnimator:
//                ValueAnimator valueAnimator = ValueAnimator.ofFloat(0f, 1.0f);
//                valueAnimator.setInterpolator(new LinearInterpolator());
//                valueAnimator.setDuration(100);
//                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//                    @Override
//                    public void onAnimationUpdate(ValueAnimator animation) {
//                        float animatedFraction = animation.getAnimatedFraction();
//                        float animatedValue = (float) animation.getAnimatedValue();
//                        Log.d(TAG, "onAnimationUpdate: " + String.format("%.3f  %.3f", animatedFraction, animatedValue));
//                    }
//                });
//                valueAnimator.start();
//                break;
            case R.id.viewAlphaAnimation:
                //通过AnimatorInflater 从资源文件中获取Animator 对象
                Animator alphaAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha);
                //通过 Animator setTarget 方法给动画设置目标
                alphaAnimator.setTarget(view);
                //开启动画
                alphaAnimator.start();
                break;
            case R.id.viewScaleAnimation:

                ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 3.0f).start();
                break;
            case R.id.viewTranslateAnimation:
                ViewPropertyAnimator viewPropertyAnimator = view.animate();
                viewPropertyAnimator.translationX(500f).setDuration(1000).start();
                break;
            case R.id.viewRotateAnimation:
                view.animate().rotation(720).start();
                break;
            case R.id.viewSetAnimation:
//                Animator rotateAnimator = ObjectAnimator.ofFloat(view, "rotation", 0, 720);
//                rotateAnimator.setDuration(1000);
//
//                Animator moveAnimator = ObjectAnimator.ofFloat(view, "x", 0, 500);
//                moveAnimator.setDuration(1000);
//
//                AnimatorSet set = new AnimatorSet();
////                set.playTogether(rotateAnimator, moveAnimator);
//                set.playSequentially(rotateAnimator, moveAnimator);
//                set.start();

                view.animate().rotation(720).setDuration(1000).start();
                view.animate().translationX(500).setDuration(1000).setStartDelay(1000).start();

                break;


        }
    }

}
