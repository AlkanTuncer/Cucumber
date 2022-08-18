Feature: Parametreli stepdefination olusturma
  @parameter
  Scenario: TC04_parametre kullanımı
    Given Kullanıcı amazon sayfasına gider
    And "macbook" icin arama yapar
    Then sonuclarin "macbook" icerdiğini test eder
    And sayfayi kapatir