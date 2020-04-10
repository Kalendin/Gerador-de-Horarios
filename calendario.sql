-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 04-Mar-2020 às 19:30
-- Versão do servidor: 5.7.26
-- versão do PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `escola`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

DROP TABLE IF EXISTS `aluno`;
CREATE TABLE IF NOT EXISTS `aluno` (
  `nome` varchar(50) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `nacionalidade` varchar(20) DEFAULT NULL,
  `datanascimento` date DEFAULT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `classesocial` varchar(20) DEFAULT NULL,
  `idendereco` int(3) DEFAULT NULL,
  `idcontato` int(3) DEFAULT NULL,
  `idaluno` int(3) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idaluno`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`nome`, `sexo`, `nacionalidade`, `datanascimento`, `cor`, `classesocial`, `idendereco`, `idcontato`, `idaluno`) VALUES
('ggg', 'Masculino', 'zsgsdg', '1010-10-10', 'sdgsdg', 'fgsdg', 3, 3, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato`
--

DROP TABLE IF EXISTS `contato`;
CREATE TABLE IF NOT EXISTS `contato` (
  `idcontato` int(3) NOT NULL AUTO_INCREMENT,
  `celular` varchar(50) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idcontato`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `contato`
--

INSERT INTO `contato` (`idcontato`, `celular`, `telefone`, `email`) VALUES
(1, '346432643', '324634634', 'esryery@gmail.com'),
(2, '346432643', '324634634', 'esryery@gmail.com'),
(3, '235235', '23523523', 'asdtgsdgt@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

DROP TABLE IF EXISTS `endereco`;
CREATE TABLE IF NOT EXISTS `endereco` (
  `idendereco` int(3) NOT NULL AUTO_INCREMENT,
  `cidade` varchar(50) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `rua` varchar(20) DEFAULT NULL,
  `numerocasa` varchar(10) DEFAULT NULL,
  `cep` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`idendereco`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`idendereco`, `cidade`, `bairro`, `rua`, `numerocasa`, `cep`) VALUES
(1, 'dshdfh', 'gdjdsgjgdj', 'dgjdgsj', '4354', '33456436'),
(2, 'dshdfh', 'gdjdsgjgdj', 'dgjdgsj', '4354', '33456436'),
(3, 'sdgsdg', 'sgsdg', 'sdgsdgsd', '323', '4252523');

-- --------------------------------------------------------

--
-- Estrutura da tabela `horario`
--

DROP TABLE IF EXISTS `horario`;
CREATE TABLE IF NOT EXISTS `horario` (
  `idmateria` int(3) DEFAULT NULL,
  `idturma` int(3) DEFAULT NULL,
  `dia` varchar(20) DEFAULT NULL,
  `numero` int(20) DEFAULT NULL,
  `tempo` varchar(10) DEFAULT NULL,
  `idHorario` int(3) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idHorario`)
) ENGINE=MyISAM AUTO_INCREMENT=121 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `horario`
--

INSERT INTO `horario` (`idmateria`, `idturma`, `dia`, `numero`, `tempo`, `idHorario`) VALUES
(3, 1, '0', 0, '0', 1),
(1, 1, '0', 0, '0', 2),
(3, 1, '0', 0, '0', 3),
(2, 1, '0', 0, '0', 4),
(1, 1, '0', 0, '0', 5),
(4, 1, '0', 0, '0', 6),
(3, 1, '1', 1, '0', 7),
(2, 1, '1', 1, '0', 8),
(1, 1, '1', 1, '0', 9),
(4, 1, '1', 1, '0', 10),
(1, 1, '1', 1, '0', 11),
(3, 1, '1', 1, '0', 12),
(4, 1, '2', 2, '0', 13),
(2, 1, '2', 2, '0', 14),
(1, 1, '2', 2, '0', 15),
(4, 1, '2', 2, '0', 16),
(2, 1, '2', 2, '0', 17),
(4, 1, '2', 2, '0', 18),
(4, 1, '3', 3, '0', 19),
(4, 1, '3', 3, '0', 20),
(3, 1, '3', 3, '0', 21),
(1, 1, '3', 3, '0', 22),
(2, 1, '3', 3, '0', 23),
(2, 1, '3', 3, '0', 24),
(2, 1, '4', 4, '0', 25),
(4, 1, '4', 4, '0', 26),
(1, 1, '4', 4, '0', 27),
(1, 1, '4', 4, '0', 28),
(1, 1, '4', 4, '0', 29),
(2, 1, '4', 4, '0', 30),
(2, 2, '0', 0, '0', 31),
(4, 2, '0', 0, '0', 32),
(3, 2, '0', 0, '0', 33),
(2, 2, '0', 0, '0', 34),
(4, 2, '0', 0, '0', 35),
(4, 2, '0', 0, '0', 36),
(3, 2, '1', 1, '0', 37),
(1, 2, '1', 1, '0', 38),
(1, 2, '1', 1, '0', 39),
(1, 2, '1', 1, '0', 40),
(3, 2, '1', 1, '0', 41),
(2, 2, '1', 1, '0', 42),
(2, 2, '2', 2, '0', 43),
(3, 2, '2', 2, '0', 44),
(1, 2, '2', 2, '0', 45),
(2, 2, '2', 2, '0', 46),
(3, 2, '2', 2, '0', 47),
(2, 2, '2', 2, '0', 48),
(3, 2, '3', 3, '0', 49),
(2, 2, '3', 3, '0', 50),
(1, 2, '3', 3, '0', 51),
(4, 2, '3', 3, '0', 52),
(1, 2, '3', 3, '0', 53),
(4, 2, '3', 3, '0', 54),
(4, 2, '4', 4, '0', 55),
(3, 2, '4', 4, '0', 56),
(4, 2, '4', 4, '0', 57),
(3, 2, '4', 4, '0', 58),
(4, 2, '4', 4, '0', 59),
(3, 2, '4', 4, '0', 60),
(3, 3, '0', 0, '0', 61),
(4, 3, '0', 0, '0', 62),
(4, 3, '0', 0, '0', 63),
(4, 3, '0', 0, '0', 64),
(3, 3, '0', 0, '0', 65),
(2, 3, '0', 0, '0', 66),
(2, 3, '1', 1, '0', 67),
(3, 3, '1', 1, '0', 68),
(4, 3, '1', 1, '0', 69),
(2, 3, '1', 1, '0', 70),
(1, 3, '1', 1, '0', 71),
(2, 3, '1', 1, '0', 72),
(1, 3, '2', 2, '0', 73),
(3, 3, '2', 2, '0', 74),
(2, 3, '2', 2, '0', 75),
(4, 3, '2', 2, '0', 76),
(1, 3, '2', 2, '0', 77),
(4, 3, '2', 2, '0', 78),
(3, 3, '3', 3, '0', 79),
(1, 3, '3', 3, '0', 80),
(1, 3, '3', 3, '0', 81),
(3, 3, '3', 3, '0', 82),
(3, 3, '3', 3, '0', 83),
(2, 3, '3', 3, '0', 84),
(2, 3, '4', 4, '0', 85),
(2, 3, '4', 4, '0', 86),
(1, 3, '4', 4, '0', 87),
(2, 3, '4', 4, '0', 88),
(4, 3, '4', 4, '0', 89),
(2, 3, '4', 4, '0', 90),
(2, 4, '0', 0, '0', 91),
(3, 4, '0', 0, '0', 92),
(2, 4, '0', 0, '0', 93),
(3, 4, '0', 0, '0', 94),
(2, 4, '0', 0, '0', 95),
(1, 4, '0', 0, '0', 96),
(4, 4, '1', 1, '0', 97),
(4, 4, '1', 1, '0', 98),
(4, 4, '1', 1, '0', 99),
(3, 4, '1', 1, '0', 100),
(4, 4, '1', 1, '0', 101),
(2, 4, '1', 1, '0', 102),
(2, 4, '2', 2, '0', 103),
(4, 4, '2', 2, '0', 104),
(1, 4, '2', 2, '0', 105),
(3, 4, '2', 2, '0', 106),
(4, 4, '2', 2, '0', 107),
(3, 4, '2', 2, '0', 108),
(1, 4, '3', 3, '0', 109),
(2, 4, '3', 3, '0', 110),
(3, 4, '3', 3, '0', 111),
(2, 4, '3', 3, '0', 112),
(3, 4, '3', 3, '0', 113),
(4, 4, '3', 3, '0', 114),
(4, 4, '4', 4, '0', 115),
(1, 4, '4', 4, '0', 116),
(1, 4, '4', 4, '0', 117),
(4, 4, '4', 4, '0', 118),
(4, 4, '4', 4, '0', 119),
(2, 4, '4', 4, '0', 120);

-- --------------------------------------------------------

--
-- Estrutura da tabela `materia`
--

DROP TABLE IF EXISTS `materia`;
CREATE TABLE IF NOT EXISTS `materia` (
  `nome` varchar(50) DEFAULT NULL,
  `idprofessor` int(3) DEFAULT NULL,
  `idmateria` int(3) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idmateria`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `materia`
--

INSERT INTO `materia` (`nome`, `idprofessor`, `idmateria`) VALUES
('jjjjjjj', 1, 1),
('jjjjjjj', 1, 2),
('	 jjjjjjj	 jjjjjjj', 1, 3),
('	 jjjjjjj	 jjjjjjj', 1, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

DROP TABLE IF EXISTS `professor`;
CREATE TABLE IF NOT EXISTS `professor` (
  `nome` varchar(50) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `nacionalidade` varchar(20) DEFAULT NULL,
  `datanascimento` date DEFAULT NULL,
  `disciplinas` varchar(20) DEFAULT NULL,
  `idendereco` int(3) DEFAULT NULL,
  `idcontato` int(3) DEFAULT NULL,
  `idprofessor` int(3) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idprofessor`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`nome`, `sexo`, `nacionalidade`, `datanascimento`, `disciplinas`, `idendereco`, `idcontato`, `idprofessor`) VALUES
('jjjj', 'Masculino', 'dfshdfhdf', '2020-10-10', NULL, 1, 1, 1),
('jjjj', 'Masculino', 'dfshdfhdf', '2020-10-10', NULL, 2, 2, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `turma`
--

DROP TABLE IF EXISTS `turma`;
CREATE TABLE IF NOT EXISTS `turma` (
  `idturma` int(3) NOT NULL AUTO_INCREMENT,
  `anoletivo` varchar(20) DEFAULT NULL,
  `ensino` varchar(20) DEFAULT NULL,
  `turno` varchar(20) DEFAULT NULL,
  `datadeinicio` date DEFAULT NULL,
  `periodo` varchar(20) DEFAULT NULL,
  `numero` int(3) DEFAULT NULL,
  PRIMARY KEY (`idturma`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `turma`
--

INSERT INTO `turma` (`idturma`, `anoletivo`, `ensino`, `turno`, `datadeinicio`, `periodo`, `numero`) VALUES
(1, '2020', 'mefio', 'tarde', '2010-10-10', '6', 6),
(2, '2020', 'mefio', 'tarde', '2010-10-10', '5', 6),
(3, '2020', 'medio', 'Tarde', '2300-12-20', '6', 6),
(4, '2090', 'medio', 'Tarde', '1010-12-12', '6', 6);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
