-- UPDATE - SET  

use batch60_61;

CREATE TABLE tedarikciler -- parent
(
vergi_no int PRIMARY KEY,
firma_ismi VARCHAR(50),
irtibat_ismi VARCHAR(50)
);
    
INSERT INTO tedarikciler VALUES (101, 'IBM', 'Kim Yon');
INSERT INTO tedarikciler VALUES (102, 'Huawei', 'Çin Li');
INSERT INTO tedarikciler VALUES (103, 'Erikson', 'Maki Tammen');
INSERT INTO tedarikciler VALUES (104, 'Apple', 'Adam Eve');

select * from tedarikciler;
    
CREATE TABLE urunler -- child
(
ted_vergino int, 
urun_id int, 
urun_isim VARCHAR(50), 
musteri_isim VARCHAR(50),
CONSTRAINT fk_urunler FOREIGN KEY(ted_vergino) REFERENCES tedarikciler(vergi_no)
on delete cascade
);    
    
INSERT INTO urunler VALUES(101, 1001,'Laptop', 'Ayşe Can');
INSERT INTO urunler VALUES(102, 1002,'Phone', 'Fatma Aka');
INSERT INTO urunler VALUES(102, 1003,'TV', 'Ramazan Öz');
INSERT INTO urunler VALUES(102, 1004,'Laptop', 'Veli Han');
INSERT INTO urunler VALUES(103, 1005,'Phone', 'Canan Ak');
INSERT INTO urunler VALUES(104, 1006,'TV', 'Ali Bak');
INSERT INTO urunler VALUES(104, 1007,'Phone', 'Aslan Yılmaz');
    
SELECT * FROM tedarikciler;

SELECT * FROM urunler;

select * from tedarikciler , urunler where tedarikciler.vergi_no = urunler.ted_vergino;
    
-- SYNTAX
-- UPDATE tablo_adı
-- SET sutun1 = yeni_deger1, sutun2 = yeni_deger2,...  
-- WHERE koşul;

-- SORU1: vergi_no’su 102 olan tedarikcinin (firma) ismini 'Vestel' olarak güncelleyeniz.
update tedarikciler set firma_ismi = 'Vestel' where vergi_no=102;
select * from tedarikciler;

--  SORU2: Tedarikciler tablosundaki tüm firma isimlerini 'CASPER' olarak güncelleyeniz. 
update tedarikciler set firma_ismi = 'CASPER'; 


-- SORU3: vergi_no’su 101 olan tedarikcinin ismini 'casper' ve irtibat_ismi’ni 'Ali Veli' olarak güncelleyiniz.
update tedarikciler set firma_ismi = 'casper' where vergi_no=101;
update tedarikciler set irtibat_ismi = 'Ali Veli' where vergi_no=101;

-- yukardaki kodu aşağdaki şekilde birleştirip tek satr olarak yazabiliriz.
update tedarikciler set firma_ismi = 'casper', irtibat_ismi='Ali Veli' where vergi_no=101;
 
    
-- SORU4: firma_ismi casper olan tedarikcinin irtibat_ismini 'Bill Gates' olarak güncelleyiniz.
update tedarikciler
set irtibat_ismi = 'Bill Gates'
where firma_ismi='casper';

update tedarikciler set irtibat_ismi = 'Bill Gates' where vergi_no=101;


-- SORU5: urunler tablosundaki 'Phone' değerlerini 'Telefon' olarak güncelleyiniz.
update urunler
set urun_isim = 'Telefon'
where urun_isim='Phone';
select * from urunler;


-- SORU6: urunler tablosundaki urun_id değeri 1004'ten büyük olanların urun_id 1 arttrn.
update urunler set urun_id = urun_id+1 where urun_id > 1004;
SELECT * FROM urunler;

-- SORU7: urunler tablosundaki tüm ürünlerin urun_id değerini ted_vergino sutun değerleri ile toplayarak güncelleyiniz.
update urunler set urun_id = urun_id + ted_vergino;
SELECT * FROM urunler;



--  SORU8: urunler tablosundan Ali Bak’in aldigi urunun ismini, tedarikci  tablosunda irtibat_ismi 
-- 'Adam Eve' olan firmanın ismi (firma_ismi) ile degistiriniz.
-- 8. soruyu çözmeden önce, tabloları eski haline getireceğiz.
update urunler set urun_isim = (select firma_ismi from tedarikciler where irtibat_ismi = 'Adam Eve')
where musteri_isim='Ali Bak';

-- (select firma_ismi from tedarikciler where irtibat_ismi = 'Adam Eve') -> Apple'i bu satir ile almş olduk.
SELECT * FROM urunler;


 -- SORU9: Laptop satin alan musterilerin ismini, firma_ismi Apple’in irtibat_isim'i ile degistirin.
update urunler
set musteri_isim = (select irtibat_ismi from tedarikciler where firma_ismi = 'Apple')
where urun_isim = 'Laptop'