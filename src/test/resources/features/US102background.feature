@paralel2
Feature: US102 Amazon Search Test with Background

  Background: Amazon sayfasına gider
    Given Kullanıcı amazon sayfasına gider

  @first
    Scenario: TC01_AmazonIphoneSearchTest
      And Iphone için arama yapar
      Then Sonucların iphone içerdiğini test eder

    Scenario: TC02_AmazonTeaPotSearchTest
      And Tea pot için arama yapar
      Then Sonucların tea pot içerdiğini test eder

  @first
    Scenario: TC03_AmazonFlowerSearchTest
      And Flower için arama yapar
      Then Sonucların flower içerdiğini test eder