/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 10.4.21-MariaDB : Database - alta_online_shop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`alta_online_shop` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `alta_online_shop`;

/*Table structure for table `operators` */

DROP TABLE IF EXISTS `operators`;

CREATE TABLE `operators` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `created_at` timestamp(6) NOT NULL DEFAULT current_timestamp(6),
  `updated_at` timestamp(6) NOT NULL DEFAULT current_timestamp(6),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

/*Data for the table `operators` */

insert  into `operators`(`id`,`name`,`created_at`,`updated_at`) values 
(1,'Indosat','2022-03-07 10:33:09.000000','2022-03-14 10:33:09.000000'),
(2,'Telkomsel','2022-03-08 10:33:09.000000','2022-03-14 10:33:09.000000'),
(3,'Tri','2022-03-10 10:33:09.000000','2022-03-14 10:33:09.000000'),
(4,'XL','2022-03-11 10:33:09.000000','2022-03-14 10:33:09.000000'),
(5,'Smartfren','2022-03-14 10:33:09.000000','2022-03-14 10:33:09.000000');

/*Table structure for table `payment_methods` */

DROP TABLE IF EXISTS `payment_methods`;

CREATE TABLE `payment_methods` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `status` smallint(6) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `payment_methods` */

insert  into `payment_methods`(`id`,`name`,`status`,`created_at`,`updated_at`) values 
(1,'Transfer',0,'2022-03-14 17:38:56','2022-03-14 17:38:56'),
(2,'Cash On Delivery',0,'2022-03-14 17:38:56','2022-03-14 17:38:56'),
(3,'Pre-Order',0,'2022-03-14 17:38:56','2022-03-14 17:38:56');

/*Table structure for table `product_description` */

DROP TABLE IF EXISTS `product_description`;

CREATE TABLE `product_description` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` text NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `product_description` */

insert  into `product_description`(`id`,`description`,`created_at`,`updated_at`) values 
(1,'Pembelian Pulsa Elektronik','2022-03-14 17:35:09','2022-03-14 17:35:09'),
(2,'Pembelian Voucher Listrik','2022-03-14 17:35:09','2022-03-14 17:35:09'),
(3,'Pembelian Topup E-Money','2022-03-14 17:35:09','2022-03-14 17:35:09');

/*Table structure for table `product_types` */

DROP TABLE IF EXISTS `product_types`;

CREATE TABLE `product_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `product_types` */

insert  into `product_types`(`id`,`name`,`created_at`,`updated_at`) values 
(1,'E-Pulsa','2022-03-14 17:25:45','2022-03-14 17:25:45'),
(2,'Voucher Listrik','2022-03-14 17:25:45','2022-03-14 17:25:45'),
(3,'Topup E-Money','2022-03-14 17:25:45','2022-03-14 17:25:45');

/*Table structure for table `products` */

DROP TABLE IF EXISTS `products`;

CREATE TABLE `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_type_id` int(11) NOT NULL,
  `operator_id` int(11) NOT NULL,
  `code` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `status` smallint(6) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  KEY `product_type_id` (`product_type_id`),
  KEY `operator_id` (`operator_id`),
  CONSTRAINT `products_ibfk_1` FOREIGN KEY (`product_type_id`) REFERENCES `product_types` (`id`),
  CONSTRAINT `products_ibfk_2` FOREIGN KEY (`operator_id`) REFERENCES `operators` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `products` */

insert  into `products`(`id`,`product_type_id`,`operator_id`,`code`,`name`,`status`,`created_at`,`update_at`) values 
(2,2,1,'VL001','Voucher Telkomsel',0,'2022-03-14 17:31:46','2022-03-14 17:31:46'),
(3,3,4,'TE001','Topup XL',0,'2022-03-14 17:31:46','2022-03-14 17:31:46');

/*Table structure for table `transaction_details` */

DROP TABLE IF EXISTS `transaction_details`;

CREATE TABLE `transaction_details` (
  `transaction_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `qty` int(11) NOT NULL,
  `price` decimal(25,2) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`transaction_id`,`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `transaction_details` */

/*Table structure for table `transactions` */

DROP TABLE IF EXISTS `transactions`;

CREATE TABLE `transactions` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `payment_method_id` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `total_qty` int(11) NOT NULL,
  `total_price` decimal(25,2) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `payment_method_id` (`payment_method_id`),
  CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `transactions_ibfk_2` FOREIGN KEY (`payment_method_id`) REFERENCES `payment_methods` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `transactions` */

insert  into `transactions`(`id`,`user_id`,`payment_method_id`,`status`,`total_qty`,`total_price`,`created_at`,`updated_at`) values 
(1,1,2,'Lunas',3,400000.00,'2022-03-01 17:45:58','2022-03-14 17:46:01'),
(2,3,1,'Lunas',3,150000.00,'2022-03-02 17:46:38','2022-03-04 17:46:42'),
(3,4,3,'Lunas',2,100000.00,'2022-03-10 17:47:48','2022-03-12 17:47:52');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `status` smallint(6) NOT NULL,
  `dob` date NOT NULL,
  `gender` char(1) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

/*Data for the table `users` */

insert  into `users`(`id`,`status`,`dob`,`gender`,`created_at`,`updated_at`) values 
(1,2,'2022-03-14','M','2022-03-06 17:42:49','2022-03-01 17:42:54'),
(2,1,'2022-03-02','F','2022-03-01 17:43:31','2022-03-03 17:43:39'),
(3,2,'2022-03-10','M','2022-03-10 17:44:00','2022-03-14 17:44:10'),
(4,2,'2022-03-11','M','2022-03-11 17:44:29','2022-03-18 17:44:33'),
(5,1,'2022-03-14','F','2022-03-09 17:48:38','2022-03-12 17:48:42');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
