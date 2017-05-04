# Uncle Bob's Clean Architecture - Bootstrap for Android

This repository contains some standard boilerplate for an implementation of Uncle Bob's Clean Architecture.

# Steps to add android-clean-bootstrap on your project dependencies:

1. Add jitpack repository url in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
  
2. Add the dependency on your modules, only updating the version according to available tags ( https://github.com/felipefpx/clean-arch-bootstrap/tags ) :
```
  dependencies {
     compile 'com.github.felipefpx:android-clean-bootstrap:0.1.0'
   }
```

3. Resync Gradle and Rebuild the project.
