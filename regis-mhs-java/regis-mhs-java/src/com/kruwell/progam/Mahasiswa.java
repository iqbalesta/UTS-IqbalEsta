/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kruwell.progam;

import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Mahasiswa extends javax.swing.JFrame {
    /** mengosongkan form **/
    private void kosongkan_form() {
        txtnama.setText(null);
        txtemail.setText(null);
        txtalamat.setText(null);
        txtlahir.setText(null);
        txttelp.setText(null);
        cbkelamin.setSelectedItem(this);
        cbjurusan.setSelectedItem(this);
        cbagama.setSelectedItem(this);
        txtkewarganegaraan.setText(null);
    }

    /** menampilkan data dalam tabel **/
    private void tampilkan_data() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Lahir");
        model.addColumn("No. telpon");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Jurusan");
        model.addColumn("Agama");
        model.addColumn("Kewarganegaraan");

        try {
            int no = 1;
            String sql = "SELECT * FROM mahasiswa";
            Connection conn = Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[] {
                        no++,
                        res.getString("nama"),
                        res.getString("email"),
                        res.getString("alamat"),
                        res.getString("tgllahir"),
                        res.getString("telp"),
                        res.getString("kelamin"),
                        res.getString("jurusan"),
                        res.getString("agama"),
                        res.getString("kewarganegaraan")
                });
            }
            tabelmahasiswa.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbkelamin1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtlahir = new javax.swing.JTextField();
        txttelp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbkelamin = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelmahasiswa = new javax.swing.JTable();
        tbtambah = new javax.swing.JButton();
        tbsimpan = new javax.swing.JButton();
        tbedit = new javax.swing.JButton();
        tbhapus = new javax.swing.JButton();
        tbbatal = new javax.swing.JButton();
        tbkeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jlabel8 = new javax.swing.JLabel();
        cbjurusan = new javax.swing.JComboBox<>();
        jlabel9 = new javax.swing.JLabel();
        cbagama = new javax.swing.JComboBox<>();
        jlabel10 = new javax.swing.JLabel();
        txtkewarganegaraan = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        cbkelamin1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki Laki ", "Perempuan" }));
        cbkelamin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkelamin1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Data Mahasiswa");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("DATA MAHASISWA BARU");

        jLabel2.setText("Nama : ");

        jLabel3.setText("Email : ");

        jLabel4.setText("Alamat : ");

        jLabel5.setText("Tanggal Lahir :");

        jLabel6.setText("No.telpon : ");

        txtlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlahirActionPerformed(evt);
            }
        });

        jLabel7.setText("Jenis Kelamin : ");

        cbkelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki Laki ", "Perempuan" }));
        cbkelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkelaminActionPerformed(evt);
            }
        });

        tabelmahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelmahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelmahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelmahasiswa);

        tbtambah.setText("Tambah Data");
        tbtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtambahActionPerformed(evt);
            }
        });

        tbsimpan.setText("Simpan");
        tbsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbsimpanActionPerformed(evt);
            }
        });

        tbedit.setText("Edit");
        tbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbeditActionPerformed(evt);
            }
        });

        tbhapus.setText("Hapus");
        tbhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbhapusActionPerformed(evt);
            }
        });

        tbbatal.setText("Batal");
        tbbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbbatalActionPerformed(evt);
            }
        });

        tbkeluar.setText("Keluar");
        tbkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbkeluarActionPerformed(evt);
            }
        });

        jLabel8.setText("yyyy-mm-dd");

        jlabel8.setText("Jurusan :");

        cbjurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekam Medik & Info. Kes. - D3", "Teknik Informatika - D3", "Teknik Informatika - S1", "Ilmu Komunikasi - S1", "Sistem Informasi - S1", "Manajemen - S1", "Akuntansi - S1", "Sastra Inggris - S1" }));
        cbjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjurusanActionPerformed(evt);
            }
        });

        jlabel9.setText("Agama :");

        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Buddha", "Konghucu" }));
        cbagama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbagamaActionPerformed(evt);
            }
        });

        jlabel10.setText("Kewarganegaraan :");

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Input Mahasiswa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Info Pendaftaran");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Login");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(tbtambah)
                                    .addComponent(jlabel8)
                                    .addComponent(jlabel9)
                                    .addComponent(jlabel10))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnama)
                                            .addComponent(txtemail)
                                            .addComponent(txtalamat)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtlahir))
                                            .addComponent(txttelp)
                                            .addComponent(cbkelamin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbagama, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tbsimpan)
                                        .addGap(31, 31, 31)
                                        .addComponent(tbedit)
                                        .addGap(35, 35, 35)
                                        .addComponent(tbhapus)
                                        .addGap(29, 29, 29)
                                        .addComponent(tbbatal)
                                        .addGap(26, 26, 26)
                                        .addComponent(tbkeluar)))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbkelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel8)
                    .addComponent(cbjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel9)
                    .addComponent(cbagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel10)
                    .addComponent(txtkewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtambah)
                    .addComponent(tbsimpan)
                    .addComponent(tbedit)
                    .addComponent(tbhapus)
                    .addComponent(tbbatal)
                    .addComponent(tbkeluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbkelamin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkelamin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbkelamin1ActionPerformed

    private void cbagamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbagamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbagamaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
                        this.setVisible(false);
                new Mahasiswa().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
                new Login().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
                new Prodi().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tbbatalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tbbatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }// GEN-LAST:event_tbbatalActionPerformed

    private void cbjurusanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbjurusanActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbjurusanActionPerformed

    // FUNGSI HAPUS
    private void tbhapusActionPerformed(java.awt.event.ActionEvent evt) {
        // Check if a row is selected
        int selectedRow = tabelmahasiswa.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "No row selected. Please select a row to delete.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?",
                "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            String nama = txtnama.getText();

            String sql = "DELETE FROM mahasiswa WHERE nama = ?";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, nama);
            pstm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
            tampilkan_data();
            kosongkan_form();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void cbkelaminActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbkelaminActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbkelaminActionPerformed

    private void tbkeluarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tbkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_tbkeluarActionPerformed

    private void tbtambahActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tbtambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();

    }// GEN-LAST:event_tbtambahActionPerformed

    private void tbsimpanActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            String nama = txtnama.getText();
            String email = txtemail.getText();
            String alamat = txtalamat.getText();
            String telp = txttelp.getText();
            String kelamin = cbkelamin.getSelectedItem().toString();
            String jurusan = cbjurusan.getSelectedItem().toString();
            String agama = cbagama.getSelectedItem().toString();
            String kewarganegaraan = txtkewarganegaraan.getText();

            String tanggalLahir = txtlahir.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate;
            try {
                parsedDate = dateFormat.parse(tanggalLahir);
                tanggalLahir = dateFormat.format(parsedDate);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Incorrect date format. Please use yyyy-MM-dd.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "INSERT INTO mahasiswa (nama, email, alamat, tgllahir, telp, kelamin, jurusan,agama, kewarganegaraan) VALUES (?,?,?, ?, ?, ?, ?, ?, ?)";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, nama);
            pstm.setString(2, email);
            pstm.setString(3, alamat);
            pstm.setString(4, tanggalLahir);
            pstm.setString(5, telp);
            pstm.setString(6, kelamin);
            pstm.setString(7, jurusan);
            pstm.setString(8, agama);
            pstm.setString(9, kewarganegaraan);
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Proses simpan data berhasil");
            tampilkan_data();
            kosongkan_form();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_tbsimpanActionPerformed

    private void txtlahirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtlahirActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtlahirActionPerformed

    // TAMBAH FUNGSI EDIT
    private void tabelmahasiswaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tabelmahasiswaMouseClicked
        // TODO add your handling code here:
        int baris = tabelmahasiswa.rowAtPoint(evt.getPoint());
        String nama = tabelmahasiswa.getValueAt(baris, 1).toString();
        txtnama.setText(nama);

        String email = tabelmahasiswa.getValueAt(baris, 2).toString();
        txtemail.setText(email);

        String alamat = tabelmahasiswa.getValueAt(baris, 3).toString();
        txtalamat.setText(alamat);

        String lahir = tabelmahasiswa.getValueAt(baris, 4).toString();
        txtlahir.setText(lahir);

        String telp = tabelmahasiswa.getValueAt(baris, 5).toString();
        txttelp.setText(telp);

        String kelamin = tabelmahasiswa.getValueAt(baris, 6).toString();
        cbkelamin.setSelectedItem(kelamin);

        String jurusan = tabelmahasiswa.getValueAt(baris, 7).toString();
        cbjurusan.setSelectedItem(jurusan);

        String agama = tabelmahasiswa.getValueAt(baris, 8).toString();
        cbagama.setSelectedItem(agama);

        String kewarganegaraan = tabelmahasiswa.getValueAt(baris, 9).toString();
        txtkewarganegaraan.setText(kewarganegaraan);

    }// GEN-LAST:event_tabelmahasiswaMouseClicked

    private void tbeditActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = tabelmahasiswa.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "No row selected. Please select a row to edit.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String nama = txtnama.getText();
            String email = txtemail.getText();
            String alamat = txtalamat.getText();
            String telpon = txttelp.getText();
            String kelamin = cbkelamin.getSelectedItem().toString();
            String jurusan = cbjurusan.getSelectedItem().toString();
            String agama = cbagama.getSelectedItem().toString();
            String kewarganegaran = txtkewarganegaraan.getText();

            String tanggalLahir = txtlahir.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate;
            try {
                parsedDate = dateFormat.parse(tanggalLahir);
                tanggalLahir = dateFormat.format(parsedDate);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Incorrect date format. Please use yyyy-MM-dd.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            String originalNama = tabelmahasiswa.getValueAt(selectedRow, 1).toString();

            String sql = "UPDATE mahasiswa SET nama = ?, email = ?, alamat = ?, tgllahir = ?, telp = ?, kelamin = ?, jurusan = ?, agama = ?,  kewarganegaraan = ?  WHERE nama = ?";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, nama);
            pstm.setString(2, email);
            pstm.setString(3, alamat);
            pstm.setString(4, tanggalLahir);
            pstm.setString(5, telpon);
            pstm.setString(6, kelamin);
            pstm.setString(7, jurusan);
            pstm.setString(8, agama);
            pstm.setString(9, kewarganegaran);
            pstm.setString(10, originalNama);
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui.");
            tampilkan_data();
            kosongkan_form();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JComboBox<String> cbjurusan;
    private javax.swing.JComboBox<String> cbkelamin;
    private javax.swing.JComboBox<String> cbkelamin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel10;
    private javax.swing.JLabel jlabel8;
    private javax.swing.JLabel jlabel9;
    private javax.swing.JTable tabelmahasiswa;
    private javax.swing.JButton tbbatal;
    private javax.swing.JButton tbedit;
    private javax.swing.JButton tbhapus;
    private javax.swing.JButton tbkeluar;
    private javax.swing.JButton tbsimpan;
    private javax.swing.JButton tbtambah;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtkewarganegaraan;
    private javax.swing.JTextField txtlahir;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables
}