package org.example.pattern.proxy.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BrowseResponseDto {
    private String status;
    private String data;
}
