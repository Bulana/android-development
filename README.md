This is will be dedicated to discussion on how an the Android project gets created. 

1. So, installations must be in check. 

2. Choose Activities, its best to choose Empty Activity for template code.

3. Give names

4. What gets created?

Four files get created, one is .java or .kt file and the other two are xml files and one gradle file.
        
        1. app > java > com.example.myfirstapp > MainActivity
        2. app > res > layout > activity_main.xml
        3. app > manifests > AndroidManifest.xml
        4. Gradle Scripts > build.gradle
        
The MainActivity:

    This is the main activity, the entry point for the app.
    
    When you build and run the app, the system launches an INSTANCE of the ACTIVITY CLASS and loads its layout.
    So, the app is the live instance object of the class activity which is subclass to AppCompatActivity. 
    Wait, AppCompactActivity?
    
    This the base class for all activities
    
        public class AppCompatActivity 
        
        extends FragmentActivity implements AppCompatCallback, TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.DelegateProvider
    
        java.lang.Object
            ↳    android.content.Context
                ↳    android.content.ContextWrapper
                    ↳    android.view.ContextThemeWrapper
                        ↳    android.app.Activity
                            ↳    android.support.v4.app.FragmentActivity
                                ↳    android.support.v7.app.AppCompatActivity
    
    Wait, extends and implements?
    
    extends is for extending a class, like extending a house. The class exists, you just add more attributes and functions elsewhere in the project, not on the original class file. 
    
    implements is for implementing an interface...wait, interface?
    
    An interface is a Protocol swift speaking. Interfaces have no implementations, only implemeting classes can implement interfaces ... implement is the same as conforming in swift.
    Why use interfaces/protocols instead of regular classes?
    
    Java, Swift and Ruby do not support multiple inheritance? Why?
    
    Multiple inheritance leads the Diamond Problem. Pause and Think...what are saying? Are we still talking about MainActivity? 
    
    The Diamond Problem:
    
    The "diamond problem" (sometimes referred to as the "deadly diamond of death") is an ambiguity that arises when two classes B and C inherit from A, and class D inherits from both B and C. If there is a method in A that B and C have overridden, and D does not override it, then which version of the method does D inherit: that of B, or that of C?
    
    For example, in the context of GUI software development, a class Button may inherit from both classes Rectangle (for appearance) and Clickable (for functionality/input handling), and classes Rectangle and Clickable both inherit from the Object class. Now if the equals method is called for a Button object and there is no such method in the Button class but there is an overridden equals method in Rectangle or Clickable (or both), which method should be eventually called?
            

     Enough said on Activities and bases classes.
     
     Basically the Activity class is created with the package and imports specified. The class overrides the function with signature onCreate(Bundle savedInstanceState) from AppCompatActivity.
     
     Done.
     
     
    
