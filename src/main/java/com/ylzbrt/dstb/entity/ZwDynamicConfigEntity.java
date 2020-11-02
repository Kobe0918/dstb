package com.ylzbrt.dstb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ZwDynamicConfigEntity implements Serializable {
    private String tid;
    private String cronExpression;
    private String status;
    private String tableName;

}
