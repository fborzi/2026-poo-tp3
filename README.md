# 2026-poo-tp3
Repositorio educativo para la materia Desarrollo de Sistemas Orientado a Objetos con la
finalidad de poner en práctica la teoria vista en clase.

---

## <i>Trabajo Práctico 1</i>

### Requisitos:
- Tener instalado Java 25.
- Tener instalado un IDE como IntelliJ.
- Tener instalado Git en su máquina local.
- Tener instalado Git Bash.
- Tener una cuenta en GitHub.
- Solicitar acceso de escritura al repositorio mediante su usuario.
- Trabajar dentro de la carpeta `/src` del repositorio clonado.

### Objetivos:
- Poner en práctica la teoría vista en clase.
- Trabajar con Git y GitHub llevado a un entorno real.
- Escribir el código según las convenciones de Java y aplicar la documentación correspondiente.

---
### Formato de trabajo:
#### En GitHub:
1. Solicitar acceso de escritura al repositorio mediante su usuario.
2. Crear una rama nueva a partir de la rama `main` con el siguiente formato:
    - `feature/<apellido-nombre>`. Por ejemplo: `feature/borzi-franco`.

#### En su máquina local:
1. Elegir la carpeta donde se va a trabajar y por consiguiente clonar el repositorio.
    - Por ejemplo: `C:\Users\francoborzi\Documents\TecnicaturaSoftware\segundo\poo\tp3`.
2. Abrir Git Bash en la carpeta elegida.
    - <i>Dentro de la carpeta, hacer clic derecho y seleccionar "Git Bash Here".</i>
3. Ejecutar los siguientes comandos en Git Bash:
    - Clonar el repositorio en su máquina local mediante el siguiente comando:
        - `git clone https://github.com/fborzi/2026-poo-tp3.git`.
    - Moverse a la rama feature creada anteriormente mediante el siguiente comando:
        - `git checkout feature/<apellido-nombre>`.
4. Abrir la carpeta del repositorio clonado con el IDE.
5. Trabajar dentro de la carpeta `/src` del repositorio clonado.

#### Modo de trabajo con Git:
Al finalizar la resolución de cada ejercicio, se deberá:
1. Guardar los cambios realizados en los archivos.
2. Abrir Git Bash en la carpeta del repositorio clonado.
3. Ejecutar los siguientes comandos en Git Bash:
    - `git status` para verificar los archivos modificados.
    - `git add .` para agregar todos los archivos modificados.
    - `git commit -m "Mensaje descriptivo del commit"` para crear un commit con los cambios realizados. **Es importante explicar brevemente de que va el ejercicio, evitar colocar commits que digan solo "Ejercicio 1 resuelto" o similares.**
    - `git push origin feature/<apellido-nombre>` para subir los cambios a la rama feature en GitHub.
4. Estos pasos se deberán seguir para cada ejercicio resuelto.

### Formato de entrega:
Para cumplir con la entrega del TP3, se deberá:
- Finalizar la resolución de todos los ejercicios propuestos.
- Asegurarse de que todos los cambios estén subidos a la rama feature en GitHub.
- Verificar que el código pase correctamente las evaluaciones hechas en GitHub Actions.

---
## El trabajo se aprueba con un 60%
### Criterios de evaluación:
- Se evaluará el correcto funcionamiento del código mediante pruebas automáticas en GitHub Actions.
- Se evaluará la correcta aplicación de las convenciones de Java y la documentación del código.
- Se evaluará que los commits tengan mensajes descriptivos y claros.
- Se evaluará que el trabajo haya sido entregado en la fecha pautada.
