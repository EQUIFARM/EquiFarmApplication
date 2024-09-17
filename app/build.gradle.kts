 plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.equifarmapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.equifarmapplication"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
    buildFeatures {
        dataBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    val koin_bom = "4.0.0-RC2"
    val room_version = "2.6.1"
    val lifecycle_version = "2.8.5"
    val material_version="1.13.0-alpha05"
    val nav_version ="2.8.0"
    val retrofit_version="2.0.11"


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.legacy.support.v4)
    implementation(libs.androidx.fragment.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
//    val kotlin_version: String by rootProject.extra
//    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version")
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


        implementation("io.insert-koin:koin-bom:$koin_bom")// Koin bom to manage all the koin library versions
        implementation("io.insert-koin:koin-android")
        implementation("io.insert-koin:koin-core-coroutines")
        implementation("io.insert-koin:koin-core")

        // Koin for testing
        testImplementation ("io.insert-koin:koin-test:3.1.2")
        testImplementation ("io.insert-koin:koin-test-junit4:3.1.2")

        // Android testing
        androidTestImplementation ("androidx.test.ext:junit:1.1.3")
        androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

        //room
        implementation ("androidx.room:room-runtime:$room_version")
        kapt ("androidx.room:room-compiler:$room_version")

        // optional - Kotlin Extensions and Coroutines support for Room
        implementation("androidx.room:room-ktx:$room_version")

        //material
        implementation ("com.google.android.material:material:$material_version")

        //navigation
        // Views/Fragments Integration
        implementation ("androidx.navigation:navigation-fragment:$nav_version")
        implementation ("androidx.navigation:navigation-ui:$nav_version")

        //lifecycle
        // ViewModel
        implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
        // LiveData
        implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

        // Annotation processor
        kapt ("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")

        //retrofit
        implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
        implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")

        //glide
        implementation ("com.github.bumptech.glide:glide:4.16.0")


}

