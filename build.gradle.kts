@Suppress("DSL_SCOPE_VIOLATION") // is needed to avoid a known false positive
plugins {
	alias(libs.plugins.kotlin.multiplatform)
	`maven-publish`
}

group = "com.example.mdrawz"
version = project.property("version")!!

// *************************************************************************************************************
// Dependency repositories
// *************************************************************************************************************
repositories {
	mavenLocal()
	mavenCentral()
}

kotlin {
	jvm {
		compilations.all {
			kotlinOptions.jvmTarget = libs.versions.jvm.target.get()
		}
		withJava()
		testRuns["test"].executionTask.configure {
			useJUnitPlatform()
		}
	}

	sourceSets {
		val commonMain by getting {
			dependencies{
				implementation(libs.lib1)
			}
		}
		val commonTest by getting
		val jvmMain by getting
		val jvmTest by getting
	}
}
