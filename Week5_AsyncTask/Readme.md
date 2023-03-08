# AsyncTask
### GoogleCodelab Link
 - https://developer.android.com/codelabs/android-training-create-asynctask?index=..%2F..%2Fandroid-training#0
#App-Overview And Introduction
- A thread is an independent path of execution in a running program. When an Android program is launched, the system creates a main thread, which is also called the UI thread. This UI thread is how your app interacts with components from the Android UI toolkit.
- Sometimes an app needs to perform resource-intensive tasks such as downloading files, making database queries, playing media, or computing complex analytics. This type of intensive work can block the UI thread so that the app doesn't respond to user input or draw on the screen. Users may get frustrated and uninstall your app.
- To keep the user experience (UX) running smoothly, the Android framework provides a helper class called AsyncTask, which processes work off of the UI thread. Using AsyncTask to move intensive processing onto a separate thread means that the UI thread can stay responsive.
- Because the separate thread is not synchronized with the calling thread, it's called an asynchronous thread. An AsyncTask also contains a callback that allows you to display the results of the computation back in the UI thread.
- I built an app that has one TextView and one Button. When the user clicks the Button, the app sleeps for a random amount of time, and then displays a message in the TextView when it wakes up. Here are the attached screenshots for finished application.
#
![App_ScreenShot-1](https://user-images.githubusercontent.com/76675965/223600652-6a1229ed-11e7-454d-9b4f-807269aa76db.jpg)
![App_ScreenShot-2](https://user-images.githubusercontent.com/76675965/223600616-6388152f-29d5-4a1e-bc42-15ada86459e3.jpg)
#
