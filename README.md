# FinartzProject
Postman Requestleri

Havayolu şirketi kaydetme;
http://localhost:8080/v1/rest/saveAirlineCompany   (Post)
{
   "name" : "Pegasus",
   "phone" : ”059595147”,
   "airportName" : "İstanbul Havalimanı"
}
---------------------------------------------------------------------------------------------------------------

İstenen havayolu şirketini aratma;  
http://localhost:8080/v1/rest/AirlineCompanyName/Pegasus    (get)

----------------------------------------------------------------------------------------------------------------

İstenen havalimanındaki havayolu şirketlerini görüntüleme;
http://localhost:8080/v1/rest/AirportName/Sabiha Gökcen Havalimanı   (get)

---------------------------------------------------------------------------------------------------------------

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

---------------------------------------------------------------------------------------------------------------------

girilen havalimanı hakkında bilgi alma;

http://localhost:8080/v1/rest/Airport/Adnan Menderes Havalimanı    (get)

----------------------------------------------------------------------------------------------------------------------

Rota kaydetme;
http://localhost:8080/v1/rest/saveRoute  (post)
{
   "airlineCompany" : "Pegasus",
   "departureAirport" : "İstanbul Havalimanı",
   "landingAirport" : "Esenboğa Havalimanı",
   "departureTime" : 12.50,
   "date" : "2021-06-06"
 }

------------------------------------------------------------------------------------------------------------------------

Kalkış ve iniş havalimanına göre rota bilgileri verme;
http://localhost:8080/v1/rest/route/İstanbul Havalimanı/Esenboğa Havalimanı     (get)

-------------------------------------------------------------------------------------------------------------------------

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

----------------------------------------------------------------------------------------------------------------------

Havayolu şirketinin üzerindeki uçuşları verme;
http://localhost:8080/v1/rest/Flight/Pegasus


