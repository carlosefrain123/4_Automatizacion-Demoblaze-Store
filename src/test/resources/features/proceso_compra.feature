Feature: Proceso completo de compra
  @ProcesoCompra @CasoExitoso
  Scenario Outline: Iniciar sesión, elegir un artículo e ir al cesto
    Given el cliente visita el portal de la tienda online
    And el usuario pulsa el enlace para iniciar sesión
    And digita las credenciales usuario "<usuario>" y clave "<clave>"
    Then el usuario confirma el ingreso al sistema
    And se valida que la sesión quedó activa
    When elige el artículo "<articulo>"
    Then el artículo queda incorporado al cesto
    And el usuario se dirige al cesto de compras

    Examples:
      |usuario         |clave   |articulo           |
      |carlitos2026qa  |pass123 |Samsung galaxy s6  |