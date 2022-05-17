# Proyecto Base Implementando Clean Architecture

## Inicio

Proyecto de practica para ensayar reactive-commons con la arquitectura de bancolombia.

Lee el art�culo [Clean Architecture � Aislando los detalles](https://medium.com/bancolombia-tech/clean-architecture-aislando-los-detalles-4f9530f35d7a)

# Arquitectura

![Clean Architecture](https://miro.medium.com/max/1400/1*ZdlHz8B0-qu9Y-QO3AXR_w.png)

#Mensaje de prueba (In)

```JSON
{
"name": "event.listener.queue",
"eventId": "eeb647c0-74c1-4d97-8d7d-af2204ae118a",
"data": {
  "message": "3125894678"
  }
}
```

#Introduccion

el MS recibe un mensaje de entrada para el registro correspondiente del inventario de licores, interactuando con otras collecciones de mongo para una mejor complementacion entre los datos

Se tendra eventos(Rabbit) collecciones(Mongo) modelos y controladores:


#Modelos
LiquorOrder

