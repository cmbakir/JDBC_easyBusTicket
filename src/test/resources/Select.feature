
Feature: Kullanıcı Bilgilerini Listeleme

  @select01
  Scenario: Tüm kullanıcıların adlarını ve e-posta adreslerini listelemek istiyorum

    * Database baglantisi kurulur.
    * SQL sorgusu hazirlanir ve calistirilir.
    * Sonuclar listelenir.
    * Database baglantisi kapatilir.

  @query2
  Scenario: Türkiye’den (country_code = 'TR') kayıtlı olan kullanıcıları listelemek istiyorum.

    * Database baglantisi kurulur.
    * Kayitli kullanicilari listeleme sorgusu hazirlanir ve calistirilir.
    * Kayitli kullanicilar listelenir.
    * Database baglantisi kapatilir.

  Scenario: Belirli bir e-posta adresine sahip kullanıcıyı bulmak istiyorum.

    * Database baglantisi kurulur.
    * Email ile kullanici goruntuleme sorgusu hazirlanir ve calistirilir.
    * Email ve kulalnici dogrulanir.
    * Database baglantisi kapatilir.
