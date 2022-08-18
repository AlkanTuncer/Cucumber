Feature: US104 Amazon Tests with Scenario Outline

  Scenario Outline: TC05 Amazon'da bir listenin tüm elementlerini aratmak
    And "<aranacakEleman>" icin arama yapar
    Then Sonuclarin "<aranacakEleman>" icerdiğini test eder
    
    
    Examples:
      |aranacakEleman|
      |car|
      |book|
      |java|
      |javascript|
      |Flutter|
      |MongoDB|