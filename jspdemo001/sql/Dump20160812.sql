CREATE DATABASE  IF NOT EXISTS `demo` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `demo`;
-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	5.1.50

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `demouser`
--

DROP TABLE IF EXISTS `demouser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `demouser` (
  `usercode` varchar(10) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `cremark` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`usercode`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `demouser`
--

LOCK TABLES `demouser` WRITE;
/*!40000 ALTER TABLE `demouser` DISABLE KEYS */;
/*!40000 ALTER TABLE `demouser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ju_users`
--

DROP TABLE IF EXISTS `ju_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ju_users` (
  `ju_userID` varchar(10) NOT NULL,
  `TaobaoID` int(11) DEFAULT NULL,
  `ju_userName` varchar(30) NOT NULL,
  `ju_userPWD` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ju_userID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ju_users`
--

LOCK TABLES `ju_users` WRITE;
/*!40000 ALTER TABLE `ju_users` DISABLE KEYS */;
INSERT INTO `ju_users` VALUES ('345',2,'2222','2222');
/*!40000 ALTER TABLE `ju_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `namelist`
--

DROP TABLE IF EXISTS `namelist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `namelist` (
  `first_name` varchar(30) NOT NULL,
  `second_name` varchar(45) DEFAULT NULL,
  `code` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`code`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `namelist`
--

LOCK TABLES `namelist` WRITE;
/*!40000 ALTER TABLE `namelist` DISABLE KEYS */;
INSERT INTO `namelist` VALUES ('name001','name002',1),('asass','asasas',2),('123','23443',3),('123212','234431212',4),('123212ww','234431212ww',5),('dddddd','esddsds',6),('ewwe','dssddsds',7);
/*!40000 ALTER TABLE `namelist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-12 18:26:26
