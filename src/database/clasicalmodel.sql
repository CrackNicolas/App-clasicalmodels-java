-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-12-2020 a las 21:50:21
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clasicalmodel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--
-- Creación: 23-12-2020 a las 12:47:50
--

CREATE TABLE `cliente` (
  `NroCliente` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Direccion1` varchar(200) NOT NULL,
  `Direccion2` varchar(200) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `EstadoCivil` varchar(50) NOT NULL,
  `CodigoPostal` varchar(10) NOT NULL,
  `Pais` varchar(15) NOT NULL,
  `RepDeVentas` int(11) NOT NULL,
  `CreditoLimite` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`NroCliente`, `Nombre`, `Apellido`, `Telefono`, `Direccion1`, `Direccion2`, `Ciudad`, `EstadoCivil`, `CodigoPostal`, `Pais`, `RepDeVentas`, `CreditoLimite`) VALUES
(103, 'Atelier graphique', 'Schmitt', '40322555', '54 rue Royale', '', 'Nantes', '', '44000', 'France', 1370, 21000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallespedido`
--
-- Creación: 23-12-2020 a las 12:58:45
-- Última actualización: 23-12-2020 a las 20:21:59
--

CREATE TABLE `detallespedido` (
  `NroOrden` int(11) NOT NULL,
  `CodigoProducto` varchar(50) NOT NULL,
  `CantidadPedida` int(11) NOT NULL,
  `PrecioPorUnidad` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `detallespedido`
--

INSERT INTO `detallespedido` (`NroOrden`, `CodigoProducto`, `CantidadPedida`, `PrecioPorUnidad`) VALUES
(10000, 'S10_1949', 100, 98.58);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--
-- Creación: 23-12-2020 a las 14:29:26
--

CREATE TABLE `empleado` (
  `NroEmpleado` int(11) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Extencion` varchar(20) NOT NULL,
  `Reportes` int(11) NOT NULL,
  `CodigoOficina` varchar(50) NOT NULL,
  `Titulo` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`NroEmpleado`, `Apellido`, `Nombre`, `Extencion`, `Reportes`, `CodigoOficina`, `Titulo`, `Email`) VALUES
(1002, 'Murphy', 'Diane', 'x5800', 0, '1', 'Presidente', 'dmurphy@classicmodelcars.com'),
(1056, 'Patterson', 'Mary', 'x4611', 1002, '1', 'VP Sales', 'mpatterso@classicmodelcars.com'),
(1076, 'Firrelli', 'Jeff', 'x9273', 1002, '1', 'VP Marketing', 'jfirrelli@classicmodelcars.com'),
(1088, 'Patterson', 'William', 'x4871', 1056, '6', 'Sales Manager', 'wpatterson@classicmodelcars.com'),
(1102, 'Bondur', 'Gerard', 'x5408', 1056, '4', 'Sale Manager', 'gbondur@classicmodelcars.com'),
(1143, 'Bow', 'Anthony', 'x5828', 1056, '1', 'Sales Manager', 'abow@classicmodelcars.com'),
(1165, 'Jennings', 'Leslie', 'x3291', 1143, '1', 'Sales Rep', 'ljennings@classicmodelcars.com'),
(1166, 'Thompson', 'Leslie', 'x4065', 1143, '1', 'Sales Rep', 'lthompson@classicmodelcars.com'),
(1188, 'Firrelli', 'Julie', 'x2173', 1143, '2', 'Sales Rep', 'jfirrelli@classicmodelcars.com'),
(1216, 'Patterson', 'Steve', 'x4334', 1143, '2', 'Sales Rep', 'spatterson@classicmodelcars.com'),
(1286, 'Tseng', 'Foon Yue', 'x2248', 1165, '3', 'Sales Rep', 'ftseng@classicmodelcars.com'),
(1323, 'Vanauf', 'George', 'x4102', 1143, '3', 'Sales Rep', 'gvanauf@classicmodelcars.com'),
(1337, 'Bondur', 'Loui', 'x6493', 1102, '4', 'Sales Rep', 'lbondur@classicmodelcars.com'),
(1370, 'Hernandez', 'Gerard', 'x2028', 1102, '4', 'Sales Rep', 'ghernande@classicmodelcars.com'),
(1401, 'Castillo', 'Pamela', 'x2759', 1102, '4', 'Sales Rep', 'pcastillo@classicmodelcars.com'),
(1501, 'Bott', 'Larry', 'x2311', 1102, '7', 'Sales Rep', 'lbott@classicmodelcars.com'),
(1504, 'Jones', 'Barry', 'x102', 1102, '7', 'Sales Rep', 'bjones@classicmodelcars.com'),
(1611, 'Fixter', 'Andy', 'x101', 1188, '6', 'Sales Rep', 'afixter@classicmodelcars.com'),
(1612, 'Marsh', 'Peter', 'x102', 1188, '6', 'Sales Rep', 'pmarsh@classicmodelcars.com'),
(1619, 'King', 'Tom', 'x103', 1188, '6', 'Sales Rep', 'tking@classicmodelcars.com'),
(1621, 'Nishi', 'Mami', 'x101', 1056, '5', 'Sales Rep', 'mnishi@classicmodelcars.com'),
(1625, 'Kato', 'Yoshimi', 'x102', 1621, '5', 'Sales Rep', 'ykato@classicmodelcars.com'),
(1702, 'Gerard', 'Martin', 'x2312', 1102, '4', 'Sales Rep', 'mgerard@classicmodelcars.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lineaproductos`
--
-- Creación: 22-12-2020 a las 21:40:43
-- Última actualización: 23-12-2020 a las 20:29:46
--

CREATE TABLE `lineaproductos` (
  `LineaProducto` varchar(50) NOT NULL,
  `Descripcion` varchar(1600) DEFAULT NULL,
  `DescripcionHtml` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `lineaproductos`
--

INSERT INTO `lineaproductos` (`LineaProducto`, `Descripcion`, `DescripcionHtml`) VALUES
('Autos clasicos', 'Atención, entusiastas de los automóviles: Haga realidad sus sueños más increíbles de tener un automóvil. Ya sea que esté buscando muscle cars clásicos, autos deportivos de ensueño o miniaturas inspiradas en películas, encontrará excelentes opciones en esta categoría. Estas réplicas cuentan con una excelente atención a los detalles y la artesanía y ofrecen características como un sistema de dirección que funciona, un compartimento delantero que se abre, un maletero trasero que se abre con una rueda de repuesto extraíble, una suspensión de resorte independiente en las 4 ruedas, etc. Los modelos varían en tamaño de escala 1:10 a 1:24 e incluyen numerosos vehículos de edición limitada y varios fuera de producción. Todos los modelos incluyen un certificado de autenticidad de sus fabricantes y vienen completamente ensamblados y listos para exhibir en el hogar u oficina.', 'www.AutosClasicos.com'),
('Aviones', 'Réplicas únicas de aviones y helicópteros fundidas a presión adecuadas para colecciones, así como decoraciones para el hogar, la oficina o el aula. Los modelos contienen detalles asombrosos como logotipos e insignias oficiales, propulsores y motores a reacción giratorios, ruedas retráctiles, etc. La mayoría vienen completamente ensamblados y con un certificado de autenticidad de sus fabricantes.', 'www.Aviones.com'),
('Buques', 'El regalo perfecto para las fiestas o el aniversario para ejecutivos, clientes, amigos y familiares. ¡Estos modelos de barcos hechos a mano son obras de arte únicas e impresionantes que serán atesoradas por generaciones! Vienen completamente ensamblados y listos para exhibir en el hogar u oficina. Garantizamos la más alta calidad y el mejor valor.', 'www.Buques.com'),
('Camiones y autobuses', 'Los modelos Truck and Bus son réplicas realistas de autobuses y camiones especializados producidos desde principios de la década de 1920 hasta el presente. Los modelos varían en tamaño desde escala 1:12 a 1:50 e incluyen numerosos vehículos de edición limitada y varios fuera de producción. Los materiales utilizados incluyen estaño, fundición a presión y plástico. Todos los modelos incluyen un certificado de autenticidad de sus fabricantes y son un adorno perfecto para el hogar y la oficina.', 'www.CamionesYautobuses.com'),
('Coches antiguos', 'Nuestros modelos de coches antiguos retratan de forma realista los automóviles producidos desde principios del siglo XX hasta los años 40. Los materiales utilizados incluyen baquelita, fundición a presión, plástico y madera. La mayoría de las réplicas están en los tamaños de escala 1:18 y 1:24, lo que proporciona lo óptimo en detalle y precisión. Los precios van desde $ 30.00 hasta $ 180.00 para algunas réplicas especiales de edición limitada. Todos los modelos incluyen un certificado de autenticidad de sus fabricantes y vienen completamente ensamblados y listos para exhibir en el hogar u oficina.', 'www.CochesAntiguos.com'),
('Motocicletas', 'Nuestras motocicletas son réplicas de última generación de leyendas de motocicletas clásicas y contemporáneas como Harley Davidson, Ducati y Vespa. Los modelos contienen detalles asombrosos como logotipos oficiales, ruedas giratorias, caballete de trabajo, suspensión delantera, palanca de cambio de velocidades, palanca de freno de pie y cadena de transmisión. Los materiales utilizados incluyen fundición a presión y plástico. Los modelos varían en tamaño de escala 1:10 a 1:50 e incluyen numerosos vehículos de edición limitada y varios fuera de producción. Todos los modelos vienen completamente ensamblados y listos para exhibir en el hogar u oficina. La mayoría incluye un certificado de autenticidad.', 'www.Motocicletas.com'),
('Trenes', 'Los trenes en miniatura son un pasatiempo gratificante para los entusiastas de todas las edades. Ya sea que esté buscando trenes de madera coleccionables, tranvías eléctricos o locomotoras, encontrará una serie de excelentes opciones para cualquier presupuesto dentro de esta categoría. El aspecto interactivo de los trenes hace que los trenes de juguete sean perfectos para los niños pequeños. Los trenes de madera son ideales para niños menores de 5 años.', 'www.Trenes.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oficinas`
--
-- Creación: 23-12-2020 a las 12:27:11
--

CREATE TABLE `oficinas` (
  `Codigo` varchar(50) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Direccion1` varchar(200) NOT NULL,
  `Direccion2` varchar(200) NOT NULL,
  `Estado` varchar(50) NOT NULL,
  `Pais` varchar(50) NOT NULL,
  `CodigoPostal` varchar(50) NOT NULL,
  `Territorio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `oficinas`
--

INSERT INTO `oficinas` (`Codigo`, `Ciudad`, `Telefono`, `Direccion1`, `Direccion2`, `Estado`, `Pais`, `CodigoPostal`, `Territorio`) VALUES
('1', 'San Francisco', '+1 650 219 4782', '100 Market Street', 'Suite 300', 'CA', 'USA', '94080', 'NA'),
('2', 'Boston', '+1 215 837 0825', '1550 Court Place', 'Suite 102', 'MA', 'USA', '02107', 'NA'),
('3', 'NYC', '+1 212 555 3000', '523 East 53rd Street', 'apt. 5A', 'NY', 'USA', '10022', 'NA'),
('4', 'Paris', '+33 14 723 4404', '43 Rue Jouffroy Dabbans', '', '', 'Francia', '75017', 'EMEA'),
('5', 'Tokyo', '+81 33 224 5000', '41 Kioicho', '', 'Chiyoda Ku', 'Japon', '1028578', 'Japon'),
('6', 'Sydney', '+61 2 9264 2451', '511 Wentworth Avenue', 'Floor 2', '', 'Australia', 'NSW 2010', 'APAC'),
('7', 'Londres', '+44 20 7877 2041', '25 Old Broad Street', 'Level 7', '', 'UK', 'EC2N 1HN', 'EMEA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--
-- Creación: 23-12-2020 a las 13:02:41
-- Última actualización: 23-12-2020 a las 20:10:47
--

CREATE TABLE `pagos` (
  `NroCliente` int(11) NOT NULL,
  `VerificarNro` varchar(50) NOT NULL,
  `Importe` double NOT NULL,
  `FechaPago` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pagos`
--

INSERT INTO `pagos` (`NroCliente`, `VerificarNro`, `Importe`, `FechaPago`) VALUES
(103, 'xxxxxxxx', 0, '2020-12-23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--
-- Creación: 23-12-2020 a las 12:55:01
-- Última actualización: 23-12-2020 a las 20:21:59
--

CREATE TABLE `pedidos` (
  `NroOrden` int(11) NOT NULL,
  `Estado` varchar(20) NOT NULL,
  `NroCliente` int(11) NOT NULL,
  `Comentarios` varchar(100) NOT NULL,
  `FechaOrden` date NOT NULL,
  `FechaRequerida` date NOT NULL,
  `FechaEnvio` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`NroOrden`, `Estado`, `NroCliente`, `Comentarios`, `FechaOrden`, `FechaRequerida`, `FechaEnvio`) VALUES
(10000, 'En proceso', 103, '', '2021-12-17', '2021-12-20', '2021-12-23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--
-- Creación: 23-12-2020 a las 12:19:05
-- Última actualización: 23-12-2020 a las 20:26:04
--

CREATE TABLE `producto` (
  `Codigo` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Escala` varchar(50) NOT NULL,
  `Vendedor` varchar(50) NOT NULL,
  `Descripcion` varchar(1600) NOT NULL,
  `Stock` varchar(50) NOT NULL,
  `Precio` double NOT NULL,
  `MSRP` double NOT NULL,
  `LineaProducto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`Codigo`, `Nombre`, `Escala`, `Vendedor`, `Descripcion`, `Stock`, `Precio`, `MSRP`, `LineaProducto`) VALUES
('S10_1949', '1952 Alpine Renault 1300', '1:10', 'Classic Metal Creations', 'Ruedas delanteras giratorias; función de dirección; interior detallado; motor detallado; capucha de apertura; apertura del maletero; abrir puertas; y chasis detallado.', '7305', 98.58, 214.3, 'Autos clasicos'),
('S10_4757', '1972 Alfa Romeo GTA', '1:10', 'Motor City Art Classics', 'Features include: Turnable front wheels; steering function; detailed interior; detailed engine; opening hood; opening trunk; opening doors; and detailed chassis.', '3252', 86.68, 136, 'Autos clasicos'),
('S10_4962', '1962 LanciaA Delta 16V', '1:10', 'Second Gear Diecast', 'Las características incluyen: Ruedas delanteras giratorias; función de dirección; interior detallado; motor detallado; capucha de apertura; apertura del maletero; abrir puertas; y chasis detallado.', '6791', 103.42, 147.74, 'Autos clasicos'),
('S12_1099', '1968 Ford Mustang', '1:12', 'Autoart Studio Design', 'El capó, las puertas y el maletero se abren para revelar características interiores muy detalladas. El volante en realidad hace girar las ruedas delanteras. Color verde oscuro.', '68', 95.32, 194.57, 'Autos clasicos'),
('S12_1108', '2001 Ferrari Enzo', '1:12', 'Second Gear Diecast', 'Ruedas delanteras giratorias; función de dirección; interior detallado; motor detallado; capucha de apertura; apertura del maletero; abrir puertas; y chasis detallado.', '3619', 95.59, 207.8, 'Autos clasicos'),
('S12_1666', '1958 Setra Bus', '1:12', 'Welly Diecast Productions', 'El modelo cuenta con 30 ventanas, tragaluces y vidrio resistente al deslumbramiento, sistema de dirección funcional, logotipos originales', '1579', 77.9, 136.67, 'Camiones y autobuses'),
('S12_3148', '1969 Corvair Monza', '1:18', 'Welly Diecast Productions', 'Escala 1:18 fundida a presión de aproximadamente 10 \"puertas de largo abiertas, capó se abre, maletero se abre y ruedas ruedan', '6906', 89.14, 151.08, 'Autos clasicos'),
('S12_3380', '1968 Dodge Charger', '1:12', 'Welly Diecast Productions', 'Modelo a escala 1:12 de un Dodge Charger de 1968. El capó, las puertas y el maletero se abren para revelar características interiores muy detalladas. El volante en realidad hace girar las ruedas delanteras. De color negro', '9123', 75.16, 117.44, 'Autos clasicos'),
('S12_3891', '1969 Ford Falcon', '1:12', 'Second Gear Diecast', 'Ruedas delanteras giratorias; función de dirección; interior detallado; motor detallado; capucha de apertura; apertura del maletero; abrir puertas; y chasis detallado.', '1049', 83.05, 173.02, 'Autos clasicos'),
('S12_3990', '1970 Plymouth Hemi Cuda', '1:12', 'Studio M Art Models', 'Modelo muy detallado de Plymouth Cuda de 1970 a escala 1:12. El Cuda es generalmente aceptado como uno de los muscle cars originales más rápidos de la década de 1970. Este modelo es una reproducción de uno de los 652 coches originales construidos en 1970. Color rojo.', '5663', 31.92, 79.8, 'Autos clasicos'),
('S12_4473', '1957 Chevy Pickup', '1:12', 'Exoto Designs', 'Escala 1:12 fundida a presión de aproximadamente 20 \"de largo Se abre la capucha, ruedas de goma', '6125', 55.7, 118.5, 'Camiones y autobuses'),
('S12_4675', '1969 Dodge Charger', '1:12', 'Welly Diecast Productions', 'Modelo detallado del Dodge Charger 1969. Este modelo incluye características interiores y exteriores finamente detalladas. Pintado en rojo y blanco.', '7323', 58.73, 115.16, 'Autos clasicos'),
('S18_1097', '1940 Ford Pickup Truck', '1:18', 'Studio M Art Models', 'Este modelo cuenta con neumáticos de goma blanda, dirección funcional, guardabarros de goma, logotipos auténticos de Ford, tren de aterrizaje detallado, puertas y capó que se abren, puerta trasera dividida extraíble, repuesto de tamaño completo montado en la caja, interior detallado con guantera que se abre', '2613', 58.33, 116.67, 'Camiones y autobuses'),
('S18_1129', '1993 Mazda RX7', '1:18', 'Highway 66 Mini Classics', 'Este modelo cuenta con capó que se abre, puertas que se abren, motor detallado, alerón trasero, baúl que se abre, dirección funcional, vidrios polarizados, acabado de esmalte horneado. Color rojo.', '3975', 83.51, 141.54, 'Autos clasicos'),
('S18_1342', '1937 Lincoln Berline', '1:18', 'Motor City Art Classics', 'Tiene tapa del motor, puertas, maletero y tapa de llenado de combustible que se abren. De color negro', '8683', 60.62, 102.74, 'Coches antiguos'),
('S18_1367', '1936 Mercedes Benz 500K Special Roadster', '1:18', 'Studio M Art Models', 'Esta réplica a escala 1:18 está construida de metal pesado fundido a presión y tiene todas las características del original: puertas funcionales y asiento ruidoso, suspensión de resorte independiente, interior detallado, sistema de dirección funcional y un capó plegable que revela un motor tan preciso. que incluso incluye el cableado. Todo esto se remata con un acabado de esmalte horneado. Color blanco.', '8635', 24.26, 53.91, 'Coches antiguos'),
('S18_1589', '1965 Aston Martin DB5', '1:18', 'Classic Metal Creations', 'Modelo de fundición a presión del Aston Martin DB5 plateado de 1965 en plata. Este modelo incluye ruedas y puertas de alambre completo que se abren con un compartimiento de pasajeros completamente detallado. A escala 1:18, este modelo mide aproximadamente 10 pulgadas 20 cm de largo.', '9042', 65.94, 124.44, 'Autos clasicos'),
('S18_1662', '1980s Black Hawk Helicopter', '1:18', 'Red Start Diecast', 'Réplica a escala 1:18 del helicóptero UH-60L BLACK HAWK del ejército real. 100% ensamblado a mano. Cuenta con palas de rotor giratorias, palas de hélice y ruedas de goma.', '5330', 77.27, 157.69, 'Aviones'),
('S18_1749', '1917 Grand Touring Sedan', '1:18', 'Welly Diecast Productions', 'Esta réplica a escala 1:18 del auto Grand Touring de 1917 tiene todas las características que esperaría de las reproducciones con calidad de museo: las cuatro puertas y la apertura del capó plegable, el motor detallado y el panel de instrumentos, molduras con aspecto cromado y tapicería con mechones, todo rematado con un acabado de esmalte horneado de fábrica.', '2724', 86.7, 170, 'Coches antiguos'),
('S18_1889', '1948 Porsche 356 A Roadster', '1:18', 'Gearbox Collectibles', 'Esta réplica de precisión fundida a presión presenta puertas que se abren, detalles y mano de obra excelentes, sistema de dirección funcional, compartimento delantero que se abre, maletero trasero que se abre con repuesto extraíble, suspensión de resorte independiente en las 4 ruedas y acabado esmaltado horneado de fábrica.', '8826', 53.9, 77, 'Autos clasicos'),
('S18_1984', '1995 Honda Civic', '1:18', 'Min Lin Diecast', 'Este modelo cuenta con capó que se abre, puertas que se abren, motor detallado, alerón trasero, baúl que se abre, dirección funcional, vidrios polarizados, acabado de esmalte horneado. Color amarillo.', '9772', 93.89, 142.25, 'Autos clasicos'),
('S18_2238', '1998 Chrysler Plymouth Prowler', '1:18', 'Gearbox Collectibles', 'Ruedas delanteras giratorias; función de dirección; interior detallado; motor detallado; capucha de apertura; apertura del maletero; abrir puertas; y chasis detallado.', '4724', 101.51, 163.73, 'Autos clasicos'),
('S18_2248', '1911 Ford Town Car', '1:18', 'Motor City Art Classics', 'Cuenta con capó que se abre, puertas que se abren, baúl que se abre, neumáticos de pared blanca ancha, apoyabrazos en la puerta delantera, sistema de dirección que funciona.', '540', 33.3, 60.54, 'Coches antiguos'),
('S18_2319', '1964 Mercedes Tour Bus', '1:18', 'Unimax Art Galleries', 'Réplica exacta. 100+ partes. sistema de dirección en funcionamiento, logotipos originales', '8258', 74.86, 122.73, 'Coches antiguos'),
('S18_2325', '1932 Model A Ford JCoupe', '1:18', 'Autoart Studio Design', 'Este modelo cuenta con bocina cromada montada en la rejilla, capó con persiana abatible, asiento con estruendo abatible, sistema de dirección que funciona, repuesto cromado, puertas que se abren, motor detallado y cableado', '9354', 58.48, 127.13, 'Coches antiguos'),
('S18_2432', '1926 Ford Fire Engine', '1:18', 'Carousel DieCast Legends', 'Aspecto hermoso rojo brillante. Todo está aquí: mangueras contra incendios, escalera, hachas, campanas, linternas, listas para combatir cualquier infierno.', '2018', 24.92, 60.77, 'Camiones y autobuses'),
('S18_2581', 'P51D Mustang', '1:72', 'Gearbox Collectibles', 'Tiene ruedas retráctiles y viene con un soporte.', '992', 49, 84.48, 'Aviones'),
('S18_2795', '1928 Mercedes Benz SSK', '1:18', 'Gearbox Collectibles', 'Esta réplica 1:18 cuenta con bocina cromada montada en la rejilla, capó con persiana elevable, asiento retumbante abatible, sistema de dirección que funciona, repuesto cromado, puertas que se abren, motor detallado y cableado. De color negro.', '548', 72.58, 168.75, 'Coches antiguos'),
('S18_2870', '1999 Indy 500 Monte Carlo SS', '1:18', 'Red Start Diecast', 'Las características incluyen puertas de apertura y cierre. Color rojo', '8164', 56.76, 132, 'Autos clasicos'),
('S18_2949', '1913 Ford Model T Speedster', '1:18', 'Carousel DieCast Legends', 'Esta reproducción de 250 partes incluye frenos de mano móviles, embrague, acelerador y pedales, bocina apretable, motor cableado detallado, bidones de agua, gasolina y aceite extraíbles, parabrisas monóculo pivotante, todo con un acabado de esmalte rojo horneado. Cada réplica viene con un título de propietario y un certificado de autenticidad. Color rojo.', '4189', 60.78, 101.31, 'Coches antiguos'),
('S18_2957', '1934 Ford V8 Coupe', '1:18', 'Min Lin Diecast', 'Detalles cromados, parrilla cromada, capó que se abre, puertas que se abren, maletero que se abre, motor detallado, sistema de dirección en funcionamiento', '5649', 34.35, 62.46, 'Coches antiguos'),
('S18_3029', '1999 Yamaha Speed Boat', '1:18', 'Min Lin Diecast', 'Réplica exacta. Madera y Metal. Muchos extras incluyen aparejos, botes largos, caseta de piloto, anclas, etc. Viene con tres mástiles, todos con aparejo cuadrado.', '4259', 51.61, 86.02, 'Buques'),
('S18_3136', '18th Century Vintage Horse Carriage', '1:18', 'Red Start Diecast', 'El carruaje de caballos de metal fundido a mano hecho a mano se recrea en una escala 1:18 de un carruaje de caballos antiguo. Esta diligencia de metal de estilo antiguo está ensamblada a mano con muchas piezas diferentes.     Este carruaje de caballos de metal coleccionable está pintado en rojo clásico, presenta un volante giratorio y está completamente acabado a mano.', '5992', 60.74, 104.72, 'Coches antiguos'),
('S18_3140', '1903 Ford Model A', '1:18', 'Unimax Art Galleries', 'Cuenta con maletero que se abre, sistema de dirección que funciona', '3913', 68.3, 136.59, 'Coches antiguos'),
('S18_3232', '1992 Ferrari 360 Spider red', '1:18', 'Unimax Art Galleries', 'Esta réplica presenta puertas que se abren, detalles y mano de obra excelentes, sistema de dirección funcional, compartimento delantero que se abre, maletero trasero que se abre con repuesto extraíble, suspensión de resorte independiente en las 4 ruedas y acabado esmaltado horneado de fábrica.', '8337', 77.9, 169.34, 'Autos clasicos'),
('S18_3233', '1985 Toyota Supra', '1:18', 'Highway 66 Mini Classics', 'Este modelo cuenta con neumáticos de goma blanda, dirección funcional, guardabarros de goma, logotipos auténticos de Ford, tren de aterrizaje detallado, puertas y capó que se abren, puerta trasera dividida extraíble, repuesto de tamaño completo montado en la caja, interior detallado con guantera que se abre', '7733', 57.01, 107.57, 'Autos clasicos'),
('S18_3259', 'Collectable Wooden Train', '1:18', 'Carousel DieCast Legends', 'El juego de trenes de juguete de madera hechos a mano tiene una escala aproximada de 1:18, 25 pulgadas de largo total, incluidos 2 carros adicionales, del tren vintage real. Este modelo de tren de juguete de madera de estilo antiguo está ensamblado a mano con 100% madera.', '6450', 67.56, 100.84, 'Trenes'),
('S18_3278', '1969 Dodge Super Bee', '1:18', 'Min Lin Diecast', 'Esta réplica presenta puertas que se abren, excelente detalle y artesanía, sistema de dirección que funciona, compartimento delantero que se abre, maletero trasero que se abre con repuesto extraíble, suspensión de resorte independiente en las 4 ruedas y acabado esmaltado horneado de fábrica.', '1917', 49.05, 80.41, 'Autos clasicos'),
('S18_3320', '1917 Maxwell Touring Car', '1:18', 'Exoto Designs', 'Equipamiento molduras doradas, llanta de repuesto de tamaño completo, molduras cromadas, parrilla cromada, capó que se abre, puertas que se abren, maletero que se abre, motor detallado, sistema de dirección funcional', '7913', 57.54, 99.21, 'Coches antiguos'),
('S18_3482', '1976 Ford Gran Torino', '1:18', 'Gearbox Collectibles', 'Modelo de fundición a presión de 1976 Ford Gran Torino \"Starsky and Hutch\" altamente detallado. Muy bien construido y pintado en rojo y blanco.', '9127', 73.49, 146.99, 'Autos clasicos'),
('S18_3685', '1948 Porsche Type 356 Roadster', '1:18', 'Gearbox Collectibles', 'Este modelo cuenta con suspensión delantera y trasera que funciona con amortiguadores que actúan y replican con precisión, así como la tapa del motor que se abre, la tapa estabilizadora trasera y 4 puertas que se abren.', '8990', 62.16, 141.28, 'Autos clasicos'),
('S18_3856', '1941 Chevrolet Special Deluxe Cabriolet', '1:18', 'Exoto Designs', 'Cuenta con capó que se abre, puertas que se abren, baúl que se abre, neumáticos anchos de pared blanca, apoyabrazos en la puerta delantera, sistema de dirección que funciona, tapicería de cuero. De color negro.', '2378', 64.58, 105.87, 'Coches antiguos'),
('S72_1253', 'Boeing X32A JSF', '1:72', 'Motor City Art Classics', 'Envergadura de 10 \"con trenes de aterrizaje retráctiles. Viene con piloto', '4857', 33.77, 49.66, 'Aviones'),
('S72_3212', 'Pont Yacht', '1:72', 'Unimax Art Galleries', 'Mide 38 pulgadas de largo x 33 3/4 pulgadas de alto. Incluye un soporte.   Muchos extras, como aparejos, botes largos, caseta de piloto, anclas, etc. Viene con 2 mástiles, todos con aparejo cuadrado', '414', 33.3, 54.6, 'Buques');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--
-- Creación: 22-12-2020 a las 21:33:05
--

CREATE TABLE `usuarios` (
  `Users` varchar(50) NOT NULL,
  `Pass` varchar(50) NOT NULL,
  `Nro` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Users`, `Pass`, `Nro`) VALUES
('Nicolas', '2206', '1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`NroCliente`),
  ADD KEY `Rep_De_Ventas` (`RepDeVentas`);

--
-- Indices de la tabla `detallespedido`
--
ALTER TABLE `detallespedido`
  ADD KEY `Nro_Orden` (`NroOrden`),
  ADD KEY `Cod_Producto` (`CodigoProducto`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`NroEmpleado`),
  ADD KEY `CodigoOfice` (`CodigoOficina`);

--
-- Indices de la tabla `lineaproductos`
--
ALTER TABLE `lineaproductos`
  ADD PRIMARY KEY (`LineaProducto`);

--
-- Indices de la tabla `oficinas`
--
ALTER TABLE `oficinas`
  ADD PRIMARY KEY (`Codigo`);

--
-- Indices de la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD KEY `Nr_Cliente` (`NroCliente`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`NroOrden`),
  ADD KEY `Nro_Cliente` (`NroCliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`Codigo`),
  ADD KEY `LineaProducto` (`LineaProducto`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Users`,`Pass`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `NroCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `NroEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1703;

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `NroOrden` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10299;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `Rep_De_Ventas` FOREIGN KEY (`RepDeVentas`) REFERENCES `empleado` (`NroEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detallespedido`
--
ALTER TABLE `detallespedido`
  ADD CONSTRAINT `Cod_Producto` FOREIGN KEY (`CodigoProducto`) REFERENCES `producto` (`Codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Nro_Orden` FOREIGN KEY (`NroOrden`) REFERENCES `pedidos` (`NroOrden`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `CodigoOfice` FOREIGN KEY (`CodigoOficina`) REFERENCES `oficinas` (`Codigo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD CONSTRAINT `Nr_Cliente` FOREIGN KEY (`NroCliente`) REFERENCES `cliente` (`NroCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `Nro_Cliente` FOREIGN KEY (`NroCliente`) REFERENCES `cliente` (`NroCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `LineaProducto` FOREIGN KEY (`LineaProducto`) REFERENCES `lineaproductos` (`LineaProducto`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
