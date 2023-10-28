plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
apply(plugin ="kotlin-android")
apply (plugin= "kotlin-kapt")
apply (plugin= "kotlin-parcelize")

android {
    namespace = "com.switchcasetech.mentalmatch"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.switchcasetech.mentalmatch"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.android.support:multidex:1.0.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //AndroidX Capable


    //Modules
    implementation(project(":domain"))
    implementation(project(":data"))

    //di
    implementation("io.insert-koin:koin-android:3.4.2")


}