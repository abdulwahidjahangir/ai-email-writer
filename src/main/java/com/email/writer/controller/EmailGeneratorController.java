package com.email.writer.controller;

import com.email.writer.dto.EmailRequest;
import com.email.writer.service.EmailGeneratoreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*f")
public class EmailGeneratorController {

    private final EmailGeneratoreService emailGeneratoreService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailReqeust) {

        String response = emailGeneratoreService.generateEmailReply(emailReqeust);

        return ResponseEntity.ok(response);
    }
}
