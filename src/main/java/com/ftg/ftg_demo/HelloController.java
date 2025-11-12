package com.ftg.ftg_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
public class HelloController {

    private final DataSource dataSource;

    public HelloController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/")
    public String hello() {
        try (Connection conn = dataSource.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT 1")) {

            if (rs.next() && rs.getInt(1) == 1) {
                return "Hello World! - Connected to DB successfully";
            } else {
                return "Hello World! - DB check failed";
            }

        } catch (Exception e) {
            return "Hello World! - DB connection error: " + e.getMessage();
        }
    }
}
