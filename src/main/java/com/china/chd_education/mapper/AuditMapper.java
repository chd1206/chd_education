package com.china.chd_education.mapper;

import com.china.chd_education.bean.MetricErrorLog;

import java.util.List;

/**
 * @ClassName AuditMapper
 * @Description: TODO
 * @Author chd
 * @Date 2020/8/27
 * @Version V1.0
 **/

public interface AuditMapper {

    List<MetricErrorLog> getAuditIssueData(String systemUid, String versionNo);

}
