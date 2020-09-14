package com.marcllus.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = -8166403478187294105L;

    private UUID id;
    private String message;
}
