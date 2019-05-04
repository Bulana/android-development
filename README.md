lets talk about the Platform Architecture. I know this form Engineering, it is the design of structures.

Structureal Design and Android lets see what voodoo is this...

Android Stack ( Structure )

    1. System and user app
    2. Android OS API in Java framework
    3. Expose native APIs, run app
    4. Expose device hardware capabilities
    5. Linux Kernel

![](Screenshot 2019-05-04 at 13.30.56.png)

System apps vs user apps
        
        1. System apps have no special status
        2. System apps provide key capabilities to app developers
        
        Example: Your app can use a system app to deliver a SMS message 
        
Java API Framework

        The entire feature-set of the Android OS is available through APIs written in the Java language. 
        
        the Framework comes with 3 main parts:
            1. View Class Hierarchy - to create UI screens
            2. Notifications manager -
            3. Activity manager - for life cycles and navigation

Android Runtime

            1. Each app runs in its own process with its own instances of the Android Runtime
            Good question to ask is, what is an Android Runtime?
            Seems this needs its own branch.
            
C/C++ Libraries

            1. Core C/C++ Libraries give access to core native Android system components and services.
            
Hardware Abstraction Layer (HAL)

            1. Standard interfaces that expose the device capabilities as libraries
            
            Example: Camera, Bluetooth module
