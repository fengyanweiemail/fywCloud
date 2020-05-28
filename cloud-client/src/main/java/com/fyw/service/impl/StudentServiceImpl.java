package com.fyw.service.impl;

import com.fyw.dao.StudentDao;
import com.fyw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by fyw on 2019/7/30.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public Map findAll() {
        return studentDao.findAll();
    }

    @Override
    public String getPort() {
        return studentDao.getPort();
    }
}
