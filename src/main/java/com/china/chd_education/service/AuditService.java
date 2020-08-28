package com.china.chd_education.service;

import com.china.chd_education.bean.MetricErrorLog;

import java.util.List;

public interface AuditService {
    List<MetricErrorLog> getAuditIssue(String systemUid, String versionNo);
}
