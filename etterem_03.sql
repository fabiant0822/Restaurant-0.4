-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2018. Már 24. 13:24
-- Kiszolgáló verziója: 5.7.14
-- PHP verzió: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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

CREATE TABLE `asztalok` (
  `asztal` int(11) NOT NULL,
  `szek` int(11) NOT NULL,
  `helyseg` varchar(20) COLLATE utf8mb4_hungarian_ci DEFAULT NULL
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
-- Tábla szerkezet ehhez a táblához `rendelesek`
--

CREATE TABLE `rendelesek` (
  `rendelesID` int(11) NOT NULL,
  `asztal` int(2) NOT NULL,
  `tetelID` int(2) NOT NULL,
  `mennyiseg` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

--
-- A tábla adatainak kiíratása `rendelesek`
--

INSERT INTO `rendelesek` (`rendelesID`, `asztal`, `tetelID`, `mennyiseg`) VALUES
(1, 1, 3, 1),
(2, 5, 6, 2),
(3, 1, 3, 1),
(4, 2, 11, 2),
(5, 3, 11, 3),
(6, 4, 10, 2),
(7, 1, 3, 1);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `tetelek`
--

CREATE TABLE `tetelek` (
  `tetelID` int(5) NOT NULL,
  `tetel` varchar(50) COLLATE utf8mb4_hungarian_ci NOT NULL,
  `egysegar` int(11) NOT NULL,
  `egyseg` varchar(5) COLLATE utf8mb4_hungarian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

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
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `asztalok`
--
ALTER TABLE `asztalok`
  ADD PRIMARY KEY (`asztal`);

--
-- A tábla indexei `rendelesek`
--
ALTER TABLE `rendelesek`
  ADD PRIMARY KEY (`rendelesID`),
  ADD KEY `asztal` (`asztal`),
  ADD KEY `tetel ID` (`tetelID`);

--
-- A tábla indexei `tetelek`
--
ALTER TABLE `tetelek`
  ADD PRIMARY KEY (`tetelID`),
  ADD KEY `tetel` (`tetel`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `rendelesek`
--
ALTER TABLE `rendelesek`
  MODIFY `rendelesID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT a táblához `tetelek`
--
ALTER TABLE `tetelek`
  MODIFY `tetelID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `rendelesek`
--
ALTER TABLE `rendelesek`
  ADD CONSTRAINT `etterem1` FOREIGN KEY (`asztal`) REFERENCES `asztalok` (`asztal`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `etterem2` FOREIGN KEY (`tetelID`) REFERENCES `tetelek` (`tetelID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
