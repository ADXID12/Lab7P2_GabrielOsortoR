package PackPrincipal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_MenuPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_MenuPrincipal = new javax.swing.JTable();
        jb_exportardatos = new javax.swing.JButton();
        jb_cargarArchivoData = new javax.swing.JButton();
        jp_CrearArchivo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_CrearArchivo = new javax.swing.JTable();
        jb_CrearNuevoDato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jp_MenuPrincipal.setBackground(new java.awt.Color(153, 255, 255));

        jt_MenuPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "category", "price", "aisle", "bin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_MenuPrincipal);

        jb_exportardatos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jb_exportardatos.setText("Exportar Datos");
        jb_exportardatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_exportardatosMouseClicked(evt);
            }
        });

        jb_cargarArchivoData.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jb_cargarArchivoData.setText("Cargar Tabla");
        jb_cargarArchivoData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cargarArchivoDataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_MenuPrincipalLayout = new javax.swing.GroupLayout(jp_MenuPrincipal);
        jp_MenuPrincipal.setLayout(jp_MenuPrincipalLayout);
        jp_MenuPrincipalLayout.setHorizontalGroup(
            jp_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_MenuPrincipalLayout.createSequentialGroup()
                .addGroup(jp_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_MenuPrincipalLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jb_exportardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jb_cargarArchivoData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_MenuPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jp_MenuPrincipalLayout.setVerticalGroup(
            jp_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_MenuPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jp_MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_exportardatos)
                    .addComponent(jb_cargarArchivoData))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Menu Principal", jp_MenuPrincipal);

        jp_CrearArchivo.setBackground(new java.awt.Color(153, 255, 255));

        jt_CrearArchivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "name", "category", "price", "aisle", "bin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_CrearArchivo);

        jb_CrearNuevoDato.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jb_CrearNuevoDato.setText("Exportar Datos");
        jb_CrearNuevoDato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearNuevoDatoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_CrearArchivoLayout = new javax.swing.GroupLayout(jp_CrearArchivo);
        jp_CrearArchivo.setLayout(jp_CrearArchivoLayout);
        jp_CrearArchivoLayout.setHorizontalGroup(
            jp_CrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CrearArchivoLayout.createSequentialGroup()
                .addGroup(jp_CrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearArchivoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_CrearArchivoLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jb_CrearNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jp_CrearArchivoLayout.setVerticalGroup(
            jp_CrearArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CrearArchivoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jb_CrearNuevoDato)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Archivo", jp_CrearArchivo);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_exportardatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_exportardatosMouseClicked
        productosData.clear();
        productosList.clear();
//SE LLENA EL ARRAYLIST GLOBAL PARA GUARDAR LA INFO QUE ESTA EN EL ARCHIVO DATA
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("C:/Users/Jahir Corrales/Desktop/Lab7P2_GabrielOsorto/Lab7P2_GabrielOsortoR/data.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine()) != null) {
                productosData.add(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //CREACION DEL ARCHIVO DATAJSON

        BufferedWriter bw = null;
        try {
            File fichero = new File("C:/Users/Jahir Corrales/Desktop/Lab7P2_GabrielOsorto/Lab7P2_GabrielOsortoR/datajson.txt");
            FileWriter fw = new FileWriter(fichero);
            bw = new BufferedWriter(fw);
            bw.write("[\n");
            for (int i = 0; i < productosList.size(); i++) {
                Producto producto = productosList.get(i);
                bw.write("  {\n");
                bw.write("    \"id\": " + producto.getId() + ",");
                bw.write("    \"name\": \"" + producto.getName() + "\",");
                bw.write("    \"category\": " + producto.getCategory() + ",");
                bw.write("    \"price\": " + producto.getPrice() + ",");
                bw.write("    \"aisle\": " + producto.getAisle() + ",");
                bw.write("    \"bin\": " + producto.getBin() + "");
                if (i < productosList.size() - 1) {
                    bw.write("  },\n");
                } else {
                    bw.write("  }\n");
                }
            }
            bw.write("]");
            bw.flush();
            JOptionPane.showMessageDialog(null, "Archivo datajson creado exitosamente");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

//LLENAR LA TABLA (ESO ESPERO)
        for (int i = 1; i < productosData.size(); i++) {
            int j = i;
            productosList.add(llenarArrayProductosList(productosData, j));
        }
        for (int i = 0; i < productosList.size(); i++) {
            DefaultTableModel modelotabla = (DefaultTableModel) jt_MenuPrincipal.getModel();
            Object[] productTable = {productosList.get(i).getId(),
                productosList.get(i).getName(), productosList.get(i).getCategory(),
                productosList.get(i).getPrice(), productosList.get(i).getAisle(),
                productosList.get(i).getBin()
            };
            modelotabla.addRow(productTable);

        }
    }//GEN-LAST:event_jb_exportardatosMouseClicked

    private void jb_CrearNuevoDatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearNuevoDatoMouseClicked
        try {
            CrearNuevoArchivotxt("C:/Users/Jahir Corrales/Desktop/Lab7P2_GabrielOsorto/Lab7P2_GabrielOsortoR/archivoNuevo.txt");
        } catch (IOException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_CrearNuevoDatoMouseClicked

    private void jb_cargarArchivoDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cargarArchivoDataMouseClicked
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        String textoGuardado = "";

        try {
            jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter("Archivos de Texto", "txt");
            jfc.setFileFilter(filtro);
            seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                String linea;
                productosData.clear();
                productosList.clear();
                while ((linea = br.readLine()) != null) {
                    productosData.add(linea);
                }
                for (int i = 1; i < productosData.size(); i++) {
                    int j = i;
                    productosList.add(llenarArrayProductosList(productosData, j));
                }
                for (int i = 0; i < productosList.size(); i++) {
                    DefaultTableModel modelotabla = (DefaultTableModel) jt_MenuPrincipal.getModel();
                    Object[] productTable = {productosList.get(i).getId(),
                        productosList.get(i).getName(), productosList.get(i).getCategory(),
                        productosList.get(i).getPrice(), productosList.get(i).getAisle(),
                        productosList.get(i).getBin()
                    };
                    modelotabla.addRow(productTable);
                }
            } //fin if

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_jb_cargarArchivoDataMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    public static Producto llenarArrayProductosList(ArrayList<String> prodData, int x) {
        Producto produ = null;
        String prod1 = prodData.get(x);
        String[] prod2 = prod1.split(",");
        if (prod2.length == 6) {
            try {
                int code1 = Integer.parseInt(prod2[0]);
                String name1 = prod2[1];
                int category11 = Integer.parseInt(prod2[2]);
                double price11 = Double.parseDouble(prod2[3]);
                int aisle11 = Integer.parseInt(prod2[4]);
                int bin1 = Integer.parseInt(prod2[5]);
                produ = new Producto(code1, name1, category11, price11, aisle11, bin1);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR, CAMPO VACIO");
        }

        return produ;
    }

    public void CrearNuevoArchivotxt(String path) throws IOException {
        DefaultTableModel model = (DefaultTableModel) jt_CrearArchivo.getModel();
        int rowcont = model.getRowCount();
        int colcont = model.getColumnCount();
        BufferedWriter bw = null;
        FileWriter fw = null;
        fw = new FileWriter(path, false);
        bw = new BufferedWriter(fw);
        try {
            for (int i = 0; i < colcont; i++) {
                bw.write(model.getColumnName(i));
                if (i < colcont - 1) {
                    bw.write(",");
                }
            }
            bw.newLine();
            for (int fil = 0; fil < rowcont; fil++) {
                for (int col = 0; col < colcont; col++) {
                    Object value = model.getValueAt(fil, col);
                    if (value != null) {
                        bw.write(value.toString());
                    }
                    if (col < colcont - 1) {
                        bw.write(",");
                    }
                }
                bw.newLine();
            }
            bw.flush();
            JOptionPane.showMessageDialog(null, "Archivo guardado con exito :D");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se guardo su archivo :( ");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_CrearNuevoDato;
    private javax.swing.JButton jb_cargarArchivoData;
    private javax.swing.JButton jb_exportardatos;
    private javax.swing.JPanel jp_CrearArchivo;
    private javax.swing.JPanel jp_MenuPrincipal;
    private javax.swing.JTable jt_CrearArchivo;
    private javax.swing.JTable jt_MenuPrincipal;
    // End of variables declaration//GEN-END:variables
ArrayList<String> productosData = new ArrayList();
    ArrayList<Producto> productosList = new ArrayList();
    JFileChooser jfc;
    int seleccion;
}
