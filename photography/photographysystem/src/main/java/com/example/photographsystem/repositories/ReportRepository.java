package com.example.photographsystem.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.photographsystem.models.Report;
import com.example.photographsystem.models.User;

import java.util.List;

public interface ReportRepository extends MongoRepository<Report, String> {
    List<Report> findByReportType(Report.ReportType reportType);
    List<Report> findByContentOwner(User contentOwner);
    List<Report> findByReportedBy(User reportedBy);
}