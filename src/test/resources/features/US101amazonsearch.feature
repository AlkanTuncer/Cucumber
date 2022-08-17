Feature: US101 Amazon Search

  Scenario: TC01_AmazonSearchTest
    Given Kullanıcı amazon sayfasına gider
    And Iphone için arama yapar
    Then Sonucların iphone içerdiğini test eder

    Given Kullanıcı amazon sayfasına gider
    And Tea pot için arama yapar
    Then Sonucların iphone içerdiğini test eder

    Given Kullanıcı amazon sayfasına gider
    And Flower için arama yapar
    Then Sonucların iphone içerdiğini test eder