-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1:3306
-- Létrehozás ideje: 2018. Feb 27. 23:19
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
(8, 4, NULL),
(9, 4, NULL),
(10, 8, NULL),
(11, 11, '11'),
(12, 4, 'kert');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `rendelesek`
--

DROP TABLE IF EXISTS `rendelesek`;
CREATE TABLE IF NOT EXISTS `rendelesek` (
  `rendeles ID` int(11) NOT NULL,
  `asztal` int(11) NOT NULL,
  `tetel ID` int(11) NOT NULL,
  `mennyiseg` int(11) NOT NULL,
  `datum` datetime NOT NULL,
  `osszeg` int(11) NOT NULL,
  `fizetes` varchar(15) COLLATE utf8mb4_hungarian_ci NOT NULL,
  PRIMARY KEY (`tetel ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `tetelek`
--

DROP TABLE IF EXISTS `tetelek`;
CREATE TABLE IF NOT EXISTS `tetelek` (
  `tetel ID` int(11) NOT NULL,
  `etel` varchar(50) COLLATE utf8mb4_hungarian_ci NOT NULL,
  `ital` varchar(25) COLLATE utf8mb4_hungarian_ci NOT NULL,
  `egysegar` int(11) NOT NULL,
  `egyseg` varchar(5) COLLATE utf8mb4_hungarian_ci NOT NULL,
  PRIMARY KEY (`tetel ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

--
-- A tábla adatainak kiíratása `tetelek`
--

INSERT INTO `tetelek` (`tetel ID`, `etel`, `ital`, `egysegar`, `egyseg`) VALUES
(1, 'Tatar beefsteak', '', 2400, 'adag'),
(2, 'Őz carpaccio parmezánforgáccsal, szezámmag olajjal', '', 2000, 'adag'),
(3, 'Cézár saláta', '', 1400, 'adag'),
(4, 'Fokhagymás céklasteak bacon jam-mel', '', 1200, 'adag'),
(5, 'Gránátalmás édeskömény saláta kecskesajttal', '', 1500, 'adag'),
(6, 'Konfitált kacsamell zsírjában', '', 1200, 'adag');

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `rendelesek`
--
ALTER TABLE `rendelesek`
  ADD CONSTRAINT `rendelesek_ibfk_1` FOREIGN KEY (`tetel ID`) REFERENCES `tetelek` (`tetel ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
