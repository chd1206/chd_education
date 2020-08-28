package com.china.chd_education.controller;

import com.alibaba.excel.EasyExcel;
import com.china.chd_education.bean.MetricErrorLog;
import com.china.chd_education.service.AuditService;
import com.china.chd_education.util.CustomCellWriteHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @ClassName ExcelExportController
 * @Description: TODO
 * @Author chd
 * @Date 2020/8/26
 * @Version V1.0
 **/
@RequestMapping("/excel")
@RestController
public class ExcelExportController {

    @Autowired
    AuditService auditService;

    @RequestMapping("/simpleExcelExport")
    public void simpleExcelExport(HttpServletRequest request, HttpServletResponse res) throws IOException {

        String fileName ="simpleWrite" + System.currentTimeMillis() + ".xlsx";
        res.setHeader("Content-Disposition", "attachment; filename=".concat(URLEncoder.encode(fileName,"UTF-8")));
        res.setHeader("Connection", "close");
        res.setCharacterEncoding("utf-8");
        res.setHeader("Content-Type", "application/vnd.ms-excel;charset=UTF-8");
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        String systemUid = request.getParameter("systemUid");
        String versionNo = request.getParameter("versionNo");
        List<MetricErrorLog> data = auditService.getAuditIssue(systemUid,versionNo);
        EasyExcel.write(res.getOutputStream(), MetricErrorLog.class).registerWriteHandler(new CustomCellWriteHandle()).sheet("模板").doWrite(data);

    }

}
