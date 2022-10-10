-- Select
select * from customers	-- * kolonların hepsini gösterir
Select ContactName Adi,CompanyName Sirketadi,City Sehir from Customers  -- memoryde fake bir tablo oluşturduk // Alias Syntax: şu isimle getir

select * from Customers where City='London'  -- Şehri Londra olan Müşterileri getir 


--case insensitive
select*from Products where CategoryID=1 or CategoryID=3 --Ürünler tablosunun kategoriId'si 1 ya da kategoriId'si 3 olanları getir 


select*from Products where CategoryID=1 and UnitPrice>=10

select * from Products order by ProductName -- Bütün ürünleri Ürün ismine göre sırala

select * from Products order by CategoryID,ProductName

select * from Products order by UnitPrice -- default ascending Fiyata göre artan olarak sırala

select * from Products order by UnitPrice desc -- descending Fiyata göre azalan olarak sırala

select * from Products where categoryId=1 order by UnitPrice desc -- KategoriId=1 olan ürünleri fiyata göre azalan olarak sırala

select count(*) Adet from Products where CategoryID=2 -- KategorId=2 olan ürünlerin adedini ver

select * from Products group by CategoryID -- group by kullandığımızda select ettiğimiz kolon SADECE group by da yazdığımız alan olabilir

select categoryID,count(*) from Products group by CategoryID --Her bir kategori için grup oluşur,ayrı ayrı count hesaplanır

select categoryID,count(*) from Products group by CategoryID having count(*)<10 -- Adedi 10 dan az kategorileri sırala

select categoryID,count(*) from Products where UnitPrice>20 
group by CategoryID having count(*)<10 -- Adedi 10'dan az fiyatı 20'den fazla kategorileri sırala


select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName
from Products inner join Categories --  Ürünlerden fiyatı 10'dan büyük olanları CategoryID ve Kategorilerin Idleri eşitse Product ve Kategorileri sırala
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

--DTO //Data Transformation Object

select * from Products p inner join[Order Details] od -- Inner Join sadece eşleşen kayıtları getirir
on p.ProductID=od.ProductID

select * from Products p left join[Order Details] od -- Solda olup sağda olmayanları da getir
on p.ProductID=od.ProductID

select * from Customers c inner join Orders o
on c.CustomerID=o.CustomerID

select * from Customers c left join Orders o 
on c.CustomerID=o.CustomerID
where o.CustomerID is null		-- Hiç sipariş vermeyen müşterileri sırala
	--(Primary Key'e uygularız)

select * from Customers c right join Orders o -- Müşteride olup siparişlerde olmayanları sırala
on c.CustomerID=o.CustomerID

select * from Products p inner join [Order Details] od -- Birden fazla tablo ekledik
on p.ProductID=od.ProductID
inner join Orders o
on o.OrderID=od.OrderID








