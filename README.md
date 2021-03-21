# parameta

#CLIENTE REST
#ingrese a la carpeta y ejecute el siguiente comando para iniciar el servicio 
#java -jar .\co-parameta-servicio-empleado-0.0.1-SNAPSHOT.jar
# el servicio responde a una petición https://localhost:9191/agregar

#tomcat Despliegue
#esta carpeta contiene un tomcat 9.0.43 con el contexto que contiene los servicios soap, el cual se depliega http://localhost:9043/webServiciosSoap/webServices/empleados?wsdl

#en la carpeta de souces se encuentran los fuentes de los servicios soap y rest.
#el proyecto de servicios soap esta construido con gradle como gestión de dependencias con una tarea que compila y despliega en el tomcat los .jar de las dependencias del proyecto
#en el paquete de servicios soap se encuentra una clase conexion con los datos de conexión a la base de datos
#ejecutar y editar la tarea copyToLib si hay cambios en el proyecto, por ejemplo la clase de conexión


#servicio SOAP
#la conexion de base de datos esta configurada a un servidor local (localhost), con puerto por defecto de mysql, base de datos con nombre parameta y tabla empleados


 