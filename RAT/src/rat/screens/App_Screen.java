/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rat.screens;

import RAT.models.Order;
import RAT.models.MenuItem;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import rat.resources.*;

/**
 *
 * @author kingr
 */
public class App_Screen extends javax.swing.JFrame {
    private DefaultTableModel tableModel1,tableModel2;
    private DefaultListModel listModel1,listModel2;
    private MenuDbHandler menuDb;
    private OrderDbHandler ordersDb;
    private ArrayList<MenuItem> currentOrderItems;
    private ArrayList<Order> orders;


    public App_Screen() {
 initComponents();
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("Rate-a-Touille");
        setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        setResizable(false);
        
        currentOrderItems=new ArrayList();
        menuDb=new MenuDbHandler();
        ordersDb=new OrderDbHandler();
        
        tableModel1=new DefaultTableModel();
        listModel1=new DefaultListModel();
        orderItemsList.setModel(listModel1);
        
        tableModel1.addColumn("NAME");
        tableModel1.addColumn("PRICE");
        
        menuTable.setModel(tableModel1);
        
        ArrayList<MenuItem> items=menuDb.getMenu();
        
        for(MenuItem item:items){
            tableModel1.addRow(new String[]{item.getName(),String.valueOf(item.getPrice())});
        }
        
        initOrdersListModel();
        initDetailsTableModel();
    }
    
    private void initOrdersListModel(){
        listModel2=new DefaultListModel();
        orders=Utils.arrangeOrders(ordersDb.getOrders());
        for(Order order:orders){
            listModel2.addElement("Order: "+order.getId());
        }
        ordersList.setModel(listModel2);
    }
    
    private void initDetailsTableModel(){
        tableModel2=new DefaultTableModel();
        detailsTable.setModel(tableModel2);
        tableModel2.addColumn("NAME");
        tableModel2.addColumn("PRICE");
        tableModel2.addColumn("QUANTITY");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemsList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        addMenuItemBtn = new javax.swing.JButton();
        removeMenuItemBtn = new javax.swing.JButton();
        placeOrderBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordersList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();
        totalLabel = new javax.swing.JLabel();
        showDetailsBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        QtyField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1062, 805));

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 27)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rate-a-Touille");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Veg Biriyani", "200"},
                {"Babycorn", "400"},
                {"Pasta", "300"},
                {null, null}
            },
            new String [] {
                "NAME", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(menuTable);

        jScrollPane2.setViewportView(orderItemsList);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setText("Quantity :");

        addMenuItemBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addMenuItemBtn.setText("Add");
        addMenuItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemBtnActionPerformed(evt);
            }
        });

        removeMenuItemBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        removeMenuItemBtn.setText("Remove");
        removeMenuItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMenuItemBtnActionPerformed(evt);
            }
        });

        placeOrderBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        placeOrderBtn.setText("Place Order");
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Orders");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane3.setViewportView(ordersList);

        jScrollPane4.setViewportView(detailsTable);

        totalLabel.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        totalLabel.setText("Total :");

        showDetailsBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        showDetailsBtn.setText("Show Details");
        showDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDetailsBtnActionPerformed(evt);
            }
        });

        removeBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4)
                                .addComponent(QtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addMenuItemBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeMenuItemBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(placeOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(67, 67, 67)
                                .addComponent(showDetailsBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshBtn))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMenuItemBtn)
                    .addComponent(removeMenuItemBtn)
                    .addComponent(placeOrderBtn)
                    .addComponent(totalLabel)
                    .addComponent(showDetailsBtn)
                    .addComponent(removeBtn)
                    .addComponent(refreshBtn)
                    .addComponent(QtyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(305, 305, 305))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String date = df.format(new Date());
        String orderItems="";
        for (MenuItem item:currentOrderItems){
            orderItems+=item.getId()+":"+item.getQty()+",";
        }
        orderItems=orderItems.substring(0,orderItems.length()-1);
        ordersDb.addOrder2(date,orderItems);
        listModel1.clear();
        QtyField.setText("");
        currentOrderItems.clear();
        initOrdersListModel();
    }//GEN-LAST:event_placeOrderBtnActionPerformed

    private void removeMenuItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMenuItemBtnActionPerformed
        // TODO add your handling code here:
         if(orderItemsList.getSelectedIndex()!=-1){
            currentOrderItems.remove(orderItemsList.getSelectedIndex());
            listModel1.remove(orderItemsList.getSelectedIndex());
        }
    }//GEN-LAST:event_removeMenuItemBtnActionPerformed

    private void addMenuItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemBtnActionPerformed
        // TODO add your handling code here:
         if(menuTable.getSelectedRow()!=-1 && !listModel1.contains((String)menuTable.getValueAt(menuTable.getSelectedRow(),0)) && QtyField.getText().length()!=0){
            String name=(String)menuTable.getValueAt(menuTable.getSelectedRow(), 0);
            currentOrderItems.add(menuDb.QueryByName(name,Integer.parseInt(QtyField.getText())));
            listModel1.addElement(name);
    }//GEN-LAST:event_addMenuItemBtnActionPerformed
    }
    private void showDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDetailsBtnActionPerformed
        // TODO add your handling code here:
      if(ordersList.getSelectedIndex()!=-1){
            initDetailsTableModel();
            Order order=orders.get(ordersList.getSelectedIndex());
            for(MenuItem item: (ArrayList<MenuItem>)order.getItems()){
                String row[]={item.getName(),String.valueOf(item.getPrice()),String.valueOf(item.getQty())};
                tableModel2.addRow(row);
            }
            totalLabel.setText("Total: Rs."+String.format("%5.2f", order.getTotal()));
        }
    }//GEN-LAST:event_showDetailsBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
          if(ordersList.getSelectedIndex()!=-1){
            ordersDb.removeOrder(orders.get(ordersList.getSelectedIndex()).getId());
            orders.remove(ordersList.getSelectedIndex());
            listModel2.remove(ordersList.getSelectedIndex());
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        initOrdersListModel();
    }//GEN-LAST:event_refreshBtnActionPerformed
 
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
            java.util.logging.Logger.getLogger(App_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QtyField;
    private javax.swing.JButton addMenuItemBtn;
    private javax.swing.JTable detailsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable menuTable;
    private javax.swing.JList<String> orderItemsList;
    private javax.swing.JList<String> ordersList;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton removeMenuItemBtn;
    private javax.swing.JButton showDetailsBtn;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

}

