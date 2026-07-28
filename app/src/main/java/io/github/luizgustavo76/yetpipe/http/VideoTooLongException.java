package io.github.luizgustavo76.yetpipe.http;

import java.io.IOException;

/**
 * Created by Gleb on 08.03.2026.
 * Exception thrown when a video conversion fails due to video being too long
 */
public class VideoTooLongException extends IOException {
    public VideoTooLongException(String message) {
        super(message);
    }
}
