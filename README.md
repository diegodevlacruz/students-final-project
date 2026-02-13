### <center> Indicaciones para la evaluación final y obtención del certificado de aprobación. </center>
### <center> Fecha máxima de presentación 20 MARZO 2026 EVALUACION </center>

### Crear un backend enfocado a servicios REST que ofrezca solución al siguiente escenario:

<p>Se desea llevar el control de registros de matrícula de los estudiantes de una academia, para el cual se debe tener almacenado los datos de los estudiantes, 
de los cursos y los cursos que los estudiantes están matriculados.</p>

<p> Se pide crear los servicios REST para: </p>

### CRUD Estudiante - Student
- Id - idStudent: Integer 
- Nombres - name: String 
- Apellidos - lastname: String 
- DNI - identityCard: String 
- Edad - age: int 

### CRUD Curso - Course
- Id - idCourse: integer
- Nombre - name: String
- Siglas - acronym: String
- Estado - status: boolean

### Registrar Matricula - Register Enrollment
#### Comprende la siguiente información.
- Fecha Mátricula - enrollmentDate: LocalDateTime
- Estudiante - Student: Class
- DetalleMatricula - RegisterEnrollment: Class[] Arreglo
- Estado - status: boolean

### Detalle Matricula - Register Details
- Curso - Course: Class 
- Aula - Classroom: String

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