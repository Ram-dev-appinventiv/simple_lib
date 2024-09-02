import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.vanniktech.maven.publish") version "0.29.0" apply false
    id("maven-publish")

}

android {
    namespace = "com.app.filters"
    compileSdk = 34

    defaultConfig {

        minSdk = 24
        targetSdk = 34


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

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}

  mavenPublishing {
    coordinates("com.app.filters", "filters", "1.0.0")

    pom {
        name.set("filters")
        description.set("Filtration is a physical process that separates solid matter and fluid from a mixture.")
        inceptionYear.set("2024")
        url.set("https://github.com/Ram-dev-appinventiv/simple_lib")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("ram.naresh1@appinventiv.com")
                name.set("Ram Naresh")
                url.set("https://github.com/Ram-dev-appinventiv/")
            }
        }
        scm {
            url.set("https://github.com/Ram-dev-appinventiv/simple_lib/")
            connection.set("scm:git:git://github.com/Ram-dev-appinventiv/simple_lib.git")
            developerConnection.set("scm:git:ssh://git@github.com/Ram-dev-appinventiv/simple_lib.git")
        }
        publishToMavenCentral(SonatypeHost.DEFAULT, automaticRelease = true)
    }
}

/*
// Maven Publishing
publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.app.filters"
            artifactId = "filters"
            version = "1.0.0"

            from(components["release"])

            pom {
                name.set("filters")
                description.set("Filtration is a physical process that separates solid matter and fluid from a mixture.")
                inceptionYear.set("2024")
                url.set("https://github.com/Ram-dev-appinventiv/simple_lib")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        distribution.set("repo")
                    }
                }
                developers {
                    developer {
                        id.set("ram.naresh1@appinventiv.com")
                        name.set("Ram Naresh")
                        url.set("https://github.com/Ram-dev-appinventiv/")
                    }
                }
                scm {
                    url.set("https://github.com/Ram-dev-appinventiv/simple_lib/")
                    connection.set("scm:git:git://github.com/Ram-dev-appinventiv/simple_lib.git")
                    developerConnection.set("scm:git:ssh://git@github.com/Ram-dev-appinventiv/simple_lib.git")
                }
            }
        }
    }
}*/
