package com.fyw.dao;

import com.fyw.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fyw on 2019/7/30.
 */
@Repository
public class StudentDao {
    private static Map studentMap;

    static {
        studentMap = new HashMap();
        studentMap.put(1L, new Student(1L, "小明", "13"));
        studentMap.put(2L, new Student(2L, "小红", "14"));
        studentMap.put(3L, new Student(3L, "小亮", "15"));
    }

    @Value("${server.port}")
    private String port;

    public Map findAll() {
        return studentMap;
    }

    public String getPort() {
        return port;
    }
}
