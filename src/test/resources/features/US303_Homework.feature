@homework @testparalel2
Feature: US303 Homework

  Scenario: TC Homework
  Given Kullanici verilen sayfaya gider
  Then Add Element butona basar
  Then Delete butonu gorunur oluncaya kadar bekler
  And Delete butonunun gorunur oldugunu test eder
  Then Delete butonuna basarak butonu siler
  And Delete butonunun gorunmedigini test eder
  And Sayfayi kapatir


#Yeni bir test methodu olusturalim
#https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
#“Add Element” butona basin
#“Delete” butonu gorunur oluncaya kadar bekleyin
#“Delete” butonunun gorunur oldugunu test edin
#Delete butonuna basarak butonu silin
#Delete butonunun gorunmedigini test edin