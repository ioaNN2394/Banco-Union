/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancounion;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author AdminOmarGuevara
 */
public class ReporteExcel {
    public void exportarExcel(JTable table, String codigoVendedor) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");

            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();

                Sheet hoja = libro.createSheet("Mi hoja de trabajo 1");
                hoja.setDisplayGridlines(false);

                conectar cc = new conectar();
                Connection cn = cc.conexion();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM creditos WHERE codigo_aliado = ?");
                pst.setString(1, codigoVendedor);
                ResultSet rs = pst.executeQuery();

                ResultSetMetaData meta = rs.getMetaData();
                int numColumnas = meta.getColumnCount();

                // Crea la fila de encabezado con los nombres de las columnas
                Row filaEncabezado = hoja.createRow(0);
                for (int c = 0; c < numColumnas; c++) {
                    Cell celda = filaEncabezado.createCell(c);
                    celda.setCellValue(meta.getColumnName(c + 1));
                }

                int filaInicio = 1;
                while (rs.next()) {
                    Row filaDatos = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < numColumnas; c++) {
                        Cell celda = filaDatos.createCell(c);
                        Object valor = rs.getObject(c + 1);

                        if (valor instanceof Double) {
                            celda.setCellValue((Double) valor);
                        } else if (valor instanceof Float) {
                            celda.setCellValue((Float) valor);
                        } else {
                            celda.setCellValue(valor.toString());
                        }
                    }
                }

                try (FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                    libro.write(archivo);
                }

                Desktop.getDesktop().open(archivoXLS);

            } catch (IOException | SQLException e) {
                Logger.getLogger(ReporteExcel.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}

