package org.example.pattern.proxy;

import org.example.pattern.proxy.dto.BrowseResponseDto;

public class Server implements IServer {
    @Override
    public BrowseResponseDto browseUrl(String url) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new BrowseResponseDto().setStatus("OK").setData("data");
    }
}
