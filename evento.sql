-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18-Abr-2016 às 03:54
-- Versão do servidor: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `evento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `convidado`
--

CREATE TABLE `convidado` (
  `cod` int(10) NOT NULL,
  `nome` text NOT NULL,
  `end` text NOT NULL,
  `cpf` int(10) NOT NULL,
  `identidade` int(10) NOT NULL,
  `perfil` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `convidado`
--

INSERT INTO `convidado` (`cod`, `nome`, `end`, `cpf`, `identidade`, `perfil`) VALUES
(1, 'dasdwdw', 'dasdsadw', 12321, 421321, 'Especial'),
(2, 'teste', 'teste', 12121, 2132, 'Especial'),
(3, 'teste2', 'sdada', 423321, 123221, 'Pagante'),
(4, 'adsaw', 'dsadw', 12321, 4213212, 'Especial'),
(5, 'adsdw', 'dsadwdw', 21, 312, 'Especial'),
(6, 'teste3', 'dsada', 42132, 2313214, 'Pagante'),
(7, 'daww', 'dsadas', 321321, 421321, 'Pagante'),
(8, 'teste', 'dsadww', 12422, 4213211, 'Especial'),
(9, 'adsadsaw', 'dadsdw', 23132, 21321, 'Especial'),
(10, 'dasdas', 'dsada', 23214, 42321, 'Especial'),
(11, 'dsadsadwww', 'dadaw', 21421, 42132, 'Pagante'),
(12, 'dsadaww', 'adsdw', 42112, 2241, 'Especial'),
(13, 'dsadaww', 'adsdw', 421122, 2241, 'Especial'),
(14, 'dsadwdw', 'sdadsadw', 214212, 214212, 'Especial'),
(15, 'dsadwdw', 'sdadsadw', 21421222, 214212, 'Pagante'),
(16, 'dsadadwdw', 'dasdsadwa', 124212, 421211, 'Especial'),
(17, 'teste', 'sadsa', 21321, 4242, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `convidado`
--
ALTER TABLE `convidado`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `convidado`
--
ALTER TABLE `convidado`
  MODIFY `cod` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
