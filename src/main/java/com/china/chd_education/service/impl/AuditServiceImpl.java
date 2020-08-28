package com.china.chd_education.service.impl;

import com.china.chd_education.bean.MetricErrorLog;
import com.china.chd_education.mapper.AuditMapper;
import com.china.chd_education.service.AuditService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AuditServiceImpl
 * @Description: TODO
 * @Author chd
 * @Date 2020/8/27
 * @Version V1.0
 **/
@Service
public class AuditServiceImpl implements AuditService {
    @Resource
    AuditMapper auditMapper;
    @Override
    public List<MetricErrorLog> getAuditIssue(String systemUid, String versionNo) {
        List<MetricErrorLog> data = auditMapper.getAuditIssueData(systemUid,versionNo);
        int no = 0;
        for (MetricErrorLog datum : data) {
            datum.setNo(++no);
        }
        return data;
    }
}
