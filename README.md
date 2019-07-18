# AppiumCrossPlatform 

 
#Pre-requisites IOS TESTS:
              
                       Here’s a comprehensive list of everything you need on a fresh installation of OSX.
                       
                       Homebrew
                       Carthage
                       Node & NPM
                       libimobiledevice
                       JDK
                       Xcode
                       authorize-ios
                       ios-deploy
                       ideviceinstaller
                       ios_webkit_debug_proxy
                       Appium
                       Appium Doctor 
                       
                                      
 # --IOS Install
     
                   * brew install carthage
                   * brew install libimobiledevice
                   * brew install node
                   * npm install -g authorize-ios
                   * brew install ios-deploy
                   * brew install ideviceinstallerbrew
                   * brew install ios-webkit-debug-proxy
                   * npm install -g appium@1.7.2
                   * npm install -g appium-doctor              
                                                                 
                                    
#--Xcode install

            * xcode-select --install
            * sudo xcode-sel
            

     

#--Step run test Android/IOS:
    
             1. Clone this project and import as a maven project in IntelliJ or Eclipse.
        
             2. Run Android tests : clean install -Denv.USER=ANDROID
        
             3. Run IOS tests : clean install -Denv.USER=IOS

#--Allure REPORTS
      
                  -  Start the server local
                  
            * REPORT LOCAL: mvn allure:serve

        
            * Log file location : /logfile.log


#--Create By: Eduardo Camilo

