-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema municipales
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema municipales
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `municipales` DEFAULT CHARACTER SET utf8 ;
USE `municipales` ;

-- -----------------------------------------------------
-- Table `municipales`.`PROPUESTA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `municipales`.`PROPUESTA` (
  `idPropuesta` INT NOT NULL AUTO_INCREMENT,
  `origenPropuesta` VARCHAR(65) NOT NULL,
  `tituloPropuesta` VARCHAR(45) NOT NULL,
  `categoriaPropuesta` VARCHAR(45) NOT NULL,
  `breveDescripcion` VARCHAR(125) NOT NULL,
  `autorPropuesta` VARCHAR(65) NULL,
  `fechaPropuesta` DATE NOT NULL,
  `estadoPropuesta` VARCHAR(45) NOT NULL DEFAULT 'Pendiente de Aprobacion',
  PRIMARY KEY (`idPropuesta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `municipales`.`MATERIAL`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `municipales`.`MATERIAL` (
  `idMaterial` INT NOT NULL AUTO_INCREMENT,
  `tituloMaterial` VARCHAR(45) NOT NULL,
  `categoriaMaterial` VARCHAR(45) NOT NULL,
  `descripcionMaterial` VARCHAR(125) NOT NULL,
  `fuenteMaterial` VARCHAR(45) NOT NULL,
  `enlaceAlDocMaterial` VARCHAR(300) NOT NULL,
  `esMaterialPrioritario` TINYINT NOT NULL,
  PRIMARY KEY (`idMaterial`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `municipales`.`JORNADA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `municipales`.`JORNADA` (
  `idJornada` INT NOT NULL AUTO_INCREMENT,
  `idPropuesta` INT NOT NULL,
  `refInstiJornada` VARCHAR(65) NOT NULL,
  `tituloJornada` VARCHAR(45) NOT NULL,
  `materialIncluidoJornada` VARCHAR(65) NOT NULL,
  `objetivoJornada` VARCHAR(125) NOT NULL,
  `EsJornadaPrioritaria` TINYINT NOT NULL,
  PRIMARY KEY (`idJornada`),
  INDEX `fk_JORNADA_PROPUESTA_idx` (`idPropuesta` ASC) VISIBLE,
  CONSTRAINT `fk_JORNADA_PROPUESTA`
    FOREIGN KEY (`idPropuesta`)
    REFERENCES `municipales`.`PROPUESTA` (`idPropuesta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `municipales`.`MATERIAL_JORNADA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `municipales`.`MATERIAL_JORNADA` (
  `MATERIAL_idMaterial` INT NOT NULL,
  `JORNADA_idJornada` INT NOT NULL,
  PRIMARY KEY (`MATERIAL_idMaterial`, `JORNADA_idJornada`),
  INDEX `fk_MATERIAL_has_JORNADA_JORNADA1_idx` (`JORNADA_idJornada` ASC) VISIBLE,
  INDEX `fk_MATERIAL_has_JORNADA_MATERIAL1_idx` (`MATERIAL_idMaterial` ASC) VISIBLE,
  CONSTRAINT `fk_MATERIAL_has_JORNADA_MATERIAL1`
    FOREIGN KEY (`MATERIAL_idMaterial`)
    REFERENCES `municipales`.`MATERIAL` (`idMaterial`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MATERIAL_has_JORNADA_JORNADA1`
    FOREIGN KEY (`JORNADA_idJornada`)
    REFERENCES `municipales`.`JORNADA` (`idJornada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `municipales`.`MATERIAL_PROPUESTA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `municipales`.`MATERIAL_PROPUESTA` (
  `MATERIAL_idMaterial` INT NOT NULL,
  `PROPUESTA_idPropuesta` INT NOT NULL,
  PRIMARY KEY (`MATERIAL_idMaterial`, `PROPUESTA_idPropuesta`),
  INDEX `fk_MATERIAL_has_PROPUESTA_PROPUESTA1_idx` (`PROPUESTA_idPropuesta` ASC) VISIBLE,
  INDEX `fk_MATERIAL_has_PROPUESTA_MATERIAL1_idx` (`MATERIAL_idMaterial` ASC) VISIBLE,
  CONSTRAINT `fk_MATERIAL_has_PROPUESTA_MATERIAL1`
    FOREIGN KEY (`MATERIAL_idMaterial`)
    REFERENCES `municipales`.`MATERIAL` (`idMaterial`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MATERIAL_has_PROPUESTA_PROPUESTA1`
    FOREIGN KEY (`PROPUESTA_idPropuesta`)
    REFERENCES `municipales`.`PROPUESTA` (`idPropuesta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
