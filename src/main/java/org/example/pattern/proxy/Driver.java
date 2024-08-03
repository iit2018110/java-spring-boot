package org.example.pattern.proxy;

import org.example.pattern.proxy.dto.BrowseResponseDto;

public class Driver {
    public static void main(String[] args) {
        IServer server = new ProxyServer();
        BrowseResponseDto response1 = server.browseUrl("blocked.url1");
        BrowseResponseDto response2 = server.browseUrl("google.com");
        System.out.println(response1);
        System.out.println(response2);
    }
}
