/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebookgui;

import java.util.Arrays;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows User
 */
public class GradebookGUI extends javax.swing.JFrame {

    /**
     * Creates new form GradebookGUI
     */
    public GradebookGUI() {
        initComponents();
        runProgram();
    }

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
            java.util.logging.Logger.getLogger(GradebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>








        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradebookGUI().setVisible(true);

            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_SelectStudent = new javax.swing.JButton();
        btn_SelectTeacher = new javax.swing.JButton();
        btn_SelectAdmin = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelStudent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_StudentId = new javax.swing.JTextField();
        lbl_StudentName = new javax.swing.JLabel();
        lbl_CourseName = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        scroll_TeacherGrades3 = new javax.swing.JScrollPane();
        tbl_StudentGrades = new javax.swing.JTable();
        panelTeacher = new javax.swing.JPanel();
        panel_EnterGrade = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txt_EnterGradeStudentId = new javax.swing.JTextField();
        txt_EnterGradeCourseId = new javax.swing.JTextField();
        txt_EnterGradeNr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_EnterGradeStudentName = new javax.swing.JLabel();
        lbl_EnterGradeCourseName = new javax.swing.JLabel();
        panel_ViewGrade = new javax.swing.JPanel();
        scroll_TeacherGrades = new javax.swing.JScrollPane();
        tbl_TeacherGrades = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_TeacherId = new javax.swing.JTextField();
        lbl_TeacherName = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbl_EnterGradeStudentName1 = new javax.swing.JLabel();
        lbl_EnterGradeCourseName1 = new javax.swing.JLabel();
        txt_EnterGradeCourseId1 = new javax.swing.JTextField();
        txt_EnterGradeStudentId1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_EnterGradeNr1 = new javax.swing.JTextField();
        btn_EditGrade = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelAdmin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_AddCourseId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_AddCourseName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        scroll_TeacherGrades1 = new javax.swing.JScrollPane();
        tbl_CourseList = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        scroll_TeacherGrades2 = new javax.swing.JScrollPane();
        tbl_AdminGrades = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gradebook Appliation");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_SelectStudent.setText("Student");
        btn_SelectStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectStudentActionPerformed(evt);
            }
        });

        btn_SelectTeacher.setText("Teacher");
        btn_SelectTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectTeacherActionPerformed(evt);
            }
        });

        btn_SelectAdmin.setText("Administrator");
        btn_SelectAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectAdminActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_SelectAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_SelectTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_SelectStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_SelectStudent)
                .addGap(18, 18, 18)
                .addComponent(btn_SelectTeacher)
                .addGap(18, 18, 18)
                .addComponent(btn_SelectAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 580, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelStudent.setName("pStudent"); // NOI18N

        jLabel1.setText("Student Id:");

        txt_StudentId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_StudentIdFocusLost(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Grades"));

        tbl_StudentGrades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll_TeacherGrades3.setViewportView(tbl_StudentGrades);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_TeacherGrades3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_TeacherGrades3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelStudentLayout = new javax.swing.GroupLayout(panelStudent);
        panelStudent.setLayout(panelStudentLayout);
        panelStudentLayout.setHorizontalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_StudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_CourseName, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelStudentLayout.setVerticalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStudentLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_StudentName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_CourseName))
                    .addGroup(panelStudentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student", panelStudent);

        panel_EnterGrade.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Grade"));

        jButton1.setText("Add Grade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_EnterGradeStudentId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_EnterGradeStudentIdFocusLost(evt);
            }
        });

        txt_EnterGradeCourseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EnterGradeCourseIdActionPerformed(evt);
            }
        });
        txt_EnterGradeCourseId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_EnterGradeCourseIdFocusLost(evt);
            }
        });

        jLabel6.setText("Student Id:");

        jLabel7.setText("Course Id");

        jLabel8.setText("Grade:");

        lbl_EnterGradeStudentName.setText(" ");

        lbl_EnterGradeCourseName.setText(" ");

        javax.swing.GroupLayout panel_EnterGradeLayout = new javax.swing.GroupLayout(panel_EnterGrade);
        panel_EnterGrade.setLayout(panel_EnterGradeLayout);
        panel_EnterGradeLayout.setHorizontalGroup(
            panel_EnterGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EnterGradeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_EnterGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(panel_EnterGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_EnterGradeCourseId)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_EnterGradeNr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_EnterGradeStudentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_EnterGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_EnterGradeCourseName, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(lbl_EnterGradeStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel_EnterGradeLayout.setVerticalGroup(
            panel_EnterGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EnterGradeLayout.createSequentialGroup()
                .addGroup(panel_EnterGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EnterGradeStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_EnterGradeStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_EnterGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EnterGradeCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_EnterGradeCourseName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_EnterGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EnterGradeNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panel_ViewGrade.setBorder(javax.swing.BorderFactory.createTitledBorder("View Grades"));

        tbl_TeacherGrades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll_TeacherGrades.setViewportView(tbl_TeacherGrades);
        tbl_TeacherGrades.getAccessibleContext().setAccessibleDescription("");
        tbl_TeacherGrades.getAccessibleContext().setAccessibleParent(panel_ViewGrade);

        javax.swing.GroupLayout panel_ViewGradeLayout = new javax.swing.GroupLayout(panel_ViewGrade);
        panel_ViewGrade.setLayout(panel_ViewGradeLayout);
        panel_ViewGradeLayout.setHorizontalGroup(
            panel_ViewGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ViewGradeLayout.createSequentialGroup()
                .addComponent(scroll_TeacherGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );
        panel_ViewGradeLayout.setVerticalGroup(
            panel_ViewGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ViewGradeLayout.createSequentialGroup()
                .addComponent(scroll_TeacherGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );

        jLabel3.setText("Enter Teacher Id:");

        txt_TeacherId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_TeacherIdFocusLost(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Grade"));

        lbl_EnterGradeStudentName1.setText(" ");

        lbl_EnterGradeCourseName1.setText(" ");

        txt_EnterGradeCourseId1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_EnterGradeCourseId1FocusLost(evt);
            }
        });

        txt_EnterGradeStudentId1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_EnterGradeStudentId1FocusLost(evt);
            }
        });

        jLabel11.setText("Student Id:");

        btn_EditGrade.setText("Save");
        btn_EditGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditGradeActionPerformed(evt);
            }
        });

        jLabel12.setText("Course Id");

        jLabel13.setText("Grade:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_EnterGradeCourseId1)
                    .addComponent(btn_EditGrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(txt_EnterGradeNr1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_EnterGradeStudentId1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_EnterGradeCourseName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_EnterGradeStudentName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EnterGradeStudentId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(lbl_EnterGradeStudentName1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EnterGradeCourseId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(lbl_EnterGradeCourseName1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EnterGradeNr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(26, 26, 26)
                .addComponent(btn_EditGrade)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout panelTeacherLayout = new javax.swing.GroupLayout(panelTeacher);
        panelTeacher.setLayout(panelTeacherLayout);
        panelTeacherLayout.setHorizontalGroup(
            panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeacherLayout.createSequentialGroup()
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTeacherLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_EnterGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(panel_ViewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTeacherLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_TeacherId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_TeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTeacherLayout.setVerticalGroup(
            panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_TeacherId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TeacherName))
                .addGap(39, 39, 39)
                .addGroup(panelTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_ViewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTeacherLayout.createSequentialGroup()
                        .addComponent(panel_EnterGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Teacher", panelTeacher);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Courses"));

        jButton2.setText("Add Course");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Course Id:");

        jLabel10.setText("Course Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_AddCourseId)
                            .addComponent(txt_AddCourseName, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AddCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_AddCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Courses"));

        tbl_CourseList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll_TeacherGrades1.setViewportView(tbl_CourseList);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(scroll_TeacherGrades1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_TeacherGrades1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("All Grades"));

        tbl_AdminGrades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll_TeacherGrades2.setViewportView(tbl_AdminGrades);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(scroll_TeacherGrades2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_TeacherGrades2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Administrator", panelAdmin);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows User\\Desktop\\logo.png")); // NOI18N
        jLabel5.setText(" ");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ECPI Gradebook");
        getContentPane().add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SelectTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectTeacherActionPerformed
        this.jTabbedPane1.setEnabledAt(0, false);
        this.jTabbedPane1.setEnabledAt(1, true);
        this.jTabbedPane1.setEnabledAt(2, false);
        this.jTabbedPane1.setVisible(true);
//        this.panelStudent.setVisible(false);
//        this.panelTeacher.setVisible(true);
//        this.panelAdmin.setVisible(false);
//        this.panelStudent.setEnabled(false);
//        this.panelTeacher.setEnabled(true);
        this.jTabbedPane1.setSelectedIndex(1);


        //Disable the teacher panels until the teacher Id is entered
        this.panel_EnterGrade.setEnabled(false);
        this.panel_ViewGrade.setEnabled(false);
        this.tbl_TeacherGrades.setEnabled(false);
        this.scroll_TeacherGrades.setEnabled(false);
        this.lbl_TeacherName.setText("");

    }//GEN-LAST:event_btn_SelectTeacherActionPerformed

    private void btn_SelectStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectStudentActionPerformed
        this.jTabbedPane1.setEnabledAt(0, true);
        this.jTabbedPane1.setEnabledAt(1, false);
        this.jTabbedPane1.setEnabledAt(2, false);
        this.jTabbedPane1.setVisible(true);
//        this.panelStudent.setVisible(true);
//        this.panelTeacher.setVisible(false);
//        this.panelAdmin.setVisible(false);
//        this.panelStudent.setEnabled(true);
//        this.panelTeacher.setEnabled(false);
//        this.panelAdmin.setEnabled(false);
        this.jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btn_SelectStudentActionPerformed

    private void btn_SelectAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectAdminActionPerformed
        this.jTabbedPane1.setEnabledAt(0, false);
        this.jTabbedPane1.setEnabledAt(1, false);
        this.jTabbedPane1.setEnabledAt(2, true);// TODO add your handling code here:
        this.jTabbedPane1.setVisible(true);
//        this.panelStudent.setVisible(false);
//        this.panelTeacher.setVisible(false);
//        this.panelAdmin.setVisible(true);
//        this.panelStudent.setEnabled(false);
//        this.panelTeacher.setEnabled(false);
//        this.panelAdmin.setEnabled(true);
        this.jTabbedPane1.setSelectedIndex(2);

        //Populate the existing courses
        this.listCourses();
        this.listAllGrades();

    }//GEN-LAST:event_btn_SelectAdminActionPerformed

    private void listAllGrades() {




        //Loop through all the g rades to find the grade array that contains teacher name
        for (int i = 0; i < myTeacher.length; i++) {







            //Set the model for the table
            DefaultTableModel myModel = new DefaultTableModel();
            this.tbl_AdminGrades.setModel(myModel);

            myModel.setColumnIdentifiers(new String[]{"StudentId", "Student Name", "CourseId", "Course Name", "Grade"});


            //Populate the panel with the  grades for the teacher's students
            for (int j = 0; j < myGrade.length; j++) {


                //Populate the table
                myModel.addRow(new String[]{myGrade[j].getStudentNr(), getStudentName(myGrade[j].getStudentNr()), myGrade[j].getCourseNr(), getCourseName(myGrade[j].getCourseNr()), myGrade[j].getGradeNr()});





            }

            break;



        }

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jTabbedPane1.setEnabledAt(0, false);
        this.jTabbedPane1.setEnabledAt(1, false);
        this.jTabbedPane1.setEnabledAt(2, false);
        this.jTabbedPane1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public void showGradesByStudentId(String sId) {
        //SHow all the grades for the specified student



        //Set the model for the table
        DefaultTableModel myModel = new DefaultTableModel();
        this.tbl_StudentGrades.setModel(myModel);

        myModel.setColumnIdentifiers(new String[]{"StudentId", "Student Name", "CourseId", "Course Name", "Grade"});


        //Populate the panel with the  grades for the teacher's students
        for (int j = 0; j < myGrade.length; j++) {
            if (myGrade[j].getStudentNr().equals(sId)) {

                //Populate the table
                myModel.addRow(new String[]{myGrade[j].getStudentNr(), getStudentName(myGrade[j].getStudentNr()), myGrade[j].getCourseNr(), getCourseName(myGrade[j].getCourseNr()), myGrade[j].getGradeNr()});




            }
        }



    }

    private String getStudentName(String sId) {
        String sName = "";

        //Loop through all the g rades to find the grade array that contains the grade nr
        for (int i = 0; i < myStudent.length; i++) {

            //Go find the actual grade for the student id & courses
            if (myStudent[i].getId().equals(sId)) {

                //Return the actual grade of the myGrade array
                sName = myStudent[i].getName();

            }
        }

        //Return the actual grade of the myGrade array
        return sName;


    }

    private String getCourseName(String cId) {
        String cName = "";

        //Loop through all the g rades to find the grade array that contains the grade nr
        for (int i = 0; i < myCourse.length; i++) {

            //Go find the actual grade for the student id & courses
            if (myCourse[i].getId().equals(cId)) {

                //Return the actual grade of the myGrade array
                cName = myCourse[i].getName();

            }
        }

        //Return the actual grade of the myGrade array
        return cName;


    }

    private void txt_TeacherIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_TeacherIdFocusLost

        String teacherId = this.txt_TeacherId.getText();
        this.lbl_TeacherName.setText("");


        //Loop through all the g rades to find the grade array that contains teacher name
        for (int i = 0; i < myTeacher.length; i++) {

            //Go find the actual grade for the student id & courses
            if (myTeacher[i].getId().equals(teacherId)) {

                //Return the actual grade of the myGrade array
                this.lbl_TeacherName.setText(myTeacher[i].getName());

                //enable the panels
                this.panel_EnterGrade.setEnabled(true);
                this.panel_ViewGrade.setEnabled(true);

                //Set the model for the table
                DefaultTableModel myModel = new DefaultTableModel();
                this.tbl_TeacherGrades.setModel(myModel);

                myModel.setColumnIdentifiers(new String[]{"StudentId", "Student Name", "CourseId", "Course Name", "Grade"});


                //Populate the panel with the  grades for the teacher's students
                for (int j = 0; j < myGrade.length; j++) {
                    if (myGrade[j].getTeacherNr().equals(teacherId)) {

                        //Populate the table
                        myModel.addRow(new String[]{myGrade[j].getStudentNr(), getStudentName(myGrade[j].getStudentNr()), myGrade[j].getCourseNr(), getCourseName(myGrade[j].getCourseNr()), myGrade[j].getGradeNr()});




                    }
                }

                break;

            }


        }





    }//GEN-LAST:event_txt_TeacherIdFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        /*for(int i = 0; i< myGrade.length; i++)
         {
         System.out.printf("/n%s ",
         Arrays.toString(myGrade[i].getGrade()));
				
         }*/

        //Set up a temporary array to store the new grade
        Grade[] temp = new Grade[myGrade.length + 1];
        System.arraycopy(myGrade, 0, temp, 0, Math.min(myGrade.length, temp.length));
        myGrade = temp;

        //now, populate the new entry based on what the teachers types in
        String sId = this.txt_EnterGradeStudentId.getText();
        String cId = this.txt_EnterGradeCourseId.getText();
        String gNr = this.txt_EnterGradeNr.getText();
        String tId = this.txt_TeacherId.getText();
        myGrade[myGrade.length - 1] = new Grade(sId, tId, cId, gNr);

        /*for(int i = 0; i< myGrade.length; i++)
         {
         System.out.printf("/n%s ",
         Arrays.toString(myGrade[i].getGrade()));
				
         } */

        ///Refresh the list of grades
        txt_TeacherIdFocusLost(null);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_EnterGradeCourseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EnterGradeCourseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EnterGradeCourseIdActionPerformed

    private void txt_EnterGradeStudentIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EnterGradeStudentIdFocusLost

        String studentId = this.txt_EnterGradeStudentId.getText();
        this.lbl_EnterGradeStudentName.setText("");

        //Loop through all the g rades to find the grade array that contains the grade nr
        for (int i = 0; i < myStudent.length; i++) {

            //Go find the actual grade for the student id & courses
            if (myStudent[i].getId().equals(studentId)) {

                //Return the actual grade of the myGrade array
                this.lbl_EnterGradeStudentName.setText(myStudent[i].getName());
                break;
            }
        }
    }//GEN-LAST:event_txt_EnterGradeStudentIdFocusLost

    private void txt_EnterGradeCourseIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EnterGradeCourseIdFocusLost


        //this.lbl_CourseName.setText(myCourse[0].getName());



        String courseId = this.txt_EnterGradeCourseId.getText();
        this.lbl_EnterGradeCourseName.setText("");

        //Loop through all the g rades to find the grade array that contains the grade nr
        for (int i = 0; i < myCourse.length; i++) {

            //Go find the actual grade for the student id & courses
            if (myCourse[i].getId().equals(courseId)) {

                //Return the actual grade of the myGrade array
                this.lbl_EnterGradeCourseName.setText(myCourse[i].getName());
                break;
            }
        }
    }//GEN-LAST:event_txt_EnterGradeCourseIdFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //Set up a temporary array to store the new grade
        Course[] temp = new Course[myCourse.length + 1];
        System.arraycopy(myCourse, 0, temp, 0, Math.min(myCourse.length, temp.length));
        myCourse = temp;

        //now, populate the new entry based on what the teachers types in
        String cName = this.txt_AddCourseName.getText();
        String cId = this.txt_AddCourseId.getText();
        myCourse[myCourse.length - 1] = new Course(cName, cId);

        /*for(int i = 0; i< myGrade.length; i++)
         {
         System.out.printf("/n%s ",
         Arrays.toString(myGrade[i].getGrade()));
				
         } */
        //refresh the course list
        this.listCourses();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void listCourses() {
        //List the existing courses on the listbox




        //Loop through all the g rades to find the grade array that contains teacher name
        for (int i = 0; i < myTeacher.length; i++) {

            //Go find courses




            //Set the model for the table
            DefaultTableModel myModel = new DefaultTableModel();
            this.tbl_CourseList.setModel(myModel);

            myModel.setColumnIdentifiers(new String[]{"Course Id", "Course Name"});


            //Populate the panel with the  grades for the teacher's students
            for (int j = 0; j < myCourse.length; j++) {


                //Populate the table
                myModel.addRow(new String[]{myCourse[j].getId(), myCourse[j].getName()});


            }

            break;


        }


    }

    private void txt_EnterGradeCourseId1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EnterGradeCourseId1FocusLost


        //this.lbl_CourseName.setText(myCourse[0].getName());



        String courseId = this.txt_EnterGradeCourseId1.getText();
        this.lbl_EnterGradeCourseName1.setText("");

        //Loop through all the g rades to find the grade array that contains the grade nr
        for (int i = 0; i < myCourse.length; i++) {

            //Go find the actual grade for the student id & courses
            if (myCourse[i].getId().equals(courseId)) {

                //Return the actual grade of the myGrade array
                this.lbl_EnterGradeCourseName1.setText(myCourse[i].getName());
                break;
            }
        }
    }//GEN-LAST:event_txt_EnterGradeCourseId1FocusLost

    private void txt_EnterGradeStudentId1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_EnterGradeStudentId1FocusLost

        String studentId = this.txt_EnterGradeStudentId1.getText();
        this.lbl_EnterGradeStudentName1.setText("");

        //Loop through all the g rades to find the grade array that contains the grade nr
        for (int i = 0; i < myStudent.length; i++) {

            //Go find the actual grade for the student id & courses
            if (myStudent[i].getId().equals(studentId)) {

                //Return the actual grade of the myGrade array
                this.lbl_EnterGradeStudentName1.setText(myStudent[i].getName());
                break;
            }
        }
    }//GEN-LAST:event_txt_EnterGradeStudentId1FocusLost

    private void btn_EditGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditGradeActionPerformed

        /*for(int i = 0; i< myGrade.length; i++)
         {
         System.out.printf("/n%s ",
         Arrays.toString(myGrade[i].getGrade()));
				
         }*/

        /*
         //Set up a temporary array to store the new grade
         Grade[] temp = new Grade[myGrade.length + 1];
         System.arraycopy(myGrade, 0, temp, 0, Math.min(myGrade.length, temp.length));
         myGrade = temp;
         */


        //now, populate the new entry based on what the teachers types in
        String sId = this.txt_EnterGradeStudentId1.getText();
        String cId = this.txt_EnterGradeCourseId1.getText();
        String gNr = this.txt_EnterGradeNr1.getText();
        String tId = this.txt_TeacherId.getText();

        //myGrade[myGrade.length -1] = new Grade(sId,tId,cId,gNr);



        //Loop through all the g rades to find the grade array that contains the grade nr
        for (int i = 0; i < myGrade.length; i++) {

            //                  System.out.println(myGrade[i].getStudentNr());
//        System.out.println(myGrade[i].getCourseNr());

            //Go find the actual grade for the student id & courses
            if (myGrade[i].getStudentNr().equals(sId) && myGrade[i].getCourseNr().equals(cId)) {

                //Return the actual grade of the myGrade array
                myGrade[i].setGradeNr(gNr);
                break;
            }
        }





        /*for(int i = 0; i< myGrade.length; i++)
         {
         System.out.printf("/n%s ",
         Arrays.toString(myGrade[i].getGrade()));
				
         } */

        ///Refresh the list of grades
        txt_TeacherIdFocusLost(null);

    }//GEN-LAST:event_btn_EditGradeActionPerformed

    private void txt_StudentIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_StudentIdFocusLost

        String studentId = this.txt_StudentId.getText();
        this.lbl_StudentName.setText("");

        //Loop through all the g rades to find the grade array that contains the grade nr
        for (int i = 0; i < myStudent.length; i++) {

            //Go find the actual grade for the student id & courses
            if (myStudent[i].getId().equals(studentId)) {

                //Return the actual grade of the myGrade array
                this.lbl_StudentName.setText(myStudent[i].getName());

                //Show all the grades for this student
                this.showGradesByStudentId(studentId);
                break;
            }
        }

    }//GEN-LAST:event_txt_StudentIdFocusLost
    Grade[] myGrade = new Grade[3];
    //Create an array of students t ostore it in a course
    Student[] myStudent = new Student[3];
    Teacher[] myTeacher = new Teacher[2];
    //initialize the course
    Course[] myCourse = new Course[2];

    public void runProgram() {

        //Initiazlize and array of grades




        //Initialize a student object
        myStudent[0] = new Student("Juan", "1001");
        myStudent[1] = new Student("Kasam", "1002");
        myStudent[2] = new Student("Matt", "1003");

        //Initialize teh teacher
        myTeacher[0] = new Teacher("Dr Pardue", "10");
        myTeacher[1] = new Teacher("Dr Bryant", "11");


        myCourse[0] = new Course("OO Programming", "IS510");
        myCourse[1] = new Course("Database Prog", "IS555");



        myGrade[0] = new Grade(myStudent[0].getId(),
                myTeacher[0].getId(),
                myCourse[0].getId(),
                "99");
        myGrade[1] = new Grade(myStudent[1].getId(),
                myTeacher[0].getId(),
                myCourse[0].getId(),
                "97");
        myGrade[2] = new Grade(myStudent[2].getId(),
                myTeacher[0].getId(),
                myCourse[0].getId(),
                "98");


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EditGrade;
    private javax.swing.JButton btn_SelectAdmin;
    private javax.swing.JButton btn_SelectStudent;
    private javax.swing.JButton btn_SelectTeacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_CourseName;
    private javax.swing.JLabel lbl_EnterGradeCourseName;
    private javax.swing.JLabel lbl_EnterGradeCourseName1;
    private javax.swing.JLabel lbl_EnterGradeStudentName;
    private javax.swing.JLabel lbl_EnterGradeStudentName1;
    private javax.swing.JLabel lbl_StudentName;
    private javax.swing.JLabel lbl_TeacherName;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelStudent;
    private javax.swing.JPanel panelTeacher;
    private javax.swing.JPanel panel_EnterGrade;
    private javax.swing.JPanel panel_ViewGrade;
    private javax.swing.JScrollPane scroll_TeacherGrades;
    private javax.swing.JScrollPane scroll_TeacherGrades1;
    private javax.swing.JScrollPane scroll_TeacherGrades2;
    private javax.swing.JScrollPane scroll_TeacherGrades3;
    private javax.swing.JTable tbl_AdminGrades;
    private javax.swing.JTable tbl_CourseList;
    private javax.swing.JTable tbl_StudentGrades;
    private javax.swing.JTable tbl_TeacherGrades;
    private javax.swing.JTextField txt_AddCourseId;
    private javax.swing.JTextField txt_AddCourseName;
    private javax.swing.JTextField txt_EnterGradeCourseId;
    private javax.swing.JTextField txt_EnterGradeCourseId1;
    private javax.swing.JTextField txt_EnterGradeNr;
    private javax.swing.JTextField txt_EnterGradeNr1;
    private javax.swing.JTextField txt_EnterGradeStudentId;
    private javax.swing.JTextField txt_EnterGradeStudentId1;
    private javax.swing.JTextField txt_StudentId;
    private javax.swing.JTextField txt_TeacherId;
    // End of variables declaration//GEN-END:variables
}
