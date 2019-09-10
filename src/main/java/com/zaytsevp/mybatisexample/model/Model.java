package com.zaytsevp.mybatisexample.model;

import lombok.*;

import java.util.UUID;

/**
 * Created by Pavel Zaytsev
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Model {

    private UUID id;

    private String name;

    private Auto auto;
}
