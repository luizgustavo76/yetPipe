package io.github.luizgustavo76.yetpipe.api;

import java.io.IOException;
import java.util.List;

import io.github.luizgustavo76.yetpipe.data.VideoInfo;

/**
 * Created by Gleb on 14.06.2026.
 */

public interface ChannelApi {
    /**
     * Get channel videos with proper sorting
     * @param id Channel ID
     * @param sort 0 = Latest, 1 = Popular
     */
    List<VideoInfo> getChannelVideos(String id, int sort) throws IOException;
}
