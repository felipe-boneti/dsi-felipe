-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 11-Maio-2023 às 01:30
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estacionamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carro`
--

DROP TABLE IF EXISTS `carro`;
CREATE TABLE IF NOT EXISTS `carro` (
  `placa` char(7) NOT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`placa`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carro`
--

INSERT INTO `carro` (`placa`, `cor`, `descricao`) VALUES
('MCN7610', 'Preto e laranja', 'Naruto Beam'),
('GHI9012', 'Vermelho', 'Carro 3'),
('JKL3456', 'Azul', 'Carro 4'),
('MNO7890', 'Cinza', 'Carro 5'),
('PQR2345', 'Prata', 'Carro 6'),
('STU6789', 'Verde', 'Carro 7'),
('VWX1234', 'Amarelo', 'Carro 8'),
('YZA5678', 'Roxo', 'Carro 9'),
('BCD9012', 'Marrom', 'Carro 10'),
('ABC2468', 'Prata', 'Carro teste'),
('XYZ1234', 'Azul', 'Carro azul');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
