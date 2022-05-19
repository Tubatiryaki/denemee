use batch60_61;

-- ================================================ CONCAT ===================================================
create table customer
(
musteri_no int,
ad VARCHAR(22),
soyad VARCHAR(25),
sehir varchar(45),
cinsiyet varchar(15),
puan int
);

INSERT INTO customer VALUES(111,'ebru', 'akar','denizli','kadin',78);
INSERT INTO customer VALUES(222,'ayse', 'kara','ankara','kadin',90);
INSERT INTO customer VALUES(333,'ali','gel','istanbul','erkek',66);
INSERT INTO customer VALUES(444, 'mehmet','okur','mus','erkek',98);

select * from customer;

select concat('Adiniz,  soyadiniz ', ad, ' ', soyad) ad_soyad from customer;

select concat(musteri_no, '. musteri ', ad, ' ', soyad) ad_soyad, sehir, cinsiyet, puan from customer;



-- ****************************************  length-left-right (String functions) ********************************************************
-- tablodaki isimlerin ve soyisimlerin uzunluklari
select ad, length(ad) as ad_uzunlugu, soyad, length(soyad) as soyad_uzunlugu from customer;

-- tablodaki isimlerin ve soyisimlerin soldan ilk harfleri
select ad , left(ad, 1), soyad, left(soyad, 1) from customer;

-- tablodaki isimlerin ve soyisimlerin sağdan ilk harfleri
select ad , right(ad, 1), soyad, right(soyad, 1) from customer;

-- tablodaki isimlerin ve soyisimlerin soldan ilk harfleri (aralarinda nokta var ve birleşik yazilmişlar)


