# Random Words Android App

Android aplikacija za generiranje nasumičnih riječi.

## Značajke
- Generiranje nasumičnih riječi od 2 do 7 slova
- Korištenje hrvatskog alfabeta (uključujući č, ć, đ, š, ž)
- Opcija za razmak nakon slučajnog slova
- Automatski razmaci nakon 2. i 4. slova

## Kako buildati

### Preduvjeti
- Android Studio Arctic Fox ili noviji
- JDK 8 ili noviji
- Android SDK (API 21+)

### Koraci
1. Otvori projekt u Android Studiu
2. Pričekaj da Gradle sinkronizira dependencies
3. Spoji Android uređaj ili pokreni emulator
4. Klikni na "Run" (zelena strelica) ili pritisni Shift+F10

## Alternativno: Build preko command line

```bash
# U glavnom direktoriju projekta
gradlew assembleDebug

# APK će biti u: app/build/outputs/apk/debug/app-debug.apk
```

## Instalacija APK-a na uređaj

```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

## Minimalni zahtjevi
- Android 5.0 (API 21) ili noviji


