@failed_scenario
Feature: hooks_test
  Background: googlea_git
    Given kullanici google gider
# bu scenarioda bılerek faıl ettık
  # raporları faıle durumunda  ekran goruntusu eklemıs olcak
  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" için arama yapar
    Then sonuclarin "iphone" icerdigini dogrula
    Then close the application


  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" için arama yapar
    Then sonuclarin "tesla" icerdigini dogrula
    Then ekran goruntusu al
    Then close the application