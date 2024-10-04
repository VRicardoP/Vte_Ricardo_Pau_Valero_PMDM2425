# 1. Análisis de la estructura del proyecto

Se trata de una aplicación Android nativa. Está desarrollada específicamente para dispositivos Android utilizando el SDK de Android y el lenguaje de programación Kotlin. Cada carpeta y archivo tiene un propósito específico y se organiza de manera jerárquica para facilitar la gestión del proyecto:

## Estructura General:

### Nivel raíz:
Contiene archivos de configuración general del proyecto, como:
- `build.gradle`: Para configurar el proyecto completo.
- `settings.gradle`: Para configurar los módulos.

### Módulo `app`:
Es donde se encuentra el código fuente de la aplicación en sí. Dentro de este módulo están las siguientes carpetas y archivos clave:

- **`AndroidManifest.xml`**: Este archivo describe los componentes de la aplicación (actividades, servicios, etc.), los permisos que necesita, y otras configuraciones generales de la app.
- **`java`**: Contiene el código fuente de la aplicación escrito en Kotlin.
- **`res`**: Almacena los recursos de la aplicación, como:
  - **`layout`**: Contiene los archivos XML que definen el diseño de las pantallas (layouts).
  - **`drawable`**: Contiene los gráficos y otros recursos dibujables.
  - **`mipmap`**: Contiene los iconos de la aplicación para diferentes densidades de pantalla.
  - **`values`**: Contiene archivos XML para definir valores como cadenas, colores, estilos, etc.
- **Gradle Scripts**: Contienen los scripts de Gradle para configurar la compilación de la aplicación.

## Archivos y Carpetas Importantes:

- **`AndroidManifest.xml`**: Es el archivo central de configuración de la aplicación.
- **`activity_main.xml`**: Es un archivo de layout que define el diseño de la pantalla principal de la aplicación.
- **`MainActivity.kt`**: Es el archivo que contiene la lógica de la actividad principal, es decir, el código que se ejecuta cuando se inicia la aplicación.
- **`MostraComptadorActivity.kt`**: Es otra actividad en la aplicación.
- **`res/drawable`**: Contiene los iconos y otros gráficos utilizados en la aplicación.
- **`res/layout`**: Contiene los diseños de todas las pantallas de la aplicación.
- **`res/values`**: Contiene los valores de cadena, colores y estilos utilizados en la aplicación.
- **`build.gradle`**: Configura cómo se construye la aplicación.
- **`gradle.properties`**: Contiene propiedades del proyecto.


## Análisis de la Actividad Principal (MainActivity)

### Funcionalidad:

Esta actividad principal de la aplicación "Comptador" se encarga de gestionar un contador simple. Permite al usuario ver el valor del contador y aumentarlo. Además, tiene un botón que abre otra actividad ("MostraComptadorActivity").

### Ficheros implicados:

- **`MainActivity.kt`**: Este fichero contiene el código fuente escrito en Kotlin que define el comportamiento de la actividad principal.
- **`activity_main.xml`**: Este fichero define el diseño de la interfaz de usuario de la actividad principal utilizando el lenguaje de diseño XML.
- **`AndroidManifest.xml`**: Este fichero especifica las diferentes actividades que tiene la aplicación.

### ¿Si quisiera añadir una nueva Actividad, sería suficiente crear el fichero de layout y el fichero kotlin con la Classe?

Sí, para añadir una nueva actividad necesitarás crear dos ficheros:

- **Fichero Kotlin**: Donde se definirá el comportamiento de la nueva actividad (su lógica).
- **Fichero Layout XML**: Un nuevo fichero XML que defina el diseño de la interfaz de usuario de la nueva actividad utilizando un layout.

Pero no hay que olvidar añadir la nueva actividad al fichero **`AndroidManifest.xml`**.

## 2. Análisis del Ciclo de Vida

Para poder realizar un seguimiento del ciclo de vida se han añadido etiquetas en el código para poder visualizar en el Log de la aplicación el paso de los métodos por los que pasa la aplicación. A continuación se ha iniciado la aplicación y se ha realizado una serie de pasos para ver su ciclo de vida, estos han sido:

1. Inicio de la aplicación.
2. Incremento de la variable en pantalla.
3. Cambio de aplicación, quedando esta en segundo plano.
4. Restauración de la aplicación a primer plano.
5. Giro de pantalla (pérdida del contenido de la variable en la aplicación).
6. Giro de la pantalla a su posición vertical.
7. Cierre de la aplicación.

### Resultado del log:

```
...
Ejecutando OnCreate
Accessing hidden method Landroid/view/ViewGroup;->makeOptionalFitsSystemWindows()V (unsupported, reflection, allowed)
Compat change id reported: 210923482; UID 10192; state: ENABLED
Ejecutando OnStart
Ejecutando OnResume
Compat change id reported: 237531167; UID 10192; state: DISABLED
Unknown dataspace 0
Skipped 53 frames!  The application may be doing too much work on its main thread.
Failed to choose config with EGL_SWAP_BEHAVIOR_PRESERVED, retrying without...
Failed to initialize 101010-2 format, error = EGL_SUCCESS
mapper 4.x is not supported
Unable to match the desired swap behavior.
Davey! duration=1382ms; Flags=1, FrameTimelineVsyncId=46363, IntendedVsync=76817402237386, Vsync=76818285570684, InputEventId=0, HandleInputStart=76818292743358, AnimationStart=76818293019468, PerformTraversalsStart=76818293657488, DrawStart=76818675780271, FrameDeadline=76817418904052, FrameInterval=76818291087661, FrameStartTime=16666666, SyncQueued=76818748264038, SyncStart=76818753838105, IssueDrawCommandsStart=76818755122792, SwapBuffers=76818777852599, FrameCompleted=76818790027108, DequeueBufferDuration=16651, QueueBufferDuration=1933704, GpuCompleted=76818789862404, SwapBuffersCompleted=76818790027108, DisplayPresentTime=0, CommandSubmissionCompleted=76818777852599, 
Installing profile for com.pmdm.ieseljust.comptador
app_time_stats: avg=19799.36ms min=10.64ms max=158111.78ms count=8
Ejecutando OnPause
app_time_stats: avg=2108.79ms min=3.55ms max=41638.80ms count=20
Ejecutando OnStop
Ejecutando OnSaveInstanceState
Ejecutando OnRestart
Ejecutando OnStart
Ejecutando OnResume
Unable to match the desired swap behavior.
Ejecutando OnPause
Ejecutando OnStop
Ejecutando OnSaveInstanceState
Ejecutando OnDestroy
sendCancelIfRunning: isInProgress=falsecallback=android.view.ViewRootImpl$$ExternalSyntheticLambda17@eb81694
Ejecutando OnCreate
Ejecutando OnStart
Ejecutando OnRestoreInstanceState
Ejecutando OnResume
Skipped 70 frames!  The application may be doing too much work on its main thread.
Unable to match the desired swap behavior.
Skipped 57 frames!  The application may be doing too much work on its main thread.
Davey! duration=2178ms; Flags=1, FrameTimelineVsyncId=53881, IntendedVsync=77051968894670, Vsync=77053135561290, InputEventId=0, HandleInputStart=77053158697384, AnimationStart=77053158826382, PerformTraversalsStart=77053158944386, DrawStart=77053607957720, FrameDeadline=77051985561336, FrameInterval=77053151943599, FrameStartTime=16666666, SyncQueued=77054029908735, SyncStart=77054042592377, IssueDrawCommandsStart=77054043008756, SwapBuffers=77054070889832, FrameCompleted=77054160059862, DequeueBufferDuration=133895, QueueBufferDuration=3354006, GpuCompleted=77054160059862, SwapBuffersCompleted=77054135008955, DisplayPresentTime=0, CommandSubmissionCompleted=77054070889832, 
Davey! duration=1071ms; Flags=0, FrameTimelineVsyncId=54294, IntendedVsync=77053202227954, Vsync=77054152227916, InputEventId=0, HandleInputStart=77054165513443, AnimationStart=77054165543681, PerformTraversalsStart=77054177304258, DrawStart=77054179013158, FrameDeadline=77054185561248, FrameInterval=77054161772414, FrameStartTime=16666666, SyncQueued=77054209814101, SyncStart=77054209993594, IssueDrawCommandsStart=77054210667618, SwapBuffers=77054237580071, FrameCompleted=77054273567488, DequeueBufferDuration=343176, QueueBufferDuration=2257952, GpuCompleted=77054273567488, SwapBuffersCompleted=77054250947078, DisplayPresentTime=0, CommandSubmissionCompleted=77054237580071, 
Ejecutando OnPause
Ejecutando OnStop
Ejecutando OnSaveInstanceState
Ejecutando OnDestroy
sendCancelIfRunning: isInProgress=falsecallback=android.view.ViewRootImpl$$ExternalSyntheticLambda17@10a4fc2
Ejecutando OnCreate
Ejecutando OnStart
Ejecutando OnRestoreInstanceState
Ejecutando OnResume
Unable to match the desired swap behavior.
Davey! duration=764ms; Flags=1, FrameTimelineVsyncId=55032, IntendedVsync=77059618894364, Vsync=77060068894346, InputEventId=0, HandleInputStart=77060076208511, AnimationStart=77060076255136, PerformTraversalsStart=77060076666739, DrawStart=77060240923264, FrameDeadline=77059635561030, FrameInterval=77060074948438, FrameStartTime=16666666, SyncQueued=77060368048051, SyncStart=77060370234072, IssueDrawCommandsStart=77060370408254, SwapBuffers=77060372563525, FrameCompleted=77060385888184, DequeueBufferDuration=31215, QueueBufferDuration=655775, GpuCompleted=77060385888184, SwapBuffersCompleted=77060377774694, DisplayPresentTime=0, CommandSubmissionCompleted=77060372563525, 
Ejecutando OnPause
app_time_stats: avg=3236.00ms min=3.62ms max=41735.57ms count=13
Cleared Reference was only reachable from finalizer (only reported once)
Ejecutando OnStop
Ejecutando OnDestroy
sendCancelIfRunning: isInProgress=falsecallback=android.view.ViewRootImpl$$ExternalSyntheticLambda17@f2d38bf
```
El log muestra cómo la aplicación pasa por todas las fases del ciclo de vida de la actividad, desde el inicio hasta la destrucción.
El log indica que la aplicación comenzó correctamente. Primero, se ejecuta el método onCreate(), que configura la interfaz de usuario, seguido por onStart() que prepara la actividad para mostrarse al usuario y finalmente onResume(), cuando la actividad entra en el estado interactivo. En este momento se incrementa el valor de la variable.
Cuando la aplicación pasa a segundo plano, se registra la ejecución de onPause(), lo que indica que la actividad está a punto de perder el foco. Luego, onStop() confirma que la actividad ya no es visible, y onSaveInstanceState() guarda el estado actual de la aplicación, como el valor del contador, antes de que sea pausada o destruida.
Al volver a la aplicación, se ve cómo se ejecutan los métodos onRestart(), onStart(), y onResume(). Esto indica que la actividad fue retomada desde el estado detenido (pero no destruido), restaurando su visibilidad e interactividad.
Al girar la pantalla, el ciclo de vida se reinicia debido a la recreación de la actividad para adaptarse a la nueva orientación. Esto implica que la actividad se detiene (onPause() y onStop()), se guarda su estado (onSaveInstanceState()), y se destruye (onDestroy()). Luego, la actividad se vuelve a crear con onCreate(), se restaura el estado guardado en onRestoreInstanceState(), y vuelve a estar activa (onResume()). Sin embargo, la variable no se restauró correctamente tras el giro de pantalla.
Al girar la pantalla nuevamente a su posición original, se repite el ciclo de vida completo. La actividad se recrea para reflejar los cambios de configuración.
Al cerrar la aplicación, el ciclo de vida finaliza con onPause(), onStop(), se guarda el estado de la aplicación con onSaveInstanceState() por última vez, y la actividad es destruida con onDestroy().

## El Problema de la pérdida de estado.
El giro de la pantalla provoca la recreación de la actividad, lo cual es esperado. Sin embargo, la pérdida de la variable está ocurriendo porque no se está guardando ni restaurando en onSaveInstanceState() y onRestoreInstanceState().

# 3. Solución al problema de la pérdida de estado.
Se añade el siguiente código:

**Guardar el estado del contador:**

En `onSaveInstanceState()`, se guarda el valor del contador (`comptador`) en el `Bundle` utilizando `outState.putInt(STATE_COMPTADOR, comptador)`.

**Restaurar el estado del contador:**

En `onRestoreInstanceState()`, se restaura el valor de `comptador` usando `savedInstanceState.getInt(STATE_COMPTADOR, 0)`, y luego se actualiza el `TextView` correspondiente.

**Comprobar si hay algún estado guardado (después del onCreate).**
Con un if comprobamos si hay algún estado de alguna instancia salvada y de haberlo cargamos el valor guardado.

# 4. Añadir funcionalidad para restar y reset.

Para añadir las dos funcionalidades se ha hecho siguiendo el mismo código que para el botón sumar.
En el fichero activity_mail.xml se ha añadido el siguiente código:
```
<Button
        android:id="@+id/btSubtract"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="-"
        android:textSize="34sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/btReset"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textViewComptador" />

<Button
    android:id="@+id/btReset"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="0"
    android:textSize="34sp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toStartOf="@+id/btAdd"
    app:layout_constraintStart_toEndOf="@+id/btSubtract"
    app:layout_constraintTop_toBottomOf="@+id/textViewComptador" />
```

Mientras que en el archivo MainActivity.kt se han añadido las variables y la lógica para modificar la variable:
```
val btSubtract = findViewById<Button>(R.id.btSubtract)
        val btReset = findViewById<Button>(R.id.btReset)

btSubtract.setOnClickListener {
    comptador--
    textViewContador.text = comptador.toString()
}

btReset.setOnClickListener {
    comptador = 0
    textViewContador.text = comptador.toString()
}
```

# 5. Aplicar el View Binding
**Activar el ViewBinding en las buildFeatures del script Gradle del módulo.**
Dentro de build.gradle.kts (Module: app) añadimos el View Binding:

```
buildFeatures {
        viewBinding = true
    }
```
    
**Importar la clase de binding generada:**
com.pmdm.ieseljust.comptador.databinding.ActivityMostraComptadorBinding es la clase generada automáticamente por el sistema de ViewBinding a partir del archivo activity_mostra_comptador.xml, la cual importamos en el archivo MostraComptadorActivity.kt

```
import com.pmdm.ieseljust.comptador.databinding.ActivityMostraComptadorBinding
```

**Inicializar el binding:**
Dentro de override fun onCreate(savedInstanceState: Bundle?) {} añadimos
binding = ActivityMostraComptadorBinding.inflate(layoutInflater) que crea una instancia de la clase de binding inflando la vista.

**Modificar setContentView:**
Cambiamos setContentView para usar binding.root, que es la raíz del layout vinculado.
setContentView(binding.root)

**Acceder a los elementos de la UI:**
En lugar de usar findViewById, ahora accedemos a los elementos de la interfaz de usuario a través del objeto binding:

```
// Referencia al TextView (sin findViewById)
val textViewContador = binding.textViewMostraComptador

// Referencia al botón (sin findViewById)
val btBack = binding.btBack
```

