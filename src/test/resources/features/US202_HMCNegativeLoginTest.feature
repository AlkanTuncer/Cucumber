Feature: US202 HotelMyCamp Negative Login Test

  Scenario: TC12_Wrong Username Valid Password
    Given Kullanici "urlHMC" sayfasina gider
    Given Login linkine tıklar
    Then Username olarak "HMCWrongUsername" girer.
    Then Password olarak "HMCValidPassword" girer.
    Then Login butonuna tıklar.
    And Giris yapma isleminin basarisiz oldugunu test eder.
    And Sayfayi kapatir

  Scenario: TC13_Wrong Password Valid Username
    Given Kullanici "urlHMC" sayfasina gider
    Given Login linkine tıklar
    Then Username olarak "HMCValidUsername" girer.
    Then Password olarak "HMCWrongPassword" girer.
    Then Login butonuna tıklar.
    And Giris yapma isleminin basarisiz oldugunu test eder.
    And Sayfayi kapatir

  Scenario: TC14_Wrong Username and Password
    Given Kullanici "urlHMC" sayfasina gider
    Given Login linkine tıklar
    Then Username olarak "HMCWrongUsername" girer.
    Then Password olarak "HMCWrongPassword" girer.
    Then Login butonuna tıklar.
    And Giris yapma isleminin basarisiz oldugunu test eder.
    And Sayfayi kapatir