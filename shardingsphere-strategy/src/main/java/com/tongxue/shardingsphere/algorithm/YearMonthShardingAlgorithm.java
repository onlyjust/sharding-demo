package com.tongxue.shardingsphere.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class YearMonthShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    private static final String SPLITTER = "_";

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> shardingValue) {
        String tbName = shardingValue.getLogicTableName() + "_" + shardingValue.getValue();
        System.out.println("Sharding input:" + shardingValue.getValue() + ", output:{}" + tbName);
        return tbName;
    }
}
