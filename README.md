### <center> Indicaciones para la evaluación final y obtención del certificado de aprobación. </center>
### <center> Fecha máxima de presentación 20 MARZO 2026 EVALUACION </center>

### Crear un backend enfocado a servicios REST que ofrezca solución al siguiente escenario:

<p>Se desea llevar el control de registros de matrícula de los estudiantes de una academia, para el cual se debe tener almacenado los datos de los estudiantes, 
de los cursos y los cursos que los estudiantes están matriculados.</p>

<p> Se pide crear los servicios REST para: </p>

### CRUD Estudiante 
- Id: integer 
- Nombres: string 
- Apellidos: string 
- DNI: string 
- Edad: int 

### CRUD Curso
- Id: integer
- Nombre: string
- Siglas: string
- Estado: boolean

### Registrar Matricula
#### Comprende la siguiente información.
- Fecha Mátricula: LocalDateTime
- Estudiante: Class
- DetalleMatricula: Class[] Arreglo
- Estado: boolean

### DetalleMatricula
- Curso: Class
- Aula: String

*_Listar estudiantes ordenados de forma descendente por edad usando programación funcional_ 

*_Mostrar la relación de cursos matriculados y sus estudiantes correspondientes usando programación funcional (sugerencia, usar un Map<K,V>)_

#### Ejemplo
- Programación <br>
  **Jaime Medina** 

- Base de Datos <br>
  **Mito X** <br>
  **Code Y**

#### Consideraciones:
- Usar cualquier base de datos de su preferencia
- Control de excepciones globales
- Validar los request de los servicios con **@Valid** según su preferencia
- No es obligatorio usar Spring Security y JWT

***La forma de presentar el trabajo es subir su código (CONSIDERAR EL .gitignore para no subir código innecesario) en un repositorio públicos en su cuenta de bitbucket, github, etc, para el back-end.
Enviar a*** _cursos@mitocodenetwork.com_.