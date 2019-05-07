This is where we discuss topics covered in the android developer site (developer.android.com)
-
Starting off with App Basics.

Apps provide multiple entry points discussion 
-
Apps are a commbination of components.

1. Activity Component

    An Activity is a type of app component that provides a user interface. Ok. 
    
    The Main Activity is what starts when user taps app icon, but can be directed to other activities later.

2. Broadcast Recievers and Services Components

    Allow app to perform background tasks and without a user interface. This should be were concurrency is applied.  


 Adapt to different devices discussion
-

True, but how they ADAPT?...
        
Android allows you to provide different resources for different devices. For example, you can create different layouts for different screens. The system will determine which layout to use based on the current devices screen size.
    
The app can query whether the device has hardware for a feature. Example, the camera, at runtime you can check if the device has the camera and the disable the feature if response if false.
    
I think, you first check before using features...
Some features can be set as required.
    

    
    

