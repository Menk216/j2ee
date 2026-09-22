package com.example.demo.duan112.controller;

import com.example.demo.duan111.model.Score;
import com.example.demo.duan111.service.ScoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/scores")
public class ScoreApiController {
    private final ScoreService scoreService;

    public ScoreApiController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping("/{sbd}")
    public ResponseEntity<?> getScore(@PathVariable String sbd, @RequestHeader("User-Token") String token) {
        if (!"valid-token-123".equals(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Token");
        }
        Score score = scoreService.getScore(sbd);
        if (score == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
        }
        return ResponseEntity.ok(score);
    }
}

