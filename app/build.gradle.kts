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
        viewBinding = true
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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.legacy.support.v4)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.lifecycle.viewmodel.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
//    val kotlin_version: String by rootProject.extra
//    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version")
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//   kapt ("androidx.databinding:databinding-compiler:7.3.1")

        // Koin for Android
        implementation ("io.insert-koin:koin-android:3.1.2")
        implementation ("io.insert-koin:koin-android-compat:3.1.2") // Koin AndroidX WorkManager, Navigation, Room, etc.


        // Koin for testing
        testImplementation ("io.insert-koin:koin-test:3.1.2")
        testImplementation ("io.insert-koin:koin-test-junit4:3.1.2")

        // Android testing
        androidTestImplementation ("androidx.test.ext:junit:1.1.3")
        androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    dependencies {
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        dependencies {
            // AndroidX Core
            implementation ("androidx.core:core-ktx:1.9.0")

            // AppCompat
            implementation ("androidx.appcompat:appcompat:1.5.1")

            // Material Design
            implementation ("com.google.android.material:material:1.7.0")

            // ConstraintLayout
            implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

            // ViewModel
            implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")

            // LiveData
            implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")

            // Lifecycle extensions (optional)
            implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

            // Data Binding Compiler
//            kapt ("com.android.databinding:compiler:7.3.1")

            // Coroutine Support
            implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
            implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

            // Testing
            testImplementation ("junit:junit:4.13.2")
            androidTestImplementation ("androidx.test.ext:junit:1.1.4")
            androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.0")
            dependencies {
                // Other dependencies

                // Navigation component
                implementation ("androidx.navigation:navigation-fragment-ktx:2.7.0")
                implementation ("androidx.navigation:navigation-ui-ktx:2.7.0")

                // Optional: for Safe Args (recommended)
                // implementation "androidx.navigation:navigation-safe-args-plugin:2.7.0"
            }

// Apply the Safe Args plugin (optional but recommended for type-safe navigation)

        }
    }

}

