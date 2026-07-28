package io.github.luizgustavo76.yetpipe.api;

import java.io.IOException;

/**
 * Created by Gleb on 09.01.2026.
 */

public interface VideoStream {
    String getName(); String getHost();

    String getVideoUrl(String id, String quality, int timeout) throws IOException;
}
