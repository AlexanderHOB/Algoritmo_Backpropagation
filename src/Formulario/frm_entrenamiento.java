/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;
import algoritmo_bp.*;
import static algoritmo_bp.Algoritmo_bp.crearRed;
import static algoritmo_bp.Algoritmo_bp.entrenamiento;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author PC-TEC
 */
public class frm_entrenamiento extends javax.swing.JFrame {
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    gestionA gestion = new gestionA();
    
    imagenFondo fondo = new imagenFondo();
    public static int [] arquitectura;
    public static int [] ndatos;
    public ArrayList<String> contenido;
    public String tmp;
    public String delimitador;
    public double lr = 0.2;
    public int num_repeticiones = 5000;
    CapaNeuronal[] red_neuronal;
    double[][] Y;
    /**
     * Creates new form frm_entrenamiento
     */
    public frm_entrenamiento() {
        this.setContentPane(fondo);
        setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        
        SpinnerNumberModel nm1 = new SpinnerNumberModel();
        SpinnerNumberModel nm2 = new SpinnerNumberModel();
        SpinnerNumberModel nm3 = new SpinnerNumberModel();
        nm1.setMinimum(0);
        nm2.setMinimum(0);
        nm3.setMinimum(0);
        niNE.setModel(nm1);
        niNC.setModel(nm2);
        niNS.setModel(nm3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        niNC = new javax.swing.JSpinner();
        niNS = new javax.swing.JSpinner();
        niNE = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        cbDelimitado = new javax.swing.JComboBox<>();
        btnEntrenar = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCargar = new javax.swing.JTextField();
        btnBuscar = new java.awt.Button();
        btnEstablecer = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        niNR = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        niLR = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Capas Ocultas");

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Neuronas de Salida");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Neuronas de Entrada");

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cargar de un archivo (*.txt)");

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Delimitado por:");

        niNC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                niNCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                niNCFocusLost(evt);
            }
        });
        niNC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                niNCMouseReleased(evt);
            }
        });
        niNC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                niNCKeyPressed(evt);
            }
        });

        niNE.setRequestFocusEnabled(false);

        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos");

        cbDelimitado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ",", ";", "tab", "espacio" }));
        cbDelimitado.setToolTipText("");
        cbDelimitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDelimitadoActionPerformed(evt);
            }
        });

        btnEntrenar.setActionCommand("Entrenar");
        btnEntrenar.setBackground(new java.awt.Color(0, 204, 204));
        btnEntrenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrenar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnEntrenar.setLabel("Entrenar");
        btnEntrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Entrenamiento Neuronal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jLabel11.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Neuronas");

        txtCargar.setEnabled(false);
        txtCargar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCargarFocusLost(evt);
            }
        });
        txtCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargarActionPerformed(evt);
            }
        });

        btnBuscar.setActionCommand("Buscar");
        btnBuscar.setBackground(new java.awt.Color(0, 204, 204));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnBuscar.setLabel("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEstablecer.setBackground(new java.awt.Color(0, 204, 204));
        btnEstablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstablecer.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnEstablecer.setLabel("Establecer");
        btnEstablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstablecerMouseClicked(evt);
            }
        });
        btnEstablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Learning Rate");

        niNR.setModel(new javax.swing.SpinnerNumberModel(5000, 10, null, 1));
        niNR.setValue(5000);

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número de Repeticiones");

        niLR.setModel(new javax.swing.SpinnerNumberModel(0.2d, 0.1d, null, 0.1d));
        niLR.setValue(0.2);

        jButton1.setText("Probar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEstablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGap(87, 87, 87)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(niNE, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(niNC)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(jLabel9)
                                    .addGap(142, 142, 142)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(niNR, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(233, 233, 233)
                                    .addComponent(niNS, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEntrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(111, 111, 111)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbDelimitado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(15, 15, 15)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(niLR, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(niNE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(niNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(niNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(niLR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(niNR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)))
                .addGap(12, 12, 12)
                .addComponent(txtCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbDelimitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnEntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenarActionPerformed
        int e = (Integer)niNE.getValue();
        int s = (Integer)niNS.getValue();
        if(e == 0 || s == 0){
            JOptionPane.showMessageDialog(null, "Inserte número de neuronas", "Error datos vacios", JOptionPane.WARNING_MESSAGE);
        }else if(txtCargar.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Inserte los datos de práctica", "Error datos vacios", JOptionPane.WARNING_MESSAGE);
        }else if((Integer)niNC.getValue()==0){
            ndatos = new int[2];
            //System.out.println(ndatos.length);
            ndatos[0] = e;
            ndatos[1] = s;
            for(int j=0;j<ndatos.length;j++){
               // System.out.print(ndatos[j]);
            }
        }else{
            ndatos = new int[arquitectura.length+2];
            //System.out.println(ndatos.length);
            int t = arquitectura.length+1;
            ndatos[0] = e;
            for(int i=1;i<t;i++){
                int a = arquitectura[i-1];
                ndatos[i] = a;
            }
            ndatos[t] = s;
            for(int j=0;j<ndatos.length;j++){
                //System.out.print(ndatos[j]);
            }
        }
        int casos = contenido.size();
        Object [] c = contenido.toArray();
        double [][] X = new double[casos][e];
        Y = new double[casos][s];
        //generar los arreglos para entrenar
        for (int i=0; i<c.length;i++){
            String u = (String) c[i];
            System.out.println(delimitador);
            String [] d = u.split(delimitador);
            double[] tmp = new double[d.length-s];
            double[] tmpY= new double[s];
            for(int j=0;j<d.length-s;j++){
                double a = Double.parseDouble(d[j]);
                tmp[j] = a;
            }
            System.out.println("* " + s);
            for(int j=(d.length-s); j<d.length;j++){
                double a = Double.parseDouble(d[j]);
                //System.out.println("** " + j);

                tmpY[(j-(d.length-s))]=a;
            }
            X[i]=tmp;
            Y[i]=tmpY;
        }
        //Establecer el lr
        lr = (double) niLR.getValue();
        //Establecer la cantidad de repeticiones
        num_repeticiones =(int) niNR.getValue();
        
         for(int i = 0; i<X.length; i++){
            for(int j = 0; j<X[0].length;j++){
                System.out.print(X[i][j]+ " ");
            }
            System.out.println("");
        }
        for(int i = 0; i<Y.length; i++){
            for(int j = 0; j<Y[0].length;j++){
                System.out.print(Y[i][j]+ " ");
            }
            System.out.println("");
        }
        //EMPIEZA LO CHIDO
        red_neuronal = crearRed(ndatos);

         // Entrenar red
       for(int i= 0; i < num_repeticiones; i++){
           double[][]pY = entrenamiento(red_neuronal,X,Y,(float) lr,true);
       }
       double [][] t= {{0.208502024, 0.466666667, 0.3, 0.0, 1.0, 0.3, 1.0, 0.0},
               {0.36437247, 0.0, 0.3, 1.0, 1.0, 0.925, 0.909090909, 0.0}};
       System.out.println("Termine puto :v");
       
        
        
       
        
        
        
        
       
        
        //System.out.println(casos);
        
    }//GEN-LAST:event_btnEntrenarActionPerformed
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(seleccionado.showDialog(this, "Abrir Archivo") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            contenido = gestion.AbrirTexto(archivo);                                          

            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    File rutaArchivo = seleccionado.getCurrentDirectory();
                    String ruta = rutaArchivo.getAbsolutePath();
                    txtCargar.setText(ruta);
                    System.out.println(ruta);
                    if(cbDelimitado.getSelectedItem()==","){
                        delimitador = ",";
                        if(contenido.size()==0){
                            System.out.println(contenido.size());
                            System.out.println(contenido);
                            JOptionPane.showMessageDialog(null, "Archivo no delimitado por comas","Archivo inválido", JOptionPane.WARNING_MESSAGE);
                        }else{
                            System.out.println(contenido.size());
                            System.out.println(contenido);
                            JOptionPane.showMessageDialog(null, "Archivo cargado exitosamente","Archivo válido", JOptionPane.INFORMATION_MESSAGE);
                    }
                    }else if(cbDelimitado.getSelectedItem()==";"){
                        //contenido = gestion.AbrirTexto(archivo);
                        delimitador = ";";
                        if(contenido.size()==0){
                            JOptionPane.showMessageDialog(null, "Archivo no delimitado por punto y comas", "Archivo inválido", JOptionPane.WARNING_MESSAGE);
                        }else{
                            System.out.println(contenido.size());
                            System.out.println(contenido);
                            JOptionPane.showMessageDialog(null, "Archivo cargado exitosamente","Archivo válido", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else if(cbDelimitado.getSelectedItem()=="tab"){
                            delimitador = "\t";

                           // contenido = gestion.AbrirTexto(archivo);
                            if(contenido.size()==0){
                                JOptionPane.showMessageDialog(null, "Archivo no delimitado por tabulaciones", "Archivo inválido", JOptionPane.WARNING_MESSAGE);
                            }else{
                                System.out.println(contenido.size());
                                System.out.println(contenido);
                                JOptionPane.showMessageDialog(null, "Archivo cargado exitosamente","Archivo válido", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else if(cbDelimitado.getSelectedItem()=="espacio"){
                            //contenido = gestion.AbrirTexto(archivo);
                            delimitador = " ";

                            if(contenido.size()==0){
                                JOptionPane.showMessageDialog(null, "Archivo no delimitado por espacios", "Archivo inválido", JOptionPane.WARNING_MESSAGE);
                            }else{
                                System.out.println(contenido.size());
                                System.out.println(contenido);
                                JOptionPane.showMessageDialog(null, "Archivo cargado exitosamente","Archivo válido", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }else{
                    JOptionPane.showMessageDialog(null, "Archivo incompatible", "Archivo inválido", JOptionPane.ERROR_MESSAGE);
                }
                }
            }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbDelimitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDelimitadoActionPerformed
         if(cbDelimitado.getSelectedItem()==","){
            delimitador = ",";       
        }else if(cbDelimitado.getSelectedItem()==";"){                      
            delimitador = ";";                       
        }else if(cbDelimitado.getSelectedItem()=="tab"){
            delimitador = "\t";
        }else if(cbDelimitado.getSelectedItem()=="espacio"){
            delimitador = " ";
        }
    }//GEN-LAST:event_cbDelimitadoActionPerformed
       
    private void niNCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_niNCFocusLost

    }//GEN-LAST:event_niNCFocusLost

    private void niNCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niNCMouseReleased

    }//GEN-LAST:event_niNCMouseReleased

    private void niNCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_niNCFocusGained

    }//GEN-LAST:event_niNCFocusGained

    private void txtCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargarActionPerformed

    private void txtCargarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCargarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargarFocusLost

    private void niNCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_niNCKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_niNCKeyPressed

    private void btnEstablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerActionPerformed
        int cantNO = (Integer)niNC.getValue();
        arquitectura = new int[cantNO];
        for(int i=0;i<cantNO;i++){
            String tmp = JOptionPane.showInputDialog(null,"Ingrese cantidad de neuronas ocultas de la capa "+(i+1),"Cantidad de neuronas ocultas",JOptionPane.INFORMATION_MESSAGE);
            int a = Integer.parseInt(tmp);
            if(a==0){
                JOptionPane.showMessageDialog(null, "Cantidad de neuronas inválidas", "Error de cantidad", JOptionPane.WARNING_MESSAGE);
                break;
            }else{
                arquitectura[i]=a;
            }
        }
        System.out.println(arquitectura.length);
        for(int j=0;j<arquitectura.length;j++){
            System.out.println(arquitectura[j]);
        }
    }//GEN-LAST:event_btnEstablecerActionPerformed

    private void btnEstablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstablecerMouseClicked
        if((Integer)niNC.getValue()==0){
            JOptionPane.showMessageDialog(null, "Número de capas no establecidas", "Error de capas", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEstablecerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frm_prueba abrirForm = new frm_prueba(){
            @Override
            public void dispose(){
                //Cerramos vNueva
                super.dispose();
                //Hacemos visible la principal
                getFrame().setVisible(true);
                
            }
        };
        abrirForm.setVisible(true);
        abrirForm.setRedNeuronal(red_neuronal);
        abrirForm.setY(Y);

    }//GEN-LAST:event_jButton1ActionPerformed
    private JFrame getFrame(){
        return this;
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
            java.util.logging.Logger.getLogger(frm_entrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_entrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_entrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_entrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_entrenamiento().setVisible(true);
            }
        });
        
        // arquitectura
        
        // X
        System.out.println("****");
        System.out.println(ndatos);
        // Y
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBuscar;
    private java.awt.Button btnEntrenar;
    private java.awt.Button btnEstablecer;
    private javax.swing.JComboBox<String> cbDelimitado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner niLR;
    private javax.swing.JSpinner niNC;
    private javax.swing.JSpinner niNE;
    private javax.swing.JSpinner niNR;
    private javax.swing.JSpinner niNS;
    private javax.swing.JTextField txtCargar;
    // End of variables declaration//GEN-END:variables
    
    class imagenFondo extends JPanel{
        private Image imagen;
        public void paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("VNeurona.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
