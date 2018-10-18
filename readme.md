# Ejemplo de seguridad básica en una api rest con SpringBoot

Para probarlo simplemente descarga el código y ejecuta en un terminal situado en la carpeta del proyecto
```bash
    mvn spring-boot:run
```
Luego usa las siguientes URL desde postman:
* [localhost:8090/api/hello](localhost:8090/api/hello)
* [localhost:8090/api/admin/hello](localhost:8090/api/admin/hello)

Los usuarios son:
* admin
    * **Contraseña**  => admin
    * **Rol**  => admin
* suso
    * **Contraseña**  => suso
    * **Rol**  => user