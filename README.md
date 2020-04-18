
# YouTubePlayer API

The project uses the key created on console.developers.google using api,
YouTube Android Player API is publicly available.


## Installation
Just put your API key inside this, you can generate api key from link in "Resources used"

![image](https://user-images.githubusercontent.com/63904223/79636209-55925980-8176-11ea-80f4-7e84dcfb52da.png)

Screenshot path: app\src\main\java\com\example\youtubeplayer\YouTubeConfig.java

## Library

YouTubePlayer\app\libs\YouTubeAndroidPlayerApi.jar



## Files

YouTubePlayer\app\src\main\res\layout\activity_main.xml

YouTubePlayer\app\src\main\java\com\example\youtubeplayer\MainActivity.java

YouTubePlayer\app\src\main\AndroidManifest.xml

app\src\main\java\com\example\youtubeplayer\YouTubeConfig.java

## Features

* Uses api to play YouTube video with full type functionality - rewinding, stop, changing video quality, next video etc.
* In addition, I added logs in 'logcat' to individual stages, i.e. start, initialization, initialization error, initialization completed successfully.
* The video to play is added using the end of the video url available on youtube to the created list, it is also possible to play the entire playlist

## Resources used

* YouTubeAndroidPlayerApi Library: https://developers.google.com/youtube/android/player/downloads
* Generate api key: https://console.developers.google.com/

## Not included

  * Using fullscreen or rotation probably interrupts 'activity'


## Author

* Łukasz Mieczkowski,
* Mateusz Janikowski, Adrian Arciszewski
