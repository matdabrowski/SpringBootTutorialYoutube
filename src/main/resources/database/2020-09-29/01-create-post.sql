--liquibase formatted sql
--changeset mdabrowski:1
CREATE TABLE POST (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(400) NOT NULL,
  content VARCHAR(2000) NULL,
  created timestamp
);
