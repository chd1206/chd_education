package com.china.chd_education.bean;


import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;

@ContentRowHeight(20)
@HeadRowHeight(25)
@ColumnWidth(15)
public class MetricErrorLog {
    @ExcelIgnore
    private String id;
    @ExcelProperty("序号")
    private int no;
    @ExcelIgnore
    private int versionNo;
    @ExcelProperty("数据卡片")
    private String tableName;
    @ExcelProperty("行数")
    private int lineNum;
    @ExcelIgnore
    private String tableColumn;
    @ColumnWidth(20)
    @ExcelProperty("字段")
    private String columnName;
    @ExcelIgnore
    private int errorNo;
    @ExcelProperty("相关指标")
    private String type;
    @ExcelIgnore
    private String systemUid;
    @ExcelProperty("问题描述")
    private String errordescription;

    public String getErrordescription() {
        return errordescription;
    }

    public void setErrordescription(String errordescription) {
        this.errordescription = errordescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(int versionNo) {
        this.versionNo = versionNo;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public String getTableColumn() {
        return tableColumn;
    }

    public void setTableColumn(String tableColumn) {
        this.tableColumn = tableColumn;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(int errorNo) {
        this.errorNo = errorNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSystemUid() {
        return systemUid;
    }

    public void setSystemUid(String systemUid) {
        this.systemUid = systemUid;
    }
}
