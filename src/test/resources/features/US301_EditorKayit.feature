@editor
Feature: US301 Scenario Outline ile EditorDateTables sayfasına kayıt

  Scenario Outline: TC16 Kullanıcı yeni kayıt eklemeli
    Given Kullanici "EDT" sayfasina gider
    Then New butonuna basar
    Then First name olarak "<firstname>" girer
    Then Last name olarak "<lastname>" girer
    Then Position olarak "<position>" girer
    Then Office olarak "<office>" girer
    Then Extension olarak "<extension>" girer
    Then Start date olarak "<startdate>" girer
    Then Salary olarak "<salary>" girer
    And Kullanici Create butonuna basar
    Then Kullanici "<firstname>" ile arama yapar
    And First name bölümünde "<firstname>" oldugunu dogrular
    And Sayfayi kapatir

    Examples:
      | firstname | lastname | position | office | extension | startdate | salary |
      | Alkan | Tuncer | DevOps | New York | QA | 2022-10-10 | 110000 |
