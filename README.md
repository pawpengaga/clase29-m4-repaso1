# Clase 29 Modulo 4

Primer proyecto de repaso.

### Descripción del enunciado

Desarrolla un sistema de envíos en Java que permita gestionar el envío de paquetes desde un origen a un destino. El sistema debe incluir las siguientes características:
- Paquete: Cada paquete debe tener un identificador único, peso, dimensiones, dirección de origen y destino.
- Cliente: Cada cliente debe tener un nombre, dirección y un historial de envíos.
- Envío: Un envío asocia un paquete con un cliente y una fecha de envío.
- Tarifas: El sistema debe calcular el costo de un envío en función del peso, dimensiones y distancia entre el origen y el destino.
- Seguimiento: Los clientes deben poder rastrear el estado de sus envíos (en tránsito, entregado, etc.).

#### Funcionalidades a Implementar:
- Crear paquetes: Permitir crear nuevos paquetes con sus respectivas características.
- Registrar clientes: Permitir registrar nuevos clientes con su información de contacto.
- Realizar envíos: Asociar un paquete a un cliente y generar un nuevo envío.
- Calcular tarifas: Implementar una lógica para calcular el costo de un envío en función de las tarifas de la empresa.
- Seguimiento de envíos: Permitir a los clientes consultar el estado de sus envíos.
- Generar reportes: Generar reportes con información sobre los envíos realizados, clientes, etc.