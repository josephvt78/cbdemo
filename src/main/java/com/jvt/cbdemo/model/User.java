package com.jvt.cbdemo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Setter
@Getter
public class User {

    @Id
    private Integer id;

    private String name;

    private String email;

}
