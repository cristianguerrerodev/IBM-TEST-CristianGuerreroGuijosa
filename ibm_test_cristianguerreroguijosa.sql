SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE DATABASE ibm_test_cristianguerreroguijosa;

CREATE TABLE `ibm_test_cristianguerreroguijosa`.`proveedores` (
  `id_proveedor` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `fecha_alta` date NOT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(1, 'Coca-cola', '2022-07-18', 5);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(2, 'Pepsi', '2022-07-01', 5);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(3, 'Sprite', '2022-07-08', 5);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(4, 'Fanta', '2022-06-03', 5);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(6, '7up', '2022-07-07', 2);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(7, 'Coca-cola', '2022-07-18', 3);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(8, 'Coca-cola', '2022-04-09', 2);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(11, 'Redbull', '2022-07-01', 6);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(12, 'Fanta', '2022-07-01', 6);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(13, '7up', '2022-06-10', 1);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(14, 'Fanta', '2022-06-18', 2);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(15, 'Redbull', '2022-06-30', 4);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(16, 'Fanta', '2022-05-07', 4);
INSERT INTO `ibm_test_cristianguerreroguijosa`.`proveedores` VALUES(17, 'Sprite', '2022-03-11', 4);


ALTER TABLE `ibm_test_cristianguerreroguijosa`.`proveedores`
  ADD PRIMARY KEY (`id_proveedor`);


ALTER TABLE `ibm_test_cristianguerreroguijosa`.`proveedores`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
