-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 13, 2019 at 06:11 PM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `company maintenance system`
--

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

DROP TABLE IF EXISTS `contacts`;
CREATE TABLE IF NOT EXISTS `contacts` (
  `megID` int(11) NOT NULL AUTO_INCREMENT,
  `FullName` varchar(250) DEFAULT NULL,
  `country` varchar(250) DEFAULT NULL,
  `message` varchar(1000) DEFAULT NULL,
  `Email` varchar(600) DEFAULT NULL,
  PRIMARY KEY (`megID`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contacts`
--

INSERT INTO `contacts` (`megID`, `FullName`, `country`, `message`, `Email`) VALUES
(1, 'Sharmini Sivarajah', 'srilanka', 'hi', 'sharmi5@gmail.com'),
(11, 'thulasi', 'srilanka', NULL, 'theepag@live.com'),
(10, 'roch', 'srilanka', NULL, 'roch4@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
CREATE TABLE IF NOT EXISTS `feedback` (
  `feedbackID` int(5) NOT NULL AUTO_INCREMENT,
  `content` text NOT NULL,
  `feedbackDateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `userID` int(5) NOT NULL,
  `ranking` int(11) DEFAULT NULL,
  PRIMARY KEY (`feedbackID`),
  KEY `userID` (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`feedbackID`, `content`, `feedbackDateTime`, `userID`, `ranking`) VALUES
(13, 'hfrgtvhjuiuhygfh', '2019-07-12 17:14:08', 7, NULL),
(14, 'It is good', '2019-07-12 18:18:33', 7, NULL),
(15, 'products are very quality..', '2019-07-12 20:18:21', 7, NULL),
(16, 'hi', '2019-07-12 20:42:51', 7, NULL),
(17, 'sdfsgrdtae', '2019-07-12 21:23:35', 7, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `leave`
--

DROP TABLE IF EXISTS `leave`;
CREATE TABLE IF NOT EXISTS `leave` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_Name` varchar(100) NOT NULL,
  `Leave_Type` varchar(100) NOT NULL,
  `Reason` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `userID` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userID` (`userID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `userID` int(5) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `uname` varchar(30) NOT NULL,
  `pword` varchar(50) NOT NULL,
  `nic` varchar(12) NOT NULL,
  `userCategory` int(1) NOT NULL DEFAULT '1',
  `addressNo` varchar(10) NOT NULL,
  `addressLine1` varchar(50) NOT NULL,
  `addressLine2` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `nic` (`nic`),
  UNIQUE KEY `uname` (`uname`),
  KEY `userCategory` (`userCategory`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `firstName`, `lastName`, `email`, `uname`, `pword`, `nic`, `userCategory`, `addressNo`, `addressLine1`, `addressLine2`, `city`) VALUES
(5, 'sharmini', 'sivaraja', 'sharmini95@gmail.com', 'sharmini', 'sharmini', '2345678923', 1, 'jaffna', 'sdfghji', 'asdfgf', 'inuvil'),
(6, 'roch', 'danistan', 'roch93@gmail.com', 'roch', 'roch', '234563523', 2, 'aSfsSEgbe', 'sgzbndymtujry', 'geargerhrtsntrsn', 'gawerhtrjry'),
(7, 'archi', 'kumar', 'archi97@gmail.com', 'archi', 'archi', '3456789', 3, 'fjufiky', 'sadadgshnjmuy', 'qwewgares', 'wegaretry'),
(8, 'thulasika', 'nathan', 'thulas95@gmail.com', 'thulasi', 'thulasi', '2345678', 3, 'asdfgjh', 'asdfddghj,k', 'qwefewagrehstjryuu', 'waegrhtjyrut'),
(9, 'sharmini', 'dani', 'archi@gamil.com', 'dani', 'dani', '957793410v', 2, 'fshjhc', 'sfsdf', 'fsf', 'dsg');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
