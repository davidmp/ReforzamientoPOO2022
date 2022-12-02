/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.upeu.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import pe.edu.upeu.dao.ResultadoDao;
import pe.edu.upeu.dao.ResultadoDaoI;
import pe.edu.upeu.modelo.ResultadoTO;

/**
 *
 * @author Lab Software
 */
public class MainCalc extends javax.swing.JFrame implements ActionListener{
    
    JButton[] boton=new JButton[20];
    String[] contenidoCal={"AC", "C", "%", "/",
                           "7","8","9","*",
                           "4","5","6","-",
                           "1","2","3","+",
                           ".","0","00","="};

    public MainCalc() {
        initComponents();
        jPanelButton.setLayout(new BorderLayout());
        jPanelButton.setLayout(new GridLayout(5, 4));
        btnInicio();
        listarREsultados();
    }
    
    public void btnInicio(){
        jPanelButton.removeAll();
        for (int i = 0; i < 20; i++) {
            boton[i]=new JButton(contenidoCal[i]);
            boton[i].setFont(new Font("Ink Free",Font.BOLD,15));
            jPanelButton.add(boton[i]);
            boton[i].addActionListener(this);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jPanelButton = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanelButton.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Num1", "Num2", "Operador", "Resultado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

    int valA=0, valB=0;
    char oper=' ';    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 20; i++) {
            if(e.getSource()==boton[i]){                   
                operador(boton[i].getText());
            }            
        }
    }
    
    public void operador(String data){
    if(data.equals("+") || data.equals("-") || data.equals("*") 
            || data.equals("/") || data.equals("%")){
            valA=Integer.parseInt(txtResult.getText());
            txtResult.setText("");
            oper=data.charAt(0);
        }else if(data.equals("AC") || data.equals("C")){
            valA=0;
            valB=0;
            oper=' ';
            
        }else if(data.charAt(0)=='='){
            operResultado(data);           
        }else{
                String datax=txtResult.getText()+data;
                txtResult.setText(datax);
                //operador(data);        
        }
    }    
    public void operResultado(String operResult){
        System.out.println("V"+operResult);
        valB=Integer.parseInt(txtResult.getText());
        switch (oper) {
            case '+': txtResult.setText(String.valueOf( valA+valB));registrarOperacion();  break;
            case '-': txtResult.setText(String.valueOf( valA-valB));registrarOperacion(); break;
            case '*': txtResult.setText(String.valueOf( valA*valB));registrarOperacion(); break;
            case '/': txtResult.setText(String.valueOf( valA/valB));registrarOperacion(); break;
            case '%': txtResult.setText(String.valueOf( valA%valB));registrarOperacion(); break;
            default: System.err.println("Error");
        }
    }
    
    public void  registrarOperacion(){
        ResultadoTO to=new ResultadoTO();
        to.setNum1(valA);
        to.setNum2(valB);
        to.setOperador(String.valueOf(oper));
        to.setResult(Double.parseDouble(txtResult.getText()));
        ResultadoDaoI dao=new ResultadoDao();
        dao.crearResultado(to);
        listarREsultados();
    }
    
    DefaultTableModel model;
    
    public void listarREsultados(){
        ResultadoDaoI dao=new ResultadoDao();
        List<ResultadoTO> lista=dao.listarResultados();
        model=(DefaultTableModel)jTable1.getModel();
        model.setNumRows(0);
        Object[] ob=new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            int x=-1;
            ob[++x]=lista.get(i).getIdResultado();
            ob[++x]=lista.get(i).getNum1();
            ob[++x]=lista.get(i).getNum2();
            ob[++x]=lista.get(i).getOperador();
            ob[++x]=lista.get(i).getResult();
            model.addRow(ob);
        }                
    }
    
}
