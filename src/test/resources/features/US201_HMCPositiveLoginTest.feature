Feature: US201 HotelMyCamp Positive Login Test

  Scenario: TC11_Positive Login HMC
    Given Kullanici "urlHMC" sayfasina gider
    Then Login linkine tıklar
    Then Username olarak "HMCValidUsername" girer.
    Then Password olarak "HMCValidPassword" girer.
    And Login butonuna tıklar.
    And Basarili olarak giris yaptigini test eder.
    And Sayfayi kapatir