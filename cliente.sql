-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 05-Ago-2020 às 03:44
-- Versão do servidor: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cliente_java`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(80) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `cep` varchar(12) NOT NULL,
  `cpf` varchar(16) DEFAULT NULL,
  `data_nasc` varchar(11) DEFAULT NULL,
  `razao_social` varchar(50) DEFAULT NULL,
  `cnpj` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nome`, `endereco`, `telefone`, `cep`, `cpf`, `data_nasc`, `razao_social`, `cnpj`) VALUES
(1, 'Paula Santos', 'Rua Manoel Antonio', '95421675', '18000-000', '111111111111111', '15/02/1957', NULL, NULL),
(2, 'Mateus Prado', 'Rua Coronel castanho', '95847562', '17000-000', '2222222222222', '14/07/1987', NULL, NULL),
(3, 'Emanoel dos Santos', 'Rua Pedro Antonio ', '15981205121', '20111-111', '333333333333', '02/03/1989', NULL, NULL),
(4, 'Sara Cristina', 'Rua São Paulo', '159842653', '112333-222', '555555555555', '02/11/1978', NULL, NULL),
(5, 'Gabriel Alves', 'Rua Pedro Simoes', '158974536', '55142-222', '777777777777', '16/09/1972', NULL, NULL),
(6, 'teste', 'teste', 'teste', 'teste', 'teste', 'teste', NULL, NULL),
(7, 'teste2', 'teste2', 'teste2', 'teste2', NULL, NULL, 'teste2', 'teste2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
