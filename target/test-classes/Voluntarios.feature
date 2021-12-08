Feature: Cadastrar Voluntario
  Scenario: Inicio do Programa
    Given o app iniciou
    And foi criado o Controller
    And chamado o metodo de criacao
    Then o voluntario foi salvo no repository

  Scenario: Inicio do Programa novo
    Given o app iniciou novo
    And foi criado o Controller novo
    And chamado o metodo de criacao novo
    Then o voluntario foi salvo no repository novo