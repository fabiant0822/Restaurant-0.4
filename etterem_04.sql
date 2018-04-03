-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1:3306
-- Létrehozás ideje: 2018. Ápr 03. 22:27
-- Kiszolgáló verziója: 5.7.19
-- PHP verzió: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `etterem`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `asztalok`
--

DROP TABLE IF EXISTS `asztalok`;
CREATE TABLE IF NOT EXISTS `asztalok` (
  `asztal` int(11) NOT NULL,
  `szek` int(11) NOT NULL,
  `helyseg` varchar(20) COLLATE utf8mb4_hungarian_ci DEFAULT NULL,
  PRIMARY KEY (`asztal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

--
-- A tábla adatainak kiíratása `asztalok`
--

INSERT INTO `asztalok` (`asztal`, `szek`, `helyseg`) VALUES
(1, 4, NULL),
(2, 4, NULL),
(3, 6, NULL),
(4, 2, NULL),
(5, 4, NULL),
(6, 8, NULL),
(7, 2, NULL),
(11, 11, '11'),
(12, 4, 'kert'),
(13, 8, 'kert'),
(15, 6, 'kert'),
(17, 2, 'duz');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(20) COLLATE utf8mb4_hungarian_ci NOT NULL,
  `password` varchar(10) COLLATE utf8mb4_hungarian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

--
-- A tábla adatainak kiíratása `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `rendelesek`
--

DROP TABLE IF EXISTS `rendelesek`;
CREATE TABLE IF NOT EXISTS `rendelesek` (
  `rendelesID` int(11) NOT NULL AUTO_INCREMENT,
  `asztal` int(2) NOT NULL,
  `tetelID` int(11) NOT NULL,
  `mennyiseg` int(11) NOT NULL,
  PRIMARY KEY (`rendelesID`),
  KEY `asztal` (`asztal`),
  KEY `tetel ID` (`tetelID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

--
-- A tábla adatainak kiíratása `rendelesek`
--

INSERT INTO `rendelesek` (`rendelesID`, `asztal`, `tetelID`, `mennyiseg`) VALUES
(1, 1, 3, 1),
(3, 1, 4, 5),
(8, 1, 5, 2),
(9, 1, 12, 3),
(10, 1, 12, 3);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `szamla`
--

DROP TABLE IF EXISTS `szamla`;
CREATE TABLE IF NOT EXISTS `szamla` (
  `szamlaID` int(11) NOT NULL AUTO_INCREMENT,
  `asztalID` int(11) NOT NULL,
  `tetelID` int(11) NOT NULL,
  `mennyiseg` int(11) NOT NULL,
  `vegosszeg` int(11) NOT NULL,
  PRIMARY KEY (`szamlaID`),
  KEY `asztaID` (`asztalID`),
  KEY `tetelID` (`tetelID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `tetelek`
--

DROP TABLE IF EXISTS `tetelek`;
CREATE TABLE IF NOT EXISTS `tetelek` (
  `tetelID` int(5) NOT NULL AUTO_INCREMENT,
  `tetel` varchar(50) COLLATE utf8mb4_hungarian_ci NOT NULL,
  `egysegar` int(11) NOT NULL,
  `egyseg` varchar(5) COLLATE utf8mb4_hungarian_ci NOT NULL,
  PRIMARY KEY (`tetelID`),
  KEY `tetel` (`tetel`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

--
-- A tábla adatainak kiíratása `tetelek`
--

INSERT INTO `tetelek` (`tetelID`, `tetel`, `egysegar`, `egyseg`) VALUES
(1, 'Tatar beefsteak', 2400, 'adag'),
(2, 'Őz carpaccio parmezánforgáccsal, szezámmag olajjal', 2000, 'adag'),
(3, 'Cézár saláta', 1400, 'adag'),
(4, 'Fokhagymás céklasteak bacon jam-mel', 1200, 'adag'),
(5, 'Gránátalmás édeskömény saláta kecskesajttal', 1500, 'adag'),
(6, 'Konfitált kacsamell zsírjában', 1200, 'adag'),
(10, 'Halászlé ponty', 1100, 'adag'),
(11, 'Heineken', 500, 'pohár'),
(12, 'Rántotthús', 1000, 'adag');

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `rendelesek`
--
ALTER TABLE `rendelesek`
  ADD CONSTRAINT `etterem1` FOREIGN KEY (`asztal`) REFERENCES `asztalok` (`asztal`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `etterem2` FOREIGN KEY (`tetelID`) REFERENCES `tetelek` (`tetelID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Megkötések a táblához `szamla`
--
ALTER TABLE `szamla`
  ADD CONSTRAINT `szamla_1` FOREIGN KEY (`szamlaID`) REFERENCES `rendelesek` (`rendelesID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
