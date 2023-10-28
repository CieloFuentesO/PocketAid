plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies{
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:${project.property("kotlinVersion")}")
    implementation ("com.android.support:multidex:1.0.3")

    //di
    implementation("io.insert-koin:koin-core:3.4.2")
}