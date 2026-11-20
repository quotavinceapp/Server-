plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "it.mioserver"
    compileSdk = 34
    defaultConfig {
        applicationId = "it.mioserver.cloud"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    implementation("org.nanohttpd:nanohttpd:2.3.1")
    implementation("androidx.work:work-runtime-ktx:2.9.0")
}
