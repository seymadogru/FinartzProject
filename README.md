
Havayolları Biletleme Sistemi


İstenilen teknolojiler kullanılarak gereksinimler sağlanmıştır. Yalnızca satın alma kısmında eksiklikler bulunmaktadır.

● Havayolu şirketi eklenebilmeli, aranabilmeli. (Oluşturuldu)

● Havaalanı eklenebilmeli, aranabilmeli.  (Oluşturuldu)

● Rota eklenebilmeli, aranabilmeli. (Oluşturuldu)

● Havayolu şirketine uçuş tanımlanabilmeli, aranabilmeli.  (Oluşturuldu)

● Bilet satın alınabilmeli, ○ Satın alma işlemi sırasında kredi kartı bilgileri maskelenmeli. ( Örneğin “4221161122330005” -> “422116******0005”). ○ Burada kredi kart numarasının aralarında boşluklar ya da ayraçlar olması gibi durumları da kapsayacak şekilde geliştirme yapılmalı. Örn; Request’te kart numarası farklı formatlarda da gelse (Önr; “4221-1611-2233-0005” , “4221,1611,2233,0005”) kart bilgisi beklenen şekilde (“422116******0005”) maskelenerek satın alma işlemine alınmalı. ○ Uçuş kontenjanın her %10 artışında, bilet fiyatı da %10 arttırılmalı.
(Yalnızca sisteme bilet kayıt edilebilmektedir.)

● Bilet numarası ile arama yapılabilmeli ve bilet iptali yapılabilmeli.  (Oluşturuldu)
 
● Private metodlar harici her yerin testleri yazılmalıdır. (Oluşturuldu)


Github linki:  https://github.com/seymadogru/FinartzProject.git


Postman Requestleri;


Havayolu şirketi kaydetme;
http://localhost:8080/v1/rest/saveAirlineCompany   (Post)
{
   "name" : "Pegasus",
   "phone" : ”059595147”,
   "airportName" : "İstanbul Havalimanı"
}

-------------------------------------------------------------------------------------------------------------------

İstenen havayolu şirketini aratma;  
http://localhost:8080/v1/rest/AirlineCompanyName/Pegasus    (get)
-------------------------------------------------------------------------------------------------------------------

İstenen havalimanındaki havayolu şirketlerini görüntüleme;
http://localhost:8080/v1/rest/AirportName/Sabiha Gökcen Havalimanı   (get)

-------------------------------------------------------------------------------------------------------------------

Havalimanı kayıt edebilme;
http://localhost:8080/v1/rest/saveAirport      (post)
{
   "name" : "Sabiha Gökçen Havalimanı",
   "city" : "İstanbul",
   "phone" : ”0548545678”,
   "aircraftCapacity" : 175
}
-------------------------------------------------------------------------------------------------------------------

Girilen şehirdeki havalimanlarını görebilme;

http://localhost:8080/v1/rest/AirportCity/İstanbul     (get)

-------------------------------------------------------------------------------------------------------------------

Girilen havalimanı hakkında bilgi alma;

http://localhost:8080/v1/rest/Airport/Adnan Menderes Havalimanı    (get)

-------------------------------------------------------------------------------------------------------------------

Rota kaydetme;
http://localhost:8080/v1/rest/saveRoute  (post)
{
   "airlineCompany" : "Pegasus",
   "departureAirport" : "İstanbul Havalimanı",
   "landingAirport" : "Esenboğa Havalimanı",
   "departureTime" : 12.50,
   "date" : "2021-06-06"
 }

-------------------------------------------------------------------------------------------------------------------

Kalkış ve iniş havalimanına göre rota bilgileri verme;
http://localhost:8080/v1/rest/route/İstanbul Havalimanı/Esenboğa Havalimanı     (get)
-------------------------------------------------------------------------------------------------------------------


uçuş kaydetme;
http://localhost:8080/v1/rest/saveFlight   (post)
{
   "airlineCompanyName" : "Pegasus",
   "departureAirport" : "Sabiha Gökçen Havalimanı",
   "landingAirport" : "Adnan Menderes Havalimanı",
   "departureTime" : 15.30,
   "date" : "2021-06-06",
   "travelTime" : 1.45,
   "firstClassPrice" : 352.0,
   "economyClassPrice" : 190.0

 }
 
------------------------------------------------------------------------------------------------------------------- 

Havayolu şirketinin üzerindeki uçuşları verme;
http://localhost:8080/v1/rest/Flight/Pegasus       (get)
---------------------------------------------------------------------------------------------------------------------------------------------------------------
Tüm uçuşları görüntüleme
http://localhost:8080/v1/rest/AllFlights            (get)

----------------------------------------------------------------------------------------------------------------------------------------------------
Girilen tarihe göre uçuşları listeleme;
http://localhost:8080/v1/rest//FlightDates/2021-06-06            (get)
-------------------------------------------------------------------------------------------------------------------

Bilet Kaydetme;
http://localhost:8080/v1/rest/saveTicket   (post)
{
   "flightNo": "0930sghtoamh100621",
   "name" : "şeyma",
   "surname" : "dogru",
   "tcKimlikNo" : "123456789",
   "hesCode" : "9ds30",
   "date" : "2021-10-06"

 }
 
-------------------------------------------------------------------------------------------------------------------
Yapılan rezervasyonları Flight No ile görme;
http://localhost:8080/v1/rest/ticketInformation/0930sghtoamh100621  (get)

-------------------------------------------------------------------------------------------------------------------

Tc Kimlik No’ya göre bilet görüntüleme
http://localhost:8080/v1/rest/ticketInformation/123456789   (get)

-------------------------------------------------------------------------------------------------------------------

id ile bilet silme
http://localhost:8080/v1/rest/deleteTicket?id=1     (delete)

-------------------------------------------------------------------------------------------------------------------

Şeyma DOĞRU





