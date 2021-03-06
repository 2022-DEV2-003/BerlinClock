# The Berlin Clock
## Rules

The Berlin Clock (Mengenlehreclock or Berlin Uhr) is a clock that tells the time using a series of illuminated coloured blocks, as you can see in the picture for this project.

The top lamp blinks to show seconds- it is illuminated on even seconds and off on odd seconds.

The next two rows represent hours. The upper row represents 5 hour blocks and is made up of 4 red lamps. The lower row represents 1 hour blocks and is also made up of 4 red lamps.

The final two rows represent the minutes. The upper row represents 5 minute blocks, and is made up of 11 lamps- every third lamp is red, the rest are yellow. The bottom row represents 1 minute blocks, and is made up of 4 yellow lamps.

### Building the app
To build the app, you can use the build/run option in Android Studio, or build directly from the command line if you prefer.

    git clone https://github.com/2022-DEV2-003/BerlinClock.git
    cd BerlinClock
    export ANDROID_SDK_ROOT=<path_to_android_sdk>
    ./gradlew build
### Installing the app
    ./gradlew installDebug
### Running Unit Tests
    ./gradlew test
HTML test result files: `app/build/reports/tests/` directory.
### Running Instrumentation Tests
    ./gradlew connectedAndroidTest
HTML test result files: `app/build/reports/androidTests/connected/` directory.
