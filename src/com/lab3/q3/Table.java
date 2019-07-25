package com.lab3.q3;

import java.util.ArrayList;
import java.util.List;

public class Table implements ITable {

    List<IRow> table = new ArrayList<>();

    @Override
    public int numOfRows() {
        return table.size();
    }

    @Override
    public IRow getRow(int rowNum) {
        return table.get(rowNum);
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        table.add(rowNum, row);
    }

    @Override
    public void deleteRow(int rowNum) {
        table.remove(rowNum);
    }
}
