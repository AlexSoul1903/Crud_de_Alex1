/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Conexion.Conectar;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Forms.Resgistrarse;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author alexm
 */
public class Login extends javax.swing.JFrame {

    
    FondoPanel panel = new FondoPanel();
    
    Conectar con = new Conectar();
    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_inicio_sec1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Panel_inicio_sec2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Panel_inicio_sec3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Usuariotext = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Boton_registro = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        Acederbotton = new javax.swing.JButton();
        Limpiarbotton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        Contratext = new javax.swing.JPasswordField();
        SalirBotton = new javax.swing.JButton();
        jPanel3 = new FondoPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel_inicio_sec4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Usuariotext1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Boton_registro1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        Acederbotton1 = new javax.swing.JButton();
        Limpiarbotton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        Contratext1 = new javax.swing.JPasswordField();
        SalirBotton1 = new javax.swing.JButton();

        Panel_inicio_sec1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_inicio_sec1.setName(""); // NOI18N
        Panel_inicio_sec1.setNextFocusableComponent(this);
        Panel_inicio_sec1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel6.setText("Inicio de sección.");
        Panel_inicio_sec1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 157, -1));
        Panel_inicio_sec1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 85, 37, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel9.setText("Nombre de usuario");
        Panel_inicio_sec1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 157, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        Panel_inicio_sec1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 133, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel10.setText("No posees una cuenta?");
        Panel_inicio_sec1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));
        Panel_inicio_sec1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 133, -1));
        Panel_inicio_sec1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Registrate");
        Panel_inicio_sec1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel12.setText("Contraseña");
        Panel_inicio_sec1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 20));

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Acceder");
        Panel_inicio_sec1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Salir");
        Panel_inicio_sec1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        Panel_inicio_sec2.setBackground(new java.awt.Color(51, 51, 51));
        Panel_inicio_sec2.setForeground(new java.awt.Color(102, 102, 102));
        Panel_inicio_sec2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_inicio_sec2.setName(""); // NOI18N
        Panel_inicio_sec2.setNextFocusableComponent(this);
        Panel_inicio_sec2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Inicio de sección.");
        Panel_inicio_sec2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 157, -1));
        Panel_inicio_sec2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 85, 37, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre de usuario");
        Panel_inicio_sec2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 157, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        Panel_inicio_sec2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 133, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Limpiar");
        Panel_inicio_sec2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jPasswordField3.setBackground(new java.awt.Color(255, 255, 255));
        Panel_inicio_sec2.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 133, -1));
        Panel_inicio_sec2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Registrate");
        Panel_inicio_sec2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Contraseña");
        Panel_inicio_sec2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 20));

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Acceder");
        Panel_inicio_sec2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jButton9.setBackground(new java.awt.Color(255, 102, 102));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Salir");
        Panel_inicio_sec2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("No posees una cuenta?");
        Panel_inicio_sec2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Panel_inicio_sec3.setBackground(new java.awt.Color(51, 51, 51));
        Panel_inicio_sec3.setForeground(new java.awt.Color(102, 102, 102));
        Panel_inicio_sec3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_inicio_sec3.setName(""); // NOI18N
        Panel_inicio_sec3.setNextFocusableComponent(this);
        Panel_inicio_sec3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Inicio de sección.");
        Panel_inicio_sec3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 157, -1));
        Panel_inicio_sec3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 85, 37, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nombre de usuario");
        Panel_inicio_sec3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 157, -1));

        Usuariotext.setBackground(new java.awt.Color(255, 255, 255));
        Panel_inicio_sec3.add(Usuariotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 133, -1));
        Panel_inicio_sec3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        Boton_registro.setBackground(new java.awt.Color(153, 153, 255));
        Boton_registro.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Boton_registro.setForeground(new java.awt.Color(255, 255, 255));
        Boton_registro.setText("Registrate");
        Panel_inicio_sec3.add(Boton_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Contraseña");
        Panel_inicio_sec3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 20));

        Acederbotton.setBackground(new java.awt.Color(153, 153, 255));
        Acederbotton.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Acederbotton.setForeground(new java.awt.Color(255, 255, 255));
        Acederbotton.setText("Acceder");
        Panel_inicio_sec3.add(Acederbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        Limpiarbotton.setBackground(new java.awt.Color(0, 153, 153));
        Limpiarbotton.setForeground(new java.awt.Color(255, 255, 255));
        Limpiarbotton.setText("Limpiar");
        Panel_inicio_sec3.add(Limpiarbotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 20));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("No posees una cuenta?");
        Panel_inicio_sec3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Contratext.setBackground(new java.awt.Color(255, 255, 255));
        Contratext.setForeground(new java.awt.Color(102, 102, 102));
        Panel_inicio_sec3.add(Contratext, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 122, -1));

        SalirBotton.setBackground(new java.awt.Color(255, 102, 102));
        SalirBotton.setForeground(new java.awt.Color(255, 255, 255));
        SalirBotton.setText("Salir");
        Panel_inicio_sec3.add(SalirBotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 51, 102));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_inicio_sec4.setBackground(new java.awt.Color(51, 51, 51));
        Panel_inicio_sec4.setForeground(new java.awt.Color(102, 102, 102));
        Panel_inicio_sec4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_inicio_sec4.setName(""); // NOI18N
        Panel_inicio_sec4.setNextFocusableComponent(this);
        Panel_inicio_sec4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Inicio de sección.");
        Panel_inicio_sec4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 157, -1));
        Panel_inicio_sec4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 85, 37, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Nombre de usuario");
        Panel_inicio_sec4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 157, -1));

        Usuariotext1.setBackground(new java.awt.Color(255, 255, 255));
        Usuariotext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuariotext1ActionPerformed(evt);
            }
        });
        Panel_inicio_sec4.add(Usuariotext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 133, -1));
        Panel_inicio_sec4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        Boton_registro1.setBackground(new java.awt.Color(153, 153, 255));
        Boton_registro1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Boton_registro1.setForeground(new java.awt.Color(255, 255, 255));
        Boton_registro1.setText("Registrate");
        Boton_registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_registro1ActionPerformed(evt);
            }
        });
        Panel_inicio_sec4.add(Boton_registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Contraseña");
        Panel_inicio_sec4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        Acederbotton1.setBackground(new java.awt.Color(153, 153, 255));
        Acederbotton1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Acederbotton1.setForeground(new java.awt.Color(255, 255, 255));
        Acederbotton1.setText("Acceder");
        Acederbotton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acederbotton1ActionPerformed(evt);
            }
        });
        Panel_inicio_sec4.add(Acederbotton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        Limpiarbotton1.setBackground(new java.awt.Color(0, 153, 153));
        Limpiarbotton1.setForeground(new java.awt.Color(255, 255, 255));
        Limpiarbotton1.setText("Limpiar");
        Limpiarbotton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiarbotton1ActionPerformed(evt);
            }
        });
        Panel_inicio_sec4.add(Limpiarbotton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 20));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("No posees una cuenta?");
        Panel_inicio_sec4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Contratext1.setBackground(new java.awt.Color(255, 255, 255));
        Contratext1.setForeground(new java.awt.Color(102, 102, 102));
        Panel_inicio_sec4.add(Contratext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 122, -1));

        SalirBotton1.setBackground(new java.awt.Color(255, 102, 102));
        SalirBotton1.setForeground(new java.awt.Color(255, 255, 255));
        SalirBotton1.setText("Salir");
        SalirBotton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBotton1ActionPerformed(evt);
            }
        });
        Panel_inicio_sec4.add(SalirBotton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(203, Short.MAX_VALUE)
                    .addComponent(Panel_inicio_sec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(203, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(Panel_inicio_sec4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Acederbotton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acederbotton1ActionPerformed
    
        log();
    }//GEN-LAST:event_Acederbotton1ActionPerformed

    private void SalirBotton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBotton1ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_SalirBotton1ActionPerformed

    private void Boton_registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_registro1ActionPerformed
      
        Resgistrarse reg = new Resgistrarse();
        reg.setVisible(true);
       this.setVisible(false); 
       
    }//GEN-LAST:event_Boton_registro1ActionPerformed

    private void Limpiarbotton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiarbotton1ActionPerformed
       
         this.Usuariotext1.setText("");
         this.Contratext1.setText("");
        
    }//GEN-LAST:event_Limpiarbotton1ActionPerformed

 
    private void Usuariotext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuariotext1ActionPerformed
        
     
    }//GEN-LAST:event_Usuariotext1ActionPerformed

    public void setContratext1(JPasswordField Contratext1) {
        this.Contratext1 = Contratext1;
    }

       public static String guardar;
    private boolean log(){
    ResultSet rls = null;
    PreparedStatement ps=null;
    Connection conex = con.getConnection();
       String query="select nombre_usuario, nombre_completo,telefono,correo,contrasena from usuario where nombre_usuario = ? and contrasena = ?"; 
       guardar=Usuariotext1.getText();
String pass = new String(this.Contratext1.getPassword());
         String user = (this.Usuariotext1.getText());
       try{
           
           ps=conex.prepareStatement(query);
           ps.setString(1, user);
           ps.setString(2, pass);
              rls=ps.executeQuery();
               
              if(rls.next()){
              
              
          JOptionPane.showMessageDialog(null, "Session iniciada");
          this.setVisible(false);
          TablaReg reg = new TablaReg();
          reg.setVisible(true);
         
              return true;
              }else{
                  
                  if(user.equals("")&& !pass.equals("")){
                        JOptionPane.showMessageDialog(null, "El campo del nombre de usuario esta vacio, debe de llenarlo");
                     
                  }
                  if(pass.equals("")&& !user.equals("")){
                        JOptionPane.showMessageDialog(null, "El campo de la contraseña esta vacio, debe de llenarlo");
                        
                  }
                  
                  if(user.equals("") && pass.equals("") ){
                  
                        JOptionPane.showMessageDialog(null, "Ambos campos estan vacios, debe llenarlo y si no posee una cuenta registrese");
                  
                  
                  }
                  
                  else{
                     JOptionPane.showMessageDialog(null, "El nombre de usuario o la contraseña es incorrecta");
                  }
              return false;
              }
              
              
               }catch (SQLException e){
             
                     JOptionPane.showMessageDialog(null, "El nombre de usuario o la contraseña es incorrecta"+e);
          
                   
                   
                   return false;    
                       
                       }
     
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    class FondoPanel extends JPanel{
    
        private Image imagen;
        
       public void paint(Graphics g){
       
           imagen=new ImageIcon(getClass().getResource("/Images/Fondo.jpg")).getImage();
       
           g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
           
           setOpaque(false);
           
           super.paint(g);
  
       } 
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acederbotton;
    private javax.swing.JButton Acederbotton1;
    private javax.swing.JButton Boton_registro;
    private javax.swing.JButton Boton_registro1;
    private javax.swing.JPasswordField Contratext;
    private javax.swing.JPasswordField Contratext1;
    private javax.swing.JButton Limpiarbotton;
    private javax.swing.JButton Limpiarbotton1;
    private javax.swing.JPanel Panel_inicio_sec1;
    private javax.swing.JPanel Panel_inicio_sec2;
    private javax.swing.JPanel Panel_inicio_sec3;
    private javax.swing.JPanel Panel_inicio_sec4;
    private javax.swing.JButton SalirBotton;
    private javax.swing.JButton SalirBotton1;
    private javax.swing.JTextField Usuariotext;
    private javax.swing.JTextField Usuariotext1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
