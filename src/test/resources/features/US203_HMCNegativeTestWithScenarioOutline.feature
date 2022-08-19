@negativeOutline
Feature:US203 HotelMyCamp Negative Test with Scenario Outline

  Scenario Outline: TC15 - Different Usernames and Passwords
    Given Kullanici "urlHMC" sayfasina gider
    Then Login linkine tıklar
    And username olarak "<username>" girer.
    And password olarak "<password>" girer.
    And Login butonuna tıklar.
    Then Giris yapma isleminin basarisiz oldugunu test eder.
    And Sayfayi kapatir

    Examples:
      | username | password |
      | manager53 | password53 |
      | manager | manager1905 |
      | manager53 | Manager1! |
