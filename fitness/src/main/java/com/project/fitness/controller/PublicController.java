package com.project.fitness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
    
    @GetMapping("/")
    public String healthCheck() {
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>Nutrixa Fit API</title>" +
                "<style>" +
                "body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; line-height: 1.6; color: #333; max-width: 800px; margin: 40px auto; padding: 20px; background-color: #f4f7f6; }" +
                ".container { background: white; padding: 30px; border-radius: 10px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); border-top: 5px solid #2ecc71; }" +
                "h1 { color: #2c3e50; margin-bottom: 10px; }" +
                ".status { display: inline-block; background: #e8f8f0; color: #2ecc71; padding: 5px 15px; border-radius: 20px; font-weight: bold; margin-bottom: 20px; }" +
                ".tech-stack { display: flex; gap: 10px; margin-top: 20px; }" +
                ".badge { background: #34495e; color: white; padding: 5px 12px; border-radius: 4px; font-size: 0.9em; }" +
                "ul { padding-left: 20px; }" +
                "code { background: #eee; padding: 2px 5px; border-radius: 3px; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='container'>" +
                "<h1>Nutrixa Fit Backend API</h1>" +
                "<div class='status'>System Online & Healthy</div>" +
                "<p>Welcome! This is the core backend engine for the <strong>Nutrixa Fit</strong> application, built with a focus on security, scalability, and performance.</p>" +
                "<h3>🚀 Key Features:</h3>" +
                "<ul>" +
                "<li><strong>JWT Authentication:</strong> Secure stateless session management.</li>" +
                "<li><strong>User Management:</strong> Role-based access control (Admin/User).</li>" +
                "<li><strong>Fitness Tracking:</strong> Real-time logging of workouts and Activity data.</li>" +
                "<li><strong>PostgreSQL Integration:</strong> Persistent and optimized data storage using NeonDB.</li>" +
                "</ul>" +
                "<h3>🛠 Tech Stack:</h3>" +
                "<div class='tech-stack'>" +
                "<span class='badge'>Java 21</span>" +
                "<span class='badge'>Spring Boot 4.0.1</span>" +
                "<span class='badge'>Spring Security</span>" +
                "<span class='badge'>JPA / Hibernate</span>" +
                "</div>" +
                "<p style='margin-top: 30px;'><em>Note: This is a REST API. For endpoint documentation, please refer to the <code>/swagger-ui/index.html</code> (if enabled) or use the Postman collection.</em></p>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}
