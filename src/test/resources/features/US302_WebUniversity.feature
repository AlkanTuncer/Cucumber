@webU
Feature: US302 WebUniversity Window Handle TASK

  Scenario Outline: TC16 Window Handle with Reusable Methods
  
    Given Kullanici "WebUniversityUrl" sayfasina gider
    Then Login Portal elementine kadar asagi iner ve elemente tiklar.
    And Diger windowa gecer
    Then "<username>" ve "<password>" kutularina deger yazar
    And WebUniversity Login butonuna basar
    Then Popup'ta cikan yazinin "validation failed" oldugunu test eder
    And Ok diyerek Popup'i kapatir
    Then Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder
    Then Sayfayi kapatir

    Examples:
      | username | password |
      | dante | JUGKING |


  #"http://webdriveruniversity.com/" adresine gidin
  #"Login Portal" a kadar asagi inin
  #"Login Portal" a tiklayin
  #Diger window'a gecin  -> title : WebDriver | Login Portal (ReusableMethods (:)
  #"username" ve "password" kutularina deger yazdirin
  # WebUniversity Login butonuna basar
  #Popup'ta cikan yazinin "validation failed" oldugunu test edin
  #Ok diyerek Popup'i kapatin
  #Ilk sayfaya geri donun
  #Ilk sayfaya donuldugunu test edin