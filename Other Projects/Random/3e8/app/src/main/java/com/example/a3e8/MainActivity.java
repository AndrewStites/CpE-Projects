package com.example.a3e8;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


//Change it to Activity for game dev
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Allows our code to run in conjunction with existing code
        //Without this, onCreate() will not even run
        super.onCreate(savedInstanceState);
        //Gets rid of the bar up top the app
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //"this" refers to mainActivity
        //Removes status bar from app
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //makes a clicking noise
        //deleted the Flag_Fullscreens from the method below and it worked
        hideSystemUI();


        //DisplayMetrics: A structure describing general information about a display, such as its size, density, and font scaling.
        DisplayMetrics dm = new DisplayMetrics();
        //getDefaultDisplay(): Returns the Display upon which this WindowManager instance will create new windows
        //getMetrics(DisplayMetrics): Gets display metrics that describe the size and density of this display. The size returned by this method does not necessarily represent the actual raw size (native resolution) of the display.
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        Constants.HEIGHT = dm.heightPixels;
        Constants.WIDTH = dm.widthPixels;


        //Sets the display on the android's screen
        //Utilizes the class GamePanel which utilizes this class
        setContentView(new GamePanel(this));

    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION

                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

}
