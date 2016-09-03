# discoverBoston
5 ways to enjoy our city!

<details>
	<summary>Author and date</summary>

ALicia P., Started project on March 2016.

</details>


INSTRUCTIONS:

This app uses the Google maps API so you need to add your API key to the file /app/src/release/res/values/google_maps_api.xml as follows:

```xml
<resources>
    <string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">
        AIza.......
    </string>
</resources>
```

Same with the credentials for the Twitter API. Just modify the file fabric.properties:
apiSecret=YOUR_BUILD_SECRET
apiKey=YOUR_API_KEY

Fabric API key is generated and stored in the manifest. Add it as follows:
```xml
<application>
    .......
    <meta-data android:name="io.fabric.ApiKey" android:value="KEY_GOES_HERE"/>
</application>
```


To do/notes:
* Retrieved tweets list gets refreshed as we scroll up. Ideally I'd like to retrieve a fixed list of tweets (the most recent ones).




CREDITS

Authors of the Flickr photos I used for this app:
* Clam chowder: https://www.flickr.com/photos/simon_shek/
* Sam Adams:
* Oysters: https://www.flickr.com/photos/adwriter/15685802595/
* Harpoon: https://www.flickr.com/photos/lynnmarie/5711535889/
* Lobster roll: https://www.flickr.com/photos/pixxiestails/3736641877
* Boston creme: https://www.flickr.com/photos/bionicgrrl/6185887039/
* Canoli:
