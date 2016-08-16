-- MySQL dump 10.13  Distrib 5.6.20, for osx10.8 (x86_64)
--
-- Host: localhost    Database: wms
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `EpriLog`
--


--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sd_address_1` varchar(512) DEFAULT NULL COMMENT 'msp.address.address_1, cim.work_location.streetaddress.address_general',
  `sd_address_2` varchar(512) DEFAULT NULL COMMENT 'msp.address.address_2, cim.worklocation.streetdetail.name',
  `sd_building_name` varchar(512) DEFAULT NULL COMMENT 'msp.address..building_number, cim.work_location.streetdetail.building_name',
  `sd_code` varchar(512) DEFAULT NULL COMMENT 'cim.worklocation.streetdetail.code',
  `sd_number` varchar(512) DEFAULT NULL COMMENT 'msp.address..streetnumber, cim.worklocation.streetdetail.number',
  `sd_prefix` varchar(512) DEFAULT NULL COMMENT 'msp.address..streetprefix, cim.worklocation.streetdetail.prefix',
  `sd_suffix` varchar(512) DEFAULT NULL COMMENT 'msp.address..streetsuffix, cim.worklocation.streetdetail.suffix',
  `sd_suite_number` varchar(512) DEFAULT NULL COMMENT 'msp.address..suiteNumber, cim.worklocation.streetdetail.suitenumber',
  `sd_type` varchar(512) DEFAULT NULL COMMENT 'msp.address..streettype, cim.worklocation.streetdetail.type',
  `sd_within_town_limits_flag` int(1) NOT NULL DEFAULT '0' COMMENT 'cim.worklocation.streetdetail.withintownlimits',
  `td_code` varchar(512) DEFAULT NULL COMMENT 'msp.address.townCode, cim.worklocation.towndetail.code',
  `td_country` varchar(512) DEFAULT NULL COMMENT 'cim.worklocation.towndetail.country, msp.address..country',
  `td_name` varchar(512) DEFAULT NULL COMMENT 'msp.address.city,cim.worklocation.towndetail.name',
  `td_section` varchar(512) DEFAULT NULL COMMENT 'cim.worklocation.towndetail.section,msp.',
  `td_state_province` varchar(512) DEFAULT NULL COMMENT 'cim.worklocation.towndetail.state,msp.address.state',
  `directions` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationComment,cim.worklocation.direction',
  `td_pobox` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.address.pobox',
  `td_postal_code` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.postalcode',
  `td_region` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.address.region',
  `county` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.county',
  `township_name` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.townshipname',
  `subdivision` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.subdivision',
  `block` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.block',
  `lot` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.lot',
  `time_zone` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.time_zone',
  `coord_system` varchar(512) DEFAULT NULL COMMENT 'cim.work.worklocation.coordinatesystem',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=528 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `address_districts`
--

DROP TABLE IF EXISTS `address_districts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address_districts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `district_id` int(11) NOT NULL COMMENT 'foreign to district',
  PRIMARY KEY (`id`),
  KEY `fk_address_districts_address_id` (`address_id`),
  KEY `fk_address_districts_district_id` (`district_id`),
  CONSTRAINT `fk_address_districts_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `fk_address_districts_district_id` FOREIGN KEY (`district_id`) REFERENCES `district` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `address_hazards`
--

DROP TABLE IF EXISTS `address_hazards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address_hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `hazard_id` int(11) NOT NULL COMMENT 'foreign to hazards',
  PRIMARY KEY (`id`),
  KEY `fk_address_hazards_address_id` (`address_id`),
  KEY `fk_address_hazards_hazard_id` (`hazard_id`),
  CONSTRAINT `fk_address_hazards_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `fk_address_hazards_hazard_id` FOREIGN KEY (`hazard_id`) REFERENCES `hazards` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='cim.asset.hazards';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `address_internal_loc`
--

DROP TABLE IF EXISTS `address_internal_loc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address_internal_loc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `building_name` varchar(512) DEFAULT NULL COMMENT 'address.internal.buildingName',
  `building_number` varchar(512) DEFAULT NULL COMMENT 'address.internal.buildingNumber',
  `floor` varchar(512) DEFAULT NULL COMMENT 'address.internal.floor',
  `room_number` varchar(512) DEFAULT NULL COMMENT 'address.internal.roomNumber',
  PRIMARY KEY (`id`),
  KEY `fk_address_iloc_address_id` (`address_id`),
  CONSTRAINT `fk_address_iloc_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `address_position_points`
--

DROP TABLE IF EXISTS `address_position_points`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address_position_points` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `sequence` int(5) DEFAULT NULL COMMENT 'cim.asset.location',
  `xposition` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  `yposition` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  `zposition` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  PRIMARY KEY (`id`),
  KEY `fk_address_position_points_address_id` (`address_id`),
  CONSTRAINT `fk_address_position_points_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='cim.asset  position points';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `asset`
--

DROP TABLE IF EXISTS `asset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asset` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRID` varchar(512) NOT NULL COMMENT 'cim.asset.mRID',
  `critical_flag` int(1) NOT NULL DEFAULT '0' COMMENT 'cim.asset',
  `utc_number` varchar(512) DEFAULT NULL COMMENT 'cim.asset',
  `address_id` int(11) DEFAULT NULL COMMENT 'cim.asset.location',
  `internal_building_name` varchar(512) DEFAULT NULL,
  `internal_building_number` varchar(512) DEFAULT NULL,
  `internal_floor` varchar(512) DEFAULT NULL,
  `internal_room_number` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `address_id` (`address_id`),
  CONSTRAINT `asset_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=243 DEFAULT CHARSET=utf8 COMMENT='cim.asset';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `asset_names`
--

DROP TABLE IF EXISTS `asset_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asset_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `name` varchar(512) NOT NULL COMMENT 'cim.name',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to nametype',
  PRIMARY KEY (`id`),
  KEY `fk_asset_names_nametype_id` (`name_type_id`),
  KEY `fk_asset_names_objectid` (`asset_id`),
  CONSTRAINT `fk_asset_names_nametype_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_asset_names_objectid` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `asset_proceds`
--

DROP TABLE IF EXISTS `asset_proceds`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asset_proceds` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `proced_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_asset_procedures_asset_id` (`asset_id`),
  KEY `fk_asset_proceds_proced_id` (`proced_id`),
  CONSTRAINT `fk_asset_proceds_proced_id` FOREIGN KEY (`proced_id`) REFERENCES `proced` (`id`),
  CONSTRAINT `fk_asset_procedures_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `attachment`
--

DROP TABLE IF EXISTS `attachment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attachment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `filename` varchar(512) NOT NULL COMMENT 'path to file on server',
  `comment` varchar(512) DEFAULT NULL,
  `description` varchar(512) DEFAULT NULL,
  `attach_type` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(512) NOT NULL COMMENT 'msp.supplementalnote.notevalue',
  `comment_type` varchar(512) DEFAULT NULL COMMENT 'msp.supplementalnote.notetype',
  `comment_subtype` varchar(512) DEFAULT NULL COMMENT 'msp.supplementalnote.notesubtype',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `contactperson`
--

DROP TABLE IF EXISTS `contactperson`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contactperson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastname` varchar(512) NOT NULL COMMENT 'msp.workrequest.requestingperson',
  `firstname` varchar(512) NOT NULL COMMENT 'msp.workrequest.requestingperson',
  `middle` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `prefix` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `suffix` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `governmentid` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `affiliation` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `primary_id` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `secondary_id` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson',
  `objectid` varchar(512) DEFAULT NULL COMMENT 'msp identified_object',
  `comments` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.requestingperson.comments',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `contactperson_addresses`
--

DROP TABLE IF EXISTS `contactperson_addresses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contactperson_addresses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contactperson_id` int(11) NOT NULL COMMENT 'foreign to contact_person',
  `address_id` int(11) NOT NULL COMMENT 'foreign to address',
  `address_type` varchar(512) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.addressitems.addressitem',
  `priority_order` int(3) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.addressitems.addressitem',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_addresses_contactperson_id` (`contactperson_id`),
  KEY `fk_contactperson_addresses_address_id` (`address_id`),
  CONSTRAINT `fk_contactperson_addresses_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `fk_contactperson_addresses_contactperson_id` FOREIGN KEY (`contactperson_id`) REFERENCES `contactperson` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `contactperson_emails`
--

DROP TABLE IF EXISTS `contactperson_emails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contactperson_emails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contactperson_id` int(11) NOT NULL COMMENT 'foreign to contactperson',
  `email_id` int(11) NOT NULL COMMENT 'foreign to email',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_emails_contactperson_id` (`contactperson_id`),
  KEY `fk_contactperson_emails_email_id` (`email_id`),
  CONSTRAINT `fk_contactperson_emails_contactperson_id` FOREIGN KEY (`contactperson_id`) REFERENCES `contactperson` (`id`),
  CONSTRAINT `fk_contactperson_emails_email_id` FOREIGN KEY (`email_id`) REFERENCES `email` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `contactperson_other_contactinfos`
--

DROP TABLE IF EXISTS `contactperson_other_contactinfos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contactperson_other_contactinfos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contactperson_id` int(11) NOT NULL COMMENT 'foreign to contactperson',
  `other_contactinfo_id` int(11) NOT NULL COMMENT 'foreign to other_contactinfo',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_other_contactperson_id` (`contactperson_id`),
  KEY `fk_contactperson_other_other_contactinfo_id` (`other_contactinfo_id`),
  CONSTRAINT `fk_contactperson_other_contactperson_id` FOREIGN KEY (`contactperson_id`) REFERENCES `contactperson` (`id`),
  CONSTRAINT `fk_contactperson_other_other_contactinfo_id` FOREIGN KEY (`other_contactinfo_id`) REFERENCES `other_contactinfo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `contactperson_phones`
--

DROP TABLE IF EXISTS `contactperson_phones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contactperson_phones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contactperson_id` int(11) NOT NULL COMMENT 'foreign to contactperson',
  `phone_id` int(11) NOT NULL COMMENT 'foreign to phone',
  PRIMARY KEY (`id`),
  KEY `fk_contactperson_phones_contactperson_id` (`contactperson_id`),
  KEY `fk_contactperson_phones_phone+id` (`phone_id`),
  CONSTRAINT `fk_contactperson_phones_contactperson_id` FOREIGN KEY (`contactperson_id`) REFERENCES `contactperson` (`id`),
  CONSTRAINT `fk_contactperson_phones_phone+id` FOREIGN KEY (`phone_id`) REFERENCES `phone` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `crew`
--

DROP TABLE IF EXISTS `crew`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRid` varchar(512) NOT NULL COMMENT 'cim.crew',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `crew_assets`
--

DROP TABLE IF EXISTS `crew_assets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew_assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `crew_id` int(11) NOT NULL COMMENT 'foreign to crew',
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  PRIMARY KEY (`id`),
  KEY `fk_crew_assets_crew_id` (`crew_id`),
  KEY `fk_crew_assets_asset_id` (`asset_id`),
  CONSTRAINT `fk_crew_assets_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  CONSTRAINT `fk_crew_assets_crew_id` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `crew_contactpersons`
--

DROP TABLE IF EXISTS `crew_contactpersons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew_contactpersons` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contact_person_id` int(11) NOT NULL COMMENT 'foreign to contact_person',
  `crew_id` int(11) NOT NULL COMMENT 'foreign to crew',
  PRIMARY KEY (`id`),
  KEY `fk_contact_crews_contact_id` (`contact_person_id`),
  KEY `fk_contact_crews_crew_id` (`crew_id`),
  CONSTRAINT `fk_contact_crews_crew_id` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`id`),
  CONSTRAINT `fk_contact_crews_work_id` FOREIGN KEY (`contact_person_id`) REFERENCES `contactperson` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `crew_names`
--

DROP TABLE IF EXISTS `crew_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crew_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `crew_id` int(11) NOT NULL COMMENT 'foreign key to crew',
  `name` varchar(512) NOT NULL COMMENT 'cim.crew',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign key to name_type',
  PRIMARY KEY (`id`),
  KEY `fk_crew_names_crew_id` (`crew_id`),
  KEY `fk_crew_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_crew_names_crew_id` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`id`),
  CONSTRAINT `fk_crew_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `district`
--

DROP TABLE IF EXISTS `district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `district` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `name` varchar(512) NOT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `code` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  `description` varchar(512) DEFAULT NULL COMMENT 'msp.worklocation.locationinformation.district',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `email`
--

DROP TABLE IF EXISTS `email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(512) NOT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  `email_type` varchar(512) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  `priority_order` int(3) DEFAULT NULL COMMENT 'msp.requestingperson.contactinfo.emailaddresses',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hazards`
--

DROP TABLE IF EXISTS `hazards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hazard_name` varchar(512) NOT NULL COMMENT 'cim.asset.location.hazards',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=484 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `interface`
--

--
-- Table structure for table `maintorder`
--

DROP TABLE IF EXISTS `maintorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maintorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRID` varchar(512) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` varchar(512) NOT NULL,
  `status` varchar(20) DEFAULT NULL COMMENT 'ACTIVE, DELETED',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `maintorder_names`
--

DROP TABLE IF EXISTS `maintorder_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maintorder_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `maintorder_id` int(11) NOT NULL,
  `name` varchar(512) NOT NULL,
  `name_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_maintorder_names_maintorder_id` (`maintorder_id`),
  KEY `fk_maintorder_names_nametype_id` (`name_type_id`),
  CONSTRAINT `fk_maintorder_names_maintorder_id` FOREIGN KEY (`maintorder_id`) REFERENCES `maintorder` (`id`),
  CONSTRAINT `fk_maintorder_names_nametype_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `material_item`
--

DROP TABLE IF EXISTS `material_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `material_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `unit` varchar(512) DEFAULT NULL,
  `quantity` float DEFAULT NULL,
  `multiplier` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.materialitem';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `material_item_names`
--

DROP TABLE IF EXISTS `material_item_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `material_item_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `material_item_id` int(11) NOT NULL COMMENT 'foreign to material_item',
  `name` varchar(512) NOT NULL,
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to nametype',
  PRIMARY KEY (`id`),
  KEY `fk_material_item_material_id` (`material_item_id`),
  KEY `fk_material_item_names_nametype_id` (`name_type_id`),
  CONSTRAINT `fk_material_item_material_id` FOREIGN KEY (`material_item_id`) REFERENCES `material_item` (`id`),
  CONSTRAINT `fk_material_item_names_nametype_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `measurement`
--

DROP TABLE IF EXISTS `measurement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measurement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phases` varchar(512) DEFAULT NULL,
  `unit_multiplier` float DEFAULT NULL,
  `unit_symbol` varchar(512) DEFAULT NULL,
  `measurement_type` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `name_type_authority`
--

DROP TABLE IF EXISTS `name_type_authority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `name_type_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(512) DEFAULT NULL,
  `description` varchar(512) DEFAULT NULL COMMENT 'cim.nametypeauthority, msp.nametypeauthority',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=728 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `nametype`
--

DROP TABLE IF EXISTS `nametype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nametype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(512) DEFAULT NULL,
  `name_type_authority_id` int(11) DEFAULT NULL,
  `description` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_name_type_authority_id` (`name_type_authority_id`),
  CONSTRAINT `fk_name_type_authority_id` FOREIGN KEY (`name_type_authority_id`) REFERENCES `name_type_authority` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=771 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `objectref`
--

DROP TABLE IF EXISTS `objectref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `objectref` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `primary_name` varchar(512) NOT NULL COMMENT 'msp.objectref',
  `secondary_name` varchar(512) DEFAULT NULL COMMENT 'msp.objectref',
  `noun` varchar(512) DEFAULT NULL COMMENT 'msp.objectref',
  `object_guid` varchar(512) DEFAULT NULL COMMENT 'msp.objectref',
  `utility` varchar(512) DEFAULT NULL COMMENT 'msp.objectref',
  `registered_name` varchar(512) DEFAULT NULL COMMENT 'msp.objectref',
  `system_name` varchar(512) DEFAULT NULL COMMENT 'msp.objectref',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `organization`
--

DROP TABLE IF EXISTS `organization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organization` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRid` varchar(512) NOT NULL COMMENT 'cim.organization',
  `address_id` int(11) DEFAULT NULL COMMENT 'foreign to address',
  `phone_id` int(11) DEFAULT NULL COMMENT 'foreign to phone',
  PRIMARY KEY (`id`),
  KEY `fk_organization_phone_id` (`phone_id`),
  KEY `fk_organization_address_id` (`address_id`),
  CONSTRAINT `fk_organization_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `fk_organization_phone_id` FOREIGN KEY (`phone_id`) REFERENCES `phone` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=408 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `organization_names`
--

DROP TABLE IF EXISTS `organization_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organization_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `organization_id` int(11) DEFAULT NULL,
  `name` varchar(512) DEFAULT NULL,
  `name_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_organization_names_organization_id` (`organization_id`),
  KEY `fk_organization_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_organization_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_organization_names_organization_id` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `other_contactinfo`
--

DROP TABLE IF EXISTS `other_contactinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `other_contactinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `details` varchar(512) NOT NULL COMMENT 'msp.other_contactinfo',
  `info_type` varchar(512) DEFAULT NULL COMMENT 'msp.other_contactinfo',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `phone`
--

DROP TABLE IF EXISTS `phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `areacode` varchar(512) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `citycode` varchar(512) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `countrycode` varchar(512) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `localnumber` varchar(512) DEFAULT NULL COMMENT 'msp.phone, cim.phone',
  `extension` varchar(512) DEFAULT NULL,
  `phonetype` varchar(512) DEFAULT NULL COMMENT 'msp.phone',
  `priorityorder` int(3) DEFAULT NULL COMMENT 'msp.phone',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `proced`
--

DROP TABLE IF EXISTS `proced`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proced` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `instruction` varchar(512) NOT NULL,
  `kind` varchar(512) DEFAULT NULL,
  `sequence` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='cim.asset';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `proced_measurements`
--

DROP TABLE IF EXISTS `proced_measurements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proced_measurements` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `measurement_id` int(11) NOT NULL COMMENT 'foreign to measurement',
  `proced_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_procedure_measurements_measurement_id` (`measurement_id`),
  KEY `fk_proced_measurements_proced_id` (`proced_id`),
  CONSTRAINT `fk_proced_measurements_proced_id` FOREIGN KEY (`proced_id`) REFERENCES `proced` (`id`),
  CONSTRAINT `fk_procedure_measurements_measurement_id` FOREIGN KEY (`measurement_id`) REFERENCES `measurement` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `purchase_order`
--

DROP TABLE IF EXISTS `purchase_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_order` (
  `order_num` int(11) NOT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `quantity` float DEFAULT NULL,
  `shipping_cost` float DEFAULT NULL,
  `shipping_date` datetime DEFAULT NULL,
  `freight_company` varchar(255) DEFAULT NULL,
  `sales_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `request` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(512) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `request` varchar(512) DEFAULT NULL,
  `result` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `resultcode`
--

DROP TABLE IF EXISTS `resultcode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resultcode` (
  `id` int(11) NOT NULL,
  `name` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `seqs`
--

DROP TABLE IF EXISTS `seqs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seqs` (
  `seq_name` varchar(512) DEFAULT NULL,
  `start` int(11) DEFAULT NULL,
  `increment` int(11) DEFAULT NULL,
  `curval` int(11) DEFAULT NULL,
  `flag` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `time_schedule`
--

DROP TABLE IF EXISTS `time_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `time_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_tstamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'cim.timeschedule',
  `end_tstamp` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT 'cim.timeschedule',
  `schedule_type` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=208 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order`
--

DROP TABLE IF EXISTS `work_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_name` varchar(512) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` varchar(512) NOT NULL,
  `mRid` varchar(512) NOT NULL COMMENT 'master resource id',
  `kind` varchar(512) NOT NULL COMMENT 'type of work',
  `updated_at` timestamp NULL DEFAULT NULL,
  `request_datetime` timestamp NULL DEFAULT NULL COMMENT 'date and time work was requested',
  `updated_by` varchar(512) DEFAULT NULL,
  `status` varchar(512) NOT NULL COMMENT 'status of work order',
  `status_kind` varchar(512) DEFAULT NULL COMMENT 'kind of work status',
  `priority_justification` varchar(512) DEFAULT NULL COMMENT 'justification for rank',
  `priority_rank` int(5) DEFAULT NULL COMMENT 'lower number = higher priority',
  `priority_type` varchar(512) DEFAULT NULL COMMENT 'type of priority',
  `comments` varchar(512) DEFAULT NULL,
  `description` varchar(512) DEFAULT NULL,
  `title` varchar(512) DEFAULT NULL,
  `request_contact_id` int(11) DEFAULT NULL COMMENT 'foreign to contact_person',
  `address_id` int(11) DEFAULT NULL COMMENT 'foreign to address',
  `primary_object_ref_id` int(11) DEFAULT NULL COMMENT 'foreign to objectref',
  `grid_location` varchar(512) DEFAULT NULL COMMENT 'grid location',
  `location_comment` varchar(512) DEFAULT NULL COMMENT 'comment about location',
  `location_contact_id` int(11) DEFAULT NULL COMMENT 'foreign to contactperson',
  `gps_latitude` float DEFAULT NULL COMMENT 'msp.workrequest.worklocation',
  `gps_longitude` float DEFAULT NULL COMMENT 'msp.workrequest.worklocation',
  `gps_altitude` float DEFAULT NULL COMMENT 'msp.workrequest.worklocation',
  `internal_building_name` varchar(512) DEFAULT NULL COMMENT 'cim.work.worklocation.internallocation',
  `internal_building_num` varchar(512) DEFAULT NULL COMMENT 'cim.work.worklocation.internallocation',
  `internal_floor` varchar(512) DEFAULT NULL COMMENT 'cim.work.worklocation.internallocation',
  `internal_room_num` varchar(512) DEFAULT NULL COMMENT 'cim.work.worklocation.internallocation',
  `primary_id` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.primary_id',
  `secondary_id` varchar(512) DEFAULT NULL COMMENT 'msp.workrequest.secondary_id',
  `maintorder_id` int(11) DEFAULT NULL,
  `reason` varchar(60) DEFAULT NULL,
  `severity` varchar(255) DEFAULT NULL,
  `order_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_work_order_request_contact_id` (`request_contact_id`),
  KEY `fk_work_order_primary_object_id` (`primary_object_ref_id`),
  KEY `fk_work_order_location_contact_id` (`location_contact_id`),
  KEY `fk_work_order_maintorder_id` (`maintorder_id`),
  CONSTRAINT `fk_work_order_location_contact_id` FOREIGN KEY (`location_contact_id`) REFERENCES `contactperson` (`id`),
  CONSTRAINT `fk_work_order_maintorder_id` FOREIGN KEY (`maintorder_id`) REFERENCES `maintorder` (`id`),
  CONSTRAINT `fk_work_order_primary_object_id` FOREIGN KEY (`primary_object_ref_id`) REFERENCES `objectref` (`id`),
  CONSTRAINT `fk_work_order_request_contact_id` FOREIGN KEY (`request_contact_id`) REFERENCES `contactperson` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=288 DEFAULT CHARSET=utf8 COMMENT='msp, cim  \r\nworkrequest';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order_attachments`
--

DROP TABLE IF EXISTS `work_order_attachments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_attachments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `attachment_id` int(11) NOT NULL COMMENT 'foreign to attachment',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_attachments_attachment_id` (`attachment_id`),
  KEY `fk_work_order_attachments_work_order_id` (`work_order_id`),
  CONSTRAINT `fk_work_order_attachments_attachment_id` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`id`),
  CONSTRAINT `fk_work_order_attachments_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order_comments`
--

DROP TABLE IF EXISTS `work_order_comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `comment_id` int(11) NOT NULL COMMENT 'foreign to comment',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_comments_work_order_id` (`work_order_id`),
  KEY `fk_work_order_comments_comment_id` (`comment_id`),
  CONSTRAINT `fk_work_order_comments_comment_id` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`id`),
  CONSTRAINT `fk_work_order_comments_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='msp.workrequest.supplementalnotes\r\n';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order_hazards`
--

DROP TABLE IF EXISTS `work_order_hazards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_hazards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `hazard_id` int(11) NOT NULL COMMENT 'foreigh to hazards',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_hazards_work_id` (`work_order_id`),
  KEY `fk_work_order_hazards_hazard_id` (`hazard_id`),
  CONSTRAINT `fk_work_order_hazards_hazard_id` FOREIGN KEY (`hazard_id`) REFERENCES `hazards` (`id`),
  CONSTRAINT `fk_work_order_hazards_work_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=124 DEFAULT CHARSET=utf8 COMMENT='cim.worklocation.hazards';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order_location_object_refs`
--

DROP TABLE IF EXISTS `work_order_location_object_refs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_location_object_refs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `loc_ref_object_id` int(11) NOT NULL COMMENT 'foreign to objectref',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_location_object_refs_work_id` (`work_order_id`),
  KEY `fk_work_order_location_object_refs_locref_objid` (`loc_ref_object_id`),
  CONSTRAINT `fk_work_order_location_object_refs_locref_objid` FOREIGN KEY (`loc_ref_object_id`) REFERENCES `objectref` (`id`),
  CONSTRAINT `fk_work_order_location_object_refs_work_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='msp.workrequest.locationreferences.objectrefs';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order_names`
--

DROP TABLE IF EXISTS `work_order_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(512) NOT NULL,
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to name_type',
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_names_work_order_id` (`work_order_id`),
  KEY `fk_work_order_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_work_order_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_work_order_names_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='cim.workrequest.names';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order_organizations`
--

DROP TABLE IF EXISTS `work_order_organizations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_organizations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `organization_id` int(11) NOT NULL COMMENT 'foreign to organization',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_organizations_organization_id` (`organization_id`),
  KEY `fk_work_order_organizations_work_order_id` (`work_order_id`),
  CONSTRAINT `fk_work_order_organizations_organization_id` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`),
  CONSTRAINT `fk_work_order_organizations_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order_schedules`
--

DROP TABLE IF EXISTS `work_order_schedules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_schedules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign key to work_order',
  `time_schedule_id` int(11) NOT NULL COMMENT 'foreign key to time_schedule',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_schedule_work_order_id` (`work_order_id`),
  KEY `fk_work_order_schedule_time_schedule_id` (`time_schedule_id`),
  CONSTRAINT `fk_work_order_schedule_time_schedule_id` FOREIGN KEY (`time_schedule_id`) REFERENCES `time_schedule` (`id`),
  CONSTRAINT `fk_work_order_schedule_work_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8 COMMENT='cim.work.timeschedules\r\n';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_order_work_tasks`
--

DROP TABLE IF EXISTS `work_order_work_tasks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_order_work_tasks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  PRIMARY KEY (`id`),
  KEY `fk_work_order_work_tasks_order_id` (`work_order_id`),
  KEY `fk_work_order_work_tasks_task_id` (`work_task_id`),
  CONSTRAINT `fk_work_order_work_tasks_order_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`),
  CONSTRAINT `fk_work_order_work_tasks_task_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_position_points`
--

DROP TABLE IF EXISTS `work_position_points`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_position_points` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_order_id` int(11) NOT NULL COMMENT 'foreign to work_order',
  `sequence_num` int(5) DEFAULT NULL,
  `xposition` int(11) DEFAULT NULL,
  `yposition` int(11) DEFAULT NULL,
  `zposition` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_work_position_points_work_id` (`work_order_id`),
  CONSTRAINT `fk_work_position_points_work_id` FOREIGN KEY (`work_order_id`) REFERENCES `work_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='cim.work.worklocation.pospoints\r\n';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_task`
--

DROP TABLE IF EXISTS `work_task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mRID` varchar(512) NOT NULL COMMENT 'master resource id',
  `instructions` varchar(512) DEFAULT NULL COMMENT 'instructions for performing this task',
  `subject` varchar(512) NOT NULL COMMENT 'document subject',
  `crew_eta` timestamp NULL DEFAULT NULL COMMENT 'cim work.worktask.creweta',
  `task_type` varchar(512) DEFAULT NULL COMMENT 'cim.work.worktask.taskKind',
  `old_asset_id` int(11) DEFAULT NULL COMMENT 'cim.work.worktask.oldAsset',
  `status_kind` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_work_task_old_asset_id` (`old_asset_id`),
  CONSTRAINT `fk_work_task_old_asset_id` FOREIGN KEY (`old_asset_id`) REFERENCES `asset` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=utf8 COMMENT='cim.work.worktasks';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_task_assets`
--

DROP TABLE IF EXISTS `work_task_assets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task_assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'created timestamp',
  `created_by` varchar(512) DEFAULT NULL COMMENT 'created by',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_asset_id` (`asset_id`),
  KEY `fk_work_task_assets_work_id` (`work_task_id`),
  CONSTRAINT `fk_work_task_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  CONSTRAINT `fk_work_task_assets_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.assets';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_task_crews`
--

DROP TABLE IF EXISTS `work_task_crews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task_crews` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `crew_id` int(11) NOT NULL COMMENT 'foreign to crew',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_crews_work_id` (`work_task_id`),
  KEY `fk_work_task_crews_crew_id` (`crew_id`),
  CONSTRAINT `fk_work_task_crews_crew_id` FOREIGN KEY (`crew_id`) REFERENCES `crew` (`id`),
  CONSTRAINT `fk_work_task_crews_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8 COMMENT='cim.work.worktasks.crews';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_task_material_items`
--

DROP TABLE IF EXISTS `work_task_material_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task_material_items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `material_item_id` int(11) NOT NULL COMMENT 'foreign to material_item',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_material_items_mat_id` (`material_item_id`),
  KEY `fk_work_task_material_items_work_id` (`work_task_id`),
  CONSTRAINT `fk_work_task_material_items_mat_id` FOREIGN KEY (`material_item_id`) REFERENCES `material_item` (`id`),
  CONSTRAINT `fk_work_task_material_items_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_task_names`
--

DROP TABLE IF EXISTS `work_task_names`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task_names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(512) NOT NULL,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `name_type_id` int(11) DEFAULT NULL COMMENT 'foreign to name_type',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_names_work_id` (`work_task_id`),
  KEY `fk_work_task_names_name_type_id` (`name_type_id`),
  CONSTRAINT `fk_work_task_names_name_type_id` FOREIGN KEY (`name_type_id`) REFERENCES `nametype` (`id`),
  CONSTRAINT `fk_work_task_names_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='cim.work.worktask.names';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_task_old_assets`
--

DROP TABLE IF EXISTS `work_task_old_assets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task_old_assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `asset_id` int(11) NOT NULL COMMENT 'foreign to asset',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'created timestamp',
  `created_by` varchar(512) DEFAULT NULL COMMENT 'created by',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_old_asset_id` (`asset_id`),
  KEY `fk_work_task_old_assets_work_id` (`work_task_id`),
  CONSTRAINT `fk_work_task_old_asset_id2` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  CONSTRAINT `fk_work_task_old_assets_work_id2` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `work_task_time_schedules`
--

DROP TABLE IF EXISTS `work_task_time_schedules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_task_time_schedules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work_task_id` int(11) NOT NULL COMMENT 'foreign to work_task',
  `time_schedule_id` int(11) NOT NULL COMMENT 'foreign to time_schedule',
  PRIMARY KEY (`id`),
  KEY `fk_work_task_time_schedule_work_id` (`work_task_id`),
  KEY `fk_work_task_time_schedules_time_id` (`time_schedule_id`),
  CONSTRAINT `fk_work_task_time_schedule_work_id` FOREIGN KEY (`work_task_id`) REFERENCES `work_task` (`id`),
  CONSTRAINT `fk_work_task_time_schedules_time_id` FOREIGN KEY (`time_schedule_id`) REFERENCES `time_schedule` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `workorderimage`
--

DROP TABLE IF EXISTS `workorderimage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workorderimage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `workorder_id` int(11) DEFAULT NULL,
  `url` varchar(512) DEFAULT NULL,
  `error` varchar(512) DEFAULT NULL,
  `filename` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-13 14:07:57
