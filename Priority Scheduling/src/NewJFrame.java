
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pabon
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int[] arrival = new int[50];
    int[] brust = new int[50];
    int[] priority = new int[50];
    String Process[] = new String[200];

    int[] arrival1 = new int[50];
    int[] brust1 = new int[50];
    int[] priority1 = new int[50];
    String Process1[] = new String[200];

    int[] store = new int[50];
    int[] start = new int[200];
    int[] nd = new int[200];
    String print[] = new String[200];
    String p[] = new String[200];

    int z = 0;

    int sum = 0;

    public NewJFrame() {

        initComponents();

        String s2 = "P", s3;
        s3 = String.valueOf(1);
        s2 += s3;

        Process[z + 1] = s2;
        Process1[z + 1] = s2;

        jTextField4.setText(s2);
        jTextField4.setEditable(false);
        JFrame frame = new JFrame();
        frame.pack();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jOptionPane2 = new javax.swing.JOptionPane();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CPU Scheduling");

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)), "Priority Scheduling(Preemptive)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Maiandra GD", 1, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jLabel1.setText("Process");

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jLabel2.setText("Arrival Time");

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jLabel3.setText("Brust Time");

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jLabel4.setText("Priority");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Maiandra GD", 1, 20)); // NOI18N

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Maiandra GD", 1, 20)); // NOI18N

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Maiandra GD", 1, 20)); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 102, 0));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton1.setText("Take Current Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 102, 0));
        jButton2.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 51, 0));
        jButton3.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton3.setText("Show Gantt Chart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setFont(new java.awt.Font("Maiandra GD", 1, 20)); // NOI18N

        jButton4.setBackground(new java.awt.Color(102, 51, 0));
        jButton4.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        jButton4.setText("Credit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        jButton5.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton5.setText("Taken Processes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addContainerGap(380, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTextField4.getAccessibleContext().setAccessibleName("");
        jTextField4.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int a, b, c;
        String s1 = "", s2 = "", s3 = "";

        s1 = jTextField1.getText();
        s2 = jTextField2.getText();
        s3 = jTextField3.getText();

        if (s1.equals("") || s2.equals("") || s3.equals("")) {
            JOptionPane.showMessageDialog(null, "Please insert required values.\n");
        } else {
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            c = Integer.parseInt(s3);

            arrival[z + 1] = a;
            brust[z + 1] = b;
            priority[z + 1] = c;

            sum += b;

            arrival1[z + 1] = a;
            brust1[z + 1] = b;
            priority1[z + 1] = c;

            ++z;
            //System.out.println("" + z);

            jTextField1.setEditable(false);
            jTextField2.setEditable(false);
            jTextField3.setEditable(false);

            JOptionPane.showMessageDialog(null, "Current Process has Taken.\n");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        // System.out.println("" + Process[z]);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);

        String s2 = "P", s3;
        s3 = String.valueOf(z + 1);
        s2 += s3;
        Process[z + 1] = s2;
        Process1[z + 1] = s2;

        jTextField4.setText(s2);
        jTextField4.setEditable(false);

        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "1.Shahnawaz Hossan Pabon\nReg: 2012331531\n2.Enamul Haque Shawon\nReg: 2012331520"
                + "\n3.Debabrata Barman\nReg: 2012331546\nStudents of\nYear: 3rd\nSemester: 5th");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if (z == 0) {

            JOptionPane.showMessageDialog(null, "Please take process correctly.");

        } else {
            int process = z;

            int i, j, k, remain = z, temp, a = 0;

            String temp1;

            for (i = 1; i <= process; i++) {
                for (j = 1; j < process; j++) {
                    if (arrival[j] > arrival[j + 1]) {
                        temp = arrival[j];
                        arrival[j] = arrival[j + 1];
                        arrival[j + 1] = temp;

                        temp = brust[j];
                        brust[j] = brust[j + 1];
                        brust[j + 1] = temp;

                        temp = priority[j];
                        priority[j] = priority[j + 1];
                        priority[j + 1] = temp;

                        temp1 = Process[j];
                        Process[j] = Process[j + 1];
                        Process[j + 1] = temp1;

                    } else if (arrival[j] == arrival[j + 1]) {
                        if (priority[j] > priority[j + 1]) {
                            temp = arrival[j];
                            arrival[j] = arrival[j + 1];
                            arrival[j + 1] = temp;

                            temp = brust[j];
                            brust[j] = brust[j + 1];
                            brust[j + 1] = temp;

                            temp = priority[j];
                            priority[j] = priority[j + 1];
                            priority[j + 1] = temp;

                            temp1 = Process[j];
                            Process[j] = Process[j + 1];
                            Process[j + 1] = temp1;
                        } else if (priority[j] == priority[j + 1]) {
                            if (brust[j] > brust[j + 1]) {
                                temp = arrival[j];
                                arrival[j] = arrival[j + 1];
                                arrival[j + 1] = temp;

                                temp = brust[j];
                                brust[j] = brust[j + 1];
                                brust[j + 1] = temp;

                                temp = priority[j];
                                priority[j] = priority[j + 1];
                                priority[j + 1] = temp;

                                temp1 = Process[j];
                                Process[j] = Process[j + 1];
                                Process[j + 1] = temp1;
                            }
                        }
                    }
                }
            }

            int tag = arrival[1];

            int m = 0, cnt;

            int[] pabon = new int[100];
            int[] shawon = new int[100];

            for (int total_runtime = arrival[1]; remain > 0; total_runtime++) {
                cnt = 0;
                a = 0;

                for (i = 1; i <= process; i++) {
                    if (brust[i] == 0) {
                        cnt++;
                    } else if (brust[i] > 0 && arrival[i] <= total_runtime) {
                        brust[i]--;
                        print[++m] = Process[i];
                        pabon[m] = total_runtime;
                        shawon[m] = total_runtime + 1;
                        break;
                    }
                }

                if (cnt == process) {
                    remain = 0;
                    break;
                }

                for (i = 1; i <= process; i++) {
                    if (arrival[i] <= total_runtime + 1) {
                        a++;
                    }
                }

                for (i = 1; i <= a; i++) {
                    for (j = 1; j < a; j++) {
                        if (priority[j] > priority[j + 1]) {
                            temp = arrival[j];
                            arrival[j] = arrival[j + 1];
                            arrival[j + 1] = temp;

                            temp = brust[j];
                            brust[j] = brust[j + 1];
                            brust[j + 1] = temp;

                            temp = priority[j];
                            priority[j] = priority[j + 1];
                            priority[j + 1] = temp;

                            temp1 = Process[j];
                            Process[j] = Process[j + 1];
                            Process[j + 1] = temp1;
                        } else if (priority[j] == priority[j + 1]) {
                            if (brust[j] > brust[j + 1]) {
                                temp = arrival[j];
                                arrival[j] = arrival[j + 1];
                                arrival[j + 1] = temp;

                                temp = brust[j];
                                brust[j] = brust[j + 1];
                                brust[j + 1] = temp;

                                temp = priority[j];
                                priority[j] = priority[j + 1];
                                priority[j + 1] = temp;

                                temp1 = Process[j];
                                Process[j] = Process[j + 1];
                                Process[j + 1] = temp1;
                            }
                        }
                    }
                }
            }

            k = 0;

            // System.out.println(""+m);
            for (i = 2; i <= m; i++) {

                if (print[i].equals(print[i - 1])) {
                    continue;
                }

                p[++k] = print[i - 1];
                start[k] = tag;
                nd[k] = shawon[i - 1];
                tag = pabon[i];

            }

            if (print[m].equalsIgnoreCase(print[m - 1])) {
                p[++k] = print[m];
                start[k] = tag;
                nd[k] = shawon[m];
            } else {
                p[++k] = print[i - 1];
                start[k] = tag;
                nd[k] = shawon[i - 1];
            }

            String arr[] = new String[200];

            int printEx[] = new int[200];

            int t = 0, t1 = 0, q = 0;

            if (start[1] > 0) {

                arr[++t] = "Wait";
                printEx[++t1] = 0;
                //arr[++p] =
            }

            arr[++t] = p[1];
            printEx[++t1] = start[1];

            for (i = 2; i <= k; i++) {
                if (start[i] != nd[i - 1]) {
                    arr[++t] = "Wait";
                    arr[++t] = p[i];
                    printEx[++t1] = nd[i - 1];
                    printEx[++t1] = start[i];
                } else {
                    arr[++t] = p[i];
                    printEx[++t1] = start[i];
                }
            }

            //System.out.println("" + sum);

            printEx[++t1] = nd[k];

            Graphics g = jPanel2.getGraphics();

            g.setColor(Color.BLACK);

            int x1 = 10, x2 = 10, y1 = 40, y2 = 40;

            int drawstrx1 = (x1 + 15);

            int drawstry1 = 35;

            int drawfirstx1 = x1 - 3;

            int drawfirsty1 = 65;

            int drawsecondx1 = (x1 + y1) - 1;

            int drawsecondy1 = 65;

            int flag = 0, y, f = 0;

            Thread th = new Thread();

            try {

                for (y = 1; y <= t; y++) {

                    for (j = printEx[y]; j < printEx[y + 1]; j++) {

                        // System.out.println("Yes");
                        g.drawRect(x1, x2, y1, y2);

                        if (arr[y].equals("Wait")) {

                            g.drawString("Wait", x1 + 7, drawstry1);

                        } else {

                            g.drawString("" + arr[y], drawstrx1, drawstry1);
                        }

                        x1 = x1 + y1;

                        drawstrx1 = (x1 + 15);

                        th.sleep(700);

//                        x1 = 10;
//                        x2 = 10;
//                        y1 = 40;
//                        y2 = 40;
                        drawfirstx1 = x1 - 3;

                        drawfirsty1 = 65;

                        drawsecondx1 = (x1 + y1) - 1;

                        drawsecondy1 = 65;
                    }
                }

            } catch (Exception e) {
                System.out.println("Exception");
            }

            x1 = 10;
            x2 = 10;
            y1 = 40;
            y2 = 40;
            drawfirstx1 = x1 - 3;

            drawfirsty1 = 65;

            drawsecondx1 = (x1 + y1) - 1;

            drawsecondy1 = 65;

            try {

                for (i = 1; i < 2; i++) {

                    for (j = printEx[i]; j < printEx[i + 1]; j++) {

                        g.drawString("" + printEx[i], drawfirstx1, drawfirsty1);

                        x1 = x1 + y1;

                        drawfirstx1 = x1 - 3;

                        th.sleep(700);

                        printEx[i]++;
                    }
                }

            } catch (Exception e) {
                System.out.println("Exception");
            }

            try {

                for (i = 2; i < t1; i++) {

                    for (j = printEx[i]; j < printEx[i + 1]; j++) {

                        g.drawString("" + printEx[i], drawfirstx1, drawfirsty1);

                        x1 = x1 + y1;

                        drawfirstx1 = x1 - 3;

                        th.sleep(700);

                        printEx[i]++;
                    }
                }
                g.drawString("" + printEx[i], drawfirstx1, drawfirsty1);

//                x1 = x1 + y1;
//
//                drawfirstx1 = x1 - 3;
//
//                th.sleep(700);
//
//                printEx[i]++;

            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        NewJFrame1 nf = new NewJFrame1();

        DefaultTableModel mdl = (DefaultTableModel) nf.jTable1.getModel();

        nf.setVisible(true);

        mdl.setRowCount(0);

        for (int i = 1; i <= z; i++) {

            String s = Process1[i];
            int a = arrival1[i];
            int b = brust1[i];
            int c = priority1[i];

            mdl.addRow(new Object[]{s, a, b, c});
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Maiandra GD", Font.BOLD, 20)));

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
