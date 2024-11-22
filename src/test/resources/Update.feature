Feature: UPDATE QUERY
  Background: Database baglantisi kurulur.
    * Database baglantisi olusturulur.

  @insert
  Scenario: Yeni bir kullanıcı eklemek istiyorum ve eklenen verinin doğruluğunu test etmek istiyorum.

    * InsertQuery hazirlanir ve calistirilir.
    * Verinin kaydedildigi dogrulanir.
    * Database baglantisi sonlandirilir.


  @update
  Scenario: Mevcut bir kullanıcının email'ini güncellemek ve değişikliğin doğruluğunu test etmek istiyorum.

    * UpdateQuery hazirlanir ve calistirilir.
    * Verinin Update edildigi dogrulanir.
    * Database baglantisi sonlandirilir.

  @delete
  Scenario: Belirli bir e-posta adresine sahip kullanıcıyı silmek
  ve silindiğinden emin olmak istiyorum.

    * DeleteQuery hazirlanir ve calistirilir.
    * Verinin silindigi dogrulanir.
    * Database baglantisi sonlandirilir.