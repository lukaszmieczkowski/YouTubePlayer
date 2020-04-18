
# YouTubePlayer API

The project uses the key created on console.developers.google using api,
YouTube Android Player API is publicly available.

## Features

* Uses api to play YouTube video with full type functionality - rewinding, stop, changing video quality, next video etc.

Example: 

![image](https://user-images.githubusercontent.com/63904223/79636564-db170900-8178-11ea-98d3-68d23db799a3.png)![image](https://user-images.githubusercontent.com/63904223/79636588-0b5ea780-8179-11ea-9ff4-47b67f1fa88f.png)

* In addition, I added logs in 'logcat' to individual stages, i.e. start, initialization, initialization error, initialization completed successfully.

Example: 

![image](https://user-images.githubusercontent.com/63904223/79636652-a35c9100-8179-11ea-8288-0e90b85f21be.png)
![image](https://user-images.githubusercontent.com/63904223/79636690-d2730280-8179-11ea-8d3b-1bb613f35007.png)

* The video to play is added using the end of the video url available on youtube to the created list, it is also possible to play the entire playlist

![image](https://user-images.githubusercontent.com/63904223/79636715-fc2c2980-8179-11ea-8bd5-4d20bfef1eb5.png)


## Installation
Just put your API key inside, you can generate api key from link in "Resources used"

![image](https://user-images.githubusercontent.com/63904223/79636751-3dbcd480-817a-11ea-9f85-ca842679ceef.png)

Screenshot path: app\src\main\java\com\example\youtubeplayer\YouTubeConfig.java

## Library

YouTubePlayer\app\libs\YouTubeAndroidPlayerApi.jar



## Files

YouTubePlayer\app\src\main\res\layout\activity_main.xml

YouTubePlayer\app\src\main\java\com\example\youtubeplayer\MainActivity.java

YouTubePlayer\app\src\main\AndroidManifest.xml

app\src\main\java\com\example\youtubeplayer\YouTubeConfig.java


## Resources used

* YouTubeAndroidPlayerApi Library: https://developers.google.com/youtube/android/player/downloads
* Generate api key: https://console.developers.google.com/

## Not included

  * Using fullscreen or rotation probably interrupts 'activity'


## Author

* Łukasz Mieczkowski,
* Mateusz Janikowski, Adrian Arciszewski
