This is where we discuss App Android Fundamentals.

What is an Android app?
-
        1. One or more interactive screens
        2. Written using Java Programming Language and XML
        3. Uses the Android Software Development Kit (SDK)
        4. Uses Android libraries and Android Application Framework 
        5. Executed by Android Runtime Virtual machine (ART)
        
Challenges of Android development
-
        1. Multiple screen sizes and resolutions
        2. Performance: make your apps responsive and smooth 
        3. Security: keep source code and user data safe
        4. Compatibility: run well on older platform versions 
        5. Marketing: 
        
App Building Blocks
-
        1. Resources: layouts, images, strings, colors as XML and media files
        2. Components: activities, services, and Helper classes as java code
        3. Manifest: information about thet app for the runtime
        4. Build configuration: APK versions in Gradle config files
    
What languages can Android be written with?
-
        1. Java
        2. Kotlin
        3. C++

APK?
-
        The Android SDK tools compile your code along with any data and resource files into an APK, an android package, which in an archive file with an .apk suffic.
        One APK file contains all the contents of an Android app and is the file tht Androipowered devices use to install the app.

Android Security sandBox?
-
        -The Android OS is a multi-user Linux system in which each app is a different user. Ok
        
        -By default, the system assigns each app a unique Linux user ID (the ID is used only by the system and is unknown to the app). The system sets permissions for all the files in the app so that only the user ID assigned to that app can access them.
        
        -Each process has its own virtual machine (VM), so an app's code runs in isolation from the apps.
        
        -By default, every app runs in its own Linux process. The Android System starts the process when any of the app's components need to be executed, and then shuts down the process when its no longer needed or when the system must recover memory for other apps.

Least Previlege
-
        Each app, by default, has access only to the components that it requires to do its work and no more.
        This creates a very secure environment in which an app cannot access parts of the system for which it is not given permission. 
        
        However there are ways for an app to share data with other apps and for an app to access system services.

...


App Components
-

        App components are building blocks of the Android app.
        Each component is an entry point through which the system or user can enter the app. Some components depend on others.
        
Four Types of Components 
- 
        1. Activities
        2. Services
        3. Broadcast Recievers
        4. Content Providers
        
Activities 
-
        -Entry point for interacting with user.
        
        -Represents a single screen 
        
        Example, the email app. 
            an email app might have one activity that shows a list of new emails, another activity to compose an email, and another activity for reading 
        -Activities are independent of each other
        

Activities Facilitation between system and app interactions
-
        
        -Keeps track of what the user currently cares about (what is on screen) to ensure that the system keeps running the process that is the activity

        -Knowing that previously used processes contain things the user may return to (stopped activities), and thus more highly prioritize keeping those processes around.

        -helping the app handle having its process killed so the user can return to activities with their previous state restored

        -Providing a way for apps to implement user flows between each other, and for the system to coordinate these flows. (The most classic example here being share)

Services 
-
        -A Service is a general-purpose entry point for keeping an app running in the background for all kind of reasons.
        
        -A component that runs in the background to perform long-running operations or to perform work for remote processes.
        
        -No UI provided
        
        -Example, a service might play music in the background while the user is in a different app, or it might fetch data over the network without blocking user interactions with an activity. 
        
Two Service sematics for managing an app 
- 
        1. To sync data in the background or 
            1.1 This also starts two more services,  
        
        2. Play music even after the user leaves the app.
            2.1 This laso starts two more services, 
        
