Feature: US404 N11 Product Test

  Scenario Outline: Go to N11 Website and add product to favorites then delete from the favorites
    Given Kullanici "urlN11" sayfasina gider
    And Kullanici ana sayfayi dogrular
    Then Kullanici giriş yap butonuna basar
    Then Email kısmına "<email>" password kısmına "<password>" girer
    And Login işlemi kontrol edilir
    Then Arama kismina Iphone yazilir
    And Iphone kelimesinin aratildigi kontrol edilir
    When Arama sonuclari sayfalarindan ikinci sayfaya gidilir
    And  Ikinci sayfada olundugu kontrol edilir
    Then Sayfadaki ücüncü ürün favorilere eklenir
    Then Hesabımdan istek listem favorilerim sayfasina gidilir
    And Favorilerim sayfasinin acildiği kontrol edilir
    Then Eklenen urun favorilerden silinir ve silme islemi kontrol edilir
    And Uye cikis islemi yapılır.

    Examples:
      | email | password |
      | ferhat142yedek@hotmail.com | Yede124k+ |

