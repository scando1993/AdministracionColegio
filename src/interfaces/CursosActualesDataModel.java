/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevincando
 */
public class CursosActualesDataModel extends DefaultTableModel{

    public static String[] columnNames = {"Id",
                                          "Curso"};

    
    public CursosActualesDataModel() {
        super();
        
        for (String column: columnNames)
            this.addColumn(column);
    }

    public CursosActualesDataModel(Object[][] data) {
        super();
        
        for (String column: columnNames)
            this.addColumn(column);
        
        for (Object[] row: data)
                this.addRow(row);
    }
}
