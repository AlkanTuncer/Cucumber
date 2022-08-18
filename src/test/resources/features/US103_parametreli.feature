Feature: Parametreli stepdefination olusturma
  @parametre
  Scenario: TC04_parametre kullanımı
    Given Kullanıcı amazon sayfasına gider
    And "macbook" icin arama yapar
    Then sonuclarin "macbook" icerdiğini test eder
    And sayfayi kapatir