package vistas;

import Logica.ComprimirArchivo;
import Logica.DescomprimirArchivo;
import datos.CargarArchivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CompresionDiccionario extends javax.swing.JFrame {

    private static String str;

    public CompresionDiccionario() {
        initComponents();
        this.setLocationRelativeTo(null);//pone en el centro la pantalla
        this.setResizable(false);//desabilita el maximizar
        this.setTitle("Codificacion por diccionarios LZW");//pone el titulo de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonComprimir = new javax.swing.JButton();
        jButtonDescomprimir = new javax.swing.JButton();
        jButtonCargarArchivo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelNomArch = new javax.swing.JLabel();
        jLabelTamArch = new javax.swing.JLabel();
        jLabelTiemp = new javax.swing.JLabel();
        jLabelDetalleNom = new javax.swing.JLabel();
        jLabelDetalleTam = new javax.swing.JLabel();
        jLabelDetalleTiem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonComprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprimir.png"))); // NOI18N
        jButtonComprimir.setText("Comprimir");
        jButtonComprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprimirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonComprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 140, 45));

        jButtonDescomprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Descomp.png"))); // NOI18N
        jButtonDescomprimir.setText("Descomprimir");
        jButtonDescomprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescomprimirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDescomprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 170, 45));

        jButtonCargarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargar.png"))); // NOI18N
        jButtonCargarArchivo.setText("Cargar Archivo");
        jButtonCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, 45));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 100, 45));

        jLabelNomArch.setText("Nombre del archivo:");

        jLabelTamArch.setText("Tamaño del archivo:");

        jLabelTiemp.setText("Tiempo de ejecucion:");

        jLabelDetalleNom.setText("NULL");

        jLabelDetalleTam.setText("NULL");

        jLabelDetalleTiem.setText("NULL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTiemp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTamArch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomArch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDetalleNom, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jLabelDetalleTam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDetalleTiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNomArch, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelDetalleNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTamArch, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelDetalleTam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTiemp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetalleTiem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 76, 700, 170));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconos.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 540, 230));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comprension de archivos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 440, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_pantalla.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprimirActionPerformed
        try {
            long time_start, time_end;
            ComprimirArchivo lzw = new ComprimirArchivo();
            File file = new File(str);
            Scanner fileScanner = new Scanner(file);
            String line = "";
            time_start = System.currentTimeMillis();
            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                System.out.println("Contents of your file being compressed: \n" + line);
            }
            lzw.compress(str);
            JOptionPane.showMessageDialog(rootPane, "Comprension completada");
            System.out.println("Nombre del arhivo: " + str.concat(".lzw"));
            time_end = System.currentTimeMillis();
            this.jLabelDetalleNom.setText(str.concat(".lzw"));
            file = new File(this.jLabelDetalleNom.getText());
            this.jLabelDetalleTam.setText(file.length()+" bytes");
            this.jLabelDetalleTiem.setText((time_end - time_start) + " milisegundos.");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "No se ha podido encontrar el archivo");
        } catch (IOException ex) {
            Logger.getLogger(CompresionDiccionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonComprimirActionPerformed

    private void jButtonCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarArchivoActionPerformed
        CargarArchivo cargaArchivo = new CargarArchivo();
        str = cargaArchivo.seleccionArchivo(this);
        File file = new File(str);
        this.jLabelDetalleNom.setText(str);
        this.jLabelDetalleTam.setText(file.length()+" bytes");
    }//GEN-LAST:event_jButtonCargarArchivoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonDescomprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescomprimirActionPerformed
        try {
            long time_start, time_end;
            DescomprimirArchivo lzw = new DescomprimirArchivo();
            File file = new File(str);
            Scanner fileScanner = new Scanner(file);
            String line = "";
            time_start = System.currentTimeMillis();
            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                System.out.println("Contents of your file being decompressed:\n"+ line);
            }
            lzw.LZW_Decompress(str);
            JOptionPane.showMessageDialog(rootPane, "Descomprension completada");
            System.out.println("Nombre del archivo: "+ str.replace(".lzw", ""));
            time_end = System.currentTimeMillis();
            this.jLabelDetalleNom.setText(str.replace(".lzw", ""));
            file = new File(this.jLabelDetalleNom.getText());
            this.jLabelDetalleTam.setText(file.length()+" bytes");
            this.jLabelDetalleTiem.setText((time_end - time_start) + " milisegundos.");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "No se ha podido encontrar el archivo");
        } catch (IOException ex) {
            Logger.getLogger(CompresionDiccionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDescomprimirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompresionDiccionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargarArchivo;
    private javax.swing.JButton jButtonComprimir;
    private javax.swing.JButton jButtonDescomprimir;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDetalleNom;
    private javax.swing.JLabel jLabelDetalleTam;
    private javax.swing.JLabel jLabelDetalleTiem;
    private javax.swing.JLabel jLabelNomArch;
    private javax.swing.JLabel jLabelTamArch;
    private javax.swing.JLabel jLabelTiemp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
