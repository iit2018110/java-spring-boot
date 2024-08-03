package org.example.pattern.proxy;

import org.example.pattern.proxy.dto.BrowseResponseDto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProxyServer implements IServer {
    private final IServer server = new Server();
//    Set<String> blockedUrls = Set.of("blocked.url1", "blocked.url2");
    Set<String> blockedUrls = new HashSet<>(Arrays.asList("blocked.url1", "blocked.url2"));



    @Override
    public BrowseResponseDto browseUrl(String url) {
        if (blockedUrls.contains(url)) {
            return new BrowseResponseDto().setStatus("Fail").setData(null);
        }
        return server.browseUrl(url);
    }
}
