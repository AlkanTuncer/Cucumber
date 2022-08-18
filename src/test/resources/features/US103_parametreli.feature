Feature: Parametreli stepdefination olusturma
  @parameter
  Scenario: TC04_parametre kullanımı
    Given Kullanıcı amazon sayfasına gider
    And "macbook" icin arama yapar
    Then Sonuclarin "macbook" icerdiğini test eder
    And Sayfayi kapatir