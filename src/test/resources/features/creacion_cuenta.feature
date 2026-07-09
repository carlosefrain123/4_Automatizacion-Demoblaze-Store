Feature: Creación de cuenta
  @AltaUsuario @CasoExitoso
  Scenario Outline: Registrar un nuevo cliente
    Given el cliente ingresa al portal de la tienda online
    When completa el formulario de alta con usuario "<usuario>" y clave "<clave>"
    Then el sistema confirma la creación de la cuenta

    Examples:
      |usuario         |clave   |
      |carlitos2026qa  |pass123 |