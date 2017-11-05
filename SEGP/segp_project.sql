-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2017 at 12:35 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `segp_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `userName` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userName`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `UoB` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `programme` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `year` varchar(20) NOT NULL,
  `tutor_id` int(20) DEFAULT NULL,
  `group_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`UoB`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`UoB`, `Name`, `programme`, `email`, `year`, `tutor_id`, `group_name`) VALUES
('13031155', 'Muhammad Jalil', 'BSc (Hons) Computer Science', 'mjalil2013@namal.edu.pk', 'Year - 4', NULL, NULL),
('13031162', 'Faheem Abbas Shah', 'BEng Electrical & Electronic Engineering', 'faheem2013@namal.edu.pk', 'Year - 4', 20, 'Namal'),
('13031166', 'Muhammad Shoaib Khan', 'BSc (Hons) Computer Science', 'shoaib2013@namal.edu.pk', 'Year - 4', 20, 'Namal'),
('13031167', 'Abdul Rahman Khan', 'BSc (Hons) Computer Science', 'rahman2013@namal.edu.pk', 'Year - 4', 10, 'dfsd'),
('13031168', 'Abdul Rafay', 'BSc (Hons) Computer Science', 'rafay2013@namal.edu.pk', 'Year - 4', 10, 'dfsd'),
('13031172', 'Habib Ur Rehman Sayem', 'BSc (Hons) Computer Science', 'Habib2013@namal.edu.pk', 'Year - 4', 10, 'dfsd'),
('13031177', 'Abdur Rahman', 'BEng Electrical & Electronic Engineering', 'arahman2013@namal.edu.pk', 'Year - 4', 13, 'Genius'),
('14031183', 'Amna Rasheed Awan', 'BEng Electrical & Electronic Engineering', 'amna2014@namal.edu.pk', 'Year - 4', 13, 'Genius'),
('14031184', 'Muhammad Haroon', 'BSc (Hons) Computer Science', 'haroon2014@namal.edu.pk', 'Year - 3', 13, 'Genius'),
('14031185', 'Huzaifa', 'BEng Electrical & Electronic Engineering', 'huzaifa2014@namal.edu.pk', 'Year - 4', 20, 'Namal'),
('14031186', 'Ehtisham Ul Hassan Malik', 'BSc (Hons) Computer Science', 'ehtisham2014@namal.edu.pk', 'Year - 4', 20, 'Namal'),
('14031187', 'Muhammad Sharjeel Malik', 'BSc (Hons) Computer Science', 'sharjeel2014@namal.edu.pk', 'Year - 4', 20, 'Namal'),
('14031188', 'Muhammad Imran', 'BSc (Hons) Computer Science', 'imran2014@namal.edu.pk', 'Year - 4', 20, 'Namal'),
('14031190', 'Hafiz Waleed Bin Zahid', 'BSc (Hons) Computer Science', 'waleedzahid2014@namal.edu.pk', 'Year - 4', 20, 'Namal'),
('14031191', 'Umer Zeb Khan', 'BSc (Hons) Computer Science', 'umer2014@namal.edu.pk', 'Year - 3', 20, 'Namal'),
('14031192', 'Ismat Ullah', 'BEng Electrical & Electronic Engineering', 'ismat2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031193', 'Muhammad Asad', 'BEng Electrical & Electronic Engineering', 'masad2014@namal.edu.pk', 'Year - 4', 16, 'Free Rider'),
('14031195', 'Muhammad Shoaib Ahmed', 'BSc (Hons) Computer Science', 'shoaib2014@namal.edu.pk', 'Year - 4', 16, 'Free Rider'),
('14031196', 'Hassam Ul Haq', 'BSc (Hons) Computer Science', 'hassam2014@namal.edu.pk', 'Year - 4', 16, 'Free Rider'),
('14031197', 'Muhammad Ijlal', 'BEng Electrical & Electronic Engineering', 'mijlal2014@namal.edu.pk', 'Year - 4', 16, 'Free Rider'),
('14031198', 'Umer Awais Malik', 'BSc (Hons) Computer Science', 'umerawais2014@namal.edu.pk', 'Year - 4', 16, 'Free Rider'),
('14031199', 'Muzammil Abdullah', 'BSc (Hons) Computer Science', 'muzammil2014@namal.edu.pk', 'Year - 3', 14, 'ABC'),
('14031200', 'Faisal Imran', 'BSc (Hons) Computer Science', 'faisal2014@namal.edu.pk', 'Year - 4', 14, 'ABC'),
('14031201', 'Hamza Javaid', 'BSc (Hons) Computer Science', 'hjavaid2014@namal.edu.pk', 'Year - 4', 14, 'ABC'),
('14031202', 'Usama Saleem', 'BSc (Hons) Computer Science', 'usama2014@namal.edu.pk', 'Year - 4', 14, 'ABC'),
('14031203', 'Shahid Ullah', 'BEng Electrical & Electronic Engineering', 'shahid2014@namal.edu.pk', 'Year - 4', 14, 'ABC'),
('14031204', 'Annus Salam', 'BSc (Hons) Computer Science', 'annus2014@namal.edu.pk', 'Year - 4', 14, 'ABC'),
('14031205', 'Muhammad Zeeshan', 'BSc (Hons) Computer Science', 'zeeshan2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031206', 'Laraib Mahboob', 'BSc (Hons) Computer Science', 'laraib2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031207', 'Muhammad Waleed Iqbal', 'BSc (Hons) Computer Science', 'mwaleed2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031208', 'Umar Akhtar', 'BEng Electrical & Electronic Engineering', 'umar2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031209', 'Abdul Wadood Qasim', 'BSc (Hons) Computer Science', 'abdulwadood2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031210', 'Muhammad Umair Masood', 'BSc (Hons) Computer Science', 'umair2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031211', 'Muhammad Ali Khalid', 'BSc (Hons) Computer Science', 'alik2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031212', 'Abid Ayub', 'BEng Electrical & Electronic Engineering', 'aayub2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031213', 'Muhammad Umar', 'BSc (Hons) Computer Science', 'mumar2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031214', 'Taimoor Ahmed', 'BEng Electrical & Electronic Engineering', 'taimoor2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031215', 'Mubasher Ullah', 'BEng Electrical & Electronic Engineering', 'mubasher2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031216', 'Waqar Ahmad', 'BSc (Hons) Computer Science', 'waqar2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031217', 'Arslan Amin', 'BEng Electrical & Electronic Engineering', 'arsalan2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031218', 'Muhammad Tayyab', 'BSc (Hons) Computer Science', 'tayyab2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031219', 'Muhammad Bilal Iqbal', 'BEng Electrical & Electronic Engineering', 'mbilal2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031220', 'Abdul Malik', 'BSc (Hons) Computer Science', 'ajabbar2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031221', 'Sajid Ali', 'BSc (Hons) Computer Science', 'sali2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031222', 'Shakir Ullah', 'BSc (Hons) Computer Science', 'shakir2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031223', 'Muhammad Hamza Jawad', 'BEng Electrical & Electronic Engineering', 'hamzajawad2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031224', 'Qadeer Ahmad', 'BSc (Hons) Computer Science', 'qadeer2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031225', 'Zunaira Ahmed', 'BSc (Hons) Computer Science', 'zunaira2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031226', 'Muhammad Nabeel', 'BSc (Hons) Computer Science', 'nabeel2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031228', 'Umair Aziz', 'BSc (Hons) Computer Science', 'uaziz2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031229', 'Adnan Khan', 'BEng Electrical & Electronic Engineering', 'adnan2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031230', 'Zawar Hussain', 'BEng Electrical & Electronic Engineering', 'zawar2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031232', 'Ameer Abdullah', 'BSc (Hons) Computer Science', 'ameer2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031233', 'Abid Iqbal', 'BSc (Hons) Computer Science', 'abid2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031236', 'Muhammad Bilal Yousaf Khan', 'BSc (Hons) Computer Science', 'bilaly2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031237', 'Danish Ghazaal Khan', 'BSc (Hons) Computer Science', 'danish2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031238', 'Muhammad Mudasir', 'BEng Electrical & Electronic Engineering', 'mudasir2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031239', 'Hassan Ahmed', 'BSc (Hons) Computer Science', 'hassanahmed2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031241', 'Muhammad Umar Farooq', 'BSc (Hons) Computer Science', 'umarf2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031242', 'Sami Muzzamil', 'BEng Electrical & Electronic Engineering', 'sami2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031243', 'Muhammad Ramzan Shahid Khan', 'BSc (Hons) Computer Science', 'ramzan2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031244', 'Muhammad Ali Abid Raza', 'BSc (Hons) Computer Science', 'aliabid2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031246', 'Saleem Khan', 'BSc (Hons) Computer Science', 'saleem2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031247', 'Najaf Khan', 'BSc (Hons) Computer Science', 'najaf2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031248', 'Muhammad Tahir Khan', 'BSc (Hons) Computer Science', 'tahir2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031249', 'Muhammad Arif', 'BSc (Hons) Computer Science', 'marif2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031250', 'Aqsa Samreen', 'BSc (Hons) Computer Science', 'aqsa2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031251', 'Sana Ullah Khan', 'BSc (Hons) Computer Science', 'sana2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031252', 'Naeem Rashid', 'BSc (Hons) Computer Science', 'naeemr2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031253', 'Bilal Ahmad Khan', 'BSc (Hons) Computer Science', 'bilal2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031254', 'Asim Hameed Khan', 'BSc (Hons) Computer Science', 'asim2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031255', 'Muhammad Tariq', 'BSc (Hons) Computer Science', 'mtariq2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031256', 'Abdul Rehman Khan Niazi', 'BSc (Hons) Computer Science', 'rehman2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031257', 'Muhammad Hasnain Khan', 'BSc (Hons) Computer Science', 'hasnain2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031258', 'Mohsin Ahmad Khan', 'BSc (Hons) Computer Science', 'mohsin2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031259', 'Muhammad Usman Ghani', 'BSc (Hons) Computer Science', 'usman2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031260', 'Muhammad Adnan', 'BSc (Hons) Computer Science', 'madnan2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031261', 'Muhammad Faizan Khan', 'BSc (Hons) Computer Science', 'faizank2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031262', 'Arsalan Amir', 'BSc (Hons) Computer Science', 'aamir2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031263', 'Mohammad Hassan Iqbal Khan', 'BSc (Hons) Computer Science', 'mhassan2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031264', 'Badar Shahzad Khan', 'BSc (Hons) Computer Science', 'badar2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031266', 'Sheraz Ahmad', 'BSc (Hons) Computer Science', 'sheraz2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031269', 'Zulqarnain Haider', 'BSc (Hons) Computer Science', 'zulqarnain2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031273', 'Naira Rahim', 'BSc (Hons) Computer Science', 'naira2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031274', 'Murad Khateeb', 'BSc (Hons) Computer Science', 'murad2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031276', 'Shahrukh', 'BSc (Hons) Computer Science', 'shahrukh2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031277', 'Akhtar Zaman', 'BSc (Hons) Computer Science', 'akhtar2014@namal.edu.pk', 'Year - 3', NULL, NULL),
('14031278', 'Muhammad Awais', 'BEng Electrical & Electronic Engineering', 'awais2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031279', 'Nisar Ali', 'BSc (Hons) Computer Science', 'nisar2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('14031282', 'Nasir Raza', 'BSc (Hons) Computer Science', 'nasir2014@namal.edu.pk', 'Year - 4', NULL, NULL),
('15026368', 'Waleed Khan', 'BSc (Hons) Computer Science', 'waleed2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026369', 'Muhammad Faraz', 'BEng Electrical & Electronic Engineering', 'faraz2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026370', 'Shaharyar Khan Niazi', 'BSc (Hons) Computer Science', 'shaheryar2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026371', 'Usman Farooq', 'BSc (Hons) Computer Science', 'usmanf2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026373', 'Abdul Kareem', 'BSc (Hons) Computer Science', 'akareem2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026374', 'Muhammad Hasnain Ahsan', 'BEng Electrical & Electronic Engineering', 'hasnain2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026375', 'Kashif Latif', 'BSc (Hons) Computer Science', 'kashif2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026377', 'Sunnan Islam Rahi', 'BSc (Hons) Computer Science', 'sunnan2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026378', 'Masood Ahmad', 'BEng Electrical & Electronic Engineering', 'masood2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026379', 'Shafi Ullah Khan', 'BSc (Hons) Computer Science', 'shafi2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026380', 'Jahanzaib Rasheed', 'BEng Electrical & Electronic Engineering', 'jahanzaib2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026381', 'Syed Munnawar Shah', 'BSc (Hons) Computer Science', 'munnawar2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026382', 'Hamza Khan', 'BEng Electrical & Electronic Engineering', 'hamzak2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026383', 'Salman Shahzad', 'BEng Electrical & Electronic Engineering', 'salman2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026384', 'Muhammad Huzaifa', 'BEng Electrical & Electronic Engineering', 'huzaifa2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026385', 'Muhammad Junaid Malik', 'BSc (Hons) Computer Science', 'junaid2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026386', 'Muhammad Haider Iqbal', 'BSc (Hons) Computer Science', 'mhaider2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026388', 'Sheharyar Saleem', 'BSc (Hons) Computer Science', 'sheharyar2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026389', 'Arshad Majeed', 'BSc (Hons) Computer Science', 'arshad2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026390', 'Muhammad Aamir Mumtaz', 'BSc (Hons) Computer Science', 'aamir2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026391', 'Atiq Uz Zaman', 'BSc (Hons) Computer Science', 'atiq2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026392', 'Malik Muhammad Subhan', 'BSc (Hons) Computer Science', 'malik2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026393', 'Naveed Hakim', 'BSc (Hons) Computer Science', 'naveed2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026396', 'Sufyan Abdur Rehman', 'BSc (Hons) Computer Science', 'sufyan2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026400', 'Usama Ismail', 'BSc (Hons) Computer Science', 'uismail2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026401', 'Zahid-Ur-Rehman', 'BSc (Hons) Computer Science', 'zahid2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026403', 'Haider Anwer', 'BSc (Hons) Computer Science', 'haider2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026406', 'Sajjad Shah', 'BSc (Hons) Computer Science', 'sajjad2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026407', 'Ikram Ullah Khan', 'BSc (Hons) Computer Science', 'ikram2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026408', 'Muhammad Nadir Iqbal', 'BSc (Hons) Computer Science', 'nadir2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026410', 'Shahid Mahmood', 'BSc (Hons) Computer Science', 'shahid2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026411', 'Ali Rizwan', 'BSc (Hons) Computer Science', 'ali2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026412', 'Shuja Akbar', 'BSc (Hons) Computer Science', 'shuja2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026413', 'Hamza Safdar', 'BSc (Hons) Computer Science', 'hamzas2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026415', 'Hamza Badar', 'BSc (Hons) Computer Science', 'hamzab2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026416', 'Muhammad Nawaz', 'BSc (Hons) Computer Science', 'nawaz2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026417', 'Naveed Khan', 'BSc (Hons) Computer Science', 'naveedk2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026420', 'Muhammad Imtiaz', 'BSc (Hons) Computer Science', 'imtiaz2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026421', 'Ahsan Zubair', 'BSc (Hons) Computer Science', 'ahsan2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026422', 'Khizar Farooq', 'BSc (Hons) Computer Science', 'khizar2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026423', 'Anab Niazi', 'BSc (Hons) Computer Science', 'anab2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026424', 'Faizan Ullah', 'BSc (Hons) Computer Science', 'faizan2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026425', 'Manzoor Hussain', 'BSc (Hons) Computer Science', 'manzoor2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026426', 'Tayyaba Anwer', 'BSc (Hons) Computer Science', 'tayyaba2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026427', 'Muhammad Waseem', 'BSc (Hons) Computer Science', 'waseem2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026428', 'Izzat Amin', 'BSc (Hons) Computer Science', 'izzat2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026429', 'Muhammad Faizan Shahid', 'BSc (Hons) Computer Science', 'faizans2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026430', 'Hamza Rehan', 'BSc (Hons) Computer Science', 'hamzar2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026431', 'Muhammad Ikramullah Khan', 'BSc (Hons) Computer Science', 'mikram2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026432', 'Muhammad Talha Hameed Khan', 'BSc (Hons) Computer Science', 'talha2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026433', 'Zainab Malik', 'BSc (Hons) Computer Science', 'zainab2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026434', 'Naeem Ullah Khan', 'BSc (Hons) Computer Science', 'naeem2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026435', 'Muhammad Usman', 'BSc (Hons) Computer Science', 'musman2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('15026436', 'Muhammad Usman', 'BSc (Hons) Computer Science', 'usman2015@namal.edu.pk', 'Year - 3', NULL, NULL),
('2016-UET-NML-CS-01', 'Munazza Nida', 'BSc Computer Science', '1602001@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-03', 'Inbasat Fiza', 'BSc Computer Science', '1601026@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-04', 'Muhammad Adnan Shah', 'BSc Computer Science', '1602004@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-05', 'Mubashar Nisar', 'BSc Computer Science', '1602005@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-08', 'Nadeem Abbas', 'BSc Computer Science', '1602008@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-09', 'Abis Ali Jamal', 'BSc Computer Science', '1602038@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-10', 'Mahad Asif', 'BSc Computer Science', '1602009@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-12', 'Muhammad Nafy Khan', 'BSc Computer Science', '1602010@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-13', 'Muhammad Waqar', 'BSc Computer Science', '1602011@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-15', 'Sana Fatima', 'BSc Computer Science', '1602014@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-17', 'Umer Farooq', 'BSc Computer Science', '1602017@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-18', 'Asmat Ullah Wazir', 'BSc Computer Science', '1602018@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-19', 'Muhammad Aqil', 'BSc Computer Science', '1602019@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-20', 'Ammar Farooq Khan', 'BSc Computer Science', '1602020@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-21', 'Usama Tehmas', 'BSc Computer Science', '1602021@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-23', 'Muhammad Azhar Ud Din', 'BSc Computer Science', '1602023@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-24', 'Muhammad Faisal Shahzad', 'BSc Computer Science', '1602024@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-25', 'Syed Ahmed Hasan Ovais', 'BSc Computer Science', '1602025@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-27', 'Samman Urooj', 'BSc Computer Science', '1602027@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-28', 'Muhammad Hamza', 'BSc Computer Science', '1602028@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-29', 'Fahad Hussain Malik', 'BSc Computer Science', '1602029@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-30', 'Muhammad Zeeshan Ahmad', 'BSc Computer Science', '1602030@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-31', 'Muhammad Shoaib', 'BSc Computer Science', '1602031@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-33', 'Muhammad Usaman  Ali', 'BSc Computer Science', '1602033@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-34', 'Hinan Bilal Shah', 'BSc Computer Science', '1602034@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-35', 'Hamid Naseem', 'BSc Computer Science', '1602035@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-CS-36', 'Ahmad Ayaz', 'BSc Computer Science', '1602036@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-01', 'Syed Zohaib Hussain Kazmi', 'BSc Electrical  Engineering', '1601002@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-02', 'Nasarullah', 'BSc Electrical  Engineering', '1601003@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-03', 'Muhammad Atif Haroon', 'BSc Electrical  Engineering', '1601004@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-04', 'Umair Nawaz', 'BSc Electrical  Engineering', '1601005@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-05', 'Tufail Ahmad Siddiq', 'BSc Electrical  Engineering', '1601006@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-06', 'Mian Yousaf Shah', 'BSc Electrical  Engineering', '1601007@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-07', 'Muhammad Imran', 'BSc Electrical  Engineering', '1601008@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-08', 'Waqar Hassan', 'BSc Electrical  Engineering', '1601009@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-09', 'Mudassar Nisar', 'BSc Electrical  Engineering', '1601010@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-10', 'Fazal Wahid', 'BSc Electrical  Engineering', '1601012@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-11', 'Muhammad Faiq Kaleem', 'BSc Electrical  Engineering', '1601014@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-12', 'Muhammad Khan', 'BSc Electrical  Engineering', '1601015@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-13', 'Muhammad Waqas', 'BSc Electrical  Engineering', '1601016@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-14', 'Ansar Abbas Khan', 'BSc Electrical  Engineering', '1601017@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-15', 'Muhammad Sheraz', 'BSc Electrical  Engineering', '1601018@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-16', 'Muhammad Afzal', 'BSc Electrical  Engineering', '1601019@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-17', 'Asif Ahmad', 'BSc Electrical  Engineering', '1601020@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-19', 'Waseem Haider', 'BSc Electrical  Engineering', '1601022@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-20', 'Nishat Ahmed', 'BSc Electrical  Engineering', '1601023@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-21', 'Aaqib Hussain', 'BSc Electrical  Engineering', '1601024@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-22', 'Muhammad Ilyas', 'BSc Electrical  Engineering', '1601025@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-23', 'Najeeb Ullah Khan', 'BSc Electrical  Engineering', '1601027@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-25', 'Zubair Iqbal', 'BSc Electrical  Engineering', '1601029@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-27', 'Junaid Bakhtiar', 'BSc Electrical  Engineering', '1601031@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-29', 'Muhammad Mir Hassan', 'BSc Electrical  Engineering', '1601033@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-32', 'Muhammad Iqbal', 'BSc Electrical  Engineering', '1601036@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-34', 'Abdul Wahab', 'BSc Electrical  Engineering', '1601039@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-35', 'Kashif Saeed', 'BSc Electrical  Engineering', '1601040@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-36', 'Aftab Mustafa Qureshi', 'BSc Electrical  Engineering', '1601041@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-38', 'Muhammad Ghufran', 'BSc Electrical  Engineering', '1601042@namal.edu.pk', 'Year - 2', NULL, NULL),
('2016-UET-NML-Elect-39', 'Rafi-Ud-Din', 'BSc Electrical  Engineering', '1601043@namal.edu.pk', 'Year - 2', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tutor`
--

CREATE TABLE IF NOT EXISTS `tutor` (
  `tutor_id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  PRIMARY KEY (`tutor_id`),
  UNIQUE KEY `tutor_id` (`tutor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tutor`
--

INSERT INTO `tutor` (`tutor_id`, `name`, `email`, `phone`) VALUES
('1', 'Dr. Malik Jahan Khan', 'malik.jahan@namal.edu.pk', 'null'),
('10', 'Dr. Muhammad Naeem Ayyaz', 'naeem.ayyaz@namal.edu.pk', 'null'),
('11', 'Dr. Nasir ud Din Gohar', 'nasir.gohar@namal.edu.pk', 'null'),
('12', 'Dr. Amir Khurrum Rashid', 'amir.khurrum@namal.edu.pk', 'null'),
('13', 'Dr. Israr Ali Khan', 'israr.khan@namal.edu.pk', 'null'),
('14', 'Dr. Syed Asad Alam', 'asad.alam@namal.edu.pk', 'null'),
('15', 'Dr. Ateeq-ur-Rehman Shaheen', 'ateeq.shaheen@namal.edu.pk', 'null'),
('16', 'Muhammad Hanif', 'muhammad.hanif@namal.edu.pk', 'null'),
('17', 'Jawwad Nasar Chattha', 'jawwad.chattha@namal.edu.pk', 'null'),
('18', 'Zulaikha Kiran', 'zulaikha.kiran@namal.edu.pk', 'null'),
('19', 'Faiqa Ali', 'faiqa.ali@namal.edu.pk', 'null'),
('2', 'Dr. Muhammad Adil Raja', 'adil.raja@namal.edu.pk', 'null'),
('20', 'Abbirah Ahmad', 'abbirah.ahmed@namal.edu.pk', 'null'),
('21', 'Azeem Ahmed Khan', 'azeem.khan@namal.edu.pk', 'null'),
('22', 'Muhammad Zameer Nawaz', 'zameer.nawaz@namal.edu.pk', 'null'),
('23', 'Muhammad Irfan Nadeem', 'irfan.nadeem@namal.edu.pk', 'null'),
('24', 'Dr. Usman Raja', 'usman.raja@namal.edu.pk', 'null'),
('25', 'Dr. Muhammad Umer Azeem', 'umer.azeem@namal.edu.pk', 'null'),
('26', 'Dr. Iqra Abdullah', 'iqra.abdullah@namal.edu.pk', 'null'),
('27', 'Basharat Javed', 'basharat.javed@namal.edu.pk', 'null'),
('3', 'Dr. Adnan Iqbal', 'adnan.iqbal@namal.edu.pk', 'null'),
('4', 'Dr. Noman Javed', 'noman.javed@namal.edu.pk', '12345'),
('5', 'Dr. Junaid Akhtar', 'junaid.akhtar@namal.edu.pk', 'null'),
('6', 'Muhammad Sarmad Ali', 'sarmad.ali@namal.edu.pk', 'null'),
('7', 'Ambreen Hanif', 'ambreen.hanif@namal.edu.pk', 'null'),
('8', 'Muhammad Kamran Nishat', 'kamran.nishat@namal.edu.pk', 'null'),
('9', 'Gul Aftab Ahmed', 'gul.aftab@namal.edu.pk', 'null'),
('Tutor_Id', 'Name', 'Email', 'Phone');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
