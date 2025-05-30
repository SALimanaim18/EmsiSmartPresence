package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 5000; // 5 seconds
    private static final int PROGRESS_UPDATE_INTERVAL = 50; // Update every 50ms
    private static final int TYPEWRITER_INTERVAL = 100; // Typing speed for tagline
    private ProgressBar progressBar;
    private TextView taglineTextView;
    private Handler handler;
    private int progressStatus = 0;
    private String tagline = "Innovate. Create. Succeed.";
    private int taglineIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Initialize views
        progressBar = findViewById(R.id.progress_bar);
        taglineTextView = findViewById(R.id.tagline);
        handler = new Handler(Looper.getMainLooper());

        // Start progress bar animation
        startProgressAnimation();

        // Start typewriter effect for tagline
        taglineTextView.setVisibility(TextView.VISIBLE);
        startTypewriterEffect();

        // Navigate to MainActivity after splash timeout
        handler.postDelayed(() -> {
            Intent i = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }, SPLASH_TIME_OUT);
    }

    private void startProgressAnimation() {
        new Thread(() -> {
            while (progressStatus < 100) {
                progressStatus += 1;
                handler.post(() -> progressBar.setProgress(progressStatus));
                try {
                    Thread.sleep(SPLASH_TIME_OUT / 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void startTypewriterEffect() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (taglineIndex <= tagline.length()) {
                    taglineTextView.setText(tagline.substring(0, taglineIndex));
                    taglineIndex++;
                    handler.postDelayed(this, TYPEWRITER_INTERVAL);
                }
            }
        }, 500); // Start after a slight delay
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null); // Clean up to prevent memory leaks
    }
}