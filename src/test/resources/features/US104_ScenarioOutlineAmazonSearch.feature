Feature: US104 Amazon Tests with Scenario Outline

  Scenario Outline: TC05 Amazon'da bir listenin tüm elementlerini aratmak
    Given Kullanici "AmazonURL" sayfasina gider
    And "<aranacakEleman>" icin arama yapar
    Then Sonuclarin "<aranacakEleman>" icerdiğini test eder
    Then Sayfayi kapatir
    
    
    Examples:
      |aranacakEleman|
      |car|
      |video games|
      |java|
      |javascript|
      |Flutter|
      |MongoDB|