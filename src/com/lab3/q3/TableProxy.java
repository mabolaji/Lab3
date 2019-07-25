package com.lab3.q3;

public class TableProxy implements IRow {

    private Table table;

    public TableProxy() {
        table = new Table();
    }

    @Override
    public IRow getRow(int rowNum) {
        return null;
    }
}
