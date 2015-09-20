# ADRepasoJava2
Acceso a Datos - Repaso java Ejercicio 2




1.  Crea unha clase Vehiculo coas propiedades que establecen a cor do vehículo, o número de rodas que utiliza, a cilindrada que ten e a potencia que ofrece. Ademais contará cos métodos e constructores que se considere necesarios.
A clase derivada Camion establece unha nova propiedade que indique o número de eixes que posúe o camión, xunto ós constructores e métodos que se consideren adecuados.
A clase derivada Motocicleta contén unha propiedade que albergue o número de ocupantes permitido que pode transportar cada motocicleta.
Finalmente, implementa unha clase ProbaVehiculos que realice o seguinte:
Cree unha motocicleta asignándolle no momento de creala cor roxa, cilindrada 125 e potencia 25.
Cree unha motocicleta asignándolle no momento de creala cor verde, cilindrada 125, potencia 25 e numero de prazas 2.
Cree un camión asignándolle no momento de crealo cor azul, número de rodas 4, número de eixos 2, cilindrada 4000 e potencia 300.
Cree un camión asignándolle no momento de crealo número de rodas 24, número de eixos 6 e cilindrada 15000.
Establece o número de prazas da primeira moto creada como 1.
Mostra por pantalla a cilindrada da segunda moto creada.
Asígnalle ó segundo camión creado unha potencia de 800.
Mostra os valores de tódalas propiedades de cada unha das motocicletas e camións creados.

2.  Modifica o exercicio anterior de maneira que agora Vehiculo sexa unha clase abstracta, e teña ademais dos anteriores métodos un de nome imposto, que devolve o imposto que ten que pagar o vehículo e defínese en cada unha das subclases da seguinte maneira:
Na clase Camion o imposto calcúlase como: cilindrada / 30 + potencia * 20 + numero de rodas * 20 + numero de eixes * 50.
Na clase Motocicleta o imposto calcúlase como: cilindrada / 30 + potencia + 30.
No método main, aparte das funcións xa implementadas no exercicio anterior, mostra por pantalla que imposto terán que pagar cada unha das motocicletas e cada un dos camións creados.
