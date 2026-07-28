package io.github.luizgustavo76.yetpipe.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

public class LocalRecommendationManager {
    private static final String PREF_NAME = "yetpipe_channel_scores";
    public static void recordChannelVisit(Context context, String channelTitle) {
        if (channelTitle == null || channelTitle.trim().isEmpty()) return;
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        int currentScore = prefs.getInt(channelTitle, 0);        
        prefs.edit().putInt(channelTitle, currentScore + 1).apply();
    }
    public static String getMostWatchedChannel(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        Map<String, ?> allEntries = prefs.getAll();

        String topChannel = null;
        int maxScore = -1;

        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            if (entry.getValue() instanceof Integer) {
                int score = (Integer) entry.getValue();
                if (score > maxScore) {
                    maxScore = score;
                    topChannel = entry.getKey();
                }
            }
        }
        return topChannel;
    }
}