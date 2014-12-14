package pl.polsl.Szymon.Bartnik.views;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import pl.polsl.Szymon.Bartnik.models.exceptions.ServerAnswerException;
import pl.polsl.Szymon.Bartnik.models.NumeralSystemsCalculatorClient;

/**
 * Application is simple calculator of numeral systems which can operate
 * (for now) on decimal and binary numbers using object-oriented architecture.
 * 
 * @author Szymon Bartnik (grupa 2)
 * @version 1.1
 */
public class MainDialog extends javax.swing.JFrame {

    /** Stores instance of NumeralSystemsCalculator service */
    NumeralSystemsCalculatorClient service;
    
    /**
     * Creates new instance of MainDialogClass
     */
    public MainDialog() {
        initComponents();
        executeMyInit();
        
        // Run connecting to server asynchronously
        new ConnectToServerWorker().execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        upperMainPanel = new javax.swing.JPanel();
        panelInputNumeralSystem = new javax.swing.JPanel();
        labelInputNumeralSystem = new javax.swing.JLabel();
        inputNumeralSystemComboBox = new javax.swing.JComboBox();
        panelOutpuNumeralSystem = new javax.swing.JPanel();
        labelOutputNumeralSystem = new javax.swing.JLabel();
        outputNumeralSystemComboBox = new javax.swing.JComboBox();
        panelInputNumberToConvert = new javax.swing.JPanel();
        labelInputNumberToConvert = new javax.swing.JLabel();
        inputNumberToConvert = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultsHistoryTable = new javax.swing.JTable();
        mainToolbar = new javax.swing.JToolBar();
        ComputeNumber = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        upperMainPanel.setMaximumSize(new java.awt.Dimension(32767, 180));
        upperMainPanel.setMinimumSize(new java.awt.Dimension(0, 180));
        upperMainPanel.setPreferredSize(new java.awt.Dimension(645, 180));

        panelInputNumeralSystem.setMaximumSize(new java.awt.Dimension(32767, 70));
        panelInputNumeralSystem.setMinimumSize(new java.awt.Dimension(100, 70));
        panelInputNumeralSystem.setPreferredSize(new java.awt.Dimension(267, 70));

        labelInputNumeralSystem.setText("Input numeral system:");

        inputNumeralSystemComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelInputNumeralSystemLayout = new javax.swing.GroupLayout(panelInputNumeralSystem);
        panelInputNumeralSystem.setLayout(panelInputNumeralSystemLayout);
        panelInputNumeralSystemLayout.setHorizontalGroup(
            panelInputNumeralSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputNumeralSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInputNumeralSystem)
                .addGap(18, 18, 18)
                .addComponent(inputNumeralSystemComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInputNumeralSystemLayout.setVerticalGroup(
            panelInputNumeralSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputNumeralSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputNumeralSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInputNumeralSystem)
                    .addComponent(inputNumeralSystemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelOutpuNumeralSystem.setMaximumSize(new java.awt.Dimension(32767, 70));
        panelOutpuNumeralSystem.setMinimumSize(new java.awt.Dimension(0, 70));
        panelOutpuNumeralSystem.setPreferredSize(new java.awt.Dimension(192, 70));

        labelOutputNumeralSystem.setText("Output numeral system:");

        outputNumeralSystemComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelOutpuNumeralSystemLayout = new javax.swing.GroupLayout(panelOutpuNumeralSystem);
        panelOutpuNumeralSystem.setLayout(panelOutpuNumeralSystemLayout);
        panelOutpuNumeralSystemLayout.setHorizontalGroup(
            panelOutpuNumeralSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOutpuNumeralSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOutputNumeralSystem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputNumeralSystemComboBox, 0, 131, Short.MAX_VALUE))
        );
        panelOutpuNumeralSystemLayout.setVerticalGroup(
            panelOutpuNumeralSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOutpuNumeralSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOutpuNumeralSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOutputNumeralSystem)
                    .addComponent(outputNumeralSystemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelInputNumberToConvert.setMaximumSize(new java.awt.Dimension(32767, 140));
        panelInputNumberToConvert.setMinimumSize(new java.awt.Dimension(100, 140));
        panelInputNumberToConvert.setPreferredSize(new java.awt.Dimension(366, 140));

        labelInputNumberToConvert.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelInputNumberToConvert.setText("Number to convert:");

        inputNumberToConvert.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        inputNumberToConvert.setText("Type here...");

        javax.swing.GroupLayout panelInputNumberToConvertLayout = new javax.swing.GroupLayout(panelInputNumberToConvert);
        panelInputNumberToConvert.setLayout(panelInputNumberToConvertLayout);
        panelInputNumberToConvertLayout.setHorizontalGroup(
            panelInputNumberToConvertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputNumberToConvertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInputNumberToConvert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumberToConvert, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInputNumberToConvertLayout.setVerticalGroup(
            panelInputNumberToConvertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputNumberToConvertLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelInputNumberToConvert, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(panelInputNumberToConvertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputNumberToConvert)
                .addContainerGap())
        );

        javax.swing.GroupLayout upperMainPanelLayout = new javax.swing.GroupLayout(upperMainPanel);
        upperMainPanel.setLayout(upperMainPanelLayout);
        upperMainPanelLayout.setHorizontalGroup(
            upperMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOutpuNumeralSystem, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(panelInputNumeralSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInputNumberToConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        upperMainPanelLayout.setVerticalGroup(
            upperMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInputNumberToConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(upperMainPanelLayout.createSequentialGroup()
                        .addComponent(panelInputNumeralSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelOutpuNumeralSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jSplitPane2.setTopComponent(upperMainPanel);
        upperMainPanel.getAccessibleContext().setAccessibleName("");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(452, 300));

        resultsHistoryTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        resultsHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(resultsHistoryTable);

        jSplitPane2.setBottomComponent(jScrollPane2);

        mainToolbar.setFloatable(false);
        mainToolbar.setRollover(true);

        ComputeNumber.setBackground(new java.awt.Color(204, 204, 204));
        ComputeNumber.setText("Compute number");
        ComputeNumber.setAlignmentY(2.0F);
        ComputeNumber.setEnabled(false);
        ComputeNumber.setFocusable(false);
        ComputeNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ComputeNumber.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ComputeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeNumberActionPerformed(evt);
            }
        });
        mainToolbar.add(ComputeNumber);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addComponent(mainToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *  Invoked when user clicks x button of the window
     * 
     * @param evt describes context of action which invoked the method
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        this.formWindowClosing(null);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * Invoked when user clicked computation button. 
     * 
     * @param evt describes context of action which invoked the method
     */
    private void computeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeNumberActionPerformed
        
        
        if(inputNumberToConvert.getText().isEmpty()){           
            JOptionPane.showMessageDialog(null, "You have to type number to convert");
            return;
        }
        // Run computing the number asynchronously
        new ComputeNumberWorker().execute();
    }//GEN-LAST:event_computeNumberActionPerformed

    /**
     * Worker which computes the number in the backgroun
     */
    private class ComputeNumberWorker extends SwingWorker<Object[], Void> {
        
        /**
         * Computes number on the server in the background.
         * @return hello message if the connection was successfull
         */
        @Override
        public Object[] doInBackground() {
            try {
                
                // Computes and stores the computation result if was successfull
                Object[] result = service.convertNumber(
                        (String)inputNumeralSystemComboBox.getSelectedItem(),
                        (String)outputNumeralSystemComboBox.getSelectedItem(),
                        inputNumberToConvert.getText());

                return result;
            
            } catch (IOException | ServerAnswerException e) {
                // Show alert if any error occured during the computation
                JOptionPane.showMessageDialog(null, e.getMessage());
                return null;
            }
        }

        /**
         * Executes when the background function is done.
         */
        @Override
        protected void done() {
            
            try {
                Object[] computationResult = get();
            
                if(computationResult == null)
                    return;
                
                computationFinished(computationResult);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    /**
     * Worker which connects to the server in the background
     */
    private class ConnectToServerWorker extends SwingWorker<String, Void> {
        
        /**
         * Connects to the server in the background.
         * @return hello message if the connection was successfull
         */
        @Override
        public String doInBackground() {
            try {
                Socket socket = new Socket("localhost", 8298);
                System.out.println("Successfully connected to: " + socket.getInetAddress());
                
                // Creating the instance of numeral systems calculator client
                service = new NumeralSystemsCalculatorClient(socket);
                
                return service.getHelloMessage();
                
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null, "Error while trying to connect to the server: " + e.getMessage());
                return null;
            }
        }

        /**
         * Executes when the background function is done.
         */
        @Override
        protected void done() {
            try {
                if(get() != null){
                    ComputeNumber.setEnabled(true);
                    JOptionPane.showMessageDialog(null, get());
                }
            } catch (Exception ex) { }
        }
    }
    
    /**
     * Executes when requested closing the form. Shows the prompt ensuring
     * the user really wants to exit the program.
     * 
     * @param evt describes the context of action which invoked the method.
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        // shows the prompt and stores result
        int exitResponse = JOptionPane.showConfirmDialog(
                null, 
                "Do you want to exit?", 
                "Confirm exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        // perform form exit when user selected this option
        if(exitResponse == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * Main method of the application.
     * @param args
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
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new MainDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComputeNumber;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField inputNumberToConvert;
    private javax.swing.JComboBox inputNumeralSystemComboBox;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel labelInputNumberToConvert;
    private javax.swing.JLabel labelInputNumeralSystem;
    private javax.swing.JLabel labelOutputNumeralSystem;
    private javax.swing.JToolBar mainToolbar;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JComboBox outputNumeralSystemComboBox;
    private javax.swing.JPanel panelInputNumberToConvert;
    private javax.swing.JPanel panelInputNumeralSystem;
    private javax.swing.JPanel panelOutpuNumeralSystem;
    private javax.swing.JTable resultsHistoryTable;
    private javax.swing.JPanel upperMainPanel;
    // End of variables declaration//GEN-END:variables
    
    
    private DefaultComboBoxModel<String> inputNumeralSystems;
    private DefaultComboBoxModel<String> outputNumeralSystems;
    
    /**
     * Additional initialization of controls of the form.
     */
    private void executeMyInit() {
        
        initializeNumeralSystemComboboxes();
        initializeResultsHistoryTable();
    }

    /**
     * Executes after successful computation of output number.
     * Adds the computation result to the results history table.
     * 
     * @param result represents computation result storing all required 
     * information about input/output numeral systems and their values.
     */
    private void computationFinished(Object[] result) {
        
        DefaultTableModel model = (DefaultTableModel)resultsHistoryTable.getModel();
        
        // adds the result to the table (first converts).
        model.addRow(result);
    }

    /**
     * Initializes comboboxes controls responsible for storing 
     * selected input and output numeral systems.
     */
    private void initializeNumeralSystemComboboxes() {
        
        // numeral systems which will be available in GUI
        String[] numeralSystemsMnemonics = { "bin", "dec" };
        
        // initialization of model of input numeral system combobox
        inputNumeralSystems = new DefaultComboBoxModel<>(numeralSystemsMnemonics);
        inputNumeralSystemComboBox.setModel(inputNumeralSystems);
        
        // initialization of model of output numeral system combobox
        outputNumeralSystems = new DefaultComboBoxModel<>(numeralSystemsMnemonics);
        outputNumeralSystemComboBox.setModel(outputNumeralSystems);
    }

    /**
     * Initializes computation results history table control
     */
    private void initializeResultsHistoryTable() {
        
        DefaultTableModel resultsTableModel = new DefaultTableModel();
        
        // adding columns required for the table to the model
        resultsTableModel.addColumn("Input num system");
        resultsTableModel.addColumn("Input number");
        resultsTableModel.addColumn("Output num system");
        resultsTableModel.addColumn("Output number");
        
        resultsHistoryTable.setModel(resultsTableModel);
    }
}
