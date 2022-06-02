
@tag
Feature: automacao


  @tag1
  Scenario: banco original
  
    Given que o usuario acesse a URL  "https://www.original.com.br"
    And selecione o campo abrir conta 
    And selecione o tipo de pessoa fisica
    And preencha os dados
    When selcionar o botao quero abrir conta
    Then realizo a validacao do texto falta pouco
  