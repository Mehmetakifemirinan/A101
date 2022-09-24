@TEST_MED-179
Feature: US_001


  Scenario: Kullanici alisveris yapabilmelidir

    Given Kullanici "a101Url" anasayfasina giris yapar
    Then  Kullanici Giyim&Aksesuar secenegine tiklar
    And   Kullanici kadin ic giyim secenegine tiklar
    When  Kullanici dizalti corap secenegine tiklar
    And   Kullanici acilan urunun siyah oldugunu dogrular
    And   Kullanici urun adedini secer ve adet ekle secenegine tiklar
    And   Kullanici sepete ekle secenegine tiklar
    And   Kullanici sepeti goruntule secenegine tiklar
    And   Kullanici sepeti onayla secenegine tiklar
    And   Kullanici uye olmadan devam et secenegine tiklar
    And   Kullanici mail bilgisini girer ve devam secenegine tiklar
    And   Kullanici Adres olustur secenegine tiklar ve texboxlari doldurur
    And   Kullanici kaydet secenegini tiklar
    And   Kullanici istedigi kargo firmasini secer kaydet ve devam et secenegine tiklar



