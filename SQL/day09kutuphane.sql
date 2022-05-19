-- KÜTÜPHANE DATABASE OLUŞTURMA

create database kutuphane;

use kutuphane;

create table ogrenci
(
ogrno int primary key,
ad VARCHAR(20),
soyad VARCHAR(20),
dtarih DATE	,
cinsiyet CHAR,
sinit CHAR(3),
puan int
);



create table islem
(
islemno INT primary key,
ogrno INT,
kitapno INT,
atarih DATE,
vtarih DATE,
CONSTRAINT ogrno FOREIGN KEY(ogrno) REFERENCES ogrenci(ogrno)
);





create table kitap
(
kitapno int NOT NULL,
ad varchar(100),
sayfasayisi int Not Null,
puan int NOT NULL,
yazarno int NULL,
sayi int null
);






create table yazar
(
yazarno int NOT NULL,
ad varchar(50) NULL,
soyad varchar(50) NULL,
CONSTRAINT yazarno_fk FOREIGN KEY (yazarno) REFERENCES kitap(yazarno)
);






create table tur
(
turno int NOT NULL,
ad varchar(20)
);





