package com.example.demo.duan111.service;

import com.example.demo.duan111.model.Score;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ScoreService {
    private Map<String, Score> mockData = new HashMap<>();

    public ScoreService() {
        mockData.put("SV001", new Score("SV001", "Nguyen Van A", 8.0, 7.5, 9.0));
        mockData.put("SV002", new Score("SV002", "Tran Thi B", 7.0, 8.5, 8.0));
    }

    public Score getScore(String mssv) {
        return mockData.get(mssv);
    }
}

