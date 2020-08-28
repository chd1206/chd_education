package com.china.chd_education.util;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;

import java.util.List;

/**
 * @ClassName CustomCellWriteHandle
 * @Description: TODO
 * @Author chd
 * @Date 2020/8/26
 * @Version V1.0
 **/
@Slf4j
public class CustomCellWriteHandle implements CellWriteHandler {
    int[][] checks = {};

    public CustomCellWriteHandle() {
    }

    public CustomCellWriteHandle(int[][] checks) {
        this.checks = checks;
    }

    @Override
    public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Head head, Integer integer, Integer integer1, Boolean aBoolean) {
    }

    @Override
    public void afterCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Cell cell, Head head, Integer integer, Boolean aBoolean) {
    }

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<CellData> list, Cell cell, Head head, Integer integer, Boolean aBoolean) {
//        log.info("第{}行每{}列！" , cell.getRowIndex(), cell.getColumnIndex());
        Workbook workbook = writeSheetHolder.getSheet().getWorkbook();
        CellStyle cellStyle = cellStyle(workbook);
        //根据校验结果设置单元格文字颜色
        /*if (checks[cell.getRowIndex()][cell.getColumnIndex()] == 1) {
            //设置单元格背景色
//            cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
            Font font = workbook.createFont();
            font.setColor(IndexedColors.RED.getIndex());
            //设置背景色

            cellStyle.setFont(font);
        }*/
        cell.setCellStyle(cellStyle);
    }
    public static CellStyle cellStyle(Workbook workbook) {
        CellStyle cellStyle = workbook.createCellStyle();
        //居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        //设置边框
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        return cellStyle;
    }

}
