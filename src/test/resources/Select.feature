Feature: Kullanıcı Bilgilerini Listeleme

  @select01
  Scenario: Tüm kullanıcıların adlarını ve e-posta adreslerini listelemek istiyorum

    * Database baglantisi kurulur.
    * SQL sorgusu hazirlanir ve calistirilir.
    * Sonuclar listelenir.
    * Database baglantisi kapatilir.