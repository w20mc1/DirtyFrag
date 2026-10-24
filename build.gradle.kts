plugins {
    id("com.android.application") version "9.4.0" apply false
}
android {
    buildTypes {
        getByName("debug") {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}
