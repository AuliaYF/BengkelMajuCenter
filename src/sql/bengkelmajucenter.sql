/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : bengkelmajucenter

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2015-05-07 08:38:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cucikendaraan
-- ----------------------------
DROP TABLE IF EXISTS `cucikendaraan`;
CREATE TABLE `cucikendaraan` (
  `KdCuci` varchar(10) NOT NULL,
  `PlatNomor` varchar(10) NOT NULL,
  `TanggalCuci` date NOT NULL,
  `KdKaryawan` varchar(10) NOT NULL,
  `KdPelanggan` varchar(10) NOT NULL,
  `Harga` bigint(11) NOT NULL,
  PRIMARY KEY (`KdCuci`),
  KEY `PlatNomor` (`PlatNomor`),
  KEY `KdKaryawan` (`KdKaryawan`),
  KEY `KdPelanggan` (`KdPelanggan`),
  CONSTRAINT `cucikendaraan_ibfk_3` FOREIGN KEY (`KdPelanggan`) REFERENCES `pelanggan` (`KdPelanggan`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `cucikendaraan_ibfk_1` FOREIGN KEY (`PlatNomor`) REFERENCES `kendaraan` (`PlatNomor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `cucikendaraan_ibfk_2` FOREIGN KEY (`KdKaryawan`) REFERENCES `karyawan` (`KdKaryawan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of cucikendaraan
-- ----------------------------

-- ----------------------------
-- Table structure for detailservice
-- ----------------------------
DROP TABLE IF EXISTS `detailservice`;
CREATE TABLE `detailservice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `KdService` varchar(10) NOT NULL,
  `KdJenisService` varchar(10) NOT NULL,
  `Harga` bigint(11) NOT NULL,
  `Diskon` bigint(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `KdService` (`KdService`),
  KEY `KdJenisService` (`KdJenisService`),
  CONSTRAINT `detailservice_ibfk_2` FOREIGN KEY (`KdJenisService`) REFERENCES `jenisservice` (`KdJenisService`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detailservice_ibfk_1` FOREIGN KEY (`KdService`) REFERENCES `service` (`KdService`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of detailservice
-- ----------------------------

-- ----------------------------
-- Table structure for gantioli
-- ----------------------------
DROP TABLE IF EXISTS `gantioli`;
CREATE TABLE `gantioli` (
  `KdTransaksi` varchar(10) NOT NULL,
  `TanggalTransaksi` date NOT NULL,
  `KdKaryawan` varchar(10) NOT NULL,
  `KdPelanggan` varchar(10) NOT NULL,
  `KdOli` varchar(10) NOT NULL,
  PRIMARY KEY (`KdTransaksi`),
  KEY `KdKaryawan` (`KdKaryawan`),
  KEY `KdPelanggan` (`KdPelanggan`),
  KEY `KdOli` (`KdOli`),
  CONSTRAINT `gantioli_ibfk_3` FOREIGN KEY (`KdOli`) REFERENCES `oli` (`KdOli`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `gantioli_ibfk_1` FOREIGN KEY (`KdKaryawan`) REFERENCES `karyawan` (`KdKaryawan`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `gantioli_ibfk_2` FOREIGN KEY (`KdPelanggan`) REFERENCES `pelanggan` (`KdPelanggan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of gantioli
-- ----------------------------

-- ----------------------------
-- Table structure for jadwalkerja
-- ----------------------------
DROP TABLE IF EXISTS `jadwalkerja`;
CREATE TABLE `jadwalkerja` (
  `KdJadwal` varchar(10) NOT NULL,
  `KdKaryawan` varchar(10) NOT NULL,
  `Hari` enum('Senin','Selasa','Rabu','Kamis','Jumat','Sabtu','Minggu') NOT NULL,
  `Shift` varchar(2) NOT NULL,
  PRIMARY KEY (`KdJadwal`),
  KEY `KdKaryawan` (`KdKaryawan`),
  CONSTRAINT `jadwalkerja_ibfk_1` FOREIGN KEY (`KdKaryawan`) REFERENCES `karyawan` (`KdKaryawan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of jadwalkerja
-- ----------------------------
INSERT INTO `jadwalkerja` VALUES ('J001', 'MK0001', 'Senin', '01');
INSERT INTO `jadwalkerja` VALUES ('J002', 'MK0002', 'Senin', '01');
INSERT INTO `jadwalkerja` VALUES ('J003', 'MK0003', 'Senin', '01');
INSERT INTO `jadwalkerja` VALUES ('J004', 'MK0004', 'Senin', '02');
INSERT INTO `jadwalkerja` VALUES ('J005', 'MK0005', 'Senin', '02');
INSERT INTO `jadwalkerja` VALUES ('J006', 'MK0006', 'Senin', '02');
INSERT INTO `jadwalkerja` VALUES ('J007', 'MK0004', 'Selasa', '01');
INSERT INTO `jadwalkerja` VALUES ('J008', 'MK0005', 'Selasa', '01');
INSERT INTO `jadwalkerja` VALUES ('J009', 'MK0006', 'Selasa', '01');
INSERT INTO `jadwalkerja` VALUES ('J010', 'MK0001', 'Selasa', '02');
INSERT INTO `jadwalkerja` VALUES ('J011', 'MK0002', 'Selasa', '02');
INSERT INTO `jadwalkerja` VALUES ('J012', 'MK0003', 'Selasa', '02');
INSERT INTO `jadwalkerja` VALUES ('J013', 'MK0001', 'Rabu', '01');
INSERT INTO `jadwalkerja` VALUES ('J014', 'MK0002', 'Rabu', '01');
INSERT INTO `jadwalkerja` VALUES ('J015', 'MK0003', 'Rabu', '01');
INSERT INTO `jadwalkerja` VALUES ('J016', 'MK0004', 'Rabu', '02');
INSERT INTO `jadwalkerja` VALUES ('J017', 'MK0005', 'Rabu', '02');
INSERT INTO `jadwalkerja` VALUES ('J018', 'MK0006', 'Rabu', '02');
INSERT INTO `jadwalkerja` VALUES ('J019', 'MK0004', 'Kamis', '01');
INSERT INTO `jadwalkerja` VALUES ('J020', 'MK0005', 'Kamis', '01');
INSERT INTO `jadwalkerja` VALUES ('J021', 'MK0006', 'Kamis', '01');
INSERT INTO `jadwalkerja` VALUES ('J022', 'MK0001', 'Kamis', '02');
INSERT INTO `jadwalkerja` VALUES ('J023', 'MK0002', 'Kamis', '02');
INSERT INTO `jadwalkerja` VALUES ('J024', 'MK0003', 'Kamis', '02');
INSERT INTO `jadwalkerja` VALUES ('J025', 'MK0001', 'Jumat', '01');
INSERT INTO `jadwalkerja` VALUES ('J026', 'MK0002', 'Jumat', '01');
INSERT INTO `jadwalkerja` VALUES ('J027', 'MK0003', 'Jumat', '01');
INSERT INTO `jadwalkerja` VALUES ('J028', 'MK0004', 'Jumat', '02');
INSERT INTO `jadwalkerja` VALUES ('J029', 'MK0005', 'Jumat', '02');
INSERT INTO `jadwalkerja` VALUES ('J030', 'MK0006', 'Jumat', '02');
INSERT INTO `jadwalkerja` VALUES ('J031', 'MK0004', 'Sabtu', '01');
INSERT INTO `jadwalkerja` VALUES ('J032', 'MK0005', 'Sabtu', '01');
INSERT INTO `jadwalkerja` VALUES ('J033', 'MK0006', 'Sabtu', '01');
INSERT INTO `jadwalkerja` VALUES ('J034', 'MK0001', 'Sabtu', '02');
INSERT INTO `jadwalkerja` VALUES ('J035', 'MK0002', 'Sabtu', '02');
INSERT INTO `jadwalkerja` VALUES ('J036', 'MK0003', 'Sabtu', '02');
INSERT INTO `jadwalkerja` VALUES ('J037', 'MK0001', 'Minggu', '01');
INSERT INTO `jadwalkerja` VALUES ('J038', 'MK0002', 'Minggu', '01');
INSERT INTO `jadwalkerja` VALUES ('J039', 'MK0003', 'Minggu', '01');
INSERT INTO `jadwalkerja` VALUES ('J040', 'MK0004', 'Minggu', '02');
INSERT INTO `jadwalkerja` VALUES ('J041', 'MK0005', 'Minggu', '02');
INSERT INTO `jadwalkerja` VALUES ('J042', 'MK0006', 'Minggu', '02');

-- ----------------------------
-- Table structure for jeniskaryawan
-- ----------------------------
DROP TABLE IF EXISTS `jeniskaryawan`;
CREATE TABLE `jeniskaryawan` (
  `KdJenisKaryawan` varchar(10) NOT NULL,
  `JenisKaryawan` varchar(100) NOT NULL,
  PRIMARY KEY (`KdJenisKaryawan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of jeniskaryawan
-- ----------------------------
INSERT INTO `jeniskaryawan` VALUES ('BR', 'Barang');
INSERT INTO `jeniskaryawan` VALUES ('CS', 'Customer Service');
INSERT INTO `jeniskaryawan` VALUES ('IN', 'Informasi');
INSERT INTO `jeniskaryawan` VALUES ('MK', 'Mekanik');
INSERT INTO `jeniskaryawan` VALUES ('SC', 'Keamanan');

-- ----------------------------
-- Table structure for jeniskendaraan
-- ----------------------------
DROP TABLE IF EXISTS `jeniskendaraan`;
CREATE TABLE `jeniskendaraan` (
  `KdJenisKendaraan` varchar(10) NOT NULL,
  `JenisKendaraan` varchar(100) NOT NULL,
  PRIMARY KEY (`KdJenisKendaraan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of jeniskendaraan
-- ----------------------------

-- ----------------------------
-- Table structure for jenisservice
-- ----------------------------
DROP TABLE IF EXISTS `jenisservice`;
CREATE TABLE `jenisservice` (
  `KdJenisService` varchar(10) NOT NULL,
  `JenisService` varchar(100) NOT NULL,
  `Keterangan` text NOT NULL,
  PRIMARY KEY (`KdJenisService`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of jenisservice
-- ----------------------------
INSERT INTO `jenisservice` VALUES ('1', 'Machine Repair', 'Membetulkan mesin');
INSERT INTO `jenisservice` VALUES ('2', 'Change Sparepart', 'Penggantian Sparepart');
INSERT INTO `jenisservice` VALUES ('3', 'Automatic Repair', 'Reparasi untuk mobil automatic');
INSERT INTO `jenisservice` VALUES ('4', 'Tune-up', 'Maintenance Mobil');
INSERT INTO `jenisservice` VALUES ('5', 'In Repair', 'Membetulkan dalam mobil');

-- ----------------------------
-- Table structure for karyawan
-- ----------------------------
DROP TABLE IF EXISTS `karyawan`;
CREATE TABLE `karyawan` (
  `KdKaryawan` varchar(10) NOT NULL,
  `NamaKaryawan` varchar(100) NOT NULL,
  `AlamatKaryawan` text NOT NULL,
  `NoHpKaryawan` varchar(14) NOT NULL,
  `KdJenisKaryawan` varchar(10) NOT NULL,
  PRIMARY KEY (`KdKaryawan`),
  KEY `KdJenisKaryawan` (`KdJenisKaryawan`),
  CONSTRAINT `karyawan_ibfk_1` FOREIGN KEY (`KdJenisKaryawan`) REFERENCES `jeniskaryawan` (`KdJenisKaryawan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of karyawan
-- ----------------------------
INSERT INTO `karyawan` VALUES ('BR0010', 'Suhaeri', 'Ciroyom-Bandung', '0826-131313', 'BR');
INSERT INTO `karyawan` VALUES ('CS0009', 'Hana Pertiwi', 'Pasir Layung-Bandung', '0877-717188', 'CS');
INSERT INTO `karyawan` VALUES ('IN0008', 'Irvan Juliansyah', 'Awi Ligar-Bandung', '0921-821829', 'IN');
INSERT INTO `karyawan` VALUES ('MK0001', 'Anang Sucipto', 'Jl. Gempol Asri-Bandung', '0879-171717', 'MK');
INSERT INTO `karyawan` VALUES ('MK0002', 'Dudung Dulhamid', 'Dungus Cariang-Bandung', '0822-345677', 'MK');
INSERT INTO `karyawan` VALUES ('MK0003', 'Ujang Tarmana', 'Gg. Durman-Bandung', '0877-717171', 'MK');
INSERT INTO `karyawan` VALUES ('MK0004', 'Ahmad Nurjaman', 'Sekelimus-Bandung', '085-7233445', 'MK');
INSERT INTO `karyawan` VALUES ('MK0005', 'Rizqi Fatwa', 'Cicadas-Bandung', '0817-171711', 'MK');
INSERT INTO `karyawan` VALUES ('MK0006', 'Berjay', 'Jl. Dadali-Bandung', '0891-819199', 'MK');
INSERT INTO `karyawan` VALUES ('SC0007', 'Haris Wijanarko', 'Jl. Bagus Rangin-Bandung', '0821-212891', 'SC');

-- ----------------------------
-- Table structure for kendaraan
-- ----------------------------
DROP TABLE IF EXISTS `kendaraan`;
CREATE TABLE `kendaraan` (
  `PlatNomor` varchar(10) NOT NULL,
  `MerkKendaraan` varchar(100) NOT NULL,
  `KdJenisKendaraan` varchar(10) NOT NULL,
  PRIMARY KEY (`PlatNomor`),
  KEY `KdJenisKendaraan` (`KdJenisKendaraan`),
  CONSTRAINT `kendaraan_ibfk_1` FOREIGN KEY (`KdJenisKendaraan`) REFERENCES `jeniskendaraan` (`KdJenisKendaraan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of kendaraan
-- ----------------------------

-- ----------------------------
-- Table structure for oli
-- ----------------------------
DROP TABLE IF EXISTS `oli`;
CREATE TABLE `oli` (
  `KdOli` varchar(10) NOT NULL,
  `MerkOli` varchar(100) NOT NULL,
  `TipeOli` varchar(100) NOT NULL,
  `UkuranOli` varchar(100) NOT NULL,
  `HargaOli` bigint(11) NOT NULL,
  PRIMARY KEY (`KdOli`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of oli
-- ----------------------------

-- ----------------------------
-- Table structure for onderdil
-- ----------------------------
DROP TABLE IF EXISTS `onderdil`;
CREATE TABLE `onderdil` (
  `KdOnderdil` varchar(10) NOT NULL,
  `NamaOnderdil` varchar(100) NOT NULL,
  `MerkOnderdil` varchar(100) NOT NULL,
  `HargaOnderdil` bigint(11) NOT NULL,
  `TipeOnderdil` varchar(100) NOT NULL,
  PRIMARY KEY (`KdOnderdil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of onderdil
-- ----------------------------
INSERT INTO `onderdil` VALUES ('0001', 'Vallace Wind', 'Honda', '175000', 'Sparepart');
INSERT INTO `onderdil` VALUES ('0002', 'Brake Zega', 'Yamaha', '150000', 'Sparepart');
INSERT INTO `onderdil` VALUES ('0003', 'Fill-up Steer', 'Honda', '170000', 'Sparepart');
INSERT INTO `onderdil` VALUES ('0004', 'Velg New', 'Suzuki', '180000', 'Sparepart');
INSERT INTO `onderdil` VALUES ('0005', 'Cleanup Bumper', 'Suzuki', '190000', 'Sparepart');
INSERT INTO `onderdil` VALUES ('0006', 'Busi', 'BOSCH', '20000', 'Busi');
INSERT INTO `onderdil` VALUES ('0007', 'Busi', 'Optibelt', '30000', 'Busi');
INSERT INTO `onderdil` VALUES ('0008', 'Shock Breaker', 'Optibelt', '600000', 'Shock Breaker');
INSERT INTO `onderdil` VALUES ('0009', 'Lampu Depan', 'Optibelt', '300000', 'Lampu Depan');
INSERT INTO `onderdil` VALUES ('0010', 'Ribbed Belt', 'Optibelt', '2750000', 'Ribbed Belt');
INSERT INTO `onderdil` VALUES ('0011', 'Busi', 'Sachs', '40000', 'Busi');
INSERT INTO `onderdil` VALUES ('0012', 'Lampu Depan', 'Sachs', '250000', 'Lampu Depan');

-- ----------------------------
-- Table structure for pelanggan
-- ----------------------------
DROP TABLE IF EXISTS `pelanggan`;
CREATE TABLE `pelanggan` (
  `KdPelanggan` varchar(10) NOT NULL,
  `NamaPelanggan` varchar(100) NOT NULL,
  `JenisKelamin` enum('L','P') NOT NULL,
  `AlamatPelanggan` text NOT NULL,
  `NoHP` varchar(14) NOT NULL,
  PRIMARY KEY (`KdPelanggan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pelanggan
-- ----------------------------
INSERT INTO `pelanggan` VALUES ('PG0001', 'Aan Setiawan', 'L', 'Kp. Timur', '0819-281918');
INSERT INTO `pelanggan` VALUES ('PG0002', 'Imron Fadillah', 'L', 'Lubang Buaya', '0291-291829');
INSERT INTO `pelanggan` VALUES ('PG0003', 'Triana Masrie', 'P', 'Ciaracas', '0881-928192');
INSERT INTO `pelanggan` VALUES ('PG0004', 'Febria Monica', 'P', 'Bambu Apus', '0889-191911');
INSERT INTO `pelanggan` VALUES ('PG0005', 'Joni', 'L', 'Kp. Tengah', '0857-177177');
INSERT INTO `pelanggan` VALUES ('PG0006', 'Nova Yanti Patimah', 'P', 'Jl. Haji Gofur Ds. Pakuhaji Ngamprah', '0811-89674523');
INSERT INTO `pelanggan` VALUES ('PG0007', 'Gun Gun Iskandar', 'L', 'Jalan Mahar Martanegara Utama Cimahi Selatan', '0822-88664422');
INSERT INTO `pelanggan` VALUES ('PG0008', 'Mega Silfha', 'P', 'Nanjung Lagadar Marga Asih', '0833-87654321');
INSERT INTO `pelanggan` VALUES ('PG0009', 'Tanti Nurlinawati', 'P', 'Jl. Babakan Cianjur No.29B Sukaraja Cicendo', '0844-86644220');
INSERT INTO `pelanggan` VALUES ('PG0010', 'Dimas Dewantoro', 'L', 'Karya 2 No.03  Cicendo', '0855-85634119');
INSERT INTO `pelanggan` VALUES ('PG0011', 'Siti Nurjanah', 'P', 'Jl.Leuwi Gajah/ Kp Ciputri No. 122 Cigugur Tengah Cimahi Tengah', '0866-84624018');
INSERT INTO `pelanggan` VALUES ('PG0012', 'Lani Maylani', 'P', 'Perumnas Cijerah 2 Gempolsari Bandung Kulon', '0877-83613917');
INSERT INTO `pelanggan` VALUES ('PG0013', 'Arli Hartomo Yugo', 'L', 'Lapang Tembak Selatan. Gg. Mekar Sari 1 No. 28 Padasuka Cimahi Selatan', '0888-82603816');
INSERT INTO `pelanggan` VALUES ('PG0014', 'Siska Nurhotimah', 'P', 'Rancabali Pasirkaliki Cimahi Utara', '0899-81593715');
INSERT INTO `pelanggan` VALUES ('PG0015', 'Dian Rosmayanti', 'P', 'Gg. Mesjid Al-Imtisal No. 146 Cimareme Ngamprah', '0811-80583614');
INSERT INTO `pelanggan` VALUES ('PG0016', 'Abdullah Afif Anwari', 'L', 'Nanjung Lagadar Marga Asih', '0822-79573513');
INSERT INTO `pelanggan` VALUES ('PG0017', 'Angie Cita Pratama', 'P', 'Jl. Babakan Cianjur No.29B Sukaraja Cicendo', '0833-78563412');
INSERT INTO `pelanggan` VALUES ('PG0018', 'Arli Hartomo Yugo', 'L', 'Karya 2 No.03  Cicendo', '0844-77553311');
INSERT INTO `pelanggan` VALUES ('PG0019', 'Cicy Eka Murdeny', 'P', 'Jl.Leuwi Gajah/ Kp Ciputri No. 122 Cigugur Tengah Cimahi Tengah', '0855-76543210');
INSERT INTO `pelanggan` VALUES ('PG0020', 'Egi Nugraha', 'L', 'Perumnas Cijerah 2 Gempolsari Bandung Kulon', '0866-75533109');
INSERT INTO `pelanggan` VALUES ('PG0021', 'Firman Deanto', 'L', 'Jl. Haji Gofur Ds. Pakuhaji Ngamprah', '0877-74523008');
INSERT INTO `pelanggan` VALUES ('PG0022', 'Fitri Irma Saputri', 'P', 'Jalan Mahar Martanegara Utama Cimahi Selatan', '0888-73512907');
INSERT INTO `pelanggan` VALUES ('PG0023', 'Gina Nurwafa Husen', 'P', 'Rancabali Pasirkaliki Cimahi Utara', '0899-72502806');
INSERT INTO `pelanggan` VALUES ('PG0024', 'Gitta Fenturi', 'P', 'Gg. Mesjid Al-Imtisal No. 146 Cimareme Ngamprah', '0811-71492705');
INSERT INTO `pelanggan` VALUES ('PG0025', 'Hafidz Reksa Nugraha', 'L', 'Jl. Haji Gofur Ds. Pakuhaji Ngamprah', '0822-70482604');
INSERT INTO `pelanggan` VALUES ('PG0026', 'Imansyah Dwi Cahyo', 'L', 'Jalan Mahar Martanegara Utama Cimahi Selatan', '0833-69472503');
INSERT INTO `pelanggan` VALUES ('PG0027', 'Indah Octavia Dewi', 'P', 'Nanjung Lagadar Marga Asih', '0844-68462402');
INSERT INTO `pelanggan` VALUES ('PG0028', 'Indra Mukti Kirnawan', 'L', 'Jl. Babakan Cianjur No.29B Sukaraja Cicendo', '0855-67452301');

-- ----------------------------
-- Table structure for penjualan
-- ----------------------------
DROP TABLE IF EXISTS `penjualan`;
CREATE TABLE `penjualan` (
  `KdPenjualan` varchar(10) NOT NULL,
  `TanggalPenjualan` date NOT NULL,
  `KdKaryawan` varchar(10) NOT NULL,
  `KdPelanggan` varchar(10) NOT NULL,
  PRIMARY KEY (`KdPenjualan`),
  KEY `KdKaryawan` (`KdKaryawan`),
  KEY `KdPelanggan` (`KdPelanggan`),
  CONSTRAINT `penjualan_ibfk_2` FOREIGN KEY (`KdPelanggan`) REFERENCES `pelanggan` (`KdPelanggan`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`KdKaryawan`) REFERENCES `karyawan` (`KdKaryawan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of penjualan
-- ----------------------------

-- ----------------------------
-- Table structure for penjualandetail
-- ----------------------------
DROP TABLE IF EXISTS `penjualandetail`;
CREATE TABLE `penjualandetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `KdPenjualan` varchar(10) NOT NULL,
  `KdOnderdil` varchar(10) NOT NULL,
  `Qty` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `KdPenjualan` (`KdPenjualan`),
  KEY `KdOnderdil` (`KdOnderdil`),
  CONSTRAINT `penjualandetail_ibfk_2` FOREIGN KEY (`KdOnderdil`) REFERENCES `onderdil` (`KdOnderdil`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `penjualandetail_ibfk_1` FOREIGN KEY (`KdPenjualan`) REFERENCES `penjualan` (`KdPenjualan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of penjualandetail
-- ----------------------------

-- ----------------------------
-- Table structure for service
-- ----------------------------
DROP TABLE IF EXISTS `service`;
CREATE TABLE `service` (
  `KdService` varchar(10) NOT NULL,
  `TanggalService` date NOT NULL,
  `KdKaryawan` varchar(10) NOT NULL,
  `KdPelanggan` varchar(10) NOT NULL,
  PRIMARY KEY (`KdService`),
  KEY `KdKaryawan` (`KdKaryawan`),
  KEY `KdPelanggan` (`KdPelanggan`),
  CONSTRAINT `service_ibfk_2` FOREIGN KEY (`KdPelanggan`) REFERENCES `pelanggan` (`KdPelanggan`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `service_ibfk_1` FOREIGN KEY (`KdKaryawan`) REFERENCES `karyawan` (`KdKaryawan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of service
-- ----------------------------
